package ru.sbrf.privatebussiness.goverment.melpen.service;

import org.springframework.stereotype.Service;
import ru.sbrf.privatebussiness.goverment.melpen.model.domain.ImportFileJournal;
import ru.sbrf.privatebussiness.goverment.melpen.repository.ImportedFileRepository;

import java.math.BigInteger;
import java.util.List;

@Service
public class KafkaTaskExecuteService {
    private final ImportedFileRepository importedFileRepository;

    public KafkaTaskExecuteService(ImportedFileRepository importedFileRepository) {
        this.importedFileRepository = importedFileRepository;
    }

    public void executeTask(List<Long> messageDto) {
importedFileRepository.deleteByIdIn(messageDto);
    }
}
