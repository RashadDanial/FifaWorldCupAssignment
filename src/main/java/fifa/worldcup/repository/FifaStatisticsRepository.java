package fifa.worldcup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fifa.worldcup.model.FifaStatistics;

@Repository

public interface FifaStatisticsRepository extends JpaRepository<FifaStatistics, Integer>{

}
