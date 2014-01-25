package com.github.cob.commands;

import com.github.cob.enums.EnumInventories;
import com.not2excel.api.command.CommandHandler;
import com.not2excel.api.command.CommandListener;
import com.not2excel.api.command.objects.CommandInfo;
import org.bukkit.entity.Player;

public class CommandSpells implements CommandListener
{

    @CommandHandler(command = "cob.spells" , permission = "cob.spells")
    public void shopCommand(CommandInfo args)
    {
        Player p = args.getPlayer();
        if (p == null)
        { return; }

        p.openInventory(EnumInventories.SPELL_FACTORY.getInventory().getInventory());
    }


}