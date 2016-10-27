package kensington;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GameTest {

	AdjacencyMatrix gameBoard = new AdjacencyMatrix();

	/*
	 * @Test public void occupancyTest() { Board board = new Board(72); for (int
	 * i = 0; i < 72; i++) { assertEquals(board.boardArray[i].colour,
	 * Counter.Colour.GREEN); } }
	 * 
	 * @Test public void triangleTest() {
	 * 
	 * assertEquals(isATriangle(66, 68, 70), true); }
	 * 
	 * 
	 * 
	 * public boolean isATriangle(int node1, int node2, int node3) {
	 * 
	 * if ((gameBoard.adjacencyMatrix[node1][node2]) &&
	 * (gameBoard.adjacencyMatrix[node2][node3]) &&
	 * (gameBoard.adjacencyMatrix[node3][node1]))
	 * 
	 * return true;
	 * 
	 * else return false; }
	 */

	@Test
	public void squareTest() {

		int[] nodes = { 0, 1, 11, 70 };

		assertEquals(isASquare(nodes), true);
	}

	public boolean isASquare(int[] nodes) {

		int i = 1;
		int j = 0;
		int k = 0;
		boolean tim = gameBoard.adjacencyMatrix[nodes[0]][nodes[i]];

		while (!tim)

			{i++;

		if (i > nodes.length)
			return false;}

		

			while (!gameBoard.adjacencyMatrix[nodes[i]][nodes[j]])
				j++;
		if (j > nodes.length)
			return false;

		else

			while (!gameBoard.adjacencyMatrix[nodes[j]][nodes[k]])
				k++;

		if (k > nodes.length)
			return false;

		else if (gameBoard.adjacencyMatrix[nodes[k]][nodes[0]])

			return true;
		else
			return false;

	}
}
