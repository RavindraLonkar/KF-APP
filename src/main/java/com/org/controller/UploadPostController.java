package com.org.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.org.services.FileDumpService;
import com.org.utils.CommonConstants;
import com.org.utils.Response;

@RestController
public class UploadPostController {

	@Autowired
	FileDumpService fileDumpService;

	@Value("${file.upload.folderpath}")
	private String UPLOADED_FOLDER;

	Response response = new Response();

	// Save the uploaded file to this folder

	List<Object> objects = new ArrayList<>();

	@PostMapping("/upload") // //new annotation since 4.3
	public Response singleFileUpload(@RequestParam("file") MultipartFile file, @RequestParam("objectName") String objectName,
			@RequestParam("shift") String shift) {

		if (file.isEmpty()) {
			response = new Response(CommonConstants.KF_FILE_EMPTY, objects, "");
			return response;
		}

		try {
			// Get the file and save it somewhere
			byte[] bytes = file.getBytes();
			Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename().replaceAll("\\[.*\\]", ""));
			
			if(Files.exists(path)){
				response = new Response(CommonConstants.KF_FILE_EXISTS, objects, "");
				return response;
			}
			
			Files.write(path, bytes);

			if (file.getContentType() != null) {
				response = fileDumpService.dumpFile(new File(UPLOADED_FOLDER + file.getOriginalFilename()), shift, objectName);
			}

		} catch (IOException e) {
			response = new Response(CommonConstants.KF_FAIL, objects, "");
		}

		return response;
	}

}