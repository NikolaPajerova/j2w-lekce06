package cz.czechitas.java2webapps.lekce6.controller.alkohol;

import javax.validation.constraints.*;

/**
 */
public class AlkoholForm {
  @NotBlank   //pravidla pro vyplňování - nesmí být prázdné atp., lze zadat též na GETTERu
  @NotEmpty  // zkontroluje, že hodnota není Null a není prázdný string, musí být text (bere i jednu mezeru)
  private String zbozi;
  @NotNull   // nesmí být prázdné
  private Objem objem;  //můžu rovnou vyplnit nějakou hodnotu, která se zobrazí - objem = Objem.OBJEM_5L
  @NotBlank  //zkontroluje, že není Null, délka je větší než 1 a není to mezera
  private String jmeno; //můžu rovnou vyplnit nějakou hodnotu, která se zobrazí - jmeno = "Méďa Béďa"
  @NotNull
  @Min(1)  //řeší obsah prvku VEK
  @Max(150)
  private Integer vek;
  @Email  //řeší, zda se zadá formát adresy
  @NotBlank
  private String email;
  @AssertTrue  //zadaná hodnota musí být vždy TRUE
  private boolean obchodniPodminky;
  private boolean newsletter;

  public String getZbozi() {
    return zbozi;
  }

  public void setZbozi(String zbozi) {
    this.zbozi = zbozi;
  }

  public Objem getObjem() {
    return objem;
  }

  public void setObjem(Objem objem) {
    this.objem = objem;
  }

  public String getJmeno() {
    return jmeno;
  }

  public void setJmeno(String jmeno) {
    this.jmeno = jmeno;
  }

  public Integer getVek() {
    return vek;
  }

  public void setVek(Integer vek) {
    this.vek = vek;
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

  public boolean isNewsletter() {
    return newsletter;
  }

  public void setNewsletter(boolean newsletter) {
    this.newsletter = newsletter;
  }
}
