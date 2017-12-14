package guru.springframework.spring5webapp.model;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@ToString
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    String title;
    String isbn;
    String publisher;
    @ManyToMany
    @JoinTable(name = "author_book",joinColumns=@JoinColumn(name="book_id"),inverseJoinColumns = @JoinColumn(name="author_id"))
    Set<Author> authors=new HashSet<Author>();
}
