package testDatabase.M2Database.service;

import testDatabase.M2Database.model.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> getAll();
    public UserDto getById(Integer id);
    UserDto create(UserDto userDto);
    UserDto update(UserDto userDto);
    void delete(Integer id);
}
