package com.WAAHomework.WAA.Repo;


import com.WAAHomework.WAA.Entity.LoggerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoggerRepo extends JpaRepository<LoggerEntity, Long> {
}
