package net.javaguides.springboot.controller;


import net.javaguides.springboot.entity.Comment;
import net.javaguides.springboot.entity.Post;
import net.javaguides.springboot.repository.CommentRepository;
import net.javaguides.springboot.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private CommentRepository commentRepository;

    @PostMapping
    public Comment createEmployee() {
        long id = 1L;
        Post post = postRepository.getOne(id);
        Comment comment1 = new Comment("Very useful");
        Comment comment2 = new Comment("informative");
        Comment comment3 = new Comment("Great post");

        post.getComments().add(comment1);
        post.getComments().add(comment2);
        post.getComments().add(comment3);

        return commentRepository.save(comment3);
    }

    @DeleteMapping
    public String delComment() {
        long id = 1;
        commentRepository.deleteById(id);
        return "Delete success";
    }

    @GetMapping
    public List<Comment> getAllEmployees(){
        return commentRepository.findAll();
    }
}
