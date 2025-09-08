package com.class_1exta_1.class_1exta_1.service;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.class_1exta_1.class_1exta_1.Entirt.todoEntity;
import com.class_1exta_1.class_1exta_1.Rapository.todoRapository;

@Service
public class todoService {

	@Autowired
	todoRapository rapository;

	public todoEntity postMap(todoEntity todo) {
		return rapository.save(todo);
	}

	public List<todoEntity> getlist() {
		return rapository.findAll();
	}

	public todoEntity getonedata(long id) {
		return rapository.findById(id).orElseThrow(() -> new RuntimeException(id + " This Id is not founde"));
	}

	public todoEntity Updated(todoEntity todo) {
		return rapository.save(todo);
	}
	public void Deleted(long id) {
		rapository.delete(getonedata(id));
	}
	public void Deletedall() {
		rapository.deleteAll();;
	}
//	public Page<todoEntity> Getallpage(int page,int size){
//		Pageable pageble= PageRequest.of(page, size);
//		return  rapository.findAll(pageble);
//	}	
	public Page<todoEntity> Getallpage(int page,int size){
		PageRequest pageable=PageRequest.of(page, size);
		return  rapository.findAll(pageable);
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
