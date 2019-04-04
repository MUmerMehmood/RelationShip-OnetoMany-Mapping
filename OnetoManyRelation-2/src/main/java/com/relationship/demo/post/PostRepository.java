package com.relationship.demo.post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.relationship.demo.post.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
