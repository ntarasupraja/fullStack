package com.careerit.jfs.basics.day14.iplstat;

import lombok.SneakyThrows;

import java.io.File;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class PlayerService {

    private static List<Player> players;
    @SneakyThrows
    public PlayerService()  {
        players=loadPlayers();
    }
    public static List<Player> getPlayers(){
        return players;
    }
    @SneakyThrows
    private List<Player> loadPlayers()  {
        List<Player> list = new ArrayList<>();
        Path path = new File(PlayerService.class.getResource("/players.csv").toURI()).toPath();
        List<String> lines = Files.readAllLines(path);
        for (int i = 1; i < lines.size(); i++) {
            String[] arr = lines.get(i).split(",");
            String name = arr[0];
            String role = arr[1];
            double amount = Double.parseDouble(arr[2]);
            String country = arr[3];
            String team = arr[4];
            Player player = new Player(name, role, amount, team, country);
            list.add(player);
        }
        return list;
    }
}

