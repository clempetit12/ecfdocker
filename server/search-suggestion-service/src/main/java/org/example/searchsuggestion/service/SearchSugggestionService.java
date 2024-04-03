package org.example.searchsuggestion.service;

import org.example.searchsuggestion.model.SearchSuggestionResponse;
import org.example.searchsuggestion.repository.SearchSuggestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@Service
public class SearchSugggestionService {

    SearchSuggestionRepository searchSuggestionRepository;


    public List<SearchSuggestionResponse> getSearchSuggestionList(String prefix) {
       return searchSuggestionRepository.findByKeywordStartingWith(prefix);
    }

    public List<SearchSuggestionResponse> getSearchSuggestionList() {
        return searchSuggestionRepository.findAll();
    }



}
