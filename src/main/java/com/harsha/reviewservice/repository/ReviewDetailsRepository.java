package com.harsha.reviewservice.repository;

import com.harsha.reviewservice.model.ReviewDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewDetailsRepository extends JpaRepository<ReviewDetails,Integer> {
}
