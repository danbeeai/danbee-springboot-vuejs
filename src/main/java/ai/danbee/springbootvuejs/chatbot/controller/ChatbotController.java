package ai.danbee.springbootvuejs.chatbot.controller;

import ai.danbee.springbootvuejs.chatbot.model.ChatbotResponse;
import ai.danbee.springbootvuejs.chatbot.model.MessageRequest;
import ai.danbee.springbootvuejs.chatbot.model.WelcomeRequest;
import ai.danbee.springbootvuejs.chatbot.service.ChatbotService;
import okhttp3.OkHttpClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("danbee")
public class ChatbotController {

    private String danbeeBaseUrl = "https://danbee.ai";

    private Retrofit getRetrofit() {
        OkHttpClient client = new OkHttpClient.Builder()
                .readTimeout(10, TimeUnit.SECONDS)
                .connectTimeout(10, TimeUnit.SECONDS)
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(danbeeBaseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        return retrofit;
    }

    @PostMapping("/chatbot/{version}/{chatbotId}/welcome.do")
    public ResponseEntity<?> welcome(@PathVariable String version,
                                     @PathVariable String chatbotId,
                                     @RequestBody WelcomeRequest welcomeRequest) {

        welcomeRequest.setVersion(version);
        welcomeRequest.setChatbot_id(chatbotId);
        welcomeRequest.setChannel_id("0");

        Retrofit retrofit = getRetrofit();
        Call<ChatbotResponse> call = retrofit.create(ChatbotService.class).chatbotWelcome(version, chatbotId, welcomeRequest);

        try {
            Response<ChatbotResponse> resopnse = call.execute();
            if(resopnse.isSuccessful()) {
                ChatbotResponse chatbotResponse = resopnse.body();
                return ResponseEntity.ok(chatbotResponse);
            } else {
                return ResponseEntity.ok(new ChatbotResponse());
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            return ResponseEntity.ok(new ChatbotResponse());
        }
    }

    @PostMapping("/chatbot/{version}/{chatbotId}/message.do")
    public ResponseEntity<?> message(@PathVariable String version,
                                     @PathVariable String chatbotId,
                                     @RequestBody MessageRequest messageRequest) {

        messageRequest.setVersion(version);
        messageRequest.setChatbot_id(chatbotId);
        messageRequest.setChannel_id("0");

        Retrofit retrofit = getRetrofit();
        Call<ChatbotResponse> call = retrofit.create(ChatbotService.class).chatbotMessage(version, chatbotId, messageRequest);

        try {
            Response<ChatbotResponse> resopnse = call.execute();

            if(resopnse.isSuccessful()) {
                ChatbotResponse chatbotResponse = resopnse.body();
                return ResponseEntity.ok(chatbotResponse);
            } else {
                return ResponseEntity.ok(new ChatbotResponse());
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            return ResponseEntity.ok(new ChatbotResponse());
        }
    }

    @PostMapping("/event/{version}/{chatbotId}/{eventId}/message.do")
    public ResponseEntity<?> event(@PathVariable String version,
                                     @PathVariable String chatbotId,
                                     @PathVariable String eventId,
                                     @RequestBody MessageRequest messageRequest) {

        messageRequest.setVersion(version);
        messageRequest.setChatbot_id(chatbotId);
        messageRequest.setChannel_id("0");

        Retrofit retrofit = getRetrofit();
        Call<ChatbotResponse> call = retrofit.create(ChatbotService.class).chatbotEventMessage(version, chatbotId, eventId, messageRequest);

        try {
            Response<ChatbotResponse> resopnse = call.execute();

            if(resopnse.isSuccessful()) {
                ChatbotResponse chatbotResponse = resopnse.body();
                return ResponseEntity.ok(chatbotResponse);
            } else {
                return ResponseEntity.ok(new ChatbotResponse());
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            return ResponseEntity.ok(new ChatbotResponse());
        }
    }

}
