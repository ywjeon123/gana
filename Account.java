package object_class;
//은행계좌 클래스 만들기111111(ex:신한은행)//
public class Account {//AccountDay0318 객체//
      //멤버변수(필드) 클래스가 만들어지면서 객체를 저장할 변수 , 
	  static final String BANKNAME="신한은행"; 
	  //final 값을 고정 ,static 정적멤버변수 안붙으면 인스턴스멤버변수,static final-상수 ,소문자로 하면 에러는 안나지만 대문자로해야함 상수쓰는 약속 
	  String accountNo; //계좌번호
	  String ownerName; //예금주 이름
	  int balance;      //잔액
	  
	  /*new 다음에 입력되는 부분 (초기값을 받을 변수 매개변수) ,생성자 생성자를 이렇게 직접 빈공간이안생긴다,초기값을 받을 변수, 
	  this.accountNo=acoountNo 매개,멤버 이름이 같을때 this.을 붙여준다*/
	  public Account(String accNo, String owName, int bal)
	  {
		  accountNo=accNo;
		  ownerName=owName;
		  balance=bal;
	  }
	  //생성자 빈 생성자
	  public Account() {
		  
	  }
	  
	  
	  //메서드(기능) 예금한다는 메서드 ,메서드이름 deposit, void-리턴값이 없는것 
	  void deposit(int amount) { 
		  balance+=amount; //balanace=balance+amount;
	  }
	  
	  //인출하는 메서드 / withdraw 메서드이름, int타입 , 타입을쓰면 무조건 리턴타입이 나와야한다, throws Exception- 예외가 생기면 그에 맞는 값을 넣어준다
	  int withdraw(int amount) throws Exception {
		  if(balance<amount) {
			  throw new Exception("잔액이 부족합니다.");
		  }
		  balance-=amount; //balance=balance-amount;
		  return amount;
	  }
}
