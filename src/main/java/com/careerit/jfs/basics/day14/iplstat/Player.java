package com.careerit.jfs.basics.day14.iplstat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Player {
    private String name;
    private String role;
    private double amount;
    private String country;
    private String team;

}
