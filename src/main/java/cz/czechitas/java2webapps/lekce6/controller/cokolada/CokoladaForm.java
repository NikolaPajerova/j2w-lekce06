package cz.czechitas.java2webapps.lekce6.controller.cokolada;

import javax.validation.constraints.*;

public class CokoladaForm {
    @NotBlank
    @NotEmpty
    private String druh;
    @NotNull   // nesmí být prázdné
    private Velikost velikost;
    @NotBlank
    private String jmeno;
    @Email
    @NotBlank
    private String email;
    @AssertTrue
    private boolean obchodniPodminky;

    public String getDruh() {
        return druh;
    }

    public void setDruh(String zbozi) {
        this.druh = zbozi;
    }

    public Velikost getVelikost() {
        return velikost;
    }

    public void setVelikost(Velikost velikost) {
        this.velikost = velikost;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isObchodniPodminky() {
        return obchodniPodminky;
    }

    public void setObchodniPodminky(boolean obchodniPodminky) {
        this.obchodniPodminky = obchodniPodminky;
    }
}
