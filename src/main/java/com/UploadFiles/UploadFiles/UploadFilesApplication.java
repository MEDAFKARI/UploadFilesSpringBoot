package com.UploadFiles.UploadFiles;

import com.UploadFiles.UploadFiles.Service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UploadFilesApplication implements CommandLineRunner {
	@Autowired
	UploadService uploadService;

	public static void main(String[] args) {
		SpringApplication.run(UploadFilesApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		uploadService.init();
	}
}
