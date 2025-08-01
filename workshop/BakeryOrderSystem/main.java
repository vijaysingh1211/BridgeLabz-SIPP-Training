package workshop.BakeryOrderSystem;

public class main {
    public static void main(String[] args) {
       orderQueue<order> bakeryQueue = new orderQueue<>();

        bakeryQueue.addOrder(new order("Red Velvet Cake",	5,	"Cake"));
        bakeryQueue.addOrder(new order("Oatmeal Raisin Cookie",	20,	"Cookie"));
        bakeryQueue.addOrder(new order("Chocolate Chip Cookie",	15,	"Cookie"));
        
        while (!bakeryQueue.isEmpty()) {
            order served = bakeryQueue.removeOrder();
            System.out.println("Serving:"+served);
            System.out.println("Next to be served: " + bakeryQueue.peekNext());
        }
    }
}
