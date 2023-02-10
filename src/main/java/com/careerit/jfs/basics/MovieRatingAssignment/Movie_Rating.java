package com.careerit.jfs.basics.MovieRatingAssignment;

import com.careerit.jfs.basics.day15.Employee;
import com.careerit.jfs.basics.day15.EmployeeService;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Movie_Rating {
    private List<Movie_data> movie_data;
    private List<Rating> ratings;

    public Movie_Rating(){
        movie_data=loadMovie_data();
        ratings=load_Ratings();
    }
    private List<Movie_data> loadMovie_data(){
        List<Movie_data> list=new ArrayList<>();
        try {
            Path path = new File(EmployeeService.class.getResource("/movie_data.csv").toURI()).toPath();
            List<String> lines = Files.readAllLines(path);
            for (int i = 1; i < lines.size(); i++) {
                String[] moviedata = lines.get(i).split(",");
                String movie_ID= moviedata[0];
                int year = Integer.parseInt(moviedata[1]);
                String name = moviedata[2];
                Movie_data movie = Movie_data.builder()
                        .movie_ID(movie_ID)
                        .year(year)
                        .name(name)
                        .build();
                list.add(movie);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return list;
    }
    private List<Rating> load_Ratings(){
        List<Rating> list=new ArrayList<>();
        try {
            Path path = new File(EmployeeService.class.getResource("/rating.csv").toURI()).toPath();
            List<String> lines = Files.readAllLines(path);
            for (int i = 1; i < lines.size(); i++) {
                String[] ratinglist = lines.get(i).split(",");
                double user_ID= Double.parseDouble(ratinglist[0]);
                int rating = Integer.parseInt(ratinglist[1]);
                int movie_ID = Integer.parseInt(ratinglist[2]);
                Rating movie_rating = Rating.builder()
                        .user_ID(user_ID)
                        .rating(rating)
                        .movie_ID(movie_ID)
                        .build();
                list.add(movie_rating);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return list;
    }

}
