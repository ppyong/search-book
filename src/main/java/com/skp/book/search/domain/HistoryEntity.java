package com.skp.book.search.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Entity(name = "HISTORY")
@NoArgsConstructor
public class HistoryEntity {
    @Id
    @GeneratedValue
    private long seq;

    private String keyword;

    private LocalDateTime time;

    private String userId;
}
