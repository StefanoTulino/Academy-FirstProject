package com.corso.git0;

public class AereoMotore extends AereoMobile {

    private double potenza;

    public AereoMotore(String sigla, double potenza) {
        super(sigla);
        this.potenza = potenza;
    }

    public double getPotenza() {
        return potenza;
    }

    public void setPotenza(double potenza) {
        this.potenza = potenza;
    }


    @Override
    public int compareToAir(AereoMobile o) {
        AereoMotore a= (AereoMotore) o;
        if(!(o instanceof AereoMotore)) {
                return -2;
            }
        if(this.potenza > ((AereoMotore) o).getPotenza())
            return 1;
        else if(this.potenza < ((AereoMotore) o).getPotenza())
            return -1;

        else return 0;
    }

    //fare override
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    //fare override
    @Override
    public String toString() {
        return super.toString();
    }

}
