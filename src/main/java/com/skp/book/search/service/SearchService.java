package com.skp.book.search.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.skp.book.search.dto.History;
import com.skp.book.search.repository.HistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SearchService {
    private final HistoryRepository historyRepository;
    private final ObjectMapper objectMapper;

    public List<History> selectAllHistoryByUserId(String userId) {
        return historyRepository.findAllByUserId(userId)
                .stream()
                .map(i->objectMapper.convertValue(i, History.class))
                .collect(Collectors.toList());
    }
}
