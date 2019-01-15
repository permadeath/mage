package mage.game.events;

import java.util.UUID;

public class CoinFlippedEvent extends GameEvent {
    private final boolean result;
    private final boolean chosen;
    private final boolean winnable;

    CoinFlippedEvent(UUID playerId, UUID sourceId, boolean result, boolean chosen, boolean winnable) {
        super(EventType.FLIP_COIN, playerId, sourceId, playerId);
        this.result = result;
        this.chosen = chosen;
        this.winnable = winnable;
    }

    public boolean getResult() {
        return result;
    }

    public boolean getChosen() {
        return chosen;
    }

    public boolean isWinnable() {
        return winnable;
    }
}
