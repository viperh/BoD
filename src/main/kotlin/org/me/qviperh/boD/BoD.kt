package org.me.qviperh.boD

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin
import org.me.qviperh.boD.listeners.onDeath
import org.me.qviperh.boD.utils.broadcastCredits

class BoD : JavaPlugin() {

    override fun onEnable() {
        server.pluginManager.registerEvents(onDeath(this), this)
        Bukkit.getScheduler().runTaskLater(this, Runnable {
            broadcastCredits(this)
        }, 20L * 60)
    }

    override fun onDisable() {

    }
}
