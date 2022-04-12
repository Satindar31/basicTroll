package cf.satindarsden.basictroll.basiltroll;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class pack implements Listener {
    public void launchCMD(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("pack")) {
            if(sender instanceof Player) {
                Player player = (Player) sender;
                player.setResourcePack("https://raw.githubusercontent.com/Satindar31/BasicTroll/master/pack.zip");
            }
        }



    }
}
