package com.github.cob.commands;

import com.github.cob.command.CommandHandler;
import com.github.cob.command.CommandListener;
import com.github.cob.enums.EnumInventories;
import com.not2excel.api.command.objects.CommandInfo;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class CommandShop implements CommandListener
{

    @CommandHandler(command = "cob.shop")
    public void shopCommand(CommandInfo args)
    {
        Player p = args.getPlayer();
        if (p == null)
        { return; }
        if (!p.hasPermission("cob.shop"))
        {
            p.sendMessage(ChatColor.DARK_RED + "You do not have permission to do that");
        }
        p.openInventory(EnumInventories.SHOP_MENU.getInventory().getInventory());
    }


}
