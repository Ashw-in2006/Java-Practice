
class nested {
    public static void main(String args[]){
        // teacher 1
        // teacher 2
        // teacher 3
        for(int teacher=1; teacher<=3; teacher= teacher+1){
            for(int count = 1; count<=5; count = count+1){
                System.out.println(teacher + " teacher says 'john' to print " + count);
            }
        }
    }
}

class star {
    public static void main(String args[]){
        for(int i = 0; i <= 2; i = i + 1){
            for(int j = 1; j <= i + 1; j++){
                System.out.print("*");                        
            }
            System.out.println();
        }
    }
}
