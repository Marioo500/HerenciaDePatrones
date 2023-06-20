import java.util.Iterator;
import java.util.Hashtable;
public class CafeMenu extends Menu {
    Hashtable menuItems = new Hashtable();

    public CafeMenu(String name, String description) {
        super(name, description);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}

/*

        addItem("Burrito",
                "A large burrito, with whole pinto beans, salsa, guacamole",
                true, 4.29);
*
* */