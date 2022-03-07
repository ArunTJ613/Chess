package chess;

public class Bishop extends Piece{
	private PieceColour colour;
	private String symbol;

	public Bishop(PieceColour pc){
		if (pc.equals(PieceColour.WHITE)){
			this.colour=PieceColour.WHITE;
			this.symbol="♗";
		}
		else if (pc.equals(PieceColour.BLACK)){
			this.colour=PieceColour.BLACK;
			this.symbol="♝";
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
		boolean bool = Board.hasPiece(i1,j1);
		if (bool){
			Piece pp = Board.getPiece(i1,j1);
			PieceColour colo = pp.getColour();
			if (colo.equals(col)){
				return false;
			}
		}


		if (p instanceof Bishop) {
			if (i1>i0){
				if (j1>j0){
					if (i1-i0 == j1-j0){
						if (i1-i0 == 1){
							return true;
						}
						i0++;
						j0++;
						for(int count = i1-i0; count > 0; count-=1){
              boolean b = Board.hasPiece(i0,j0);
							if (b){
								return false;
							}
							i0++;
							j0++;
						}
						return true;
				 } else {
						return false;
					}
				} else if (j0>j1) {
					if (i1-i0 == j0-j1){
						if (i1-i0 == 1){
							return true;
						}
						i0++;
						j0-=1;
						for(int count = i1-i0; count > 0; count-=1){
              boolean b = Board.hasPiece(i0,j0);
							if (b){
								return false;
							}
							i0++;
							j0-=1;
					}
					return true;
				}
			} else {
				return false;
			}

		} else if (i0>i1){
			if (j1>j0){
				if (i0-i1 == j1-j0){
					if (i0-i1 == 1){
						return true;
					}
					i0-=1;
					j0++;
					for(int count = i0-i1; count > 0; count-=1){
						boolean b = Board.hasPiece(i0,j0);
						if (b){
							return false;
						}
						i0-=1;
						j0++;
					}
					return true;
			 } else {
					return false;
				}
			} else if (j0>j1) {
				if (i0-i1 == j0-j1){
					if (i0-i1 == 1){
						return true;
					}
					i0-=1;
					j0-=1;
					for(int count = i0-i1; count > 0; count-=1){
						boolean b = Board.hasPiece(i0,j0);
						if (b){
							return false;
						}
						i0-=1;
						j0-=1;
				} return true;
			} return false;
		} else {
			return false;
		}

	} else {
		return false;
	}
} else {
	return false;
} return false;
}
}
