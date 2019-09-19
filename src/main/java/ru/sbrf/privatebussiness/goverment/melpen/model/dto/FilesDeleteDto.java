package ru.sbrf.privatebussiness.goverment.melpen.model.dto;

import jdk.nashorn.internal.ir.annotations.Immutable;

import java.util.List;
import java.util.UUID;
@Immutable
public class FilesDeleteDto {

    private UUID id;
    private  List<Long> fileIds;






    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public List<Long> getFileIds() {
        return fileIds;
    }

    public void setFileIds(List<Long> fileIds) {
        this.fileIds = fileIds;
    }

}
