package com.filipemscourse.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filipemscourse.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
