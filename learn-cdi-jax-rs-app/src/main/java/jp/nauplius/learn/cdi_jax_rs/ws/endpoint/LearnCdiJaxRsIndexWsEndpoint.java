package jp.nauplius.learn.cdi_jax_rs.ws.endpoint;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;

import com.google.common.base.Strings;

import jp.nauplius.learn.cdi_jax_rs.model.LearnCdiJaxRsIndexModel;
import jp.nauplius.learn.cdi_jax_rs.ws.model.LearnCdiJaxRsIndexWsRequest;
import jp.nauplius.learn.cdi_jax_rs.ws.model.LearnCdiJaxRsIndexWsResponse;

@Path("/index")
public class LearnCdiJaxRsIndexWsEndpoint implements Serializable {
    @Inject
    private Logger logger;
    @Inject
    private LearnCdiJaxRsIndexModel learnCdiJaxRsIndexModel;

    @Path("/getMessge")
    @GET
    public LearnCdiJaxRsIndexWsResponse getMessage() {
        if (this.learnCdiJaxRsIndexModel.getMessages().isEmpty()) {
            this.learnCdiJaxRsIndexModel.addMessage("😀😂😋😎");
        }
        LearnCdiJaxRsIndexWsResponse response = new LearnCdiJaxRsIndexWsResponse();
        response.setDate(LocalDate.now().format(DateTimeFormatter.ISO_DATE));
        this.learnCdiJaxRsIndexModel.setCounter(this.learnCdiJaxRsIndexModel.getCounter() + 1);
        response.setMessages(this.learnCdiJaxRsIndexModel.getMessages());
        return response;
    }

    @Path("/addMessage")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public LearnCdiJaxRsIndexWsResponse addMessage(LearnCdiJaxRsIndexWsRequest request) {
        this.logger.info("addMessage: " + request);

        if (this.learnCdiJaxRsIndexModel.getMessages().isEmpty()) {
            this.learnCdiJaxRsIndexModel.addMessage("😀😂😋😎");
        }

        if (!Strings.isNullOrEmpty(request.getRequestMessage())) {
            this.learnCdiJaxRsIndexModel.addMessage(request.getRequestMessage());
        }

        LearnCdiJaxRsIndexWsResponse response = new LearnCdiJaxRsIndexWsResponse();
        response.setDate(LocalDate.now().format(DateTimeFormatter.ISO_DATE));
        this.learnCdiJaxRsIndexModel.setCounter(this.learnCdiJaxRsIndexModel.getCounter() + 1);
        response.setMessages(this.learnCdiJaxRsIndexModel.getMessages());
        return response;
    }
}
