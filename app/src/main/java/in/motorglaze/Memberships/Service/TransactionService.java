package in.motorglaze.Memberships.Service;

import in.motorglaze.Memberships.DAO.TransactionsDao;
import in.motorglaze.Memberships.Entity.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {
    private TransactionsDao _transactions;

    public TransactionService(TransactionsDao transactionsDao){
        _transactions = transactionsDao;
    }

    public List<Transaction> findAll(){
        return _transactions.findAll();
    }

    public Transaction findById(String id){
        Optional<Transaction> tempTransaction = _transactions.findById(id);
        Transaction transaction = null;
        if(tempTransaction.isPresent()){
            transaction = tempTransaction.get();
        } else{
            throw new RuntimeException("Transaction not found with Id: " +id);
        }
        return transaction;
    }

    public Transaction save(Transaction transaction){
        return _transactions.save(transaction);
    }

    public void deleteById(String id){
        _transactions.deleteById(id);
    }
}
