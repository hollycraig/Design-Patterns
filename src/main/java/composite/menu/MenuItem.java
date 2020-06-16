package composite.menu;

public class MenuItem implements MenuComponent {

    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String des, boolean veg, double price){
        this.name = name;
        this.description = des;
        this.vegetarian= veg;
        this.price = price;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();

    }

    @Override
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();

    }

    @Override
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void print() {
        System.out.println(" " + getName());
        System.out.println(" " + getPrice());
        System.out.println(" " + getDescription());

    }
}
