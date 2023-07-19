package in.motorglaze.Memberships.Controllers;

import in.motorglaze.Memberships.Entity.Transaction;
import in.motorglaze.Memberships.Service.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/transactions")
public class TransactionsController {
    private TransactionService _transactionService;

    public TransactionsController(TransactionService transactionService){
        _transactionService = transactionService;
    }

    @GetMapping
    public List<Transaction> findAll(){
        return _transactionService.findAll();
    }

    @GetMapping("/{id}")
    public Transaction findById(@PathVariable String id){
        Transaction transaction = _transactionService.findById(id);
        if(transaction == null){
            throw new RuntimeException("Transaction not found! Id: "+id);
        }
        return transaction;
    }

    @PostMapping
    public Transaction addNewTransaction(@RequestBody Transaction transaction){
        UUID uuid = UUID.randomUUID();
        transaction.setId(uuid.toString());
        transaction.setDateTime(LocalDateTime.now());

        Transaction tempTransaction = _transactionService.save(transaction);
        return tempTransaction;
    }

    @PutMapping
    public Transaction updateTransaction(@RequestBody Transaction transaction){
        return _transactionService.save(transaction);
    }

    @DeleteMapping("/{id}")
    public String deleteTransaction(@PathVariable String id){
        Transaction transaction = _transactionService.findById(id);
        if(transaction == null){
            throw new RuntimeException("Transaction not found with ID: " + id);
        }
        _transactionService.deleteById(id);
        return "Transaction deleted. Id: "+id;
    }
}
