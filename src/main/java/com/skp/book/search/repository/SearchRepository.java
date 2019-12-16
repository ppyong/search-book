package com.skp.book.search.repository;

import com.skp.book.search.domain.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SearchRepository extends JpaRepository <BookEntity, Long>{
}
