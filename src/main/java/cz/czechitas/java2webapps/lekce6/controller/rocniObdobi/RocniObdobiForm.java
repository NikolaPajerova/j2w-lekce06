package cz.czechitas.java2webapps.lekce6.controller.rocniObdobi;

import java.util.EnumSet;

/**
 *
 */
public class RocniObdobiForm {
  private EnumSet<RocniObdobiEnum> oblibena;

  public EnumSet<RocniObdobiEnum> getOblibena() { //oproti List<...> se tu neopakují data a nezáleží na pořadí, je to jen množina prvků bez opakování
    return oblibena;
  }

  public void setOblibena(EnumSet<RocniObdobiEnum> oblibena) {
    this.oblibena = oblibena;
  }
}
