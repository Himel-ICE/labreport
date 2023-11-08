
_main:

;p1.c,8 :: 		void main()
;p1.c,10 :: 		TRISB = 0;
	CLRF       TRISB+0
;p1.c,11 :: 		TRISC = 0;
	CLRF       TRISC+0
;p1.c,12 :: 		TRISD = 0;
	CLRF       TRISD+0
;p1.c,13 :: 		PORTB = 0;
	CLRF       PORTB+0
;p1.c,14 :: 		PORTC = 0;
	CLRF       PORTC+0
;p1.c,15 :: 		PORTD = 0;
	CLRF       PORTD+0
;p1.c,16 :: 		while(1)
L_main0:
;p1.c,18 :: 		if (count % 2 == 0)
	MOVLW      2
	MOVWF      R4+0
	MOVLW      0
	MOVWF      R4+1
	MOVF       _count+0, 0
	MOVWF      R0+0
	MOVF       _count+1, 0
	MOVWF      R0+1
	CALL       _Div_16x16_S+0
	MOVF       R8+0, 0
	MOVWF      R0+0
	MOVF       R8+1, 0
	MOVWF      R0+1
	MOVLW      0
	XORWF      R0+1, 0
	BTFSS      STATUS+0, 2
	GOTO       L__main11
	MOVLW      0
	XORWF      R0+0, 0
L__main11:
	BTFSS      STATUS+0, 2
	GOTO       L_main2
;p1.c,20 :: 		PORTB = segment[count % 10];
	MOVLW      10
	MOVWF      R4+0
	MOVLW      0
	MOVWF      R4+1
	MOVF       _count+0, 0
	MOVWF      R0+0
	MOVF       _count+1, 0
	MOVWF      R0+1
	CALL       _Div_16x16_S+0
	MOVF       R8+0, 0
	MOVWF      R0+0
	MOVF       R8+1, 0
	MOVWF      R0+1
	MOVF       R0+0, 0
	ADDLW      _segment+0
	MOVWF      FSR
	MOVF       INDF+0, 0
	MOVWF      PORTB+0
;p1.c,21 :: 		PORTC.f1 = 0;
	BCF        PORTC+0, 1
;p1.c,22 :: 		delay_ms(10);
	MOVLW      26
	MOVWF      R12+0
	MOVLW      248
	MOVWF      R13+0
L_main3:
	DECFSZ     R13+0, 1
	GOTO       L_main3
	DECFSZ     R12+0, 1
	GOTO       L_main3
	NOP
;p1.c,23 :: 		PORTC.f1 = 1;
	BSF        PORTC+0, 1
;p1.c,25 :: 		PORTB = segment[count / 10];
	MOVLW      10
	MOVWF      R4+0
	MOVLW      0
	MOVWF      R4+1
	MOVF       _count+0, 0
	MOVWF      R0+0
	MOVF       _count+1, 0
	MOVWF      R0+1
	CALL       _Div_16x16_S+0
	MOVF       R0+0, 0
	ADDLW      _segment+0
	MOVWF      FSR
	MOVF       INDF+0, 0
	MOVWF      PORTB+0
;p1.c,26 :: 		PORTC.f0 = 0;
	BCF        PORTC+0, 0
;p1.c,27 :: 		delay_ms(10);
	MOVLW      26
	MOVWF      R12+0
	MOVLW      248
	MOVWF      R13+0
L_main4:
	DECFSZ     R13+0, 1
	GOTO       L_main4
	DECFSZ     R12+0, 1
	GOTO       L_main4
	NOP
;p1.c,28 :: 		PORTC.f0 = 1;
	BSF        PORTC+0, 0
;p1.c,29 :: 		}
L_main2:
;p1.c,30 :: 		if (count % 2 == 1)
	MOVLW      2
	MOVWF      R4+0
	MOVLW      0
	MOVWF      R4+1
	MOVF       _count+0, 0
	MOVWF      R0+0
	MOVF       _count+1, 0
	MOVWF      R0+1
	CALL       _Div_16x16_S+0
	MOVF       R8+0, 0
	MOVWF      R0+0
	MOVF       R8+1, 0
	MOVWF      R0+1
	MOVLW      0
	XORWF      R0+1, 0
	BTFSS      STATUS+0, 2
	GOTO       L__main12
	MOVLW      1
	XORWF      R0+0, 0
