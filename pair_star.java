package CodingNinjas;

public class pair_star {
	public static String addStars(String s) {
		if(s.length()==1)
            return s;
        String smallans=addStars(s.substring(1));
        if(s.charAt(0)==smallans.charAt(0))
            return s.charAt(0)+"*"+smallans;
        else
            return s.charAt(0)+smallans;
	}

}
