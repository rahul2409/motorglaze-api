package in.motorglaze.Memberships.DAO;

import in.motorglaze.Memberships.Entity.Memberships;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembershipsDao extends JpaRepository<Memberships, String> {
}
