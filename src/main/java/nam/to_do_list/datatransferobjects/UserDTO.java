package nam.to_do_list.datatransferobjects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import nam.to_do_list.models.Category;
import nam.to_do_list.models.User;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder //Allow app to build object
public class UserDTO {
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String userName;

    private String password;

    @JsonIgnore
    private List<CategoryDTO> categoryDTOS;

    public static User toEntity(UserDTO userDTO){
        final User user = new User();

        user.setId(userDTO.getId());
    };

}
