package ru.sbrf.privatebussiness.goverment.melpen;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.InitBinder;
import ru.sbrf.privatebussiness.goverment.melpen.model.dto.FilesDeleteDto;
import ru.sbrf.privatebussiness.goverment.melpen.repository.ImportedFileRepository;

import java.util.Arrays;
import java.util.UUID;

@Component
public class asd implements ApplicationListener<ContextRefreshedEvent> {




    private final KafkaTemplate kafkaTemplate;

    public asd(ImportedFileRepository repository, KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
       FilesDeleteDto filesDeleteDto = new FilesDeleteDto();
       filesDeleteDto.setId(UUID.randomUUID());
       filesDeleteDto.setFileIds(Arrays.asList(1L,2L));
        System.out.println(filesDeleteDto.getFileIds());
//        kafkaTemplate.send("",filesDeleteDto);

    }
}
