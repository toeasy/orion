package models;

import com.avaje.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

/**
 * Created by sunway on 2016/4/13.
 */
@Entity
@Table(name = "tables")
public class TableModel {
    @Column(name = "table_schema")
    public String dbName;
    @Column(name = "table_name")
    public String name;
    @Column(name = "table_comment")
    public String comment;
    @Column(name = "create_time")
    public Date createTime;
    @Column(name = "update_time")
    public Date updateTime;

    public static Model.Finder<Long, TableModel> find = new Model.Finder<Long, TableModel>(TableModel.class);

    public static List<TableModel> findByTableList(String tableName) {
        if(null==tableName){
            tableName = "%%";
        }else{
            tableName ="%"+tableName+"%";
        }

        return find.where().eq("table_schema", "shop2").like("table_name",tableName).findList();
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TableModel{");
        sb.append("dbName='").append(dbName).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", comment='").append(comment).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append('}');
        return sb.toString();
    }
}
