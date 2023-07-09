package in.motorglaze.Memberships.DAO;

import in.motorglaze.Memberships.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersDao extends JpaRepository<User, String>{

}