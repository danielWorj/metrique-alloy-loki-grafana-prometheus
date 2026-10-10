package formation.logs.metriquegrafana.data;

import formation.logs.metriquegrafana.profile.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<Data,Integer> {
}
