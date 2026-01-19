package org.me.qviperh.boD.listeners

import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.PlayerDeathEvent
import org.me.qviperh.boD.BoD


class onDeath(val plugin: BoD): Listener {

    @EventHandler
    fun onDeath(event: PlayerDeathEvent) {
        val player = event.entity
        player.banPlayer("Banned on death")
        plugin.server.broadcastMessage("${player.name} has been banned on death.")
    }
}