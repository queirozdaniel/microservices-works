package com.danielqueiroz.hrworker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danielqueiroz.hrworker.model.Worker;
import com.danielqueiroz.hrworker.repository.WorkerRepository;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

	@Autowired
	private WorkerRepository workerRepository;

	@GetMapping
	public ResponseEntity<List<Worker>> findAll(){
		List<Worker> list = workerRepository.findAll();
		
		return ResponseEntity.ok(list);
	}
	
	
}
