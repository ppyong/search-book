package com.skp.book.search.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.skp.book.search.domain.HistoryEntity;
import com.skp.book.search.dto.History;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import java.util.List;

public class HistoryCustomRepositoryImpl extends QuerydslRepositorySupport {
    private final JPAQueryFactory jpaQueryFactory;

    public HistoryCustomRepositoryImpl(JPAQueryFactory jpaQueryFactory){
        super(HistoryEntity.class);
        this.jpaQueryFactory = jpaQueryFactory;
    }

    public List<History> findSearchHistoriesByUserId(String userId){
        //history
        //jpaQueryFactory
        //        .selectFrom(history)
        return null;
    }


}
