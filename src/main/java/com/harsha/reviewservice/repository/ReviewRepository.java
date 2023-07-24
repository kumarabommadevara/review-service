package com.harsha.reviewservice.repository;

import com.harsha.reviewservice.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review,String> {
    List<Review> getReviewDetailsByInstructorId(String instructorID);
}
