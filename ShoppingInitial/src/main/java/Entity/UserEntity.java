package Entity;

import DTO.UserDTO;
import jakarta.persistence.*;
import org.springframework.beans.BeanUtils;

import java.util.Objects;

@Entity
@Table(name = "CLT_User")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private long User_Id;

    @Column(nullable = false)
    public String nome;

    @Column(nullable = false, unique = true)
    public String login;

    @Column(nullable = false)
    public String senha;

    @Column(nullable = false)
    public String email;

    public long getUser_Id() {
        return User_Id;
    }

    public UserEntity(UserDTO userDTO) {
        // converte DTO para Entity
        BeanUtils.copyProperties(userDTO, this);
    }

    public UserEntity() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return User_Id == that.User_Id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(User_Id);
    }
}
