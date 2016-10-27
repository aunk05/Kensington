package kensington;

public class Node {

	/*
	 * A node is defined by its cardinal number, which is arbitrary but by (my)
	 * convention nodes are numbered left to right, top to bottom; and an array
	 * of all its immediate neighbours with HIGHER cardinal numbers.
	 */

	int node;
	int[] neighbours;

	public Node(int node, int[] neighbours) {

		this.node = node;
		this.neighbours = neighbours;

	}

}
