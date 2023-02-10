package com.careerit.jfs.basics.day14.iplstat;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

public class IPLStatService {
    private TeamService teamService;
    private PlayerService playerService;


    @SneakyThrows
    public IPLStatService() {
        this.playerService=new PlayerService();
        this.teamService=new TeamService();
    }
    public List<String> getTeamNames(){
        List<TeamDetail> list=teamService.getTeamDetails();
        List<String> teamNames=new ArrayList<>();
        for (TeamDetail team:list){
            teamNames.add(team.getName());
        }
    return teamNames;
    }
    public List<Player> getPlayersOf(String team){
        List<Player>  list=PlayerService.getPlayers();
        List<Player> filteredlist=new ArrayList<>();
        for (Player player:list){
            if(player.getName().equalsIgnoreCase(team)){
                filteredlist.add(player);
            }
        }
    return filteredlist;
    }
    public List<TeamAmountDto> getTeamAmountStats() {
        List<TeamDetail> teamList = teamService.getTeamDetails();
        List<TeamAmountDto> teamAmountList = new ArrayList<>();
        for (TeamDetail team : teamList) {
            List<Player> players = getPlayersOf(team.getTeam());
            String teamName = team.getName();
            String captain = team.getCaptain();
            String name = team.getTeam();
            double totalAmount = 0;
            for (Player player : players) {
                totalAmount += player.getAmount();
            }
            TeamAmountDto teamAmountDto = new TeamAmountDto(team, totalAmount, captain, teamName);
            teamAmountList.add(teamAmountDto);
        }
        return teamAmountList;
    }

    public List<Player> getMaxPaidPlayers() {
        List<Player> list = playerService.getPlayers();
        double maxAmount = getMaxAmount(list);
        List<Player> maxPaidPlayerList = new ArrayList<>();
        for (Player player : list) {
            if (player.getAmount() == maxAmount) {
                maxPaidPlayerList.add(player);
            }
        }
        return maxPaidPlayerList;
    }

    public List<Player> getMaxPaidPlayerOf(String team) {
        List<Player> teamPlayerList = getPlayersOf(team);
        double maxAmount = getMaxAmount(teamPlayerList);
        List<Player> maxPaidPlayerList = new ArrayList<>();
        for (Player player : teamPlayerList) {
            if (player.getAmount() == maxAmount) {
                maxPaidPlayerList.add(player);
            }
        }
        return maxPaidPlayerList;
    }


    private double getMaxAmount(List<Player> list) {
        double maxAmount = list.get(0).getAmount();
        for (Player player : list) {
            if (maxAmount < player.getAmount()) {
                maxAmount = player.getAmount();
            }
        }
        return maxAmount;
    }
}
