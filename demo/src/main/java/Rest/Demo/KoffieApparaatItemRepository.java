package Rest.Demo;

import org.springframework.data.repository.CrudRepository;

public interface KoffieApparaatItemRepository extends CrudRepository<KoffieApparaatItem, Integer> {

    // getAllKoffieApparaatItems()
    // getKoffieApparaatItem(int id)
    // updateKoffieApparaatItem(KoffieApparaatItem k)
    // deleteKoffieApparaatItem(int id)
}
