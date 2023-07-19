package in.motorglaze.Memberships.Controllers;

import in.motorglaze.Memberships.Entity.Store;
import in.motorglaze.Memberships.Service.StoreService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/store")
public class StoresController {
    private StoreService _storeService;

    public StoresController(StoreService storeService){
        _storeService = storeService;
    }

    @GetMapping
    public List<Store> findAll(){
        return _storeService.findAll();
    }

    @GetMapping("/{id}")
    public Store findById(@PathVariable String id){
        Store store = _storeService.findById(id);
        if(store == null){
            throw new RuntimeException("Store not found! Id: "+id);
        }
        return store;
    }

    @PostMapping
    public Store addNewStore(@RequestBody Store store){
        UUID uuid = UUID.randomUUID();
        store.setId(uuid.toString());
        store.setCreationDate(LocalDateTime.now());

        Store tempStore = _storeService.save(store);
        return tempStore;
    }

    @PutMapping
    public Store updateStore(@RequestBody Store store){
        return _storeService.save(store);
    }

    @DeleteMapping("/{id}")
    public String deleteStore(@PathVariable String id){
        Store store = _storeService.findById(id);
        if(store == null){
            throw new RuntimeException("Transaction not found with ID: " + id);
        }
        _storeService.deleteById(id);
        return "Transaction deleted. Id: "+id;
    }
}
