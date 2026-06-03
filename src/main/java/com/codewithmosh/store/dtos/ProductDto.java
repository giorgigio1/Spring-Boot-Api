package com.codewithmosh.store.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductDto {
    private Long id;

    @NotBlank
    private String name;

    @NotNull
    private BigDecimal price;

    private String description;

    @NotNull
    private Byte categoryId;
}
