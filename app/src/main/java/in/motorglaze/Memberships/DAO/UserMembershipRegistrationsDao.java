package in.motorglaze.Memberships.DAO;

import in.motorglaze.Memberships.Entity.UserMembershipRegistrations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserMembershipRegistrationsDao extends JpaRepository<UserMembershipRegistrations, Integer> {
}
