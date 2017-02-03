package com.example.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by andrey on 04.02.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Deployments {
    private List<Deployment> data;

    public List<Deployment> getData() {
        return data;
    }

    public void setData(List<Deployment> data) {
        this.data = data;
    }
}
