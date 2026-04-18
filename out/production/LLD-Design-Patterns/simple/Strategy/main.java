interface moneyTrasnferStrategy{
    void payMoney();
}


class payTmMoneyTrasnferStrategy implements moneyTrasnferStrategy{
    
    public void payMoney(){
        System.out.println("Making payment via payTm");
    }
}

class phonePeMoneyTrasnferStrategy implements moneyTrasnferStrategy{
    
    public void payMoney(){
        System.out.println("Making payment via phonePe");
    }
}

class gPayMoneyTrasnferStrategy implements moneyTrasnferStrategy{
    
    public void payMoney(){
        System.out.println("Making payment via gPay");
    }
}

class neftMoneyTrasnferStrategy implements moneyTrasnferStrategy{
    
    public void payMoney(){
        //add your main logic/implentation for neft 
        System.out.println("Making payment via neft");
    }
}


public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		moneyTrasnferStrategy one = new payTmMoneyTrasnferStrategy();
		one.payMoney();
		
// 		moneyTrasnferStrategy two = new phonePeMoneyTrasnferStrategy();
// 		two.payMoney();
		
// 		moneyTrasnferStrategy three = new gPayMoneyTrasnferStrategy();
// 		three.payMoney();
		
		//pay via neft
		moneyTrasnferStrategy four = new neftMoneyTrasnferStrategy();
		four.payMoney();
		
		
		//
		
	}
}
