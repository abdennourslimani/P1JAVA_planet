public class HelloUniverse {
    public static void main(String... args) {
            Planete mercure = new Planete();
            mercure.nom ="Mercure";
            mercure.matiere="Téllurique";
            mercure.diametre=4880;
            Planete venus = new Planete();
            venus.nom ="Venus";
            venus.matiere="Téllurique";
            venus.diametre=12100;
            Planete terre = new Planete();
            terre.nom ="Terre";
            terre.matiere="Téllurique";
            terre.diametre=12756;
            Planete mars = new Planete();
            mars.nom ="Mars";
            mars.matiere="Téllurique";
            mars.diametre=6792;
            Planete jupiter= new Planete();
            jupiter.nom ="Jupiter";
            jupiter.matiere="Gazeuze";
            jupiter.diametre=142984;
            Planete saturne= new Planete();
            saturne.nom ="Saturne";
            saturne.matiere="Gazeuze";
            saturne.diametre=120536;
            Planete uranus= new Planete();
            uranus.nom ="Uranus";
            uranus.matiere="Gazeuze";
            uranus.diametre=51118;
            Planete neptune= new Planete();
            neptune.nom ="Neptune";
            neptune.matiere="Gazeuze";
            neptune.diametre=49532;
            Planete planèteX =new Planete();
            System.out.println();
            mars.accueillirVaisseau(8);
            mars.accueillirVaisseau("FREGATE");

            System.out.println("Le nombre d'humains ayant déja séjourné sur Mars est actuellement de "+mars.totalVisiteurs+".");

            //  System.out.println( planèteX.nom +" est une planète " + planèteX.matiere+" avec un diamètrede " +planèteX.diametre+" kilomètres");

    }
}
