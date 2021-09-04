public class Planete {
    String nom;
    int diametre;
    String matiere;
    int totalVisiteurs;

    int revolution(int angle) {
        return angle / 360;
    }


    int rotation (int angle){
            return angle/360;

        }
       void accueillirVaisseau(int nouveauHumain){
                totalVisiteurs+=nouveauHumain;
        }
        void accueillirVaisseau(String humains){
            switch(humains){ // humains.equals("CHASSEUR)
                case "CHASSEUR":
                    totalVisiteurs +=3;
                 break;
                case "FREGATE":
                    totalVisiteurs +=12;

                    break;
                case "CROISEUR":
                    totalVisiteurs +=50;
                    break;
            }


        }

}