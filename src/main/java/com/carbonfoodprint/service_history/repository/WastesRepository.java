package com.carbonfoodprint.service_history.repository;

import com.carbonfoodprint.service_history.entity.WastesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WastesRepository extends JpaRepository<WastesEntity, Long> {
}
