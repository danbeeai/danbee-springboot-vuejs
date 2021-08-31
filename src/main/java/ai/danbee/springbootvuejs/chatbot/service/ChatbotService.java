package ai.danbee.springbootvuejs.chatbot.service;

import ai.danbee.springbootvuejs.chatbot.model.ChatbotResponse;
import ai.danbee.springbootvuejs.chatbot.model.MessageRequest;
import ai.danbee.springbootvuejs.chatbot.model.WelcomeRequest;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ChatbotService {

    @POST("/chatflow/chatbot/{version}/{chatbotId}/welcome.do")
    Call<ChatbotResponse> chatbotWelcome(
            @Path("version") String version,
            @Path("chatbotId") String chatbotId,
            @Body WelcomeRequest welcomeRequest
    );

    @POST("/chatflow/chatbot/{version}/{chatbotId}/message.do")
    Call<ChatbotResponse> chatbotMessage(
            @Path("version") String version,
            @Path("chatbotId") String chatbotId,
            @Body MessageRequest messageRequest
    );

    @POST("/chatflow/event/{version}/{chatbotId}/{eventId}/message.do")
    Call<ChatbotResponse> chatbotEventMessage(
            @Path("version") String version,
            @Path("chatbotId") String chatbotId,
            @Path("eventId") String eventId,
            @Body MessageRequest messageRequest
    );

}
