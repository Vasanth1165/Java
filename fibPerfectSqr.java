class java{
    public static void main(String args[]){
        class Number{
            int num;
            public boolean isPerfectSqr(){
                double Sqrt=(int)Math.sqrt(num);
                if(Sqrt*Sqrt==num){
                    return true;
                }else{
                    return false;
                }
            }
            public boolean isFibnance(){
                this.num=5*num*num+4;
                boolean var1=isPerfectSqr();
                this.num=5*num*num-4;
                boolean var2=isPerfectSqr();
                return (var1 || var2);
            }
        }
        Number number=new Number();
        number.num=6;
        System.out.println(number.isPerfectSqr());
        System.out.println(number.isFibnance());
    }
}
