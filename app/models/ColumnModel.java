package models;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.List;
import java.util.zip.CheckedOutputStream;



/**
 * Created by sunway on 2016/4/10.
 */


@Entity //エンティティを定義-&gt;MySQLのテーブル
@Table(name = "columns") //テーブル名を定義
public class ColumnModel extends Model {
    //    @Id //PRIMARY KEYを設定
    @Column(name = "table_schema") //カラム名を定義
//    @GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO_INCREMENTを宣言
    public String dbName;

    @Column(name = "table_name") //文字数指定、NOTNULL制約
    public String tableName;

    @Column(name = "column_name")
    public String columnName;
    @Column(name = "column_comment")
    public String columnComment;

    @Column(name = "data_type")
    public String dataType;
    @Column(name = "CHARACTER_MAXIMUM_LENGTH" )
    public  String columnLength;

    //    @Column(name = "mail", length = 50, nullable = false)
//    @Constraints.Email //メール形式のバリデーション
//    public String mail;
    public static Finder<Long, ColumnModel> find = new Finder<Long, ColumnModel>( ColumnModel.class);

    public static List<ColumnModel> findByTableName(String tableName) {
//        find.where()
        return find.where().eq("table_name", tableName).eq("table_schema", "shop2").findList();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ColumnModel{");
        sb.append("dbName='").append(dbName).append('\'');
        sb.append(", tableName='").append(tableName).append('\'');
        sb.append(", columnName='").append(columnName).append('\'');
        sb.append(", columnComment='").append(columnComment).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
