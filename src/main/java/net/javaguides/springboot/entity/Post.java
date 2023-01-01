package net.javaguides.springboot.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "posts")
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long post_id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "description")
	private String description;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn( name = "pc_fid", referencedColumnName = "post_id ")
	List<Comment> comments = new ArrayList<>();
	
	public Post() {
		
	}
	
	public Post(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}


	public long getPost_id() {
		return post_id;
	}

	public void setPost_id(long post_id) {
		this.post_id = post_id;
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

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
}