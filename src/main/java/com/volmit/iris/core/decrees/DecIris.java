/*
 * Iris is a World Generator for Minecraft Bukkit Servers
 * Copyright (c) 2021 Arcane Arts (Volmit Software)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.volmit.iris.core.decrees;

import com.volmit.iris.Iris;
import com.volmit.iris.util.decree.DecreeExecutor;
import com.volmit.iris.util.decree.annotations.Decree;
import com.volmit.iris.util.decree.annotations.Param;

@Decree(name = "irisd", aliases = {"ird"}, description = "Basic Command")
public class DecIris implements DecreeExecutor
{
    private DecIrisStudio studio;

    @Decree(description = "Send a message to yourself", aliases = "p")
    public void ping(
            @Param(name = "message", description = "The message to send", defaultValue = "Pong", aliases = {"msg", "m"})
            String message)
    {
        sender().sendMessage(message + "!");
    }

    @Decree(description = "Print version information", aliases = {"v", "ver"})
    public void version(){
        sender().sendMessage("Iris v" + Iris.instance.getDescription().getVersion() + " by Volmit Software");
    }
}