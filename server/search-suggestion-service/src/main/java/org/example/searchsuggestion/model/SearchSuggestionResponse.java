package org.example.searchsuggestion.model;

import com.ut.ecommerce.commondataservice.dto.SearchSuggestionForThreeAttrDTO;
import com.ut.ecommerce.commondataservice.dto.SearchSuggestionForTwoAttrDTO;
import com.ut.ecommerce.commondataservice.entity.sql.categories.ApparelCategory;
import com.ut.ecommerce.commondataservice.entity.sql.categories.GenderCategory;
import com.ut.ecommerce.commondataservice.entity.sql.categories.ProductBrandCategory;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class SearchSuggestionResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String keyword;

}
