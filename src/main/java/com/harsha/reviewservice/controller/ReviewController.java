package com.harsha.reviewservice.controller;

import com.harsha.reviewservice.model.Review;
import com.harsha.reviewservice.model.ReviewVM;
import com.harsha.reviewservice.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReviewController
{
    @Autowired
    private ReviewService reviewService;

    @GetMapping("/reviews")
    public List<ReviewVM> getReviews()
    {
      return   reviewService.getreviews();
    }
    @GetMapping("/reviews/instructor")
    public List<ReviewVM> getReviewsByInstructorID(@RequestParam String id)
    {
        return   reviewService.getReviewsByInstructorId(id);
    }
}
