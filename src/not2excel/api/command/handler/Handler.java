package not2excel.api.command.handler;

import not2excel.api.command.objects.CommandInfo;
import not2excel.api.exceptions.CommandException;

/**
 * @author Richmond Steele
 * @since 12/17/13
 * All rights Reserved
 * Please read included LICENSE file
 */
public interface Handler
{
    void handleCommand(CommandInfo info) throws CommandException;
}
