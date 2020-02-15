package com.example.springstudy.web.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class HelloResponseDtoTest {

    @Test
    public void LombokTest() {
        // Given
        String name = "안정민";
        int amount = 10000;

        // When
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        // Then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
