package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class TesteF1 {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// testeF1
public static Var idEscuderia() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {

    item =
    cronapi.database.Operations.query(Var.valueOf("app.entity.Escuderia"),Var.valueOf("select e from Escuderia e where e.id = :id"),Var.valueOf("id",Var.VAR_NULL));
    return Var.VAR_NULL;
   }
 }.call();
}

}

