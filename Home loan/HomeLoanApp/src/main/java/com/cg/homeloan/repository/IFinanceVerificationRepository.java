package com.cg.homeloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.homeloan.entities.LoanApplication;

@Repository
public interface IFinanceVerificationRepository extends JpaRepository<LoanApplication, Integer>{


}