L__main12:
	BTFSS      STATUS+0, 2
	GOTO       L_main5
;p1.c,32 :: 		PORTD = segment[count % 10];
	MOVLW      10
	MOVWF      R4+0
	MOVLW      0
	MOVWF      R4+1
	MOVF       _count+0, 0
	MOVWF      R0+0
	MOVF       _count+1, 0
	MOVWF      R0+1
	CALL       _Div_16x16_S+0
	MOVF       R8+0, 0
	MOVWF      R0+0
	MOVF       R8+1, 0
	MOVWF      R0+1
	MOVF       R0+0, 0
	ADDLW      _segment+0
	MOVWF      FSR
	MOVF       INDF+0, 0
	MOVWF      PORTD+0
;p1.c,33 :: 		PORTC.f3 = 0;
	BCF        PORTC+0, 3
;p1.c,34 :: 		delay_ms(10);
	MOVLW      26
	MOVWF      R12+0
	MOVLW      248
	MOVWF      R13+0
L_main6:
	DECFSZ     R13+0, 1
	GOTO       L_main6
	DECFSZ     R12+0, 1
	GOTO       L_main6
	NOP
;p1.c,35 :: 		PORTC.f3 = 1;
	BSF        PORTC+0, 3
;p1.c,37 :: 		PORTD = segment[count / 10];
	MOVLW      10
	MOVWF      R4+0
	MOVLW      0
	MOVWF      R4+1
	MOVF       _count+0, 0
	MOVWF      R0+0
	MOVF       _count+1, 0
	MOVWF      R0+1
	CALL       _Div_16x16_S+0
	MOVF       R0+0, 0
	ADDLW      _segment+0
	MOVWF      FSR
	MOVF       INDF+0, 0
	MOVWF      PORTD+0
;p1.c,38 :: 		PORTC.f2 = 0;
	BCF        PORTC+0, 2
;p1.c,39 :: 		delay_ms(10);
	MOVLW      26
	MOVWF      R12+0
	MOVLW      248
	MOVWF      R13+0
L_main7:
	DECFSZ     R13+0, 1
	GOTO       L_main7
	DECFSZ     R12+0, 1
	GOTO       L_main7
	NOP
;p1.c,40 :: 		PORTC.f2 = 1;
	BSF        PORTC+0, 2
;p1.c,41 :: 		}
L_main5:
;p1.c,42 :: 		delay_ms(175);
	MOVLW      2
	MOVWF      R11+0
	MOVLW      199
	MOVWF      R12+0
	MOVLW      136
	MOVWF      R13+0
L_main8:
	DECFSZ     R13+0, 1
	GOTO       L_main8
	DECFSZ     R12+0, 1
	GOTO       L_main8
	DECFSZ     R11+0, 1
	GOTO       L_main8
	NOP
;p1.c,43 :: 		count++;
	INCF       _count+0, 1
	BTFSC      STATUS+0, 2
	INCF       _count+1, 1
;p1.c,44 :: 		if (count > 100)
	MOVLW      128
	MOVWF      R0+0
	MOVLW      128
	XORWF      _count+1, 0
	SUBWF      R0+0, 0
	BTFSS      STATUS+0, 2
	GOTO       L__main13
	MOVF       _count+0, 0
	SUBLW      100
L__main13:
	BTFSC      STATUS+0, 0
	GOTO       L_main9
;p1.c,46 :: 		count = 0;
	CLRF       _count+0
	CLRF       _count+1
;p1.c,47 :: 		}
L_main9:
;p1.c,48 :: 		}
	GOTO       L_main0
;p1.c,50 :: 		}
L_end_main:
	GOTO       $+0
; end of _main
