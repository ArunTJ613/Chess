package chess;
import java.lang.Math;

public class King extends Piece{
	private PieceColour colour;
	private String symbol;

	public King(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.symbol="♔";
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.symbol="♚";
		}
	}
	public String getSymbol(){
		return symbol;
	}
	public PieceColour getColour(){
		return colour;
	}

	@Override
	public boolean isLegitMove(int i0, int j0, int i1, int j1) {
		Piece p = Board.getPiece(i0,j0);
		PieceColour col = p.getColour();
		boolean b = Board.hasPiece(i1,j1);
		if (b){
			Piece pp = Board.getPiece(i1,j1);
			PieceColour colo = pp.getColour();
			if (col.equals(colo)){
				return false;
			}
		}
		if ((Math.abs(i1-i0) <= 1) && (Math.abs(j1-j0) <= 1)){
			return true;
		} else {
			return false;
		}
	}
}
