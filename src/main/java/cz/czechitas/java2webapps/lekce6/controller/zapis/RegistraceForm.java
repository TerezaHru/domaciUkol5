package cz.czechitas.java2webapps.lekce6.controller.zapis;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.time.Period;

/**
 */
public class RegistraceForm {

  @NotBlank
  private String jmeno;

  @NotBlank
  private String prijmeni;


  @NotBlank
  private String pohlavi;
  @NotBlank
  private String turnus;


  @DateTimeFormat(pattern = "yyyy-MM-dd")
  public LocalDate datum_narozeni;

  private int roky;

  public int getRoky() {return roky;}

  public void setRoky(int roky) {this.roky = roky;}


  private Period period;

  public Period getPeriod() {return period;}

  public void setPeriod(Period period) {this.period = period;}


  @Email
  private String email;

  private String telefon;

  public String getPohlavi() {
    return pohlavi;
  }
  public void setPohlavi(String pohlavi) {
    this.pohlavi = pohlavi;
  }

  public String getTurnus() {return turnus;}
  public void setTurnus(String turnus) {
    this.turnus = turnus;
  }

  public String getJmeno() {
    return jmeno;
  }

  public void setJmeno(String jmeno) {
    this.jmeno = jmeno;
  }

  public String getPrijmeni() {return prijmeni;}

  public void setPrijmeni(String prijmeni) {this.prijmeni = prijmeni;}

  public LocalDate getDatum_narozeni() {return datum_narozeni;}

  public void setDatum_narozeni(LocalDate datum_narozeni) {
    this.datum_narozeni = datum_narozeni;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTelefon() {return telefon;}
  public void setTelefon(String telefon) {this.telefon = telefon;}




}
