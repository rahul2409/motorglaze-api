package in.motorglaze.Memberships.DAO;

import in.motorglaze.Memberships.Entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionsDao extends JpaRepository<Transaction, String> {
}
