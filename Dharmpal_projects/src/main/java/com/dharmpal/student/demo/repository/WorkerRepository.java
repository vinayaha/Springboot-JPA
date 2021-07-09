package com.dharmpal.student.demo.repository;

import com.dharmpal.student.demo.entities.Owner;
import com.dharmpal.student.demo.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends JpaRepository<Worker,Long> {
}
