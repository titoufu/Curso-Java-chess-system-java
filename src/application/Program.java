package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMath;

public class Program {

	public static void main(String[] args) {

	ChessMath chessmath  = new ChessMath();
	UI.printBoard(chessmath.getPieces());
	}

}
