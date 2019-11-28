package com.company;

public class HDD_SSD {
    double memorysize;
    int intodisksdivided;

    public HDD_SSD(double memorysize, int intodisksdivided) {
        this.memorysize = memorysize;
        this.intodisksdivided = intodisksdivided;
    }

    public double getMemorysize() {
        return memorysize;
    }

    public void setMemorysize(double memorysize) {
        this.memorysize = memorysize;
    }

    public int getIntodisksdivided() {
        return intodisksdivided;
    }

    public void setIntodisksdivided(int intodisksdivided) {
        this.intodisksdivided = intodisksdivided;
    }
}
