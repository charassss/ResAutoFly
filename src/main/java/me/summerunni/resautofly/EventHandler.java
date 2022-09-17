package me.summerunni.resautofly;

import com.bekvon.bukkit.residence.api.ResidenceApi;
import com.bekvon.bukkit.residence.protection.ClaimedResidence;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.jetbrains.annotations.NotNull;

public class EventHandler implements Listener {

    @org.bukkit.event.EventHandler
    public void onPlayerMove(@NotNull PlayerMoveEvent e) {

        Player player = e.getPlayer();
        String pname = player.getName();
        Location loc = player.getLocation();
        ClaimedResidence res = ResidenceApi.getResidenceManager().getByLoc(loc);

        if (player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.SPECTATOR || player.isOp() || player.hasPermission("resautofly.bypass")) {
            return;
        }

        if (res != null && player.hasPermission("resautofly.use") && !FlyList.has(pname)) {
            player.setAllowFlight(true);
            FlyList.add(pname);
        } else if (res == null && FlyList.has(pname)){
            FlyList.remove(pname);
            player.setFlying(false);
            player.setAllowFlight(false);
        }

    }

    @org.bukkit.event.EventHandler
    public void onPlayerJoin(@NotNull PlayerJoinEvent e) {

        Player player = e.getPlayer();
        String pname = player.getName();
        Location loc = player.getLocation();
        ClaimedResidence res = ResidenceApi.getResidenceManager().getByLoc(loc);

        if (player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.SPECTATOR || player.isOp() || player.hasPermission("resautofly.bypass")) {
            return;
        }

        if (res != null && player.hasPermission("resautofly.use") && !FlyList.has(pname)) {
            player.setAllowFlight(true);
            FlyList.add(pname);
        } else if (res == null && FlyList.has(pname)){
            FlyList.remove(pname);
            player.setFlying(false);
            player.setAllowFlight(false);
        }

    }

    @org.bukkit.event.EventHandler
    public void onPlayerQuit(@NotNull PlayerQuitEvent e) {

        Player player = e.getPlayer();
        String pname = player.getName();
        Location loc = player.getLocation();
        ClaimedResidence res = ResidenceApi.getResidenceManager().getByLoc(loc);

        if (player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.SPECTATOR || player.isOp() || player.hasPermission("resautofly.bypass")) {
            return;
        }

        if (res != null && player.hasPermission("resautofly.use") && !FlyList.has(pname)) {
            player.setAllowFlight(true);
            FlyList.add(pname);
        } else if (res == null && FlyList.has(pname)){
            FlyList.remove(pname);
            player.setFlying(false);
            player.setAllowFlight(false);
        }

    }
}
