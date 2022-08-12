package org.simsek.graphql.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="author")
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    @Id
    private String id;

    private String name;
}
