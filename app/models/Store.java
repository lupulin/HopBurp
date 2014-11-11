package models;

import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;
import java.util.*;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Store extends Model {

  @Id
  public Long id;

  public String image;
  public String link;
  public String title;
  public Double price;
  public Double shipping;
  public String soldBy;
  public String storeType;
  public Double ranking;

  public Store(String image, String link, String title, Double price, Double shipping, String soldBy, String storeType, Double ranking) {
    this.image = image;
    this.link = link;
    this.title = title;
    this.price = price;
    this.shipping = shipping;
    this.soldBy = soldBy;
    this.storeType = storeType;
    this.ranking = ranking;
  }

  // used for queries.
  public static Finder<Long,Store> find = new Finder<Long,Store>(
    Long.class, Store.class
  );
}
