package com.templates.service;

import com.templates.repository.ImportedFileRepository;
import org.springframework.stereotype.Service;

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
