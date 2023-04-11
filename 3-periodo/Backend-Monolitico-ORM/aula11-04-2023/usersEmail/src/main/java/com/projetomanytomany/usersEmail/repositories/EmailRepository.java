package com.projetomanytomany.usersEmail.repositories;

import com.projetomanytomany.usersEmail.models.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends JpaRepository<Email, Long> {

}