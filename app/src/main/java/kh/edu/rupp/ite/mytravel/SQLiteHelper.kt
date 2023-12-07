package kh.edu.rupp.ite.mytravel

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import kh.edu.rupp.ite.mytravel.api.model.HomeModel

class SQLiteHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION){


    companion object{
        private const val DATABASE_NAME = "province.db"
        private const val DATABASE_VERSION = 1
        private const val TBL_PROVINCE = "tbl_province"
        private const val ID = "id"
        private const val NAME = "name"
        private const val PROVINCE = "province"

    }

    override fun onCreate(db: SQLiteDatabase?) {
        val createTblLocation = ("CREATE TABLE" + TBL_PROVINCE + "(" +
                ID + "INTEGER PRIMARY KEY, " + NAME + "TEXT," + PROVINCE + "TEXT" + ")")
        db?.execSQL(createTblLocation)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db!!.execSQL("DROP TABLE IF EXISTS $TBL_PROVINCE")
        onCreate(db)
    }

    fun insertProvince(std: HomeModel): Long {
        val db = this.writableDatabase

        val contentValues = ContentValues()
        contentValues.put(ID, std.id)
        contentValues.put(ID, std.province)
        contentValues.put(ID, std.name)

        val success = db.insert(TBL_PROVINCE, null, contentValues)
        db.close()
        return success
    }

    @SuppressLint("Range")
    fun getAllProvince(): ArrayList<HomeModel>{
        val stdList: ArrayList<HomeModel> = ArrayList()
        val selectQuery = "SELECT * FROM $TBL_PROVINCE"
        val db = this.readableDatabase

        val cursor: Cursor?

        try {
            cursor = db.rawQuery(selectQuery, null)

        }catch (e: Exception){
            e.printStackTrace()
            db.execSQL(selectQuery)
            return ArrayList()
        }

        var id:Int
        var name:String
        var province:String

        if (cursor.moveToFirst()){
            do{
                id = cursor.getInt(cursor.getColumnIndex("id"))
                name = cursor.getString(cursor.getColumnIndex("name"))
                province = cursor.getString(cursor.getColumnIndex("province"))

                val std = HomeModel(id = id, name = name, province = province)
                stdList.add(std)
            }while (cursor.moveToFirst())
        }

        return stdList
    }



}