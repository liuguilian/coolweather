package com.coolweather.app.db;

import android.R.string;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

	/**
	 * province表建表语句
	 * 
	 */
	public static final String CREATE_PROVINCE = "create table provice("
			+ "id integer primary key autoincrement," + "provice_name text,"
			+ "provice_code text)";
	/**
	 * 
	 * city建表语句
	 */
	public static final String CREATE_CITY = "create table provice("
			+ "id integer primary key autoincrement," + "city_name text,"
			+ "city_code text," + "provice_id integer)";
	/**
	 * county表建表语句
	 */

	public static final String CREATE_COUNTY = "create table county("
			+ "id integer primary key autoincrement," + "county_name text,"
			+ "county_code text," + "city_id integer)";
	

	public CoolWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_PROVINCE);
		db.execSQL(CREATE_CITY);
		db.execSQL(CREATE_COUNTY);

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

	}

}
