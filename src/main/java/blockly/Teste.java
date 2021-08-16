package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Teste {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Teste
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   private Var dados = Var.VAR_NULL;

   public Var call() throws Exception {

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.startEditingMode"),
    Var.valueOf(""));

    dados =
    cronapi.list.Operations.getFirst((
    cronapi.database.Operations.query(Var.valueOf("app.entity.Escuderia"),Var.valueOf("select e.nome from Escuderia e where e.id = :id"),Var.valueOf("id",
    cronapi.util.Operations.getCurrentUserName()))));

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
    Var.valueOf(""),
    cronapi.json.Operations.getJsonOrMapField(dados,
    Var.valueOf("Piloto")));

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
    Var.valueOf(""),
    cronapi.json.Operations.getJsonOrMapField(dados,
    Var.valueOf("Carro")));
    return Var.VAR_NULL;
   }
 }.call();
}

}

