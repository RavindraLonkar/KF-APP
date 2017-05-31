package com.org.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.org.services.FileDumpService;
import com.org.utils.Response;

@RestController
public class UploadPostController {
	 
	@Autowired
	FileDumpService fileDumpService;
	
	Response response=new Response();
	
    //Save the uploaded file to this folder
    private static String UPLOADED_FOLDER = "C:/Users/Rahul/Desktop/Ravi/upload/";
    List<Object> objects=new ArrayList<>();
    
 
    @PostMapping("/upload") // //new annotation since 4.3
    public Response singleFileUpload(@RequestParam("file") MultipartFile file,@RequestParam("shift") String shift) {

    	if (file.isEmpty()) {
        	response = new Response("Empty file", objects,"");
            return response;
        }

        try {
            // Get the file and save it somewhere
            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
            Files.write(path, bytes);
            
            if(file.getContentType() != null){
            	response =fileDumpService.dumpFile(new File(UPLOADED_FOLDER + file.getOriginalFilename()),shift);
            }            

        } catch (IOException e) {
        	response = new Response("fail", objects,"");
        }

        return response;
    }
 
}