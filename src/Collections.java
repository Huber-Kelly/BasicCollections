public class Collections {
    int addition(int a, int b) {
        int result = a + b;
        return result;
    }
    public static void main (String [] args) {
        int x = 10;
        int y = 9;

        Collections obj = new Collections();
        int result = obj.addition(x,y);
        System.out.println("The answer is " + result);
    }

}
