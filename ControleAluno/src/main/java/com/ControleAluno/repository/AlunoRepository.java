package com.ControleAluno.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ControleAluno.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
