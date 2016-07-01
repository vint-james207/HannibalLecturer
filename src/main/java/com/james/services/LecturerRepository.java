package com.james.services;

import com.james.entities.Lecturer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jamesyburr on 7/1/16.
 */
public interface LecturerRepository extends CrudRepository<Lecturer, Integer> {
}
