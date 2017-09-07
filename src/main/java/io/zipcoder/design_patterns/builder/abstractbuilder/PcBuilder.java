package io.zipcoder.design_patterns.builder.abstractbuilder;

import io.zipcoder.design_patterns.abstractFactory.Computer;
import io.zipcoder.design_patterns.abstractFactory.PC;

/**
 * Created by leon on 9/5/17.
 */
public class PcBuilder extends AbstractComputerBuilder {
    @Override
    public Computer build() {
        return new PC(super.cpu, super.hdd, super.ram);
    }
}
