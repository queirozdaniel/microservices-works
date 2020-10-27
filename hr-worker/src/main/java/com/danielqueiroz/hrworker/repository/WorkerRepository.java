package com.danielqueiroz.hrworker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielqueiroz.hrworker.model.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
