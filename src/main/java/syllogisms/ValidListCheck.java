package syllogisms;

import java.util.Map;
import java.util.TreeMap;

public class ValidListCheck {

	Map<String, MoodFigure> moodMap = new TreeMap<String, MoodFigure>();

	public void addSyllogism(MoodFigure syllogism) {
		moodMap.put(syllogism.getName(), syllogism);
	}

	public void testValidity(MoodFigure syllogism) {
		for (MoodFigure name : moodMap.values()) {
			if (name.getName().equalsIgnoreCase("AAA1") || name.getName().equalsIgnoreCase("EAE1")
					|| name.getName().equalsIgnoreCase("AII1") || name.getName().equalsIgnoreCase("EIO1")
					|| name.getName().equalsIgnoreCase("EAE2") || name.getName().equalsIgnoreCase("AEE2")
					|| name.getName().equalsIgnoreCase("EIO2") || name.getName().equalsIgnoreCase("AOO2")
					|| name.getName().equalsIgnoreCase("IAI3") || name.getName().equalsIgnoreCase("AII3")
					|| name.getName().equalsIgnoreCase("OAO3") || name.getName().equalsIgnoreCase("EIO3")
					|| name.getName().equalsIgnoreCase("AEE4") || name.getName().equalsIgnoreCase("IAI4")
					|| name.getName().equalsIgnoreCase("EIO4")) {
				System.out.println(name + " is an unconditionally valid syllogism.");
			} else if (name.getName().equalsIgnoreCase("AAI1") || name.getName().equalsIgnoreCase("EAO1")
					|| name.getName().equalsIgnoreCase("AEO2") || name.getName().equalsIgnoreCase("EAO2")
					|| name.getName().equalsIgnoreCase("AAI3") || name.getName().equalsIgnoreCase("EAO3")
					|| name.getName().equalsIgnoreCase("AEO4") || name.getName().equalsIgnoreCase("EAO4")
					|| name.getName().equalsIgnoreCase("AAI1")) {
				System.out.println(name + " is a conditionally valid syllogism.");
			} else {
				System.out.println(name + " is invalid.");
			}
		}

	}

}
