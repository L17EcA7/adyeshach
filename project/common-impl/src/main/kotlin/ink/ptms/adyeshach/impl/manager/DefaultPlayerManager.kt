package ink.ptms.adyeshach.impl.manager

import ink.ptms.adyeshach.core.entity.manager.PlayerManager
import org.bukkit.entity.Player

/**
 * Adyeshach
 * ink.ptms.adyeshach.impl.manager.DefaultPlayerManager
 *
 * @author 坏黑
 * @since 2022/6/28 15:10
 */
open class DefaultPlayerManager(override val owner: Player) : DefaultManager(), PlayerManager {

    override fun getPlayers(): List<Player> {
        return listOf(owner)
    }
}