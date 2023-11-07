int i,x,zx;
int ix,xx,zxx;
char row[]={0x80,0x40,0x20,0x10,0x08,0x04,0x02,0x01};
int col[8]={0x00,0x3c,0x20,0x20,0x3c,0x20,0x20,0x3c};
void main() {
    TRISB=0x00;
    TRISD=0x00;
    while(1)
    {
        for(i=0;i<8;i++)
        {
            PORTD=row[i];
            PORTB=col[i];
            delay_ms(1);
        }
        delay_ms(30);

    }
}