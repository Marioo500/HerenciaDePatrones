import java.util.Iterator;
import java.util.ArrayList;
public class Waitress {
    MenuComponent allMenus;


    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
       allMenus.print();
    }
}
