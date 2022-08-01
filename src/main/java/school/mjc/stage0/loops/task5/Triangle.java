package school.mjc.stage0.loops.task5;

public class Triangle {
    public static void main(String[] args) {
        new Triangle().printTriangle(5);
    }

    public void printTriangle(int cathetusLength) {
        for (int i = cathetusLength; i > 0; i--) {
            for (int j = i - 1; j < cathetusLength; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
