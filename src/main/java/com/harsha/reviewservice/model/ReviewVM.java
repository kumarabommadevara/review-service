package com.harsha.reviewservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString

public class ReviewVM {

    private List<ReviewDetails> reviewDetails=new ArrayList<>();
    private String instructorId;
}
