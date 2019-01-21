package com.spring.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.mysql.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}