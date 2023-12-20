package testDatabase.M2Database.service;

import testDatabase.M2Database.model.FirstDto;

import java.util.List;

public interface FirstService {

    List<FirstDto> getAllFirstDto();
    FirstDto getByIdFirstDto(Integer id);
    FirstDto create(FirstDto firstDto);
    FirstDto updateFirstDto(FirstDto firstDto);
    void deleteFirstDto(Integer id);
}
