package datastructure;

import java.util.List;

public class recursiveAlgorithms {

    // Hace una escalera de asteriscos que crece en cada fila.
    public static void draw(int n) {
        if (n <= 0) {
            return;
        }
        draw(n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // Pone los números en orden y luego al revés con un palo en medio.
    public static void pattern(int n) {
        if (n <= 0) {
            System.out.print("|");
            return;
        }
        System.out.print(n);
        pattern(n - 1);
        System.out.print(n);
    }

    // Imprime asteriscos seguidos usando recursión.
    public static void printStars(int count) {
        if (count == 0) return;
        System.out.print("* ");
        printStars(count - 1);
    }


    public static void printStarsWithLoop(int count) {
        if (count == 0) return;

        for (int i = 0; i < count; i++) {
            System.out.print("* ");

    }

    // Dibuja un rectángulo de asteriscos usando filas y columnas.
    public static void drawGrid(int rows, int cols) {
        if (rows == 0) return;
        printStars(cols);
        System.out.println();
        drawGrid(rows - 1, cols);
    }

    public static void main(String[] args) {
        printStars(15);
    }

    // Cuenta cuántas formas hay de moverse por una cuadrícula.
    public static int paths(int row, int col) {
        if (row == 0 || col == 0) {
            return 1;
        }
        return paths(row - 1, col) + paths(row, col - 1);
    }

    // Suma todos los dígitos de un número.
    public static int transform(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) + transform(n / 10);
    }

    // Suma solo los números que sean impares de una lista.
    public static int process(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }

        int head = list.get(0);
        List<Integer> rest = list.subList(1, list.size());

        if (head % 2 != 0) {
            return head + process(rest);
        } else {
            return process(rest);
        }
    }

    // Mira qué tan alto o profundo es un árbol de datos.
    public static <T> int analyze(Node<T> node) {
        if (node == null) {
            return 0;
        }

        int a = analyze(node.left);
        int b = analyze(node.right);

        return 1 + Math.max(a, b);
    }

    // Le da la vuelta a una palabra o frase.
    public static String execute(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        return execute(s.substring(1)) + s.charAt(0);
    }

    // Clase para crear los nodos del árbol.
    private class Node<T> {
        public Node<T> left;
        public Node<T> right;
    }
}