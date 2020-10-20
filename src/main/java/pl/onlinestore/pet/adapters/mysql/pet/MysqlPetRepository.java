package pl.onlinestore.pet.adapters.mysql.pet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.onlinestore.pet.domain.pet.PetRepository;

@Repository
public interface MysqlPetRepository extends PetRepository, JpaRepository<PetEntity, Long> {
}
