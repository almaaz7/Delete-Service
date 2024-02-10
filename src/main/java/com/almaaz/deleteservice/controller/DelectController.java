package com.almaaz.deleteservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.almaaz.deleteservice.repository.DeleteRepository;

@Controller
@RequestMapping("/delete")
public class DelectController {
	
	@Autowired
	DeleteRepository deleterepository;
	
	@DeleteMapping("/deleteEmployee")
	public ResponseEntity<String> deleteEmployee(@RequestParam int id) {
		if(deleterepository.existsById(id)) {
			deleterepository.deleteById(id);
			return new ResponseEntity<>("s",HttpStatus.OK);
		}return new ResponseEntity<>("not found", HttpStatus.NOT_FOUND);
	}
	
}
