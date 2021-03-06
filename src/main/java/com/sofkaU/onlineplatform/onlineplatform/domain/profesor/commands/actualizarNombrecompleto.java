package com.sofkaU.onlineplatform.onlineplatform.domain.profesor.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values.NombreCompleto;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values.ProfesorId;

public class actualizarNombrecompleto extends Command {

    private final ProfesorId profesorId;
    private final NombreCompleto nombreCompleto;

    public actualizarNombrecompleto(ProfesorId profesorId, NombreCompleto nombreCompleto){

        this.profesorId = profesorId;
        this.nombreCompleto = nombreCompleto;
    }

    public ProfesorId getProfesorId() {
        return profesorId;
    }
}
