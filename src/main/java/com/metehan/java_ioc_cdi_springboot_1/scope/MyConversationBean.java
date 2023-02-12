package com.metehan.java_ioc_cdi_springboot_1.scope;

import jakarta.enterprise.context.Conversation;
import jakarta.enterprise.context.ConversationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@ConversationScoped
public class MyConversationBean implements Serializable {


    private int value;
    @Inject
    private Conversation conversation;

    public String getValue() {
        return "ID: " +conversation.getId() + " value: " + value;
    }

    public void startOperation() {

        value = 10;
        conversation.begin();
        conversation.setTimeout(600000);
    }
    public void continueOperation() {

        value++;
    }
    public void endOperation() {

        conversation.end();
        value = 10;

    }


}
