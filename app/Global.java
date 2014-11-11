import play.*;
import play.libs.*;
import com.avaje.ebean.Ebean;
import models.*;
import java.util.*;

public class Global extends GlobalSettings {
    @Override
    public void onStart(Application app) {
      if (AwardType.find.findRowCount() == 0) {
        Ebean.save((List) Yaml.load("awardtype-data.yml"));
      }

      if (Store.find.findRowCount() == 0) {
        Ebean.save((List) Yaml.load("product-data.yml"));
      }
    }
}
