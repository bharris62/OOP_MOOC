
public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        while (amount > 0) {
            System.out.printf("*");
            amount--;
        }
        System.out.printf("\n");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        while (amount > 1) {
            System.out.printf(" ");
            amount--;
        }

    }

    public static void printTriangle(int size) {
        // 40.2
        int numberStars = 1;
        int num = 0;
        int triangleSize = size;

        while(num < triangleSize) {
            printWhitespaces(size);
            printStars(numberStars);
            num++;
            size--;
            numberStars++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int treeSize = height;
        int star = 1;
        int treeHeight = 0;

        while(treeHeight < treeSize){
            printWhitespaces(height);
            printStars(star);
            star+=2;
            height--;
            treeHeight++;
        }
        int x = 0;
        while(x < 2) {
            printWhitespaces(treeSize-1);
            printStars(3);
            x++;
        }

    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);

    }
}
