package com.carbonfoodprint.service_history.repository;

import com.carbonfoodprint.service_history.entity.FoodsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodsRepository extends JpaRepository<FoodsEntity, Long> {
}
