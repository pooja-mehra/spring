package com.example.spring;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:5432")
@RestController
public class Spring1Controller{
	@Autowired
    private Spring1Repo questService;
	
	@RequestMapping("/")
	public String Index(){
		return "hello";
	}
	@GetMapping("/users")
    public ResponseEntity < List < Spring1Entity >> findAll() {
        return ResponseEntity.ok().body(questService.findAll());
    }
	@PostMapping("/users")
    public ResponseEntity < Spring1Entity > save(@RequestBody Spring1Entity user) {
        return ResponseEntity.ok().body(questService.save(user));
    }
	@GetMapping("/userbyId/{id}")
	public ResponseEntity <Optional<Spring1Entity>> findById(@PathVariable("id") int id){
		return ResponseEntity.ok().body(questService.findById(id));
	}
}