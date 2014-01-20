package com.github.cob.commands;


import com.github.cob.enums.EnumInventories;
import com.not2excel.api.command.CommandHandler;
import com.not2excel.api.command.CommandListener;
import com.not2excel.api.command.objects.CommandInfo;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class CommandShop implements CommandListener
{

    @CommandHandler(command = "cob.shop" , permission = "cob.shop")
    public void shopCommand(CommandInfo args)
    {
        Player p = args.getPlayer();
        if (p == null)
        { return; }
        
        p.openInventory(EnumInventories.SHOP_MENU.getInventory().getInventory());
    }


}
