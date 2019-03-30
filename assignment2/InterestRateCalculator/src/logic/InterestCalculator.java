package logic;

public class InterestCalculator {
	
	public static double simpleInterest(double principle, double time, double rate) {
		return principle*time*rate;
	}
	
	public static double compoundInterest(double principle, double time, double rate, double n) {
		return principle*Math.pow(1+(rate/n), n*time);
	}
}
