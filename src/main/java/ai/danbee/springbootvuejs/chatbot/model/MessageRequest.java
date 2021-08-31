package ai.danbee.springbootvuejs.chatbot.model;

import com.google.gson.Gson;
import lombok.*;

import java.io.Serializable;
import java.util.HashMap;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class MessageRequest implements Serializable {

    private String version = "v2.0";
    private String chatbot_id = "";
    private String user_id = "";
    private String channel_id = "0";
    private String input_sentence = "";

    private Integer session_id = 0;
    private String ins_id = "";
    private String intent_id = "";
    private String chatflow_id = "";
    private String node_id = "";
    private String param_id = "";

    private HashMap<String, String> parameters = new HashMap<String, String>();
    private String postBackFlag = "false";

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
