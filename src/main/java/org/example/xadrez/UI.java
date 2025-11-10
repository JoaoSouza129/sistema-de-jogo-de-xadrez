package org.example.xadrez;

import org.example.xadrez.Chess.ChessPiece;

import java.util.Arrays;

public class UI {
    public static void printBoard(ChessPiece[][] pieces){
        for (int i = 0; i <pieces.length ; i++) {
            System.out.print((8-i)+" ");
            for (int j = 0; j <pieces[i].length ; j++) {
                printPiece(pieces[i][j]);

            }
            System.out.println();
        }
        System.out.print("  ");
        for (int i = 0; i < pieces.length; i++) {
            System.out.print((char)(i+97)+" ");
        }
    }

    private static void printPiece(ChessPiece piece){
        if(piece==null)
            System.out.print("-");
        else
            System.out.print(piece);
        System.out.print(" ");
    }
}
