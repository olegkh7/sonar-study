package com.kholosha.sonar.controller;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MailControllerTest {

    @Test
     void getGreeting() {
        assertThat(new MailController().greeting()).isEqualTo("Hello");
    }
}