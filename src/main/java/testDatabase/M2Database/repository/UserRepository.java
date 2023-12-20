package testDatabase.M2Database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import testDatabase.M2Database.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
