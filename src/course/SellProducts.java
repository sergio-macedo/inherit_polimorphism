package course;

import entities.Employee;
import entities.ImportedProducts;
import entities.Product;
import entities.UsedProducts;

import javax.swing.event.ListDataEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SellProducts {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product " + i + "data");
            System.out.println("Common, used or imported(c/u/i)? ");
            char c = sc.next().charAt(0);
            System.out.print("Name");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price");
            double price = sc.nextDouble();
            if (c == 'c') {
                Product product = new Product(name, price);
                list.add(product);
            }
            if (c == 'i') {
                System.out.println("Customs fee");
                double customsFee = sc.nextDouble();
                Product product = new ImportedProducts(name, price, customsFee);
                list.add(product);
            }
            if (c == 'u') {
                System.out.println("Manufacture date");
                Date manufactureDate = sdf.parse(sc.next());
                Product product = new UsedProducts(name, price, manufactureDate);
                list.add(product);
            }


        }
        System.out.println();
        System.out.println("PRICE TAGS");
        for (Product prod : list) {
            System.out.println(prod.priceTag());
        }

        sc.close();
    }
}
