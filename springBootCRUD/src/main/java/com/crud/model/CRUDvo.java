package com.crud.model;


public class CRUDvo {
    private String id;
    private String name;
    private int page;



    //Getter Setter 메소드 모델을 작성
    // 사실 lombok을 사용하면 위에 메소드만 작성하고 Getter Setter 는 작성할 필요없음.
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage(){
        return page;
    }

    public void setPage(int page){
        this.page = page;
    }

}
