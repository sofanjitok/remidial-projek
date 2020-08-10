package lab.phb.remidi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import lab.phb.remidi.entity.DataCalonMhs;

@Repository
public interface DataCalonMhsRepo extends JpaRepository<DataCalonMhs, String> {
}