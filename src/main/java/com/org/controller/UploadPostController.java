package com.org.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.org.repositories.PIR1_SCanOpcodeIssueRepository;
import com.org.repositories.PIR2_SCanOpcodeIssueRepository;
import com.org.repositories.PIR3_SCanOpcodeIssueRepository;
import com.org.repositories.PIR4_SCanOpcodeIssueRepository;
import com.org.services.FileDumpService;
import com.org.utils.CommonConstants;
import com.org.utils.Response;

@RestController
public class UploadPostController {

	private Logger logger = Logger.getLogger(UploadPostController.class);

	@Autowired
	FileDumpService fileDumpService;

	@Autowired
	PIR1_SCanOpcodeIssueRepository pIR1_SCanOpcodeIssueRepository;
	@Autowired
	PIR2_SCanOpcodeIssueRepository pIR2_SCanOpcodeIssueRepository;
	@Autowired
	PIR3_SCanOpcodeIssueRepository pIR3_SCanOpcodeIssueRepository;
	@Autowired
	PIR4_SCanOpcodeIssueRepository pIR4_SCanOpcodeIssueRepository;

	@Value("${file.upload.folderpath}")
	private String UPLOADED_FOLDER;

	Response response = new Response();

	// Save the uploaded file to this folder

	List<Object> objects = new ArrayList<>();

	@PostMapping("/upload") // //new annotation since 4.3
	public Response singleFileUpload(@RequestParam("file") MultipartFile file,
			@RequestParam("objectName") String objectName, @RequestParam("shift") String shift) {

		Path path = null;
		if (file.isEmpty()) {
			response = new Response(CommonConstants.KF_FILE_EMPTY, objects, CommonConstants.KF_FILE_EXISTS_MESSAGE);
			return response;
		}

		try {
			// Get the file and save it somewhere
			byte[] bytes = file.getBytes();
			path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename().replaceAll("\\[.*\\]", ""));

			if (Files.exists(path)) {
				response = new Response(CommonConstants.KF_FILE_EXISTS, objects,
						CommonConstants.KF_FILE_EXISTS_MESSAGE);
				return response;
			}

			Files.write(path, bytes);

			if (file.getContentType() != null) {
				response = fileDumpService.dumpFile(
						new File(UPLOADED_FOLDER + file.getOriginalFilename().replaceAll("\\[.*\\]", "")), shift,
						objectName);
			}

		} catch (Exception e) {

			try {
				Files.delete(path);
				response = new Response(CommonConstants.KF_FAIL, objects, CommonConstants.KF_FAIL_MESSAGE);
			} catch (IOException e1) {
				logger.error(e1.getMessage());
			}

		}

		return response;
	}

	@GetMapping("/truncate")
	public Response truncatetable(@RequestParam("tableName") String tableName) {

		try {
			if (tableName.equals(CommonConstants.PIR1_SCANOPCODEISSUE_TABLE)) {
				pIR1_SCanOpcodeIssueRepository.deleteAll();
				response = new Response(CommonConstants.KF_SCUCESS, null, CommonConstants.KF_TRUNCATE_DATA_SCUCESS_MESSAGE);
			} else if (tableName.equals(CommonConstants.PIR2_SCANOPCODEISSUE_TABLE)) {
				pIR2_SCanOpcodeIssueRepository.deleteAll();
				response = new Response(CommonConstants.KF_SCUCESS, null, CommonConstants.KF_TRUNCATE_DATA_SCUCESS_MESSAGE);
			} else if (tableName.equals(CommonConstants.PIR3_SCANOPCODEISSUE_TABLE)) {
				pIR3_SCanOpcodeIssueRepository.deleteAll();
				response = new Response(CommonConstants.KF_SCUCESS, null, CommonConstants.KF_TRUNCATE_DATA_SCUCESS_MESSAGE);
			} else if (tableName.equals(CommonConstants.PIR4_SCANOPCODEISSUE_TABLE)) {
				pIR4_SCanOpcodeIssueRepository.deleteAll();
				response = new Response(CommonConstants.KF_SCUCESS, null, CommonConstants.KF_TRUNCATE_DATA_SCUCESS_MESSAGE);
			}
		} catch (Exception e) {
			response = new Response(CommonConstants.KF_FAIL, null, CommonConstants.KF_CONTACT_ADMIN_MESSAGE);
		}
		
		return response;

	}

}