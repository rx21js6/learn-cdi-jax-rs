package jp.nauplius.learn.cdi_jax_rs.ws.model;

import java.util.List;

import lombok.Data;

@Data
public class LearnCdiJaxRsIndexWsResponse {
    private String date;
    private int count;
    private List<String> messages;
}
