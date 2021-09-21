package nam.to_do_list.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity //Tell Spring this is the image of database table
@AllArgsConstructor ////Lombok auto generate all args constructor
@NoArgsConstructor //Lombok auto generate no args constructor
@Data //Lombok auto generate getter and setter
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String userName;

    private String password;

    @OneToMany(mappedBy = "user")
    private List<Category> category;


}
