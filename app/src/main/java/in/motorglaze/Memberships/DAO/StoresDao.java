package in.motorglaze.Memberships.DAO;

import in.motorglaze.Memberships.Entity.Stores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoresDao extends JpaRepository<Stores, String> {
}
