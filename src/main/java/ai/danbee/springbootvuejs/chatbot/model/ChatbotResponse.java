package ai.danbee.springbootvuejs.chatbot.model;

import com.google.gson.Gson;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class ChatbotResponse implements Serializable {

    private ChatbotResponseSet responseSet = new ChatbotResponseSet();

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
