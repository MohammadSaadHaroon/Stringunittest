package com.example.stringreverse;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StringReverseTest {
    StringReverse SUT;

    @Before
    public void StringReverseValidator(){
        SUT =new StringReverse();
    }
    @Test
    public void StringReverseValidatorTest() throws Exception{
        String result = SUT.reversestring("Sarfaraz");
        Assert.assertThat(result,is("zarafraS"));
    }
@Test
    public void StringReverseValidatorTest1() throws Exception{
        String result = SUT.reversestring("abcdefghijklmnopqrstuvwxyz");
        Assert.assertThat(result,is("zyxwvutsrqponmlkjihgfedcba"));
    }
@Test
    public void StringReverseValidatorTest2() throws Exception{
        String result = SUT.reversestring("saad");
        Assert.assertThat(result,is("daas"));
    }

}