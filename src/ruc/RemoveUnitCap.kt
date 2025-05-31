package ruc

import arc.Events
import mindustry.Vars
import mindustry.game.EventType
import mindustry.game.Team
import mindustry.mod.Mod

class RemoveUnitCap : Mod() {
    init {
        Events.on(EventType.WorldLoadEvent::class.java) { event ->
            if (Vars.net.server()) {
                Team.sharded.ignoreUnitCap = true
            } else {
                Vars.player.team().ignoreUnitCap = true
            }
        }
    }
}