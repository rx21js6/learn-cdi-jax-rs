package jp.nauplius.learn.cdi_jax_rs.backing;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import jp.nauplius.learn.cdi_jax_rs.model.LearnCdiJaxRsIndexModel;

@Named
@ViewScoped
public class LearnCdiJaxRsIndexController implements Serializable {
    @Inject
    private LearnCdiJaxRsIndexModel learnCdiJaxRsIndexModel;

    public String reload() {
        this.learnCdiJaxRsIndexModel.setCounter(this.learnCdiJaxRsIndexModel.getCounter() + 1);
        return null;
    }
}
