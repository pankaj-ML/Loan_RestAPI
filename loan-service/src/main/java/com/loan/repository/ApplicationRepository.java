package com.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loan.entity.loanApplication;

public interface ApplicationRepository extends JpaRepository<loanApplication,Integer> {

}
