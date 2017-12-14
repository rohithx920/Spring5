package guru.springframework.spring5webapp.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fistname;
    private String lastname;
    @ManyToMany(mappedBy = "authors")
    Set<Book> books=new HashSet<>();

    public Author(String fistname, String lastname) {
        this.fistname = fistname;
        this.lastname = lastname;
    }
}

