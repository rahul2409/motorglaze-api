package in.motorglaze.Memberships.Service;

import in.motorglaze.Memberships.DAO.StoresDao;
import in.motorglaze.Memberships.Entity.Store;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StoreService {
    private StoresDao _store;

    public StoreService(StoresDao theStore){
        _store = theStore;
    }

    // Find all the stores.
    public List<Store> findAll(){
        return _store.findAll();
    }

    // Find store by store id
    public Store findById(String id){
        Optional<Store> tempStore = _store.findById(id);
        Store store = null;
        if(tempStore.isPresent()){
            store = tempStore.get();
        } else{
            throw new RuntimeException("Store with ID not found! "+ id);
        }
        return store;
    }

    // Post a new store
    public Store save(Store store){
        return _store.save(store);
    }

    // Delete a store
    public void deleteById(String id){
        _store.deleteById(id);
    }
}
