package com.cph.authorizationservice.model;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SearchResultsDto {

    private List<ProductDto> results;

    public SearchResultsDto(ProductDto... products) {
        this.results = new ArrayList<>();
        for (ProductDto result : products) {
            this.results.add(result);

        }
    }
}