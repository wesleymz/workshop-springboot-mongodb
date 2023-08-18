package com.wesleysantos.workshopmongo.services;

import com.wesleysantos.workshopmongo.domain.Post;
import com.wesleysantos.workshopmongo.repository.PostRepository;
import com.wesleysantos.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id) {
        Optional<Post> post = repository.findById(id);
        return post.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
