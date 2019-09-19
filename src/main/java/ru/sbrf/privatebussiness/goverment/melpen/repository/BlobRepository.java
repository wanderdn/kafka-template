package ru.sbrf.privatebussiness.goverment.melpen.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import ru.sbrf.privatebussiness.goverment.melpen.model.domain.ImportedBlob;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BlobRepository extends JpaRepository<ImportedBlob, UUID> {


}
