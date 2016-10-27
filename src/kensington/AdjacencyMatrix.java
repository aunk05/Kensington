package kensington;

public class AdjacencyMatrix {

	Node[] board = new Node[72];
	boolean[][] adjacencyMatrix;

	public AdjacencyMatrix() {
		/*
		 * Builds the graph, ie game board by explicitly defining the nodes by
		 * number and higher-numbered neighbours.
		 */
		board[0] = new Node(0, new int[] { 1, 2, 4 });
		board[1] = new Node(1, new int[] { 3, 5 });
		board[2] = new Node(2, new int[] { 4, 7 });
		board[3] = new Node(3, new int[] { 5, 8 });
		board[4] = new Node(4, new int[] { 5, 11 });
		board[5] = new Node(5, new int[] { 12 });
		board[6] = new Node(6, new int[] { 7, 10, 14 });
		board[7] = new Node(7, new int[] { 11, 15 });
		board[8] = new Node(8, new int[] { 9, 12, 16 });
		board[9] = new Node(9, new int[] { 13, 17 });
		board[10] = new Node(10, new int[] { 14, 18 });
		board[11] = new Node(11, new int[] { 15, 19 });
		board[12] = new Node(12, new int[] { 16, 20 });
		board[13] = new Node(13, new int[] { 17, 21 });
		board[14] = new Node(14, new int[] { 15, 22 });
		board[15] = new Node(15, new int[] { 23 });
		board[16] = new Node(16, new int[] { 17, 24 });
		board[17] = new Node(17, new int[] { 25 });
		board[18] = new Node(18, new int[] { 22, 26 });
		board[19] = new Node(19, new int[] { 20, 23, 27 });
		board[20] = new Node(20, new int[] { 24, 28 });
		board[21] = new Node(21, new int[] { 25, 29 });
		board[22] = new Node(22, new int[] { 26, 30 });
		board[23] = new Node(23, new int[] { 27, 31 });
		board[24] = new Node(24, new int[] { 28, 32 });
		board[25] = new Node(25, new int[] { 29, 33 });
		board[26] = new Node(26, new int[] { 34 });
		board[27] = new Node(27, new int[] { 28, 35 });
		board[28] = new Node(28, new int[] { 36 });
		board[29] = new Node(29, new int[] { 37 });
		board[30] = new Node(30, new int[] { 34, 38 });
		board[31] = new Node(31, new int[] { 35, 39 });
		board[32] = new Node(32, new int[] { 33, 36, 40 });
		board[33] = new Node(33, new int[] { 37 });
		board[34] = new Node(34, new int[] { 38, 42 });
		board[35] = new Node(35, new int[] { 39, 43 });
		board[36] = new Node(36, new int[] { 40, 44 });
		board[37] = new Node(37, new int[] { 41, 45 });
		board[38] = new Node(38, new int[] { 39, 46 });
		board[39] = new Node(39, new int[] { 47 });
		board[40] = new Node(40, new int[] { 41, 48 });
		board[41] = new Node(41, new int[] { 49 });
		board[42] = new Node(42, new int[] { 46, 50 });
		board[43] = new Node(43, new int[] { 44, 47, 51 });
		board[44] = new Node(44, new int[] { 48, 52 });
		board[45] = new Node(45, new int[] { 49, 53 });
		board[46] = new Node(46, new int[] { 50, 54 });
		board[47] = new Node(47, new int[] { 51, 55 });
		board[48] = new Node(48, new int[] { 52, 56 });
		board[49] = new Node(49, new int[] { 53, 57 });
		board[50] = new Node(50, new int[] { 58 });
		board[51] = new Node(51, new int[] { 52, 59 });
		board[52] = new Node(52, new int[] { 60 });
		board[53] = new Node(53, new int[] { 61 });
		board[54] = new Node(54, new int[] { 55, 58, 62 });
		board[55] = new Node(55, new int[] { 59, 63 });
		board[56] = new Node(56, new int[] { 57, 60, 64 });
		board[57] = new Node(57, new int[] { 61, 65 });
		board[58] = new Node(58, new int[] { 62 });
		board[59] = new Node(59, new int[] { 63, 66 });
		board[60] = new Node(60, new int[] { 64, 67 });
		board[61] = new Node(61, new int[] { 65 });
		board[62] = new Node(62, new int[] { 63 });
		board[63] = new Node(63, new int[] { 68 });
		board[64] = new Node(64, new int[] { 65, 69 });
		board[65] = new Node(65, new int[] {});
		board[66] = new Node(66, new int[] { 67, 68, 70 });
		board[67] = new Node(67, new int[] { 69, 71 });
		board[68] = new Node(68, new int[] { 70 });
		board[69] = new Node(69, new int[] { 71 });
		board[70] = new Node(70, new int[] { 71 });
		board[71] = new Node(71, new int[] {});

		adjacencyMatrix = buildMatrix();

	}
	
	
	public Node getNode(int cardinal){
		
		return board[cardinal];
	}

	public boolean[][] buildMatrix() {

		boolean[][] c = new boolean[72][72]; // Initialises the adjacency matrix

		for (int g = 0; g < 72; g++) { // Populates the matrix - all elements
										// false
			for (int h = 0; h < 72; h++) {
				c[g][h] = false;

			}
		}

		for (int i = 0; i < 72; i++) { // Populates the matrix according to
										// defined nodes and neighbours.
			for (int j = 0; j < board[i].neighbours.length; j++) {
				c[i][board[i].neighbours[j]] = true;
				c[board[i].neighbours[j]][i] = true;

			}

		}

		return c;

	}

}
