int speed = 0;
void main()
{
     TRISB = 0;
     TRISD.f0 = 1;
     TRISD.f1 = 1;
     PORTB.f0 = 1;
     PORTB.f1 = 0;
     PORTD.f0 = 0;
     PORTD.f1 = 0;
     PWM1_Init(1000);
     PWM1_Start();
     PWM1_Set_Duty(speed);
     while(1)
    {
      if(PORTD.f0 == 1 && speed < 250)
      {
        Delay_ms(100);
        speed = speed + 10;
        PWM1_Set_Duty(speed);
      }
      if(PORTD.f1 == 1 && speed > 0)
      {
          speed = speed - 10;
          PWM1_Set_Duty(speed);
      }
      Delay_ms(10);
    }
     
}