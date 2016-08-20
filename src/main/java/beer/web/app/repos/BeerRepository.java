package beer.web.app.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import beer.web.app.model.Beer;

public interface BeerRepository extends MongoRepository<Beer, String> {

}
