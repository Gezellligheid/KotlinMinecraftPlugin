package me.Gezelligheid.Startup.Events

import com.destroystokyo.paper.event.player.PlayerJumpEvent
import me.Gezelligheid.Startup.Main
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.AsyncPlayerChatEvent

object Event : Listener {

    @EventHandler
    fun chat(e: AsyncPlayerChatEvent){

        e.player.sendMessage("boe")

    }

}