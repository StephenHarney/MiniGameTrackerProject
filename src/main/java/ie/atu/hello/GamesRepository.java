package ie.atu.hello;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GamesRepository extends MongoRepository<Games, ObjectId> {




        Optional<Games> findGamesByGameId(String gameId);




}
