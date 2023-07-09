package in.motorglaze.Memberships.DAO;

import in.motorglaze.Memberships.Entity.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionsDao extends JpaRepository<Transactions, String> {
}
