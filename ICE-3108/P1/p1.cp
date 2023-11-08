#line 1 "C:/Users/islam/OneDrive/Desktop/190602/P1/p1.c"
char segment[]= {0x3F,0x06,0x5B,0x4F,0x66,0x6D,0x7D,0x07,0x7F,0x6F};
int i = 0;
int j = 0;
int k = 0;
int l = 0;
int count = 0;
int evenOrOdd = 0;
void main()
{
 TRISB = 0;
 TRISC = 0;
 TRISD = 0;
 PORTB = 0;
 PORTC = 0;
 PORTD = 0;
 while(1)
 {
 if (count % 2 == 0)
 {
 PORTB = segment[count % 10];
 PORTC.f1 = 0;
 delay_ms(10);
 PORTC.f1 = 1;

 PORTB = segment[count / 10];
 PORTC.f0 = 0;
 delay_ms(10);
 PORTC.f0 = 1;
 }
 if (count % 2 == 1)
 {
 PORTD = segment[count % 10];
 PORTC.f3 = 0;
 delay_ms(10);
 PORTC.f3 = 1;

 PORTD = segment[count / 10];
 PORTC.f2 = 0;
 delay_ms(10);
 PORTC.f2 = 1;
 }
 delay_ms(175);
 count++;
 if (count > 100)
 {
 count = 0;
 }
 }

}
