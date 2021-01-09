class Army {

    public static void createArmy() {
        Unit unit1 = new Unit("Pizduc1");

        Unit unit2 = new Unit("Pizduc2");
        Unit unit3 = new Unit("Pizduc3");
        Unit unit4 = new Unit("Pizduc4");
        Unit unit5 = new Unit("Pizduc5");


        Knight knight1 = new Knight("Pidor1");
        Knight knight2 = new Knight("Pidor2");
        Knight knight3 = new Knight("Pidor3");

        General general = new General("Yebok");

        Doctor doctor = new Doctor("Dolboeb");

    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}