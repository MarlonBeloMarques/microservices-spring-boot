package com.marlonmarques.hrworker.repositories;

import com.marlonmarques.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
