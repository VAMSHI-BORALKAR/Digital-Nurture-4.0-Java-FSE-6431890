public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("cat.jpg");
        Image image2 = new ProxyImage("dog.jpg");

        System.out.println("First time displaying cat:");
        image1.display();

        System.out.println("\nSecond time displaying cat:");
        image1.display();

        System.out.println("\nDisplaying dog image:");
        image2.display();
    }
}
