package com.yg.SpringDataRest.repo;

import com.yg.SpringDataRest.domain.Tour;
import org.springframework.data.repository.CrudRepository;

public interface TourRepository extends CrudRepository<Tour, Integer> {
}