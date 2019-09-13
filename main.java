public class Main{
public static void main (Strings[] args){

for(int k=0; k<n;k++){
loop2:
for (int i = 1; i <=n; i++) {
if (i*k % 2 == 0)
continue loop1;
System.out.println(i*k+" is not divisible by 2");
if (i*k % 5 == 0)
continue loop2;
System.out.println(i*k+" is not divisible by 5");
if (i*k % 11 == 0) {
System.out.println(i*k+" is divisible by 11");
break loop1;
}
}
}

}
}
