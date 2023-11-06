/*
문제 풀어 보세요 ^^
요구사항
 >> 매장카트 구현하기 입니다 <<
카트 (Cart) >> member field 
카트 매장에 있는 [모든 전자제품]을 담을 수 있다 
카트의 크기는 고정되어 있다 (10개) : 1개  , 2개 담을 수 있고 최대 10개까지 담을 수 있다
고객이 물건을 구매 하면 ... [카트에 담는다]
---------------------------------------
계산대에 가면 전체 계산
계산기능이 필요
summary() 기능 추가해 주세요
당신이 구매한 물건이름 과 가격정보 나열
총 누적금액 계산 출력

hint) 카트 물건을 담는 행위 (Buy() 함수안에서 cart  담는 것을 구현 )
hint) Buyer ..>> summary()  main 함수에서 계산할때  사용합니다

Buyer >> buy() , summary()  >> 카트에 물건 계산 (어떤물건 , 각 가격 >> 당신은 총 얼마 지급)

구매자는 default 금액을 가지고 있고 초기금액을 설정할 수 도 있다
*/

class Product2{  //extends Object
	int price;
	int bonuspoint;
	//Product() {	}
	Product2(int price) {
		this.price = price;
		this.bonuspoint = (int)(this.price/10.0);
	}
	
}

class KtTv2 extends Product2{
	KtTv2(){
		super(500);
	}
	
	//Object 재정의 
	@Override
	public String toString() {
		return "KtTv2";
	}
}

class Audio2 extends Product2{
	Audio2(){
		super(100);
	}
	
	@Override
	public String toString() {
		return "Audio2";
	}
}

class NoteBook2 extends Product2{
	NoteBook2(){
		super(150);
	}
	
	@Override
	public String toString() {
		return "NoteBook2";
	}
}

//다시 해보세요
class Buyer2 {
    int money = 5000;
    int bonuspoint;

    Product2[] cart = new Product2[10];
    int numOfProductsInCart = 0;

    void summary() {
        int total = 0;
        System.out.println("구매 목록:");
        for (int i = 0; i < numOfProductsInCart; i++) {
            System.out.println(cart[i].toString() + " : " + cart[i].price);
            total += cart[i].price;
        }
        System.out.println("총 누적 금액: " + total);
    }

    void buy(Product2 product) {
        if (money < product.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }

        if (numOfProductsInCart >= 10) {
            System.out.println("카트에 더 이상 물건을 담을 수 없습니다.");
            return;
        }

        money -= product.price;
        bonuspoint += product.bonuspoint;
        cart[numOfProductsInCart++] = product;
        System.out.println(product.toString() + "를 카트에 담았습니다.");
    }
}



public class Ex11_Inherit_Point {
 public static void main(String[] args) {
	
 }
}
