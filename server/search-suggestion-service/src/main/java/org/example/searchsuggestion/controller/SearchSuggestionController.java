package org.example.searchsuggestion.controller;

import org.example.searchsuggestion.service.SearchSugggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class SearchSuggestionController {

    @Autowired
    private SearchSugggestionService searchSugggestionService;


        @GetMapping("/default-search-suggestion")
        public String getDefaultSearchSuggestions() {
            return searchSugggestionService.getSearchSuggestions();

    }
}
