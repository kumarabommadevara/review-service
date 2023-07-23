package com.harsha.reviewservice.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "review_details")
@ToString
public class ReviewDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int reviewDetialsId;
    private String comment;
    @ManyToOne
    @JoinColumn(name = "review_id")
    private Review review;

}
