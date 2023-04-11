package com.projetomanytomany.usersEmail.repositories;

import com.projetomanytomany.usersEmail.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {
}