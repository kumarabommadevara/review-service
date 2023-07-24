package com.harsha.reviewservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "review_details")
@NoArgsConstructor
public class ReviewDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reviewDetialsId;
    private String comment;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "review_id")
    private Review review;

}
