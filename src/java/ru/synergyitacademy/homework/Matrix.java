package ru.synergyitacademy.homework;

public class Matrix {
    //поля класса
    int n = 0, m = 0;
    private int array[][];

    //перегруженный конструктор
    Matrix(int[][] array) {
        this.array = array;
        this.n = array.length;
        this.m = array[0].length;
    }

    //перегруженный конструктор
    Matrix(Matrix matrix) {
        this.array = matrix.array;
        this.n = matrix.n;
        this.m = matrix.m;
    }

    //конструктор по-умолчанию
    Matrix() {
        this.n = 2;
        this.m = 2;
        this.array = new int[n][m];
    }

    public int getN() {
//        return this.array.length;
        return n;
    }

    public int getM() {
//        return getN() > 0 ? this.array[0].length : 0;
        return m;
    }

    //сложение
    Matrix summa(Matrix matrixB) {
        if (this.getN() != matrixB.getN() || this.getM() != matrixB.getM()) {
            return null;
        }

        Matrix resultMatrix = new Matrix(new int[this.getN()][this.getM()]);
        for (int i = 0; i < resultMatrix.n; i++) {
            for (int j = 0; j < resultMatrix.m; j++) {
                resultMatrix.array[i][j] = this.array[i][j] + matrixB.array[i][j];
            }
        }
        return resultMatrix;
    }

    @Override
    public String toString() {
        String result = "Matrix{" +
                "n=" + n +
                ", m=" + m +
                ", array=\n";
        for (int i = 0; i < array.length; i++) {
            result += "(";
            for (int j = 0; j < array[i].length; j++) {
                result += this.array[i][j] + " ";
            }
            result += ")\n";
        }
        return result + '}';
    }
}

