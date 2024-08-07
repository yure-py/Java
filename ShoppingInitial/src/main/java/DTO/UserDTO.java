package DTO;

import Entity.UserEntity;
import org.springframework.beans.BeanUtils;

public class UserDTO {

    private long User_Id;
    public String nome;
    public String login;
    public String senha;
    public String email;

    public UserDTO(UserEntity userEntity) {
        // Converte entity pra dto
        BeanUtils.copyProperties(userEntity, this);
    }

    public UserDTO() {
    }

    public long getUser_Id() {
        return User_Id;
    }
}