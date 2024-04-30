package site.haloshop.backendtmdt.exception;

import lombok.Data;


public enum ErrorCode {
    UNKNOW_ERROR(1111,"Lỗi không xác định"),
    PRODUCT_NOT_EXIST(106,"Sản phẩm này không tồn tại"),
    CATEGORY_NOT_EXIST(106,"Loại sản phẩm này không tồn tại"),
    ;
    private int code;
    private String message;
    ErrorCode(int code, String message){
        this.code = code;
        this.message = message;
    }
    public int getCode(){
        return code;
    }
    public String getMessage(){
        return message;
    }
}
