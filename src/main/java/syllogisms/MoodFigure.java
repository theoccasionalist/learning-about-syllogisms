package syllogisms;


public class MoodFigure {
	private String major;
	private String minor;
	private String conclusion;
	private String figure;
	private String name;

	public MoodFigure(String major, String minor, String conclusion, String figure) {
		this.major = major;
		this.minor = minor;
		this.conclusion = conclusion;
		this.figure = figure;
	}

	public String getMajor() {
		return major;
	}

	public String getMinor() {
		return minor;
	}

	public String getConclusion() {
		return conclusion;
	}

	public String getFigure() {
		return figure;
	}

	public String getName() {
		name = major.toUpperCase() + minor.toUpperCase() + conclusion.toUpperCase() + figure;
		return name;
	}

	@Override
	public String toString() {
		return "The name is: " + name;
	}

}
