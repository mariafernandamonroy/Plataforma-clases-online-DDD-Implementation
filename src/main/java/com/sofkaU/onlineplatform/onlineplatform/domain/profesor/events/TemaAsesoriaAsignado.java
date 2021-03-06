package com.sofkaU.onlineplatform.onlineplatform.domain.profesor.events;

import co.com.sofka.domain.generic.DomainEvent;

public class TemaAsesoriaAsignado extends DomainEvent {
    private final String tema;

    public TemaAsesoriaAsignado(String tema) {
        super("sofkaU.onlineplatform.profesor.temaasesoriaasignado");
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }
}
