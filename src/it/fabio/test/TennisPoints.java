package it.fabio.test;

public enum TennisPoints {
	LOVE(0), FIFTEEN(1), THIRTY(2), FORTY(3);

	private int points;

	private TennisPoints(int points) {
		this.points = points;
	}

	public static String getDescrStr(int points){
		return getDescription(points).toString();
	}
	
	public static TennisPoints getDescription(int points) {
		for (TennisPoints e : TennisPoints.values()) {
			if (e.points == points) {
				return e;
			}
		}
		return null;// not found
	}

}
