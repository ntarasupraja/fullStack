package com.careerit.jfs.basics.day14.iplstat;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class IPLStatDriver {
    public static void main(String[] args) throws Exception {
    PlayerService obj=new PlayerService();
        System.out.println(obj.getPlayers().size());
    }
}
