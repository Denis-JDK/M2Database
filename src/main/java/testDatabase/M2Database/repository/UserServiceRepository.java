package testDatabase.M2Database.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import testDatabase.M2Database.model.UserDto;
import testDatabase.M2Database.entity.UserEntity;
import testDatabase.M2Database.service.UserService;

import java.util.List;
@Component
@Primary
public class UserServiceRepository implements UserService {

    private final UserRepository userRepository;

    public UserServiceRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDto> getAll() {
        return null;
    }

    @Override
    public UserDto getById(Integer id) {
        return null;
    }

    @Override
    public UserDto create(UserDto userDto) {
        return null;
    }

    @Override
    public UserDto update(UserDto userDto) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    private UserDto mapToDto(UserEntity userEntity) {
        return null;
    }
}
