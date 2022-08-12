package org.simsek.graphql.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="book")
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    private String id;

    private String name;

    private BigDecimal amount;

    private Integer stock;

    @ManyToOne(targetEntity = Author.class)
    private Author author;
}
