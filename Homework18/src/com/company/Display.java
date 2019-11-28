package com.company;

public class Display {
    double diagonal;
    String manufacturer;
    String matrixtype;

    public Display(double diagonal, String manufacturer, String matrixtype) {
        this.diagonal = diagonal;
        this.manufacturer = manufacturer;
        this.matrixtype = matrixtype;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMatrixtype() {
        return matrixtype;
    }

    public void setMatrixtype(String matrixtype) {
        this.matrixtype = matrixtype;
    }
}
