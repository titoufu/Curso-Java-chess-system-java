package boardgame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces; // matriz de objetos Piece...

	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Erro ao criar o tabuleiro: É preciso pelo menos uma linha e uma coluna");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public Piece piece(int row, int column) {
		if (!PositionExists(row, column)) {
			throw new BoardException("Posição inexistente ");
		}
		return pieces[row][column];
	}

	public Piece piece(Position position) {
		if (!PositionExists(position)) {
			throw new BoardException("Posição inexistente ");
		}
		return pieces[position.getRow()][position.getColum()];
	}

	public void PlacePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("Já existe uma peça na posição " + position);
		}

		pieces[position.getRow()][position.getColum()] = piece;
		piece.position = position;

	}

	private boolean PositionExists(int row, int column) {
		return row >= 0 && row <= 8 && column >= 0 && column <= 8;
	}

	public boolean PositionExists(Position position) {

		return PositionExists(position.getRow(), position.getColum());

	}

	public boolean thereIsAPiece(Position position) {
		if (!PositionExists(position)) {
			throw new BoardException("Posição inexistente ");
		}
		return piece(position) != null;

	}
}
