package com.james.services;

import com.james.entities.Review;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jamesyburr on 7/1/16.
 */
public interface ReviewRepository extends CrudRepository<Review, Integer> {
}
