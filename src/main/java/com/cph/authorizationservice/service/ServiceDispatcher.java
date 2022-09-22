package com.cph.authorizationservice.service;

import com.cph.authorizationservice.model.ProductDto;
import com.cph.authorizationservice.model.SearchResultsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServiceDispatcher {
    public SearchResultsDto searchPrograms (String query) {

        return new SearchResultsDto(new ProductDto(1,"Harry Potter","phantasy"), new ProductDto(2,"American Beauty", "drama"), new ProductDto(3,"The Simpsons", "cartoon"));

    }
}
