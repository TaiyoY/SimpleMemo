package com.example.yuguchi.simplememo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


    public class MemoOpenHelper extends SQLiteOpenHelper {

        // データベース自体の名前(テーブル名ではない)
        static final private String DBName = "TATSU_DB";
        // データベースのバージョン(2,3と挙げていくとonUpgradeメソッドが実行される)
        static final private int VERSION = 1;

        // コンストラクタ　以下のように呼ぶこと
        public MemoOpenHelper(Context context){
            super(context, DBName, null, VERSION);
        }

        // データベースが作成された時に実行される処理
        @Override
        public void onCreate(SQLiteDatabase db) {
            // 処理を記述
        }

        // データベースをバージョンアップした時に実行される処理
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // 処理を記述
        }

        // データベースが開かれた時に実行される処理
        @Override
        public void onOpen(SQLiteDatabase db) {
            super.onOpen(db);
        }
    }

