package in.motorglaze.Memberships.DAO;

import in.motorglaze.Memberships.Entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserMembershipRegistrationsDao extends JpaRepository<Registration, Integer> {
}
