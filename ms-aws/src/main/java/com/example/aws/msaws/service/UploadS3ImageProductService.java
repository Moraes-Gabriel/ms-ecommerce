package com.example.aws.msaws.service;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.example.aws.msaws.modal.Product;
import com.example.aws.msaws.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import static org.apache.http.entity.ContentType.*;

@Component
@Slf4j
public class UploadS3ImageProductService {
        @Value("${file.path}")
        private String path;

        @Value("${aws.bucketName}")
        private String bucketName;

        @Autowired
        private ProductRepository productRepository;
        @Autowired
        private AmazonS3 amazonS3;

        public void uploadS3ImagemProduct(Long id, String productName, MultipartFile file) throws Exception {

                if (file.isEmpty()) {
                        throw new IllegalStateException("Cannot upload empty file");
                }

                if (!Arrays.asList(IMAGE_PNG.getMimeType(),
                        IMAGE_JPEG.getMimeType()).contains(file.getContentType())) {
                        throw new IllegalStateException("FIle uploaded is not an image");
                }

                        try {
                                ObjectMetadata metadata = new ObjectMetadata();
                                metadata.setContentLength(file.getSize());
                                amazonS3.putObject(bucketName, productName, file.getInputStream(), metadata);

                                Product product = Product.builder()
                                        .id(id)
                                        .name(productName)
                                        .imagePath(productName)
                                        .build();

                                productRepository.save(product);

                        } catch (IOException ioe) {
                                System.out.print("IOException: " + ioe.getMessage());
                        } catch (AmazonServiceException serviceException) {
                                System.out.print("AmazonServiceException: "+ serviceException.getMessage());
                                throw serviceException;
                        } catch (AmazonClientException clientException) {
                                System.out.print("AmazonClientException Message: " + clientException.getMessage());
                                throw clientException;
                        }
                }
}
