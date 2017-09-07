package io.zipcoder.design_patterns.abstractFactory;


/**
 * Created by leon on 9/5/17.
 */
public class PCFactory implements AbstractFactory {
    private double ram;
    private double hdd;
    private double cpu;

    public PCFactory(double r, double h, double c) {
        this.ram = r;
        this.hdd = h;
        this.cpu = c;
    }

    public Computer createComputer() {
        return new PC(ram, hdd, cpu);
    }
}
