package com.bom.example;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConsumerTest {
    @Test
    public void consumes_the_bom() {
        Consumer consumer = new Consumer();

        assertThat(consumer.works()).isEqualTo("Class A works Class B works Cool new feature imported");
    }
}
