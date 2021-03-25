package org.example.labs.tdd;

public class TrajectPrijsService {
    private TrajectNaarTrajectEenhedenService es = new TrajectNaarTrajectEenhedenService();
    private TrajectEenhedenNaarPrijsService ps = new TrajectEenhedenNaarPrijsService();

    public int getTrajectPrijs(String from, String to){
        int eenheden = es.getTrajectEenheden(from, to);
        int prijs = ps.getPriceTrajectEenheden(eenheden);
        return eenheden * prijs;
    }
}
