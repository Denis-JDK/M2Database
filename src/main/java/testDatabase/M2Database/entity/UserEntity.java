package testDatabase.M2Database.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Data
@Entity
@Table(name = "users", schema = "da")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// генерация id полностью на стороне БД по описанным там правилам sequins
    @Column(name = "id")
    private Integer id;
    @Column(name = "names", nullable = false)// nullable = false проверка на null перед работой с БД, вдруг где то null проскочил но в БД не попадет и сообщит об null
    private String names;
    @Column(name = "email")
    private String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserEntity that)) return false;
        return Objects.equals(id, that.id) && Objects.equals(names, that.names) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, names, email);
    }
}
