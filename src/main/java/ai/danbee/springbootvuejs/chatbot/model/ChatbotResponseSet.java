package ai.danbee.springbootvuejs.chatbot.model;

import com.google.gson.Gson;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class ChatbotResponseSet implements Serializable {

    private String code = "failure";
    private ChatbotResponseSetResult result = new ChatbotResponseSetResult();

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
