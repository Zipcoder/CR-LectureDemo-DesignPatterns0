package io.zipcoder.design_patterns.patternObsTest;

/**
 * Created by sdmg15 on 08/03/17.
 */
public interface Jsubject {

    void attach(Jobservers[] obs);

    void detach(int obs);

    void noty();
}
