public class Main {
    public static void main(String[] args) {
        MenuComponent pancakeHouse = new Menu("PancakeHouse Menu", "Breakfast");
        MenuComponent dinerMenu = new Menu("Diner Menu", "Lunch");
        MenuComponent cafeMenu = new Menu("Cafe Menu", "Dinner");
        MenuComponent dessertMenu = new Menu("Dessert", "Dessert");


        MenuComponent allMenus = new Menu("All menus", "All menus combines");

        allMenus.add(pancakeHouse);
        allMenus.add(cafeMenu);
        allMenus.add(dinerMenu);

        pancakeHouse.add(new MenuItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99));
        pancakeHouse.add(new MenuItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99));
        pancakeHouse.add(new MenuItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries, and blueberry syrup",
                true,
                3.49));


        dinerMenu.add(new MenuItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99));
        dinerMenu.add(new MenuItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99));
        dinerMenu.add(new MenuItem("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29));
        dinerMenu.add(new MenuItem("Hotdog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false, 3.05));

        cafeMenu.add(new MenuItem("Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false, 3.69));
        cafeMenu.add(new MenuItem("Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true, 3.99));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple Pie", "Apple Pie with flakey crust, topped with vanilla ice cream", true, 1.59));

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
    }
}