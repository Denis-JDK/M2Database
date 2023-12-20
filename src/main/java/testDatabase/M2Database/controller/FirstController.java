package testDatabase.M2Database.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import testDatabase.M2Database.model.FirstDto;
import testDatabase.M2Database.service.FirstServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class FirstController {

    private final FirstServiceImpl firstService;

    public FirstController(FirstServiceImpl firstService) {
        this.firstService = firstService;
    }

    @GetMapping
    public List<FirstDto> getAllUser() {
        return firstService.getAllFirstDto();
    }
    @GetMapping("/{id}")
    public FirstDto getById(@PathVariable Integer id) {
        return firstService.getByIdFirstDto(id);
    }

    @PostMapping
    public ResponseEntity<FirstDto> create(@RequestBody FirstDto firstDto) { //@RequestBody указывает что обьект firstDto находится в теле запроса, конвертирует из json в java обьект
       return ResponseEntity.status(HttpStatus.CREATED).body(firstService.create(firstDto)); //ResponseEntity.status(HttpStatus.CREATED) сделали костомный код ответа не просто 200, а 201 CREATE
    }
    @PutMapping
    public FirstDto update(@RequestBody FirstDto firstDto) {
       return firstService.updateFirstDto(firstDto);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        firstService.deleteFirstDto(id);
    }

}
