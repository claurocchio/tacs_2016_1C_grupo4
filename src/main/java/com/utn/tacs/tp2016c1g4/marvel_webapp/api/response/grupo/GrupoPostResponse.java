package com.utn.tacs.tp2016c1g4.marvel_webapp.api.response.grupo;

import com.utn.tacs.tp2016c1g4.marvel_webapp.api.response.OperationStatus;

public class GrupoPostResponse {

	private Long idGrupo;
	private OperationStatus status;

	public OperationStatus getStatus() {
		return status;
	}

	public void setStatus(OperationStatus status) {
		this.status = status;
	}

	public Long getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(Long idGrupo) {
		this.idGrupo = idGrupo;
	}

}
