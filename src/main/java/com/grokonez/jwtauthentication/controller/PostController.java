package com.grokonez.jwtauthentication.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/post")
public class PostController {

    @PostMapping
    public String uploadFile(@RequestParam MultipartFile foto){
        if(!foto.isEmpty()){
            Path directorioRecursos= Paths.get("src//main//resources//static/image");
            String rootPath=directorioRecursos.toFile().getAbsolutePath();
            try {
                byte[] bytes=foto.getBytes();
                Path rutaCompleta=Paths.get(rootPath+"//"+foto.getOriginalFilename());
                Files.write(rutaCompleta,bytes);
                return "Imagen guardada";
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "Imagen guardada";
    }


}
