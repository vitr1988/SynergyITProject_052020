package ru.synergyitacademy.homework.matrix;

public class MatrixRunner {

    public static void main(String[] args) {
        Matrix matrixA = new Matrix(new int[][]{{1, 2}, {3, 8}});
        System.out.println(matrixA);
        Matrix matrixB = new Matrix(new int[][]{{10, 20}, {33, 88}});
        System.out.println(matrixB);
//        BigDecimal digit = new BigDecimal("1000");
//        BigDecimal summa = digit.add(new BigDecimal("2000")); // 3000
        Matrix summa = matrixA.summa(matrixB);
        System.out.println(summa);
    }
}

