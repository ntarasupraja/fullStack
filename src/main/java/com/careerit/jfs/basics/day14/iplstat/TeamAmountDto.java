package com.careerit.jfs.basics.day14.iplstat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TeamAmountDto {
    private String team;
    private double totalAmount;
    private String captain;
    private String teamname;

    public TeamAmountDto(TeamDetail team, double totalAmount, String captain, String teamName) {
    }
}
