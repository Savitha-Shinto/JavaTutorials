package Lesson4;

public class IdentifiersClass {
    public static void main(String args[]){
        int $numberofItems=100;
        String Hello="smallBox";
        String hello="smallBox";
        String _nameofItems="smallBox";
        String colorOfItems ="Green";
        System.out.println("\n");
        System.out.println("Before Creating the object for Items and this is the input for creating Item object. Item Name : "+ _nameofItems + ", Number of Items : "+ $numberofItems + ", Color of Item : "+ colorOfItems);
        System.out.println("\n");
        Item _item = new Item();
        Item $item = new Item($numberofItems, _nameofItems, colorOfItems);
        Item item = new Item(  colorOfItems);
    }

}

class Item {
    int $numberofItems=5;
    String _nameofItems="LargeBox";
    String colorOfItems ="Black";
    Item() {
        System.out.println("No Argument Constructor with default values");
        System.out.println("Item Name : "+ _nameofItems + ", Number of Items : "+ $numberofItems + ", Color of Item : "+ colorOfItems);
        System.out.println("\n");
    }
    Item(int numberOfItems, String nameofItems, String colorOfItems ) {
        System.out.println("Argument Constructor overriding all properties");
        $numberofItems = numberOfItems;
        _nameofItems = nameofItems;
        this.colorOfItems=colorOfItems;
        System.out.println("Item Name : "+ _nameofItems + ", Number of Items : "+ $numberofItems + ", Color of Item : "+ colorOfItems);
        System.out.println("\n");

    }
    Item( String colorOfItems ) {
        System.out.println("Argument Constructor overriding only color of Item propertie");
        this.colorOfItems=colorOfItems;
        System.out.println("Item Name : "+ _nameofItems + ", Number of Items : "+ $numberofItems + ", Color of Item : "+ colorOfItems);
        System.out.println("\n");
    }

}