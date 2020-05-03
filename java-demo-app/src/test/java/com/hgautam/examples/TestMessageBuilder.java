package com.hgautam.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMessageBuilder {

    @Test
    public void testName() {

        MessageBuilder obj = new MessageBuilder();
        assertEquals("Hello hgautam", obj.getMessage("hgautam"));

    }
}
