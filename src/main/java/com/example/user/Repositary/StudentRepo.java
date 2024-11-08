package com.example.user.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.user.Entity.StudentTable;

@Repository
public interface StudentRepo extends JpaRepository<StudentTable, Integer>{

}
