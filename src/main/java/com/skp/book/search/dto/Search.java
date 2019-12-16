package com.skp.book.search.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Search {
    private long offset;
    private int length;
}
