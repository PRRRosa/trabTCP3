package domain;

public class Affiliation {

	private int id;

	private String name;

	public Affiliation(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getAffiliationName() {
		return this.name;
	}

	public int getAffiliationID() {
		return this.id;
	}

}
