package testDatabase.M2Database.service;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import testDatabase.M2Database.entity.AddressEntity;
import testDatabase.M2Database.model.UserDto;

import javax.sql.DataSource;
import java.sql.*;

@Component
public class MyService {


    public UserDto userDto;

    public UserDto getMyEntity() {
        return UserDto.builder()
                .names("Info")
                .build();
    }


    public static void main(String[] args) {



        DataSource dataSource = createDataSource();


        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5490/account","root","postgres")){
            System.out.println("connection.isValid(0) = " + connection.isValid(0));

            //SELECT
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM users WHERE names = ?");
            ps.setString(1, "Bobi");
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " - " + resultSet.getString("names") + " - "
                + resultSet.getString("address_id"));
            }
            //INSERT
            PreparedStatement insertPs = connection.prepareStatement("INSERT INTO address (id, country, region, street, home) values (?,?,?,?,?)");
            insertPs.setInt(1,3);
            insertPs.setString(2,"Belarus" );
            insertPs.setString(3,"Farery" );
            insertPs.setString(4,"street3" );
            insertPs.setString(5,"17" );
            int insertCount = insertPs.executeUpdate();
            System.out.println("insert count in DB: "+ insertCount);
            //UPDATE
            PreparedStatement updatePs = connection.prepareStatement("UPDATE address SET home = ? WHERE home = ?");
            updatePs.setString(1,"NewHome");
            updatePs.setString(2, "MyHome");
            int updateCount = updatePs.executeUpdate();
            System.out.println("updateCount = " + updateCount);
            //DELETE
            PreparedStatement deletePs = connection.prepareStatement("DELETE FROM address WHERE id = ?");
            deletePs.setInt(1,2);
            int deleteCount = deletePs.executeUpdate();
            System.out.println("deleteCount = " + deleteCount);


        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    private static DataSource createDataSource(){
        HikariDataSource ds = new HikariDataSource();
        ds.setJdbcUrl("jdbc:h2:mem:;INIT=RUNSCRIPT FROM 'classpath:init.sql';");
        ds.setUsername("root");
        ds.setPassword("postgres");
        return ds;
    }

}
