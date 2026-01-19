package org.me.qviperh.boD.utils

import org.bukkit.BanList
import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.me.qviperh.boD.BoD


fun broadcastCredits(plugin: BoD) {
    val creditsMessage = """
        &6&l=== Ban on Death Plugin ===
        &eDeveloped by: &aqviperH
        &eGitHub: &ahttps://github.com/viperh/
        &eDiscord: &aviperasuu
        &eThank you for using BoD!
        
    """.trimIndent()
    plugin.server.broadcastMessage(formatString(creditsMessage))
}

fun formatString(input: String): String{
    return ChatColor.translateAlternateColorCodes('&', input)
}
