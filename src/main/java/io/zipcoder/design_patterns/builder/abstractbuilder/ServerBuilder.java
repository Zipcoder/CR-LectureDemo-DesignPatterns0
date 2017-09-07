package io.zipcoder.design_patterns.builder.abstractbuilder;

import io.zipcoder.design_patterns.abstractFactory.Computer;
import io.zipcoder.design_patterns.abstractFactory.Server;

/**
 * Created by leon on 9/5/17.
 */
public class ServerBuilder extends AbstractComputerBuilder {

    @Override
    public Computer build() {
        return new Server(super.cpu, super.hdd, super.ram);
    }
}
