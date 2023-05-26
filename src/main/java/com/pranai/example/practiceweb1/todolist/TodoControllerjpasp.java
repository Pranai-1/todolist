package com.pranai.example.practiceweb1.todolist;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
public class TodoControllerjpasp {
	@Autowired
   private TodoRepository repository;
	@RequestMapping("todos")
	public String listTodos(ModelMap model) {
		String username=getLoggedName();
		List<Todo> todolist=repository.findByUsername(username);
		
		model.addAttribute("todo", todolist);
		return "todolist";
	}
	@RequestMapping(value="addtodo",method=RequestMethod.GET)
	public String addingTodo(ModelMap model) {
		String username=getLoggedName();
		Todo todo=new Todo(0,username,"",LocalDate.now().plusYears(0),false);
		model.addAttribute("todo", todo);
		return "addingtodo";
	}
	@RequestMapping(value="addtodo",method=RequestMethod.POST)
	public String addingTodoCompleted(ModelMap model, @Valid Todo todo,BindingResult result) {
		
		if(result.hasErrors()){
			return "addingtodo";
		}
		String username=getLoggedName(); 
		todo.setUsername(username);
		repository.save(todo);
		return "redirect:todos";
	}
	@RequestMapping("delete-todo")
	public String deleteTodo(@RequestParam int id) {
		repository.deleteById(id);
		return "redirect:todos";
	}
	@RequestMapping(value="update-todo",method=RequestMethod.GET)
	public String updateTodo(@RequestParam int id,ModelMap model) {
		Todo todo=repository.findById(id).get();
		model.addAttribute("todo", todo);
		return "addingtodo";
	}
	@RequestMapping(value="update-todo",method=RequestMethod.POST)
	public String updatedTodo(@Valid Todo todo,BindingResult result,ModelMap model) {
		if(result.hasErrors()) {
			return "addtodo";
		}else {
			 String userName = getLoggedName();
		        todo.setUsername(userName);
		        repository.save(todo);
		        return "redirect:todos";
		}
	}
	public String getLoggedName() {
		Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
  
}
////webjars/bootstrap/5.1.3/css/bootstrap.min.css
////webjars/bootstrap/5.1.3/js/bootstrap.min.js
////webjars/jquery/3.6.0/jquery.min.js
////webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css
////webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js