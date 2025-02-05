package com.yuriaguiar.chess.pieces;

import com.yuriaguiar.boardgame.Board;
import com.yuriaguiar.chess.ChessPiece;
import com.yuriaguiar.chess.Color;

public class Rook extends ChessPiece {
    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
