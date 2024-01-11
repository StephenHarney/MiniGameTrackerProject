package ie.atu.hello;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/Game")
public class GameController {



    private GameService gameService;


    @Autowired
    public void setGame(GameService gameService) {

        this.gameService = gameService;

    }
    @PostMapping
    public ResponseEntity<Games> saveGame(@RequestBody Map<String, String> payload ) {
        return new ResponseEntity<>(gameService.createGame(payload.get("GameBody"), payload.get("gameId")), HttpStatus.CREATED);
    }


    @GetMapping
        public ResponseEntity<List<Games>> getAllGames() {
        return new ResponseEntity<List<Games>>( gameService.getAllGames(), HttpStatus.OK );
    }

    @DeleteMapping
    public ResponseEntity<Optional<Games>> deleteGames(@PathVariable String gameId){
        return  new ResponseEntity<Optional<Games>>(gameService.deleteGames(gameId), HttpStatus.OK);
    }

}
