package domain;

public class Grade {

	private int value;

	private Researcher reviewer;

	public Grade(int value, Researcher reviewer) {
		this.value = value;
		this.reviewer = reviewer;
	}

	public int getValue() {
		return this.value;
	}

	public Researcher getReviewer() {
		return this.reviewer;
	}

}
