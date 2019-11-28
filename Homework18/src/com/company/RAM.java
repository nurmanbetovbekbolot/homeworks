package com.company;

public class RAM {
    int RAM;
    String manufacturer;

    public RAM(int RAM, String manufacturer) {
        this.RAM = RAM;
        this.manufacturer = manufacturer;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
