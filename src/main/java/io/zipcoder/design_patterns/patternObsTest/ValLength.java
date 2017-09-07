package io.zipcoder.design_patterns.patternObsTest;
/**
 * Created by sdmg15 on 17/03/17.
 */
public enum ValLength {
    VALUE_1(24),
    VALUE_2(23),
    VALUE_3(45);

    private int val;

    ValLength(int val){
        this.val = val;
    }

    public int getVal(){
        return this.val;
    }
}
