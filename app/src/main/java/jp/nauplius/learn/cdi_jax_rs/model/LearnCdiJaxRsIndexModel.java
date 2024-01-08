package jp.nauplius.learn.cdi_jax_rs.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import lombok.Getter;
import lombok.Setter;

@Named
@SessionScoped
public class LearnCdiJaxRsIndexModel implements Serializable {
    @Getter
    @Setter
    private int counter;

    @Getter
    private List<String> messages;

    public LearnCdiJaxRsIndexModel() {
        this.counter = 0;
        this.messages = new ArrayList<>();
    }

    public void addMessage(String message) {
        this.messages.add(message);
    }
}
