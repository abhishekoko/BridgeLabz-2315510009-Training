package JavaLevel1;

public class EarthVolumeCalculator {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double kmToMiles = 1.6;

        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double radiusMiles = radiusKm / kmToMiles;
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " +
                volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}
