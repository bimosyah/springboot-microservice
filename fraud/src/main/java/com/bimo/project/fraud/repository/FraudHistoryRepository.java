package com.bimo.project.fraud.repository;

import com.bimo.project.fraud.entity.FraudHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FraudHistoryRepository extends JpaRepository<FraudHistoryEntity, Integer> {

}
