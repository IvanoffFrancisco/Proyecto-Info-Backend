package com.grokonez.jwtauthentication.controller;
import com.grokonez.jwtauthentication.security.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;

@CrossOrigin("*")
@RestController
@RequestMapping("/fotos")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping
    public String upload(@RequestParam("foto") MultipartFile foto) throws Exception {
      String asdasd= String.valueOf(postService.uploadData(foto));
      return  asdasd;
    }


}
