package io.zipcoder.design_patterns;

import io.zipcoder.design_patterns.abstractFactory.*;
import io.zipcoder.design_patterns.builder.PCBuilder;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 9/7/17.
 */
public class ClientTest {
    @Test
    public void demoAbstractFactory() {
        PCFactory pcFactory = new PCFactory(8,16,'A');
        ServerFactory serverFactory = new ServerFactory(4, 32,'B');

        Computer pc = ComputerFactory.getComputer(pcFactory);
        Computer server = ComputerFactory.getComputer(serverFactory);

        Assert.assertTrue(pc instanceof PC);
        Assert.assertTrue(server instanceof Server);
    }


    @Test
    public void demoBuilder() {
        PC pc = new PCBuilder()
                .setCpu(0)
                .setHdd(0)
                .setRam(0)
                .build();
    }
}
