package chess;

public class Pawn extends Piece{
	private PieceColour colour;
	private String symbol;

	public Pawn(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.symbol="♙";
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.symbol="♟";
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
		if (i0 - i1 > 2 || i1 - i0 > 2){
			return false;
		}
		boolean b = Board.hasPiece(i1,j1);
		if (b){
			Piece pp = Board.getPiece(i1,j1);
			PieceColour colo = pp.getColour();
			if (j1==j0){
				return false;
			} else if ((j1-j0 == 1 || j0-j1 == 1) && (i1-i0 == 1||i0-i1 == 1)){
				if (col.equals(colo)){
					return false;
				} else {
					return true;
				}
			}
		}
		if (j1!=j0){
			return false;
		}
		if (col.equals(PieceColour.WHITE)){
			if (i0-i1==2){
				if (i0 == 6){
					return true;
				}
			} else if (i0-i1==1){
				return true;
			} else {
				return false;
			}
		} else {
			if (i1-i0==2){
				if (i0 == 1){
					return true;
				}
			} else if (i1-i0==1){
				return true;
			} else {
				return false;
			}
		} return false;


	}
}
