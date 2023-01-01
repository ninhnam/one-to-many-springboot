package net.javaguides.springboot.controller;

import net.javaguides.springboot.entity.Comment;
import net.javaguides.springboot.entity.Post;
import net.javaguides.springboot.repository.CommentRepository;
import net.javaguides.springboot.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private CommentRepository commentRepository;

    @PostMapping
    public Post createEmployee() {
        Post post = new Post("title 1", "one to many mapping using JPA and hibernate");
        Post post2 = new Post("title 2", "222.one to many mapping using JPA and hibernate");

        Comment comment1 = new Comment("Very useful");
        Comment comment2 = new Comment("informative");
        Comment comment3 = new Comment("Great post");
        Comment comment4 = new Comment("Very post");

        post.getComments().add(comment1);
        post.getComments().add(comment2);
        post2.getComments().add(comment3);
        post2.getComments().add(comment4);

        postRepository.save(post2);
        return postRepository.save(post);
    }

    @GetMapping
    public List<Post> getAllEmployees(){
        return postRepository.findAll();
    }
}
