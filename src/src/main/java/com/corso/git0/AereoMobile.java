package com.corso.git0;

public abstract class AereoMobile implements CMP<AereoMobile> {

    private String sigla;

    public AereoMobile(String sigla) {
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }


}
