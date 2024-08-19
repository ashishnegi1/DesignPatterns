package StructuralPattern.CompositePattern;

public class Demo {
    public static void main(String[] args) {

        LamborghiniEmployee CEO = new LamborghiniEmployee("Stephan Winkelmann", "CEO", 1000000);

        LamborghiniEmployee CTO = new LamborghiniEmployee("Rouven Mohr", "CTO", 500000);
        LamborghiniEmployee CMO = new LamborghiniEmployee("Ranieri Niccoli", "CMO", 500000);

        LamborghiniEmployee researcher1 = new LamborghiniEmployee("Karl", "Technical", 100000);
        LamborghiniEmployee researcher2 = new LamborghiniEmployee("chandler", "Technical", 100000);

        LamborghiniEmployee staff1 = new LamborghiniEmployee("Chris", "Manufacturing", 100000);
        LamborghiniEmployee staff2 = new LamborghiniEmployee("Tareq", "Manufacturing", 100000);

        CEO.add(CMO);
        CEO.add(CTO);

        CMO.add(staff1);
        CMO.add(staff2);

        CTO.add(researcher1);
        CTO.add(researcher2);

        System.out.println(CEO);

        for (LamborghiniEmployee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);

            for (LamborghiniEmployee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }

    }
}
