package club.banyuan.machine;
import club.banyuan.animal.*;

public class Fridge {

  public int heightInCM;
  public Elephant storage1;
  public Lion storage2;

  public Elephant store(Elephant elephant) {
    if(storage1 != null | storage2 != null){
      System.out.println("冰箱已经满了");
    }else{
      storage1 = elephant;
    }
    return storage1;
  }
  //增加一个狮子类
  public Lion store(Lion lion){
    if(storage1 != null | storage2 != null){
      System.out.println("冰箱已经满了");
    }
    else{
      storage2 = lion;
    }
    return storage2;
  }

  //删除大象
  public Elephant remove(Elephant elephant){
    storage1 = null;
    return storage1;
  }

}