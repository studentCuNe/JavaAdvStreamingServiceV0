package be.pxl.ja.streamingservice.model;

public abstract class Content {
	private String title;
	private Rating maturityRating;

	public Content(String title, Rating maturityRating) {
		this.title = title;
		this.maturityRating = maturityRating;
	}

	public Rating getMaturityRating() {
		return maturityRating;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return title;
	}
}
