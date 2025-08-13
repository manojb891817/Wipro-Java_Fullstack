class UserMainCode
{
public int isEven(int input1){
if(input1%2==0) return 2;
else return 1;
}
public static void main(String[] args) {
    UserMainCode obj = new UserMainCode();
    int result =obj.isEven(5);
    System.out.println(result);
}
}
