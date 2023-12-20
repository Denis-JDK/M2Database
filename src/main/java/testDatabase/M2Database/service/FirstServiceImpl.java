package testDatabase.M2Database.service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import testDatabase.M2Database.exception.FirstNotFoundException;
import testDatabase.M2Database.model.FirstDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class FirstServiceImpl implements FirstService {

    private Map<Integer, FirstDto> firstDtoMap = new ConcurrentHashMap<>();
    private final AtomicInteger sequenceId = new AtomicInteger(1);


    @PostConstruct
    public void init(){
        int id = sequenceId.getAndIncrement();
        firstDtoMap.put(id,FirstDto.builder()
                .id(id)
                .name("Giga")
                .country("Madagaskar")
                .build());
    }

    public FirstDto create(FirstDto firstDto) {
        int id = sequenceId.getAndIncrement();
        firstDto.setId(id);
        firstDtoMap.put(id,firstDto);
        return firstDto;
    }

    public List<FirstDto> getAllFirstDto() {
        return new ArrayList<>(firstDtoMap.values());
    }

    public FirstDto getByIdFirstDto(Integer id) {
        if (firstDtoMap.get(id)== null)
            throw new FirstNotFoundException("FirstDto по id: "+ id +" не найдено.");
        return firstDtoMap.get(id);
    }

    public FirstDto updateFirstDto(FirstDto firstDto) {
        FirstDto updateDto = firstDtoMap.get(firstDto.getId());
        if (updateDto == null) {
            throw new FirstNotFoundException("FirstDto не найдено");
        }
        firstDtoMap.put(firstDto.getId(), firstDto);

        return firstDto;
    }

    public void deleteFirstDto(Integer id) {
        firstDtoMap.remove(id);
    }
}
