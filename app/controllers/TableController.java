package controllers;

import com.avaje.ebean.Model;

import models.ColumnModel;

import models.TableModel;
import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.aa;
import views.html.table;

import java.util.List;

/**
 * Created by sunway on 2016/4/9.
 */
public class TableController extends Controller {

    public Result index(String tableName) {
      List<TableModel> list = TableModel.findByTableList(tableName);
        return ok(table.render(tableName,list));
    }


    public Result showColumn(String tableName){
        List<ColumnModel> list = ColumnModel.findByTableName(tableName);
        return  ok(aa.render(tableName,list));
    }

    public Result load(String tableName) {
        List<ColumnModel> list = ColumnModel.findByTableName(tableName);
        System.out.println(ColumnModel.db().getName());

        return  ok(Json.toJson(list));

    }
}
