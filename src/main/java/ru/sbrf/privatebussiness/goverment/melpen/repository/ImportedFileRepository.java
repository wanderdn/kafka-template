package ru.sbrf.privatebussiness.goverment.melpen.repository;

import org.springframework.transaction.annotation.Transactional;
import ru.sbrf.privatebussiness.goverment.melpen.model.domain.ImportFileJournal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImportedFileRepository extends JpaRepository<ImportFileJournal, Long> {

    @Transactional
    void deleteByIdIn(Iterable<Long> id);

    List<ImportFileJournal> getImportFileJournalsByIdIn(Iterable<Long> id);
}
