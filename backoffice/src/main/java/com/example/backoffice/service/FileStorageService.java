package com.example.backoffice.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author daniel
 */
public interface FileStorageService {

    /**
     * store the file in the server
     * @param file
     * @return
     */
    String storeFile(MultipartFile file);

    /**
     * find the file by name
     * @param fileName
     * @return
     */
    Resource loadFileAsResource(String fileName);
}
