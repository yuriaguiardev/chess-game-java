package com.yuriaguiar.chess;

import com.yuriaguiar.boardgame.Board;
import com.yuriaguiar.boardgame.Piece;

public class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
