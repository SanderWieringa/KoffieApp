package Rest.Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class KoffieApparaatService {

    @Autowired
    private KoffieApparaatItemRepository koffieApparaatItemRepository;


    public void addKoffieApparaatItem(KoffieApparaatItem koffieApparaatItem) {
        koffieApparaatItemRepository.save(koffieApparaatItem);
    }

    public List<KoffieApparaatItem> getAllKoffieApparaatItems() {
        List<KoffieApparaatItem> koffieApparaatItems = new ArrayList<>();
        koffieApparaatItemRepository.findAll()
        .forEach(koffieApparaatItems::add);
        return koffieApparaatItems;
    }

    public KoffieApparaatItem getKoffieApparaatItem(int id) {
        return koffieApparaatItemRepository.findById(id).get();
    }

    public void updateKoffieApparaatItem(int id, KoffieApparaatItem koffieApparaatItem) {
        koffieApparaatItemRepository.save(koffieApparaatItem);
    }

    public void deleteKoffieApparaatItem(int id) {
        koffieApparaatItemRepository.deleteById(id);
    }
}
