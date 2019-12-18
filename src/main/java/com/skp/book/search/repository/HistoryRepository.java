package com.skp.book.search.repository;

import com.skp.book.search.domain.HistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistoryRepository extends JpaRepository <HistoryEntity, Long>, HistoryCustomRepository{
    public List<HistoryEntity> findAllByUserId(String userId);
}
