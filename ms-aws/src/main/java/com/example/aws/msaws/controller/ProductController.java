package com.example.aws.msaws.controller;

import com.example.aws.msaws.service.UploadS3ImageProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private UploadS3ImageProductService uploadS3ImageProductService;

    @PostMapping(value = "upload/${id}/${productName}", consumes = {MediaType.APPLICATION_JSON_VALUE,
                                                MediaType.MULTIPART_FORM_DATA_VALUE})
    public void uploadImagemFromProduct(@PathVariable Long id, String productName, @RequestPart("file") MultipartFile file) throws Exception {
        uploadS3ImageProductService.uploadS3ImagemProduct(id,productName,file);
    }
}
