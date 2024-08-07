package Service;

import DTO.UserDTO;
import Entity.UserEntity;
import Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> listAll(){
        // Extrai todos os usuários do banco de dados em uma lista de UserEntity
        List<UserEntity> usuarios = userRepository.findAll();

        // Converte de UserEntity para UserDto objeto de transferencia de dados
        // (usuarioentity) -> return new UserDto(usuarioentity)
        return usuarios.stream().map(UserDTO::new).toList();
    }

    public void insert(UserDTO user) {
        // converte dto para entity e salva
        userRepository.save(new UserEntity(user));
    }

    public UserDTO alterar(UserDTO user) {
        UserEntity usuarioEntity = new UserEntity(user);
        return new UserDTO(userRepository.save(usuarioEntity));
    }

    public UserDTO find(Long id) {
        return new UserDTO(userRepository.findById(id).get());
    }
    
    public void delete(Long id) {
        UserEntity user = userRepository.findById(id).get();
        userRepository.delete(user);
    }
}
