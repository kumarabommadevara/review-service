package com.harsha.reviewservice.service;

import com.harsha.reviewservice.model.Review;
import com.harsha.reviewservice.model.ReviewVM;
import com.harsha.reviewservice.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository repository;
    public List<ReviewVM> getreviews()
    {
        final List<Review> reviews = repository.findAll();
        return reviews.stream().map(review ->
                {
                    ReviewVM review1=new ReviewVM();
                    review1.setReviewDetails(review.getReviewDetails());
                    review1.setInstructorId(review.getInstructorId());
                    return  review1;
                }).collect(Collectors.toList());
    }
}
