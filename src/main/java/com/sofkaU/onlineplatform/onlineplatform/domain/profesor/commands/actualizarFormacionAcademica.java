package com.sofkaU.onlineplatform.onlineplatform.domain.profesor.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values.FormacionAcademica;
import com.sofkaU.onlineplatform.onlineplatform.domain.profesor.values.ProfesorId;

public class actualizarFormacionAcademica extends Command {
    private final ProfesorId profesorId;
    private final FormacionAcademica formacionAcademica;

    public actualizarFormacionAcademica(ProfesorId profesorId, FormacionAcademica formacionAcademica){

        this.profesorId = profesorId;
        this.formacionAcademica = formacionAcademica;
    }

    public ProfesorId getProfesorId() {
        return profesorId;
    }

    public FormacionAcademica getFormacionAcademica() {
        return formacionAcademica;
    }
}
