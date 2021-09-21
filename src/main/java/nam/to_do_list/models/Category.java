package nam.to_do_list.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Category implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;

    //Many Categories can point to one user
    @ManyToOne
    @JoinColumn(name = "userId")
    @JsonIgnore
    private User user;

    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER) //One Category has many To Do things. FetchType to EAGER (default LAZY)
    //so that when using SQL command SELECT to access category, it will auto take data from todoLIST
    private List<Todo> todoList;
}
