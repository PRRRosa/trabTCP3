package domain;

public class SearchTopics {

	private int id;

	private String name;

	public SearchTopics(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getSearchTopicsName() {
		return this.name;
	}

	public int getSearchTopicsID() {
		return this.id;
	}

}
