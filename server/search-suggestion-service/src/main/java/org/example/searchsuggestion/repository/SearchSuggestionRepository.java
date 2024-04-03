package org.example.searchsuggestion.repository;

import org.example.searchsuggestion.model.SearchSuggestionResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchSuggestionRepository extends JpaRepository<SearchSuggestionResponse, Long> {
    List<SearchSuggestionResponse> findByKeywordStartingWith(String prefix);
}