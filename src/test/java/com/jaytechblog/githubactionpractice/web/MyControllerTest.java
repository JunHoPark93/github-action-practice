package com.jaytechblog.githubactionpractice.web;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MyControllerTest {
    @Test
    void name() {
        String h = "hello";
        assertThat("hello").isEqualTo(h);
    }
}