package ie.atu.hello;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;



import java.util.List;
import java.util.Optional;

@Service
public class GameService {



    private final GamesRepository gamesRepository;
    private final MongoTemplate mongoTemplate;
    @Autowired
    public  GameService(GamesRepository gamesRepository,MongoTemplate mongoTemplate){
        this.gamesRepository = gamesRepository;
        this.mongoTemplate = mongoTemplate;
    }

    public Games createGame(String gameBody, String gameId) {
        Games games = gamesRepository.save(new Games(gameBody));


        mongoTemplate.update(Games.class)
                .matching(Criteria.where("GameBody").is(gameBody))
                .apply(new Update().push("gameId").value(gameId))
                .first();

        return games;

    }

    public Optional<Games> deleteGames(String GameId){
        return gamesRepository.findGamesByGameId(GameId);
    }
    public List<Games> getAllGames(){
        return gamesRepository.findAll();
    }



}
