package me.summerunni.resautofly;

import java.util.List;
import java.util.Vector;

public class FlyList {
    private static final List<String> flyList = new Vector<String>();

    public static void add(String playerName) {
        flyList.add(playerName);
    }

    public static void remove(String playerName) {
        flyList.remove(playerName);
    }

    public static boolean has(String playerName) {
        return flyList.contains(playerName);
    }
}
