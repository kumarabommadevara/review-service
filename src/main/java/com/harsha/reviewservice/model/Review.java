package com.harsha.reviewservice.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "reviews")
@ToString
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reviewId;
    @OneToMany(mappedBy = "review",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<ReviewDetails> reviewDetails=new ArrayList<>();
    private String instructorId;
}
