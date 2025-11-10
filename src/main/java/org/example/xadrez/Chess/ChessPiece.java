package org.example.xadrez.Chess;

import org.example.xadrez.BoardGame.Board;
import org.example.xadrez.BoardGame.Piece;

public class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Color color,Board board) {
        super(board);
        this.color=color;
    }

    public Color getColor() {
        return color;
    }
}
