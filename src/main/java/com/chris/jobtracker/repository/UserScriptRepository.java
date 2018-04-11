package com.chris.jobtracker.repository;

import com.chris.jobtracker.model.UserScript;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserScriptRepository extends JpaRepository<UserScript, Long> {
}
