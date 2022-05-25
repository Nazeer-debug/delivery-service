import model.Package;
import service.OfferService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private final static List<Package> packages = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int baseDeliveryCost = scanner.nextInt();
        int noOfPackages = scanner.nextInt();

        for (int i = 0; i < noOfPackages; i++) {
            String id = scanner.next();
            int weight = scanner.nextInt();
            int distance = scanner.nextInt();
            String offerCode = scanner.next();
            packages.add(new model.Package(id, weight, distance, offerCode));
        }


        Calculator calculator = new Calculator(new OfferService());
        calculator.result(baseDeliveryCost, packages);
    }
}
