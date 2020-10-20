package pl.onlinestore.pet.adapters.mysql.accessories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.onlinestore.pet.domain.accessory.AccessoryRepository;

@Repository
public interface MysqlAccessoryRepository extends AccessoryRepository, JpaRepository<AccessoryEntity, Long> {

}
