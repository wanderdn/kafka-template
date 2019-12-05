package com.templates.repository;

import com.templates.model.domain.ImportFileJournal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ImportedFileRepository extends JpaRepository<ImportFileJournal, Long> {

    @Transactional
    void deleteByIdIn(Iterable<Long> id);

    List<ImportFileJournal> getImportFileJournalsByIdIn(Iterable<Long> id);
}
