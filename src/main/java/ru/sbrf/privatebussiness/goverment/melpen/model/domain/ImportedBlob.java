package ru.sbrf.privatebussiness.goverment.melpen.model.domain;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "blob_data")
public class ImportedBlob {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private UUID id;
    @Column(name = "file_data")
    private byte[] data;





    public UUID getId() {
        return id;
    }



    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }


}
