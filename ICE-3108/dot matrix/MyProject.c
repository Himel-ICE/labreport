#define col1 portd.f0
#define col2 portd.f1
#define col3 portd.f2
#define col4 portd.f3
#define col5 portd.f4
#define col6 portd.f5
#define col7 portd.f6
#define col8 portd.f7

#define display_row portb

unsigned char letter[8] = {0x3e,0x7e,0x60,0x60,0x60,0x60,0x7e,0x3e};
int i=0;
void main() {
     trisb = 0;
     trisd = 0;
     while(1)
     {
         display_row = letter[i+0];
         col1 = 1;
         delay_ms(1);
         col1 = 0;

         display_row = letter[i+1];
         col2 = 1;
         delay_ms(1);
         col2 = 0;

         display_row = letter[i+2];
         col3 = 1;
         delay_ms(1);
         col3 = 0;


         display_row = letter[i+3];
         col4 = 1;
         delay_ms(1);
         col4 = 0;

         display_row = letter[i+4];
         col5 = 1;
         delay_ms(1);
         col5 = 0;

         display_row = letter[i+5];
         col6 = 1;
         delay_ms(1);
         col6 = 0;

         display_row = letter[i+6];
         col7 = 1;
         delay_ms(1);
         col7 = 0;

         display_row = letter[i+7];
         col8 = 1;
         delay_ms(1);
         col8 = 0;
     }
}