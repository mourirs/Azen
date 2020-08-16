package com.azen.root.controller;

import com.azen.root.utils.FTPUtils;
import org.apache.commons.fileupload.FileUploadException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/")
public class UploadController {

    @PostMapping("/uploadImage")
    public String uploadCommodityImage(MultipartFile upload) throws IOException, FileUploadException {
        String originalFilename = upload.getOriginalFilename();
        if (FTPUtils.storeFile("127.0.0.1", 21, "614750226", "614750226", "/", originalFilename, upload.getInputStream())) {
            return originalFilename;
        } else {
            return "false";
        }
    }
}

