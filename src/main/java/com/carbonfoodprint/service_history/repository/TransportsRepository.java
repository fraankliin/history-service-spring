package com.carbonfoodprint.service_history.repository;

import com.carbonfoodprint.service_history.entity.TransportsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportsRepository extends JpaRepository<TransportsEntity, Long> {
}
