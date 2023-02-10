package com.careerit.jfs.basics.MovieRatingAssignment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Rating {
    private double user_ID;
    private int rating;
    private int movie_ID;
}
