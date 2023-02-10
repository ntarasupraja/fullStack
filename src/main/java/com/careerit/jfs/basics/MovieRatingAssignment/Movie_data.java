package com.careerit.jfs.basics.MovieRatingAssignment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Movie_data {
    private  String movie_ID;
            private int year;
            private String name;
}
