package dev.veski.souper;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Souper extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("/soup :)");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("soup")) {
            double randNumber = Math.random();
            double d = randNumber * 100;
            int randomInt = (int)d;

            if (!(sender instanceof Player)) {
                Bukkit.broadcastMessage("<Server> /soup");
                if (randomInt == 1) {
                    Bukkit.broadcastMessage("<EPFL_ch> ˢᵒᵘᵖ");
                }
                return true;
            }

            Bukkit.broadcastMessage("<" + ((Player) sender).getDisplayName() + "> /soup");
            if (randomInt == 1) {
                Bukkit.broadcastMessage("<EPFL_ch> ˢᵒᵘᵖ");
            }
            return true;
        }
        return true;
    }
    @Override
    public void onDisable() {
        Bukkit.getLogger().info("/soup :(");
    }
}
