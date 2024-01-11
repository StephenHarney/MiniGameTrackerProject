package ie.atu.hello;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Games")
public class Games {
    @Id
    private String  ObjectId;
    private String  gameId;
    private String  title;
    private String  Console;
    private String  Category;
    private String  releaseDate;

    private List<String> relatedgameIds;



    public Games(String gameId) {
        this.gameId = gameId;
    }


}
