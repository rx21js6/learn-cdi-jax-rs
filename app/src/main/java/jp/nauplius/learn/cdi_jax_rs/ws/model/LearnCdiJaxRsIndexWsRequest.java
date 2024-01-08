package jp.nauplius.learn.cdi_jax_rs.ws.model;

import javax.json.bind.annotation.JsonbProperty;

import lombok.Data;

@Data
public class LearnCdiJaxRsIndexWsRequest {
    @JsonbProperty
    private String requestMessage;
}
