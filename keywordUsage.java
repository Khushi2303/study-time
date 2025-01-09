public class KeywordExample {
    public static void main(String[] args) {
        int a = 5, b = 10;

        if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is greater than or equal to b");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Loop count: " + i);
        }

        Helper obj = new Helper();
        System.out.println("Sum: " + obj.add(a, b));
    }
}

class Helper {
    public int add(int x, int y) {
        return x + y;
    }
}
