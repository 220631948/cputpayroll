package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.SalesPerson;

@Repository
public interface SalesPersonRepository extends JpaRepository<SalesPerson, String> {
}
