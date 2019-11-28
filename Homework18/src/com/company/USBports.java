package com.company;

public class USBports {
    double porttype;
    String manufacturer;

    public USBports(double porttype, String manufacturer) {
        this.porttype = porttype;
        this.manufacturer = manufacturer;
    }

    public double getPorttype() {
        return porttype;
    }

    public void setPorttype(double porttype) {
        this.porttype = porttype;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
