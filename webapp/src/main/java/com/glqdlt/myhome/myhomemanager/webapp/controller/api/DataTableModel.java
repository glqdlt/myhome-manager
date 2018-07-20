package com.glqdlt.myhome.myhomemanager.webapp.controller.api;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@ToString
@Getter
public class DataTableModel<T> {

    private Integer draw;
    @NonNull
    private List<T> data;
    private Integer recordsTotal;
    private Integer recordsFiltered;

    public DataTableModel(List<T> data) {
        this.data = data;
        this.draw = 1;
        this.recordsTotal = data.size();
        this.recordsFiltered = data.size();
    }

}
