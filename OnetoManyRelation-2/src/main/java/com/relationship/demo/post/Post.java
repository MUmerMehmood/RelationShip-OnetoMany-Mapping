package com.relationship.demo.post;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.relationship.demo.abs.AuditModel;
import com.relationship.demo.comment.Comment;

@Entity
@Table(name = "posts")
public class Post extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 100)
    @Column(unique = true)
    private String title;

    @NotNull
    @Size(max = 250)
    private String description;

    @NotNull
    @Lob
    private String content;
    
    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "post")
    private Set<Comment> comments = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Post(Long id, @NotNull @Size(max = 100) String title, @NotNull @Size(max = 250) String description,
			@NotNull String content) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.content = content;
	}

    public Post() {}
}
