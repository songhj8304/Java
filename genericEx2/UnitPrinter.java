package generic.genericEx2;

import generic.genericEx2.unit.BioUnit;

public class UnitPrinter {

    public static <T extends BioUnit> void printV1(Shuttle<T> t1){
        T unit = t1.out();
        System.out.println("이름: " + unit.getName()+", HP: " + unit.getHp());
    }

    public static void printV2(Shuttle<? extends BioUnit> t2) {
        BioUnit unit = t2.out();
        System.out.println("이름: " + unit.getName()+", HP: " + unit.getHp());
    }
}
