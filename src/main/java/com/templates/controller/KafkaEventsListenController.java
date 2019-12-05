package com.templates.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.templates.model.dto.FilesDeleteDto;
import com.templates.service.KafkaTaskExecuteService;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.stream.Collectors;


@Service
@EnableKafka
public class KafkaEventsListenController {


    private final KafkaTemplate kafkaTemplate;
    private final KafkaTaskExecuteService executeService;
private  final ObjectMapper mapper = new ObjectMapper();
    public KafkaEventsListenController(KafkaTemplate kafkaTemplate, KafkaTaskExecuteService executeService) {
        this.kafkaTemplate = kafkaTemplate;
        this.executeService = executeService;
    }

    @KafkaListener(topics = "test")
    public void send(String messageDto) throws IOException {
FilesDeleteDto deleteDto =  mapper.readValue(messageDto, FilesDeleteDto.class);
        executeService.executeTask(deleteDto.getFileIds());

        kafkaTemplate.send("test",  deleteDto.getFileIds().stream().map(x->new StringBuilder().append( "Deleted file : ").append(x)).collect(Collectors.toList()));
    }

}

