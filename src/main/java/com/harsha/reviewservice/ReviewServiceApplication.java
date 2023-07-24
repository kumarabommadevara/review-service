package com.harsha.reviewservice;

import com.harsha.reviewservice.model.Review;
import com.harsha.reviewservice.model.ReviewDetails;
import com.harsha.reviewservice.repository.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
public class ReviewServiceApplication implements CommandLineRunner {


	private final ReviewRepository repository;

	public ReviewServiceApplication(ReviewRepository repository) {
		this.repository = repository;
	}

	public static void main(String[] args) {
		SpringApplication.run(ReviewServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	saveReviews();

	}
	public void saveReviews()
	{
		List<ReviewDetails> detailsList=new ArrayList<>();

		ReviewDetails details=new ReviewDetails();
		details.setComment("Excellent i love his teaching");
		detailsList.add(details);

		ReviewDetails details1=new ReviewDetails();
		details1.setComment("good");
		detailsList.add(details1);


		ReviewDetails details2=new ReviewDetails();
		details2.setComment("good very good");

		detailsList.add(details2);

		Review review=new Review();
		review.setReviewDetails(detailsList);
		details.setReview(review);
		details2.setReview(review);
		details1.setReview(review);
		review.setInstructorId("1");


		repository.save(review);

		List<ReviewDetails> detailsList1=new ArrayList<>();
		ReviewDetails detailsSai=new ReviewDetails();
		detailsSai.setComment("not good");
		detailsList1.add(detailsSai);

		Review reviewSai=new Review();
		reviewSai.setReviewDetails(detailsList1);
		detailsSai.setReview(reviewSai);
		reviewSai.setInstructorId("2");
		repository.save(reviewSai);
	}
}
