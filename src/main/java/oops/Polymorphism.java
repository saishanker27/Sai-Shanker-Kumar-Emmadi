package oops;

class Quantity {
    public int getQuantity(int qty) {
        return qty;
    }
}

    class Twicequantity extends Quantity {
        @Override
        public int getQuantity(int qty) {
            return qty * 2;
        }
    }
        class Thricequantity extends Quantity {
            @Override
            public int getQuantity(int qty) {
                return qty * 3;
            }
        }

public class Polymorphism {

    public static void main(String args[]) {
        Quantity q = new Quantity();
        Quantity q1 = new Twicequantity();
        Quantity q2 = new Thricequantity();

        System.out.println(q.getQuantity(3));
        System.out.println(q1.getQuantity(3));
        System.out.println(q2.getQuantity(3));
    }
}
