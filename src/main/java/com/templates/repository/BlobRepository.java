package com.templates.repository;

import com.templates.model.domain.ImportedBlob;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BlobRepository extends JpaRepository<ImportedBlob, UUID> {


}
