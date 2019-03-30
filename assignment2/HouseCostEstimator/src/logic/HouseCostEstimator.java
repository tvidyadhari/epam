package logic;

public class HouseCostEstimator  {

	public static double calucateCost(String standard, double area, boolean auto) throws Exception {
		if(auto) {
			if(standard.equals("high"))
				return area*2500;
			else
				throw new Exception("fully automated home is with high standard materials only!");
		}	
		if(standard.equals("basic"))
			return area*1200;
		if(standard.equals("above"))
			return area*1500;
		return area*1800;
	}
}
