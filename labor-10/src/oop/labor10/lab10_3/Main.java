package oop.labor10.lab10_3;

public class Main {
    public static void main(String[] args) {
        Company comp = new Company("TechCorp");
        comp.hireAll("emps.csv");

        System.out.println("Alphabetically:");
        comp.sortByComparator((e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName()));
        comp.printAll(System.out);

        System.out.println("\nDecreasing salary:");
        comp.sortByComparator((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
        comp.printAll(System.out);

        System.out.println("\nManagers first, then employees, both alphabetically:");
        comp.sortByComparator((e1, e2) -> {
            if (e1 instanceof Manager && !(e2 instanceof Manager)) return -1;
            if (!(e1 instanceof Manager) && e2 instanceof Manager) return 1;
            return e1.getFirstName().compareTo(e2.getFirstName());
        });
        comp.printAll(System.out);
        System.out.println();
        comp.printManagers(System.out);
    }
}
