package com.grokonez.jwtauthentication.controller;

import com.grokonez.jwtauthentication.repository.PostRepository;
import com.grokonez.jwtauthentication.security.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
@CrossOrigin("*")
@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;


    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public void uploadFile(@RequestParam MultipartFile foto){

        postService.uploadFile(foto);
    }


}
