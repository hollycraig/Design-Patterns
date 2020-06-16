package composite.menu;

public class MenuTestDrive {

    public static void main(String args[]){
        MenuComponent pancakeHouseMenu = new Menu("Pancake House Menu", "Breakfast");
        MenuComponent dinerMenu = new Menu("Diner Menu", "Lunch");
        MenuComponent cafeMenu = new Menu("Cafe Menu", "Dinner");
        MenuComponent allMenus = new Menu("All Menus", "All Menus Combined");
        MenuComponent dessertMenu = new Menu("Dessert", "Dessert menu");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("pasta", "spaghetti with tomato", true, 20.00));
        dinerMenu.add(dessertMenu);

        //etc

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
