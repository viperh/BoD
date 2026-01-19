# Ban on Death

A lightweight Paper/Spigot plugin that automatically bans players when they die using Minecraft’s native ban system.

## Features
- Automatic ban on player death
- Uses the vanilla ban system (banned-players.json)
- Fully compatible with /unban
- Bans persist across restarts
- Plug-and-play, no configuration

## How it works
When a player dies, the plugin bans them via the Bukkit/Paper API.
Because the native ban list is used:
- /unban <player> works normally
- No external dependencies are required

## Compatibility
- Paper / Spigot
- Minecraft 1.21+
- Kotlin-based plugin

## Notes
- Does not integrate with external ban plugins (LiteBans, Essentials, etc.)
- Intended for hardcore or challenge-style servers

## License
MIT