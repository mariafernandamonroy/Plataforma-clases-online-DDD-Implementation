package com.sofkaU.onlineplatform.onlineplatform.domain.profesor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values.NombreCompleto;

public class ProfesorCreado extends DomainEvent {
    private final NombreCompleto nombreCompleto;

    public ProfesorCreado(NombreCompleto nombreCompleto){
        super("sofkaU.onlineplatform.profesor.profesorcreado");
        this.nombreCompleto = nombreCompleto;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }
}
