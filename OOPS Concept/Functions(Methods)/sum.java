public class sum {
    int dum(int a,int b){
        int c = a+b;
        return c;
    }

    public static void main(String[] args) {
        sum obj = new sum();
        int summing = obj.dum(10,20);
        System.out.println(summing);
    }
}

class details {

    String name(){          //String n
        return "navin";      //n = "navin"; return n;
    }
    String mobno(){         //String m
        return "45455464";  //m = "45455464"; return m;
    }
    public static void main(String[] args) {
        details obj = new details();        
        String name = obj.name();       //obj call name navin
        String mobno = obj.mobno();     //obj call mobno 45455464
        System.out.println("My name is "+name+" and my mobile number is "+mobno);
    }
}
