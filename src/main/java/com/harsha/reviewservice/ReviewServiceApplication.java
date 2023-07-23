package com.harsha.reviewservice;

import com.harsha.reviewservice.model.Review;
import com.harsha.reviewservice.model.ReviewDetails;
import com.harsha.reviewservice.repository.ReviewDetailsRepository;
import com.harsha.reviewservice.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ReviewServiceApplication implements CommandLineRunner {


	private final ReviewRepository repository;
	private final ReviewDetailsRepository reviewDetailsRepository;

	public ReviewServiceApplication(ReviewRepository repository,ReviewDetailsRepository reviewDetailsRepository) {
		this.reviewDetailsRepository=reviewDetailsRepository;
		this.repository = repository;
	}

	public static void main(String[] args) {
		SpringApplication.run(ReviewServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<ReviewDetails> detailsList=new ArrayList<>();
		ReviewDetails details=new ReviewDetails();
		details.setComment("Excellent i love his teaching");
		details.setComment("GOOD");
		detailsList.add(details);


		Review review=new Review();
		review.setReviewDetails(detailsList);
		review.setInstructorId("1");
		details.setReview(review);

		repository.save(review);
		reviewDetailsRepository.save(details);


	}
}
