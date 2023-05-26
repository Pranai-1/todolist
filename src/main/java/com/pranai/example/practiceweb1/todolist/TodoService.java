package com.pranai.example.practiceweb1.todolist;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class TodoService {
private static List<Todo> todos=new ArrayList<>();
static int count=0;
static {
	todos.add(new Todo(++count,"Pranai","Backend Developer",LocalDate.now().plusYears(1),true));
	todos.add(new Todo(++count,"Pranai","Frontend Developer",LocalDate.now().plusYears(2),true));
	todos.add(new Todo(++count,"Pranai","FullStack Developer",LocalDate.now().plusYears(3),true));
	todos.add(new Todo(++count,"Pranai","Manager of company",LocalDate.now().plusYears(4),true));
}
public List<Todo> getTodos(String username){
	return todos;
}
public void addTodo(String username,String description,LocalDate targetdate,boolean isdone) {
	todos.add(new Todo(++count,username,description,targetdate,isdone));
	
}
public void delete(int id) {
	Predicate<? super Todo> predicate=x->x.getId()==id;
	todos.removeIf(predicate);
	
}
public Todo findBy(int id) {
	Predicate<? super Todo> predicate=x->x.getId()==id;
	 Todo todo=todos.stream().filter(predicate).findFirst().get();
	 return todo;
	
}
public void update(Todo todo) {
	delete(todo.getId());
	
	todos.add(todo);
}
}
