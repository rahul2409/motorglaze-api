package in.motorglaze.Memberships.DAO;

import in.motorglaze.Memberships.Entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoresDao extends JpaRepository<Store, String> {
}
