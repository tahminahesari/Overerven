public class Main {
    public static void main(String[] args) {
        FamilyDoctor familyDoctor = new FamilyDoctor();

        familyDoctor.setLastName("House");
        familyDoctor.setHospitalName("Princeton");

        System.out.println("Doctor " + familyDoctor.getHospitalName() + "works at " + familyDoctor.getHospitalName());

        familyDoctor.eat("Lasagne");
        familyDoctor.work();
    }
}
