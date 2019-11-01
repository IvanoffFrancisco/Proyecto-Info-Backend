package com.grokonez.jwtauthentication.security.services;

import com.grokonez.jwtauthentication.repository.PostRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.logging.Logger;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    //private static final Logger logger = LoggerFactory.getLogger(PostService.class);

    public ResponseEntity uploadFile(MultipartFile file) {
        //logger.info(String.format("File name '%s' uploaded successfully.", file.getOriginalFilename()));
        String asd=file.getOriginalFilename();
        return ResponseEntity.ok().build();
    }
}
