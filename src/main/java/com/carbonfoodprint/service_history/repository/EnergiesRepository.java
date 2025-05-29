package com.carbonfoodprint.service_history.repository;

import com.carbonfoodprint.service_history.dto.SummaryHistoryDTO;
import com.carbonfoodprint.service_history.entity.EnergiesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnergiesRepository extends JpaRepository<EnergiesEntity, Long> {
    @Query("""
    SELECT new com.carbonfoodprint.service_history.dto.SummaryHistoryDTO(
        e.id,
        e.createdAt,
        (e.total + f.total + t.total + w.total)
    )
    FROM EnergiesEntity e
    JOIN FoodsEntity f ON f.id = e.id
    JOIN TransportsEntity t ON t.id = e.id
    JOIN WastesEntity w ON w.id = e.id
    WHERE e.userId = :userId
    ORDER BY e.createdAt DESC
    """)
    List<SummaryHistoryDTO> findHistoryByUserId(@Param("userId") Long userId);


}
