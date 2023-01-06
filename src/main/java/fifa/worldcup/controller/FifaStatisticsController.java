package fifa.worldcup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import fifa.worldcup.model.FifaStatistics;
import fifa.worldcup.repository.FifaStatisticsRepository;

@Controller

public class FifaStatisticsController {
	
	@Autowired
	FifaStatisticsRepository repo;
	
	@Get("/fifa/api/v1/statistics/get-all-data")
	public List<FifaStatistics> getAll() {
		return repo.findAll();
	}

}
