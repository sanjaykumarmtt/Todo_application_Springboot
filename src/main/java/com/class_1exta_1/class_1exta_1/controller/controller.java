package com.class_1exta_1.class_1exta_1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.class_1exta_1.class_1exta_1.Entirt.todoEntity;
import com.class_1exta_1.class_1exta_1.service.todoService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class controller {

	@Autowired
	todoService todoSer;

	@PostMapping("/body")
	public ResponseEntity<todoEntity> GetpostBody(@RequestBody todoEntity todo) {
		return new ResponseEntity<>(todoSer.postMap(todo), HttpStatus.CREATED);
	}
	@GetMapping("/get")
	public List<todoEntity> Get() {
		return todoSer.getlist();
	}
	@GetMapping("/getpage")
	public ResponseEntity<Page<todoEntity>> Getpage(@RequestParam int page,int size) {
		return new ResponseEntity<>(todoSer.Getallpage(page, size), HttpStatus.CREATED);
	}

	@GetMapping("/getid/{id}")
	public ResponseEntity Getpost(@PathVariable int id) {
		try {
			return new ResponseEntity<>(todoSer.getonedata(id), HttpStatus.OK);
		} catch (RuntimeException exception) {
			return new ResponseEntity<>(id + " This id is not fuall os get data falde ", HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/update")
	public ResponseEntity<todoEntity> Getpostparam(@RequestBody todoEntity todo) {
		return new ResponseEntity<>(todoSer.Updated(todo), HttpStatus.CREATED);
	}

	@DeleteMapping("/delete")
	public ResponseEntity Getpostrequest(@RequestParam long id) {
		try {
			System.out.print(id+"heubuvuvuv");
			todoSer.Deleted(id);
			return new ResponseEntity<>(id + " Deletde succes fuall ", HttpStatus.CREATED);
		} catch (RuntimeException exception) {
			return new ResponseEntity<>(id + "  This id is not fuall os deletade failde", HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/deletall")
	public ResponseEntity GetpostrAll() {
		todoSer.Deletedall();
			return new ResponseEntity<>("Deleat All Susses fual ", HttpStatus.CREATED);
	}
}