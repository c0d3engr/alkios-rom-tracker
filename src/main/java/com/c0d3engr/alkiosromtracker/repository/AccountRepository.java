package com.c0d3engr.alkiosromtracker.repository;

import com.c0d3engr.alkiosromtracker.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {}