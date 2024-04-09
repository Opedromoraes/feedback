package com.estudo.feedback.repository;

import com.estudo.feedback.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long>{
}
