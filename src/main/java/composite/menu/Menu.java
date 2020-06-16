package composite.menu;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu implements MenuComponent {

    ArrayList menuComponents = new ArrayList();
    String name;
    String description;

    public Menu(String name, String description){
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent)menuComponents.get(i);
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
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void print() {
        System.out.println(getName());
        System.out.println(getDescription());

        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }
}
