package com.pranai.example.practiceweb1.todolist;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

@Entity
public class Todo {
	@Id
	@GeneratedValue
	private int id;
	  private String username;
	  
	  @Size(min=10,message="Required atleast 10 characters")
	  private String description;
	  
	  private LocalDate targetdate;
	  private boolean isdone;
	  Todo(){
		  
	  }
	public Todo(int id, String username, String description, LocalDate targetdate, boolean isdone) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.targetdate = targetdate;
		this.isdone = isdone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getTargetdate() {
		return targetdate;
	}
	public void setTargetdate(LocalDate targetdate) {
		this.targetdate = targetdate;
	}
	public boolean isIsdone() {
		return isdone;
	}
	public void setIsdone(boolean isdone) {
		this.isdone = isdone;
	}
	@Override
	public String toString() {
		return "TodoController [id=" + id + ", username=" + username + ", description=" + description + ", isdone=" + isdone
				+ "]";
	}
}
