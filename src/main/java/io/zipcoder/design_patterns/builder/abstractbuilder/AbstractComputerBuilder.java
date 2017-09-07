package io.zipcoder.design_patterns.builder.abstractbuilder;

import io.zipcoder.design_patterns.abstractFactory.Computer;

/**
 * Created by leon on 9/5/17.
 */
abstract public class AbstractComputerBuilder {
    protected double ram;
    protected double hdd;
    protected double cpu;

    public AbstractComputerBuilder setRam(double ram) {
        this.ram = ram;
        return this;
    }

    public AbstractComputerBuilder setHdd(double hdd) {
        this.hdd = hdd;
        return this;
    }

    public AbstractComputerBuilder setCpu(double cpu) {
        this.cpu = cpu;
        return this;
    }

    abstract public Computer build();
}
