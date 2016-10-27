package kensington;

public class Counter {

	int cardinal;
	Colour colour;

	enum Colour {
		GREEN, RED, BLUE
	};

	public Counter(Colour colour, int cardinal) {

		this.colour = colour;
		this.cardinal = cardinal;

	}

	public Colour getColour() {
		return colour;
	}

	public int getCardinal() {
		return cardinal;
	}

}
