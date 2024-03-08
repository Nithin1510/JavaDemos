package com.bookapp.util;

public class Queries {
    public static final String InsertQuery = null;
    public static final String UpdateQuery = null;
    public static final String DeleteQuery = null;

    public static final String SelectQuery = "SELECT * FROM BOOK";
    public static final String SelectByAuthorQuery = "SELECT * FROM BOOK WHERE author=?";
    public static final String SelectByPriceQuery = "SELECT * FROM BOOK WHERE price<?";
    public static final String SelectByAuthorAndCategoryQuery = "SELECT * FROM BOOK WHERE author=? && category=?";
    public static final String SelectByIdQuery = "SELECT * FROM BOOK WHERE book_Id=?";
}
