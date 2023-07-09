package in.motorglaze.Memberships.DAO;

import in.motorglaze.Memberships.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersDao extends JpaRepository<Users, String>{

}