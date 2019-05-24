package com.example.demo;

import com.fasterxml.jackson.databind.JsonNode;
import com.vladmihalcea.hibernate.type.json.JsonStringType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

@Table
@Entity(name = "name")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@TypeDefs({
    @TypeDef(name = "json", typeClass = JsonStringType.class)
})
@ToString
public class Name {

    @Id
    @Column(name = "id")
    private Integer id;

    @Type(type = "json")
    @Column(name = "node", columnDefinition = "json")
    private JsonNode node;
}
