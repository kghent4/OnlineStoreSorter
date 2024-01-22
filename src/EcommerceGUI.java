import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class EcommerceGUI extends JFrame {

    //Variables
    private final DefaultListModel<Product> productListModel;

    ArrayList<Product> products = new ArrayList<Product>();              

    public EcommerceGUI() {

        fillProductList();

        productListModel = new DefaultListModel<>();
        JList<Product> productList = new JList<>(productListModel);

        JButton displayButton = new JButton("Display Products");
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayProducts();
            }
        });

        JButton sortButton = new JButton("Sort Products");
        sortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sortProducts();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(displayButton);
        buttonPanel.add(sortButton);

        add(new JScrollPane(productList));
        add(buttonPanel, "South");

        setTitle("E-commerce Store");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void fillProductList(){
        products.add(new Product("Laptop", 800, 4.5, "Electronics"));
        products.add(new Product("Headphones", 50, 4.0, "Electronics"));
        products.add(new Product("T-shirt", 20, 3.8, "Fashion"));
        products.add(new Product("Backpack", 40, 4.2, "Fashion"));
        products.add(new Product("Book", 15, 4.7, "Books"));
        products.add(new Product("Smartphone", 600, 4.2, "Electronics"));
        products.add(new Product("Wireless Mouse", 25, 4.5, "Electronics"));
        products.add(new Product("Jeans", 30, 4.0, "Fashion"));
        products.add(new Product("Sneakers", 50, 4.3, "Fashion"));
        products.add(new Product("Cookbook", 18, 4.6, "Books"));
        products.add(new Product("Gaming Console", 350, 4.7, "Electronics"));
        products.add(new Product("Watch", 80, 4.0, "Fashion"));
        products.add(new Product("Novel", 12, 4.8, "Books"));
        products.add(new Product("Fitness Tracker", 45, 4.2, "Electronics"));
        products.add(new Product("Sunglasses", 35, 4.5, "Fashion"));
        products.add(new Product("Desktop Computer", 1200, 4.6, "Electronics"));
        products.add(new Product("Bluetooth Earbuds", 35, 4.3, "Electronics"));
        products.add(new Product("Hoodie", 25, 4.2, "Fashion"));
        products.add(new Product("Running Shoes", 60, 4.4, "Fashion"));
        products.add(new Product("Graphic Novel", 15, 4.5, "Books"));
        products.add(new Product("Tablet", 300, 4.0, "Electronics"));
        products.add(new Product("Dress Shirt", 40, 4.1, "Fashion"));
        products.add(new Product("Art Book", 22, 4.7, "Books"));
        products.add(new Product("Wireless Speaker", 50, 4.2, "Electronics"));
        products.add(new Product("Handbag", 55, 4.3, "Fashion"));
        products.add(new Product("Academic Textbook", 80, 4.6, "Books"));
        products.add(new Product("Digital Camera", 400, 4.4, "Electronics"));
        products.add(new Product("Denim Jacket", 45, 4.1, "Fashion"));
        products.add(new Product("Mystery Novel", 18, 4.8, "Books"));
        products.add(new Product("Smart TV", 900, 4.7, "Electronics"));
        products.add(new Product("Wireless Keyboard", 30, 4.4, "Electronics"));
        products.add(new Product("Sweater", 28, 4.0, "Fashion"));
        products.add(new Product("Running Watch", 70, 4.5, "Fashion"));
        products.add(new Product("Sci-Fi Book", 20, 4.6, "Books"));
        products.add(new Product("Gaming Laptop", 1200, 4.8, "Electronics"));
        products.add(new Product("Leather Jacket", 85, 4.2, "Fashion"));
        products.add(new Product("Historical Novel", 25, 4.3, "Books"));
        products.add(new Product("Digital Clock", 15, 4.1, "Electronics"));
        products.add(new Product("Sun Hat", 18, 4.4, "Fashion"));
        products.add(new Product("Cooking Book", 28, 4.5, "Books"));
        products.add(new Product("Bluetooth Speaker", 40, 4.3, "Electronics"));
        products.add(new Product("Backpacking Backpack", 50, 4.2, "Fashion"));
        products.add(new Product("Travel Guide", 18, 4.6, "Books"));
        products.add(new Product("VR Headset", 250, 4.5, "Electronics"));
        products.add(new Product("Wireless Charging Pad", 20, 4.2, "Electronics"));
        products.add(new Product("Winter Jacket", 45, 4.1, "Fashion"));
        products.add(new Product("Running Shorts", 18, 4.3, "Fashion"));
        products.add(new Product("Fantasy Book", 22, 4.7, "Books"));
        products.add(new Product("Smart Home Camera", 60, 4.4, "Electronics"));
        products.add(new Product("Formal Dress", 55, 4.0, "Fashion"));
        products.add(new Product("Science Fiction Anthology", 30, 4.6, "Books"));
        products.add(new Product("Noise-Canceling Headphones", 120, 4.8, "Electronics"));
        products.add(new Product("Fashion Backpack", 35, 4.2, "Fashion"));
        products.add(new Product("Biography Book", 25, 4.5, "Books"));
        products.add(new Product("Portable Bluetooth Printer", 80, 4.3, "Electronics"));
        products.add(new Product("Summer Sandals", 30, 4.1, "Fashion"));
        products.add(new Product("Self-Help Book", 15, 4.6, "Books"));
        products.add(new Product("Wireless Router", 70, 4.4, "Electronics"));
        products.add(new Product("Graphic Design Software", 50, 4.6, "Electronics"));
        products.add(new Product("Pullover Hoodie", 35, 4.2, "Fashion"));
        products.add(new Product("Cycling Helmet", 25, 4.3, "Fashion"));
        products.add(new Product("Historical Fiction Book", 18, 4.5, "Books"));
        products.add(new Product("Digital Drawing Tablet", 120, 4.8, "Electronics"));
        products.add(new Product("Casual Sneakers", 40, 4.0, "Fashion"));
        products.add(new Product("Poetry Collection", 15, 4.7, "Books"));
        products.add(new Product("Fitness Smartwatch", 80, 4.3, "Electronics"));
        products.add(new Product("Laptop Backpack", 45, 4.2, "Fashion"));
        products.add(new Product("Art History Book", 22, 4.6, "Books"));
        products.add(new Product("Bluetooth Earphones", 30, 4.1, "Electronics"));
        products.add(new Product("Winter Scarf", 18, 4.5, "Fashion"));
        products.add(new Product("Classic Literature Novel", 28, 4.2, "Books"));
        products.add(new Product("Smart Thermostat", 100, 4.7, "Electronics"));
        products.add(new Product("Formal Shirt", 38, 4.0, "Fashion"));
        products.add(new Product("Mystery Thriller Book", 24, 4.3, "Books"));
        products.add(new Product("Wireless Gaming Mouse", 55, 4.4, "Electronics"));
        products.add(new Product("Denim Jeans", 30, 4.1, "Fashion"));
        products.add(new Product("Travel Memoir", 20, 4.6, "Books"));
        products.add(new Product("Fitness Resistance Bands", 15, 4.8, "Electronics"));
        products.add(new Product("Leather Wallet", 28, 4.2, "Fashion"));
        products.add(new Product("Science Magazine", 10, 4.5, "Books"));
        products.add(new Product("Smart Doorbell", 120, 4.3, "Electronics"));
        products.add(new Product("Summer Dress", 50, 4.0, "Fashion"));
        products.add(new Product("Business Strategy Book", 32, 4.6, "Books"));
        products.add(new Product("Wireless Gaming Headset", 90, 4.4, "Electronics"));
        products.add(new Product("Athletic Leggings", 25, 4.2, "Fashion"));
        products.add(new Product("Romance Novel", 18, 4.7, "Books"));
        products.add(new Product("Bluetooth Karaoke Microphone", 40, 4.1, "Electronics"));
        products.add(new Product("Baseball Cap", 20, 4.5, "Fashion"));
        products.add(new Product("Historical Biography Book", 28, 4.3, "Books"));
        products.add(new Product("Fitness Tracker with GPS", 70, 4.0, "Electronics"));
        products.add(new Product("Laptop Sleeve", 15, 4.6, "Fashion"));
        products.add(new Product("Psychology Book", 26, 4.2, "Books"));
        products.add(new Product("Portable Solar Charger", 50, 4.8, "Electronics"));
        products.add(new Product("Sweatpants", 30, 4.4, "Fashion"));
        products.add(new Product("Graphic Novel Series", 35, 4.1, "Books"));
        products.add(new Product("Bluetooth Soundbar", 80, 4.5, "Electronics"));
        products.add(new Product("Knit Beanie", 18, 4.3, "Fashion"));
        products.add(new Product("Art Sketchbook", 22, 4.7, "Books"));
        products.add(new Product("Wireless Gaming Keyboard", 110, 4.2, "Electronics"));
        products.add(new Product("Casual Backpack", 40, 4.0, "Fashion"));
        products.add(new Product("Science Fiction Series", 30, 4.6, "Books"));
        products.add(new Product("Portable Air Purifier", 65, 4.3, "Electronics"));
        products.add(new Product("Denim Skirt", 28, 4.1, "Fashion"));
        products.add(new Product("Historical Mystery Novel", 24, 4.5, "Books"));
        products.add(new Product("Wireless Charging Stand", 45, 4.2, "Electronics"));
        products.add(new Product("Gaming Chair", 150, 4.7, "Fashion"));
        products.add(new Product("Travel Puzzle Book", 20, 4.3, "Books"));


    }

    private void displayProducts() {
        productListModel.clear();
        
        products.forEach(productListModel::addElement);
    }

    private void sortProducts() {
        Object[] options = {"Price", "Rating", "Category"};
        int choice = JOptionPane.showOptionDialog(this, "Sort products by:", "Sort Products",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (choice != JOptionPane.CLOSED_OPTION) {

            productListModel.clear();

            switch (choice) {
                case 0:
                    System.out.println("The user chose to sort based on price.");
                    break;
                case 1:
                    System.out.println("The user chose to sort based on Rating.");
                    break;
                case 2:
                    System.out.println("The user chose to sort based on Category.");
                    break;
                default:
                    return;
            }

            int index = 0;
            for(Product p: products){
                productListModel.add(index, p);
                index++;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EcommerceGUI().setVisible(true);
            }
        });
    }
}
