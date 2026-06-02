package com.example.todo_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;

@RestController
@RequestMapping("/toDoService")
public class TodoRest {
    
    @RequestMapping
    public String getGreeting("/"){
        return "Hello World!";
    }
   // private ToDoService toDoService; 

    /* @GetMapping
    public List<todos> findAll(){
       return toDoService.findAll();
    }

    @GetMapping(value = "/{id}")
    public todos getById(@PathVariable("id") Long id){
        return RestPreconditions.checkFound(toDoService.getById(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Long create(@RequestBody todos request){
        RestPreconditions.checkNotNull(request);

        return toDoService(request);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id){
        return toDoService.deleteById(id);
    } 
    */

    /* @ResponseStatus(HttpStatus.BAD_REQUEST)
    public class BadRequestException {} 
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public class RequestNotFoundException {} 
    */

}