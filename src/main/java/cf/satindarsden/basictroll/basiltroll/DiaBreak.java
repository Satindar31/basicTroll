package cf.satindarsden.basictroll.basiltroll;


import io.papermc.paper.event.block.BlockBreakBlockEvent;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

public class DiaBreak implements Listener {
    @EventHandler

    public void onPlayerBreakDiamonds(BlockBreakBlockEvent event) {
        Block BlockBroken = event.getBlock();

        if(BlockBroken.getType().equals(Material.DIAMOND_ORE)) {

            BlockBroken.setType(Material.AIR);
            ItemStack diamonds = new ItemStack(Material.DIAMOND_BLOCK, 5);
            BlockBroken.getWorld().dropItemNaturally(event.getBlock().getLocation(), diamonds);
        }
    }
}
