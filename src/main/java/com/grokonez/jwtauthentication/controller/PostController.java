package com.grokonez.jwtauthentication.controller;
import com.grokonez.jwtauthentication.model.Post;
import com.grokonez.jwtauthentication.security.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin("*")
@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping
    public String upload(@RequestParam("titulo") String titulo,@RequestParam("descripcion") String descripcion, @RequestParam("foto") MultipartFile foto) throws Exception {
      String asdasd= String.valueOf(postService.uploadData(titulo,descripcion,foto));
      return  asdasd;
    }


}
