package com.yuriaguiar.chess.pieces;

import com.yuriaguiar.boardgame.Board;
import com.yuriaguiar.chess.ChessPiece;
import com.yuriaguiar.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
