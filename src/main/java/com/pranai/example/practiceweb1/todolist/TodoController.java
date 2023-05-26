//package com.pranai.example.practiceweb1.todolist;
//
//import java.time.LocalDate;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.SessionAttributes;
//
//import jakarta.validation.Valid;
//
//@Controller
//@SessionAttributes("name")
//public class TodoController {
//	@Autowired
//   private TodoService service;
//	@RequestMapping("todos")
//	public String listTodos(ModelMap model) {
//		List<Todo> todolist=service.getTodos("Pranai");
//		model.addAttribute("todo", todolist);
//		return "todolist";
//	}
//	@RequestMapping(value="addtodo",method=RequestMethod.GET)
//	public String addingTodo(ModelMap model) {
//		String username=(String)model.get("name");
//		Todo todo=new Todo(0,username,"",LocalDate.now().plusYears(0),false);
//		model.addAttribute("todo", todo);
//		return "addingtodo";
//	}
//	@RequestMapping(value="addtodo",method=RequestMethod.POST)
//	public String addingTodoCompleted(ModelMap model, @Valid Todo todo,BindingResult result) {
//		String username=(String)model.get("name");
//		service.addTodo(username,todo.getDescription(),todo.getTargetdate(),false);	
//		if(result.hasErrors()){
//			return "addingtodo";
//		}
//		return "redirect:todos";
//	}
//	@RequestMapping("delete-todo")
//	public String deleteTodo(@RequestParam int id) {
//		service.delete(id);
//		return "redirect:todos";
//	}
//	@RequestMapping(value="update-todo",method=RequestMethod.GET)
//	public String updateTodo(@RequestParam int id,ModelMap model) {
//		Todo todo=service.findBy(id);
//		model.addAttribute("todo", todo);
//		return "addingtodo";
//	}
//	@RequestMapping(value="update-todo",method=RequestMethod.POST)
//	public String updatedTodo(@Valid Todo todo,ModelMap model) {
//		
//		service.update(todo);
//		return "redirect:todos";
//	}
//  
//}
////webjars/bootstrap/5.1.3/css/bootstrap.min.css
////webjars/bootstrap/5.1.3/js/bootstrap.min.js
////webjars/jquery/3.6.0/jquery.min.js
////webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css
////webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js