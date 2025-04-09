package org.fatecsjc;

import dev.langchain4j.service.SystemMessage;
import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService(tools = {})
public interface Service {

    @SystemMessage("Você é um simpático assistente")
    String input(String input);

}