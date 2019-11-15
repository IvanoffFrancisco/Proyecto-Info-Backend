package com.grokonez.jwtauthentication.security.services;

import com.grokonez.jwtauthentication.model.Post;
import com.grokonez.jwtauthentication.repository.PostRepository;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;


    public String uploadData(String titulo,String descripcion, MultipartFile file) throws Exception {
        Path rutaCompleta=null;
        if(!file.isEmpty()){
            Path directorioRecursos= Paths.get("src//main//resources//static/images");
            String rootPath=directorioRecursos.toFile().getAbsolutePath();
            byte[] bytes=file.getBytes();
            rutaCompleta=Paths.get(rootPath+"//"+file.getOriginalFilename());
            Files.write(rutaCompleta,bytes);

        }
        String ruta= String.valueOf(rutaCompleta);
        Post post=new Post(titulo,descripcion,ruta);
        postRepository.save(post);
        return ruta;
    }
}
