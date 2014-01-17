package com.github.cob.commands;

import com.github.cob.enums.EnumInventories;
import com.not2excel.api.command.CommandHandler;
import com.not2excel.api.command.CommandListener;
import com.not2excel.api.command.objects.CommandInfo;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class CommandHelp implements CommandListener
{

    @CommandHandler(command = "cob.help")
    public void helpCommand(CommandInfo args)
    {
        Player p = args.getPlayer();
        if (p == null)
        { return; }
        if (!p.hasPermission("cob.help"))
        {
            p.sendMessage(ChatColor.DARK_RED + "You do not have permission to do that");
        }
        p.openInventory(EnumInventories.MAIN_HELP.getInventory().getInventory());
    }
}
