package kensington;

public class Board {
	Counter[] boardArray;

	public Board(int numberOfPoints) {

		boardArray = new Counter[numberOfPoints];
		initialise(boardArray);

	}

	public void initialise(Counter[] board) {

		for (int i = 0; i < board.length; i++) {

			board[i] = new Counter(Counter.Colour.GREEN, i);
		}

	}

	public void placeCounter(int nodeNumber, Counter.Colour colour) {

		boardArray[nodeNumber] = new Counter(colour, nodeNumber);
	}
}
