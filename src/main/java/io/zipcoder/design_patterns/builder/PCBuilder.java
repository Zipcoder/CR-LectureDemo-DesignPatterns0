package io.zipcoder.design_patterns.builder;

import io.zipcoder.design_patterns.abstractFactory.PC;

/**
 * Created by leon on 9/5/17.
 */
public class PCBuilder {
    private double ram;
    private double hdd;
    private double cpu;

    public PCBuilder setRam(double ram) {
        this.ram = ram;
        return this;
    }

    public PCBuilder setHdd(double hdd) {
        this.hdd = hdd;
        return this;
    }

    public PCBuilder setCpu(double cpu) {
        this.cpu = cpu;
        return this;
    }

    public PC build() {
        return new PC(ram, hdd, cpu);
    }
}
