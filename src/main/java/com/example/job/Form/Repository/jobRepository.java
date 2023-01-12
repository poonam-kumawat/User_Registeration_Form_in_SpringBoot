package com.example.job.Form.Repository;

import com.example.job.Form.Entity.Form;
import org.springframework.data.jpa.repository.JpaRepository;

public interface jobRepository extends JpaRepository<Form,Integer> {
}
