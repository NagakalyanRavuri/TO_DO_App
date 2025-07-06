package com.example.demo;

import jakarta.persistence.*;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private boolean completed = false;
	public Task(Long id, String title, boolean completed) {
		super();
		this.id = id;
		this.title = title;
		this.completed = completed;
	}
	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	

    // Getters and setters
}