package com.jcloisterzone.action;

import com.jcloisterzone.board.Location;
import com.jcloisterzone.board.Position;
import com.jcloisterzone.board.pointer.FeaturePointer;
import com.jcloisterzone.game.capability.TowerCapability.TowerToken;
import com.jcloisterzone.io.message.Message;
import com.jcloisterzone.io.message.PlaceTokenMessage;
import io.vavr.collection.Set;

public class TowerPieceAction extends SelectTileAction {

    public TowerPieceAction(Set<Position> options) {
        super(options);
    }

    @Override
    public Message select(Position pos) {
        return new PlaceTokenMessage(TowerToken.TOWER_PIECE, new FeaturePointer(pos, Location.TOWER));
    }

    @Override
    public String toString() {
        return "place tower piece";
    }

}
