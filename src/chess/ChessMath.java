package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMath {

	private Board board;

	public ChessMath() {
		board = new Board(8, 8);
		initialSetup();
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat= new ChessPiece[board.getRow()][board.getColumn()];
		for (int i=0;i<board.getRow();i++) {
			for (int j=0;j<board.getColumn();j++) {
				mat[i][j]=(ChessPiece)board.piece(i, j);
			}
		}
		return mat;
	}
	private void initialSetup() {
		board.PlacePiece(new Rook(board, Color.WHITE), new Position(6, 2));
		board.PlacePiece(new King(board, Color.BLACK), new Position(0, 4));
		board.PlacePiece(new King(board, Color.WHITE), new Position(7, 4));
		
	}
}
