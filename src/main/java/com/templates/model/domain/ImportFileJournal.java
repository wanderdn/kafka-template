package com.templates.model.domain;

import javax.persistence.*;

@Entity
@Table(name = "file_log")
public class ImportFileJournal {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "file_id", referencedColumnName = "id")
    ImportedBlob blob;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ImportedBlob getBlob() {
        return blob;
    }

    public void setBlob(ImportedBlob blob) {
        this.blob = blob;
    }

}
