package io.zipcoder.design_patterns.abstractFactory;


/**
 * Created by leon on 9/5/17.
 */
public abstract class Computer {
    private double ram;
    private double hdd;
    private double cpu;

    public Computer(double ram, double hdd, double cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    public double getRam() {
        return ram;
    }

    public double getHdd() {
        return hdd;
    }

    public double getCpu() {
        return cpu;
    }

    @Override
    public String toString(){
        return String.format(
                "Config :: RAM = %s CPU = %s HDD = %s",
                getRam(),
                getCpu(),
                getHdd());
    }

}
