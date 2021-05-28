package cruddy;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(of="id")
public class Person {
    @Id
    private String id = UUID.randomUUID().toString();

    private String lastName;
    private String firstName;
}
