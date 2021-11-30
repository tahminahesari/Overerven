public class FamilyDoctor extends Person {

    private String hospitalName;

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;


//        public void eat(String food, boolean like) //Dat gaat niet en dat is ook logisch. Deze methode staat namelijk niet beschreven in de supertype en omdat de referentie variabele verwijst naar het supertype, kan Java deze methode niet vinden.
//        {
//            super.eat(food);
//            if(like) {
//                System.out.print(". And I like it.");
//            } else {
//                System.out.print(". And it tastes awful!");
//            }
//            }
        }

        @Override
        public void work (); {
            System.out.println("I do family-doctor-work.");
        }
    }



