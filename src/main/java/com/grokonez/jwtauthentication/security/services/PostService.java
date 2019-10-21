package com.grokonez.jwtauthentication.security.services;

import com.grokonez.jwtauthentication.model.Post;
import com.grokonez.jwtauthentication.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public void upload(Post post){
        postRepository.save(post);
    }

}
