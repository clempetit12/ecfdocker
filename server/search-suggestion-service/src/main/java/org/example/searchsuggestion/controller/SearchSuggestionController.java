package org.example.searchsuggestion.controller;

import org.example.searchsuggestion.model.SearchSuggestionResponse;
import org.example.searchsuggestion.service.SearchSugggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class SearchSuggestionController {

    @Autowired
    private SearchSugggestionService searchSugggestionService;


    @GetMapping("/search-suggestion")
    public ResponseEntity<List<SearchSuggestionResponse>> getSearchSuggestions(@RequestParam("q") String prefix) {
        List<SearchSuggestionResponse> suggestions = searchSugggestionService.getSearchSuggestionList(prefix);
        return new ResponseEntity<>(suggestions, HttpStatus.OK);
    }

}
