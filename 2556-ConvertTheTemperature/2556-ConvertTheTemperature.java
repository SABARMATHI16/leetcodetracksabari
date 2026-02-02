// Last updated: 2/2/2026, 2:28:24 PM
class Solution {
    public double[] convertTemperature(double celsius) {
        double[] d=new double[2];
        d[0]=celsius + 273.15;
        d[1]=celsius  * 1.80 + 32.00;
        return d;
    }
}