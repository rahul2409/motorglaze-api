package in.motorglaze.Memberships.DAO;

import in.motorglaze.Memberships.Entity.Membership;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembershipsDao extends JpaRepository<Membership, String> {
}
