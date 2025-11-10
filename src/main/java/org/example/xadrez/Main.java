package org.example.xadrez;

import org.example.xadrez.BoardGame.Board;
import org.example.xadrez.Chess.ChessMatch;

public class Main {
    public static void main(String[] args) {
        ChessMatch match=new ChessMatch();
        UI.printBoard(match.getPieces());

    }
}