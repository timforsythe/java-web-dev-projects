package org.launchcode;

import java.util.UUID;
public abstract class AbstractEntity {

    private String Id;

    public AbstractEntity() {
        this.Id = UUID.randomUUID().toString();
    }

    public String getId() {
        return this.Id;
    }

}
