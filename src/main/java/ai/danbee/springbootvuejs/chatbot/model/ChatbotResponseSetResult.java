package ai.danbee.springbootvuejs.chatbot.model;

import com.google.gson.Gson;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class ChatbotResponseSetResult implements Serializable {

    private String version = "v2.0";
    private String chatbot_id = "";
    private String user_id = "";
    private String input_sentence = "";
    private String ins_id = "";
    private String intent_id = "";
    private String ref_intent_id = "";
    private String chatflow_id = "";
    private String node_id = "";
    private String param_id = "";
    private ArrayList another_result = new ArrayList();
    private ArrayList result  = new ArrayList();
    private ArrayList debugging_result = new ArrayList(); //테스트패널
    private HashMap<String, String> parameters = new HashMap<String, String>();
    private HashMap<String, String> emotions = new HashMap<String, String>();
    private int session_id = 0;
    private int log_id = 0;
    private String debugCode = "";
    private String debugMsg = "";
    private String evaluate_setting = "N";
    private String greetingYn = "N";
    private HashMap resultStatus = new HashMap();
    private HashMap<String, String> personalityObj = new HashMap<String, String>();
    private HashMap<String, String> extension = new HashMap<String, String>();
    private String channel_id = "";
    private String flow_type = "";
    private String postBackFlag = "false";

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
