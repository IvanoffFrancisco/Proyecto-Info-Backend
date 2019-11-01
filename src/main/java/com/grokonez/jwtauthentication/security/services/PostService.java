package com.grokonez.jwtauthentication.security.services;

import com.grokonez.jwtauthentication.repository.PostRepository;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;

import org.apache.tomcat.jni.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;



    public Path uploadData( MultipartFile file) throws Exception {
        Path rutaCompleta=null;
        if(!file.isEmpty()){
            Path directorioRecursos= Paths.get("src//main//resources//static/images");
            String rootPath=directorioRecursos.toFile().getAbsolutePath();
            byte[] bytes=file.getBytes();
            rutaCompleta=Paths.get(rootPath+"//"+file.getOriginalFilename());
            Files.write(rutaCompleta,bytes);

        }
        return rutaCompleta;
    }
}
