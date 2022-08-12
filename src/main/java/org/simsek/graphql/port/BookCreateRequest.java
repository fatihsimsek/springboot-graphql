package org.simsek.graphql.port;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class BookCreateRequest {
    private String name;
    private String authorId;
    private BigDecimal amount;
    private Integer stock;
}
