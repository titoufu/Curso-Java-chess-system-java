package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import boardgame.Board;
import boardgame.Position;
import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ChessMatch chessmatch = new ChessMatch();

		while (true) {
			try {
				UI.clearScreem();
				UI.printBoard(chessmatch.getPieces());
				System.out.println();
				System.out.print("source: ");
				ChessPosition source = UI.readChessPosition(sc);

				System.out.println();
				System.out.print("target: ");
				ChessPosition target = UI.readChessPosition(sc);

				ChessPiece capturedPiece = chessmatch.performChessMove(source, target);
			} catch (ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}

		}

	}

}
