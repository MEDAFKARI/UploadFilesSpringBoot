package com.UploadFiles.UploadFiles.Service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

public interface UploadService {
    public void init();

    public void upload(MultipartFile file);

    public Resource getFileByName(String filename);

    public void deleteFileByName(String filename);

    public void deleteAll();

    public Stream<Path> getAllFiles();
}
