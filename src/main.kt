import javax.management.Query.div

fun main(args: Array<String>) {



   /* var todo = ";;INTRODUCCION AL ALGEBRA;https://www.youtube.com/watch?v=rGiuNCpoEYM&;2&t=0s\n" +
            ";;COEFICIENTE ALGEBRAICO;https://www.youtube.com/watch?v=CSxQIcyzWws&;3&t=0s\n" +
            ";;VALOR ABSOLUTO;https://www.youtube.com/watch?v=Rr_gqQVHkIg&;4&t=0s\n" +
            ";;NOMENCLATURA ALGEBRAICA;https://www.youtube.com/watch?v=opd65TJE5b8&;5&t=0s\n" +
            ";;GRADO DE UN POLINOMIO;https://www.youtube.com/watch?v=3QyBFm67tm0&;6&t=0s\n" +
            ";;SIGNOS DE AGRUPACION;https://www.youtube.com/watch?v=RjFx-KZdmvs&;7&t=0s\n" +
            ";;SIGNOS DE RELACION;https://www.youtube.com/watch?v=X8O-IotpAjw&;8&t=0s\n" +
            ";;REDUCCION DE TERMINOS SEMEJANTES 1;https://www.youtube.com/watch?v=9fy_Js-z0JU&;9&t=0s\n" +
            ";;REDUCCION DE TERMINOS SEMEJANTES 2;https://www.youtube.com/watch?v=fGHDfrpc5DY&;10&t=0s\n" +
            ";;REDUCCION DE POLINOMIOS 1;https://www.youtube.com/watch?v=EpvWoJOwTlE&;11&t=0s\n" +
            ";;REDUCCION DE POLINOMIOS 2;https://www.youtube.com/watch?v=W8kSId8ol7E&;12&t=0s\n" +
            ";;VALOR NUMERICO DE UN MONOMIO;https://www.youtube.com/watch?v=L7ppr8yCLY4&;13&t=0s\n" +
            ";;VALOR NUMERICO DE UN POLINOMIO 1;https://www.youtube.com/watch?v=gyl0XgcEZ1U&;14&t=0s\n" +
            ";;VALOR NUMERICO DE UN POLINOMIO 2;https://www.youtube.com/watch?v=lI7aJYzr2Ek&;15&t=0s\n" +
            ";;SUMA Y RESTA DE POLINOMIOS 1;https://www.youtube.com/watch?v=0m7dOR3_15s&;16&t=0s\n" +
            ";;SUMA Y RESTA DE POLINOMIOS 2;https://www.youtube.com/watch?v=XviYioukyss&;17&t=0s\n" +
            ";;SUMA Y RESTA DE POLINOMIOS COMBINADOS 1;https://www.youtube.com/watch?v=ltcIW6R0jlU&;18&t=0s\n" +
            ";;SUMA Y RESTA DE POLINOMIOS COMBINADOS 2;https://www.youtube.com/watch?v=58Qr5NLvkag&;19&t=0s\n" +
            ";;SUMA Y RESTA DE POLINOMIOS COMBINADOS 3;https://www.youtube.com/watch?v=9uTgGlynmgk&;20&t=0s\n" +
            ";;PRUEBA DEL VALOR NUMERICO;https://www.youtube.com/watch?v=wc0Rj0qZeN0&;21&t=0s\n" +
            ";;LA LEY DE LOS SIGNOS;https://www.youtube.com/watch?v=DK6naaG5gs8&;22&t=0s\n" +
            ";;LA LEY DE LOS EXPONENTES;https://www.youtube.com/watch?v=rJlm4enSxTg&;23&t=0s\n" +
            ";;ELIMINACION DE SIGNOS DE AGRUPACION;https://www.youtube.com/watch?v=NIuwU6DC_1k&;24&t=0s\n" +
            ";;MULTIPLICACION DE MONOMIOS;https://www.youtube.com/watch?v=J4JHXpDu5rs&;25&t=0s\n" +
            ";;MULTIPLICACION DE MONOMIO POR POLINOMIO;https://www.youtube.com/watch?v=A7fXjMB_ZaQ&;26&t=0s\n" +
            ";;MULTIPLICACION DE MONOMIO POR POLINOMIO 2;https://www.youtube.com/watch?v=ke7HxozYqUo&;27&t=0s\n" +
            ";;MULTIPLICACION DE POLINOMIOS;https://www.youtube.com/watch?v=1CJ1SgvV3LI&;28&t=0s\n" +
            ";;DIVISION DE MONOMIOS;https://www.youtube.com/watch?v=OYKE9BQV3Rw&;29&t=0s\n" +
            ";;DIVISION DE POLINOMIOS ENTRE MONOMIOS 1;https://www.youtube.com/watch?v=0BAgvOjA3vI&;30&t=0s\n" +
            ";;DIVISION DE POLINOMIOS ENTRE MONOMIOS 2;https://www.youtube.com/watch?v=34qTHAsQOZQ&;31&t=0s\n" +
            ";;DIVISION DE POLINOMIOS ENTRE POLINOMIOS 1;https://www.youtube.com/watch?v=CT7clza7o_Y&;32&t=0s\n" +
            ";;DIVISION DE POLINOMIOS ENTRE POLINOMIOS 2;https://www.youtube.com/watch?v=YfaTScKEuQ8&;33&t=0s\n" +
            ";;BINOMIO AL CUADRADO;https://www.youtube.com/watch?v=d0Rpg-GxHZU&;34&t=0s\n" +
            ";;BINOMIO AL CUADRADO TRUCOS;https://www.youtube.com/watch?v=WjT-rVCy4O4&;35&t=0s\n" +
            ";;PRODUCTO DE LA SUMA POR LA DIFERENCIA DE A Y B;https://www.youtube.com/watch?v=0Jxgzel0erA&;36&t=0s\n" +
            ";;CUBO DE UN BINOMIO;https://www.youtube.com/watch?v=CzQGLi6-CiM&;38&t=0s\n" +
            ";;TRIANGULO DE PASCAL;https://www.youtube.com/watch?v=_T3RiwXhzDg&;39&t=0s\n" +
            ";;BINOMIO DE NEWTON;https://www.youtube.com/watch?v=RPycUUCNux8&;40&t=0s\n" +
            ";;FACTOR COMUN DE MONOMIOS;https://www.youtube.com/watch?v=9hLmAT00aIY&;41&t=0s\n" +
            ";;FACTOR COMUN DE POLINOMIOS;https://www.youtube.com/watch?v=xHaKqgyZoP4&;42&t=0s\n" +
            ";;FACTOR COMUN POR AGRUPACION DE TERMINOS 1;https://www.youtube.com/watch?v=vxZuXCaNw_Y&;43&t=0s\n" +
            ";;FACTOR COMUN POR AGRUPACION DE TERMINOS 2;https://www.youtube.com/watch?v=gBoZ-wmvcWs&;44&t=0s\n" +
            ";;FACTORIZACION DEL TRINOMIO CUADRADO PERFECTO 1;https://www.youtube.com/watch?v=fdWIOXFiAEU&;45&t=0s\n" +
            ";;FACTORIZACION DEL TRINOMIO CUADRADO PERFECTO 2;https://www.youtube.com/watch?v=LB_4ZUh-DtI&;46&t=0s\n" +
            ";;DIFERENCIA DE CUADRADOS;https://www.youtube.com/watch?v=Aj9Y4f7hAlA&;47&t=0s\n" +
            ";;COMBINACION DE CASOS DE FACTOREO 1;https://www.youtube.com/watch?v=xGgSRIXPCZo&;48&t=0s\n" +
            ";;COMBINACION DE CASOS DE FACTOREO 2;https://www.youtube.com/watch?v=Y5azfwQewpU&;49&t=0s\n" +
            ";;TRINOMIO CUADRADO PERFECTO POR ADICION Y SUSTRACCION 1;https://www.youtube.com/watch?v=d5Oc7xhMIdk&;50&t=0s\n" +
            ";;TRINOMIO CUADRADO PERFECTO POR ADICION Y SUSTRACCION 2;https://www.youtube.com/watch?v=e73Eu_Rywbo&;51&t=0s\n" +
            ";;FACTORIZACION DE UN POLINOMIO DE LA FORMA X?2+BX+C 1;https://www.youtube.com/watch?v=VBAY3OCUb-0&;52&t=0s\n" +
            ";;FACTORIZACION DE UN POLINOMIO DE LA FORMA X?2+BX+C 2;https://www.youtube.com/watch?v=Q2iBYJFeihI&;53&t=0s\n" +
            ";;CASOS DE FACTORIZACION CUBO PERFECTO 1;https://www.youtube.com/watch?v=FQkfki97_BU&;54&t=0s\n" +
            ";;CASOS DE FACTORIZACION CUBO PERFECTO 2;https://www.youtube.com/watch?v=j9hUoF7JS8E&;55&t=0s\n" +
            ";;CASOS DE FACTORIZACION CUBO PERFECTO 3;https://www.youtube.com/watch?v=T_aEVjyspmM&;56&t=0s\n" +
            ";;SUMA O DIFERENCIA DE CUBOS PERFECTOS;https://www.youtube.com/watch?v=id1d-Uv1uFk&;57&t=0s\n" +
            ";;SUMA O DIFERENCIA DE POTENCIAS;https://www.youtube.com/watch?v=CDqc4UbQkiE&;58&t=0s\n" +
            ";;RESOLVER ECUACIONES DE PRIMER GRADO 1;https://www.youtube.com/watch?v=gb4cNDSqDJ8&;59&t=0s\n" +
            ";;RESOLVER ECUACIONES DE PRIMER GRADO 2;https://www.youtube.com/watch?v=AMuTu1q7Dmw&;60&t=0s\n" +
            ";;ECUACIONES DE PRIMER GRADO CON FRACCIONES 1;https://www.youtube.com/watch?v=oIJRCRMs-C4&;61&t=0s\n" +
            ";;ECUACIONES DE PRIMER GRADO CON FRACCIONES 2;https://www.youtube.com/watch?v=A_7Tt8iLr5g&;62&t=0s\n" +
            ";;ECUACIONES DE PRIMER GRADO PROBLEMAS 1;https://www.youtube.com/watch?v=G5Xqk3oNO_M&;63&t=0s\n" +
            ";;ECUACIONES DE PRIMER GRADO PROBLEMAS 2;https://www.youtube.com/watch?v=LjDjESyx2JU&;64&t=0s\n" +
            ";;MAXIMO COMUN DIVISOR;https://www.youtube.com/watch?v=bTWki9Zcy0Q&;65&t=0s\n" +
            ";;MAXIMO COMUN DIVISOR DE MONOMIOS 1;https://www.youtube.com/watch?v=BcCCLBzQK7g&;66&t=0s\n" +
            ";;MAXIMO COMUN DIVISOR DE MONOMIOS 2;https://www.youtube.com/watch?v=pQrfexkrXx0&;67&t=0s\n" +
            ";;MAXIMO COMUN DIVISOR DE POLINOMIOS 1;https://www.youtube.com/watch?v=_3eZF5Ht-m4&;68&t=0s\n" +
            ";;MAXIMO COMUN DIVISOR DE POLINOMIOS 2;https://www.youtube.com/watch?v=hohEatB839E&;69&t=0s\n" +
            ";;MAXIMO COMUN DIVISOR DE POLINOMIOS 3;https://www.youtube.com/watch?v=10kTFXxi3xI&;70&t=0s\n" +
            ";;MINIMO COMUN MULTIPLO DE MONOMIOS ;https://www.youtube.com/watch?v=Nvq8CrrazXw&;71&t=0s\n" +
            ";;MINIMO COMUN MULTIPLO DE MONOMIOS Y POLINOMIOS 1;https://www.youtube.com/watch?v=QHpSuprDY5Y&;72&t=0s\n" +
            ";;MINIMO COMUN MULTIPLO DE MONOMIOS Y POLINOMIOS 2;https://www.youtube.com/watch?v=naBlLjIc-9M&;73&t=0s\n" +
            ";;MINIMO COMUN  MULTIPLO ENTRE POLINOMIOS 1;https://www.youtube.com/watch?v=m_l2_-smfFk&;74&t=0s\n" +
            ";;MINIMO COMUN  MULTIPLO ENTRE POLINOMIOS 2;https://www.youtube.com/watch?v=vfPQxQSWwbA&;75&t=0s\n" +
            ";;SIMPLIFICACION DE FRACCIONES ALGEBRAICAS 1;https://www.youtube.com/watch?v=EVCbQuFJtMo&;76&t=0s\n" +
            ";;SIMPLIFICACION DE FRACCIONES ALGEBRAICAS 2;https://www.youtube.com/watch?v=VJE-HWQ-dO4&;77&t=0s\n" +
            ";;SUMA DE FRACCIONES ALGEBRAICAS 1;https://www.youtube.com/watch?v=x7tTdvt7BuE&;78&t=0s\n" +
            ";;SUMA DE FRACCIONES ALGEBRAICAS 2;https://www.youtube.com/watch?v=CAh2LS7gunA&;79&t=0s\n" +
            ";;RESTA DE FRACCIONES ALGEBRAICAS;https://www.youtube.com/watch?v=PCr1qbfAnL8&;80&t=0s\n" +
            ";;SUMA Y RESTA DE FRACCIONES ALGEBRAICAS 1;https://www.youtube.com/watch?v=fauRRrGhVbI&;81&t=0s\n" +
            ";;SUMA Y RESTA DE FRACCIONES ALGEBRAICAS 2;https://www.youtube.com/watch?v=LDqGWOV5WUc&;82&t=0s\n" +
            ";;MULTIPLICACION DE FRACCIONES ALGEBRAICAS 1;https://www.youtube.com/watch?v=BVcDag0Twts&;83&t=0s\n" +
            ";;MULTIPLICACION DE FRACCIONES ALGEBRAICAS 2;https://www.youtube.com/watch?v=5zGqU-c_ZN4&;84&t=0s\n" +
            ";;MULTIPLICACION DE FRACCIONES ALGEBRAICAS 3;https://www.youtube.com/watch?v=DqcM4ZmDgF4&;85&t=0s\n" +
            ";;DIVISION DE FRACCIONES ALGEBRAICAS 1;https://www.youtube.com/watch?v=RFSktv9juys&;86&t=0s\n" +
            ";;DIVISION DE FRACCIONES ALGEBRAICAS 2;https://www.youtube.com/watch?v=6_7RVL3FvCU&;87&t=0s\n" +
            ";;DIVISION DE FRACCIONES ALGEBRAICAS CON EXPRESIONES MIXTAS;https://www.youtube.com/watch?v=GeJwsPlwquM&;88&t=0s\n" +
            ";;SIMPLIFICACION DE FRACCIONES ALGEBRAICAS COMPLEJAS 1;https://www.youtube.com/watch?v=IXni8cxRXjU&;89&t=0s\n" +
            ";;SIMPLIFICACION DE FRACCIONES ALGEBRAICAS COMPLEJAS 2;https://www.youtube.com/watch?v=JBaBfHRwomM&;90&t=0s\n"
    var trigonometria=";;INTRODUCCION A LA TRIGONOMETRIA;https://www.youtube.com/watch?v=L91sk7x8mhM&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=2&t=0s\n" +
            ";;FUNCIONES TRIGONOMETRICAS;https://www.youtube.com/watch?v=rrDWXOENNTU&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=3&t=0s\n" +
            ";;SIGNO DE FUNCIONES TRIGONOMETRICAS EN EL PLANO;https://www.youtube.com/watch?v=MjkpjlLrz9E&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=4&t=0s\n" +
            ";;SIGNOS DE FUNCIONES TRIGONOMETRICAS EN UN CUADRANTE;https://www.youtube.com/watch?v=m0osKfRvnYI&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=5&t=0s\n" +
            ";;DECIMALES A GRADOS MINUTOS Y SEGUNDOS;https://www.youtube.com/watch?v=va3_XSBhYBg&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=6&t=0s\n" +
            ";;GRADOS A RADIANES;https://www.youtube.com/watch?v=mU2wjcNC-us&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=7&t=0s\n" +
            ";;RADIANES A GRADOS DECIMALES;https://www.youtube.com/watch?v=HcqRswpdfUw&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=8&t=0s\n" +
            ";;LONGITUD DE UN ARCO DE CIRCUNFERENCIA 1;https://www.youtube.com/watch?v=mAKTJ7RmjBc&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=9&t=0s\n" +
            ";;LONGITUD DE UN ARCO DE CIRCUNFERENCIA 2;https://www.youtube.com/watch?v=umHlKrPXjDE&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=10&t=0s\n" +
            ";;AREA DE UN SECTOR CIRCULAR 1;https://www.youtube.com/watch?v=dq2EwykcRzE&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=11&t=0s\n" +
            ";;AREA DE UN SECTOR CIRCULAR 2;https://www.youtube.com/watch?v=r5eA6Lh5QZE&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=12&t=0s\n" +
            ";;ÁNGULOS COTERMINALES POSITIVOS Y NEGATIVOS 1;https://www.youtube.com/watch?v=OhwODfQm1kM&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=13&t=0s\n" +
            ";;ÁNGULOS COTERMINALES POSITIVOS Y NEGATIVOS 2;https://www.youtube.com/watch?v=0J4wpBNhTQs&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=14&t=0s\n" +
            ";;RAZONES TRIGONOMETRICAS DE LOS ANGULOS CUADRANTALES;https://www.youtube.com/watch?v=DYHpplJBIgY&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=15&t=0s\n" +
            ";;OPERACIONES CON FUNCIONES TRIGONOMETRICAS;https://www.youtube.com/watch?v=s_s3GB_THrU&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=16&t=0s\n" +
            ";;CALCULAR EL PERIMETRO DE UN TRAPECIO;https://www.youtube.com/watch?v=B_uRVMS69_A&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=17&t=0s\n" +
            ";;TEOREMA DE PITAGORAS;https://www.youtube.com/watch?v=PoxJhyObkeY&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=18&t=0s\n" +
            ";;RESOLUCION DE TRIANGULOS RECTANGULOS 1;https://www.youtube.com/watch?v=XBUvCZzp_bg&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=19&t=0s\n" +
            ";;RESOLUCION DE TRIANGULOS RECTANGULOS 2;https://www.youtube.com/watch?v=DnjDNONrD7Q&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=20&t=0s\n" +
            ";;RESOLUCION DE TRIANGULOS RECTANGULOS 3;https://www.youtube.com/watch?v=kIfkljocsWM&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=21&t=0s\n" +
            ";;OBTENER LOS ÁNGULOS USANDO FUNCIONES TRIGONOMETRICAS INVERSAS;https://www.youtube.com/watch?v=HKkusPHEIvA&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=22&t=0s\n" +
            ";;FUNCIONES TRIGONOMETRICAS DE UN TRIANGULO RECTANGULO;https://www.youtube.com/watch?v=cKD3WVjHKK0&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=23&t=0s\n" +
            ";;RAZONES TRIGONOMETRICAS DE LOS ANGULOS NOTABLES;https://www.youtube.com/watch?v=4XPjBDC6R2E&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=24&t=0s\n" +
            ";;TRUCOS FUNCIONES TRIGONOMETRICAS ANGULOS NOTABLES;https://www.youtube.com/watch?v=fv1F0E6PEF0&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=25&t=0s\n" +
            ";;RAZONES TRIGONOMETRICAS RECIPROCAS Y COMPLEMENTARIAS;https://www.youtube.com/watch?v=YDUSubSSWy0&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=26&t=0s\n" +
            ";;FUNCIONES TRIGONOMETRICAS EN LA CASIO FX 991 PARTE 1;https://www.youtube.com/watch?v=LsSk4PWTYmA&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=27&t=0s\n" +
            ";;FUNCIONES TRIGONOMETRICAS EN LA CASIO FX 991 PARTE 2;https://www.youtube.com/watch?v=Gt9Ig6Flul4&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=28&t=0s\n" +
            ";;OBTENER FUNCIONES TRIGONOMETRICAS A PARTIR DE UNA;https://www.youtube.com/watch?v=bJrrSFxqUoo&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=29&t=0s\n" +
            ";;CIRCULO UNITARIO PARA FUNCIONES TRIGONOMETRICAS;https://www.youtube.com/watch?v=vuVNNJ_jBdU&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=30&t=0s\n" +
            ";;CIRCULO UNITARIO DE LA FUNCION SENO;https://www.youtube.com/watch?v=5jmNuPFahBA&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=31&t=0s\n" +
            ";;CIRCULO UNITARIO DE LA FUNCION COSENO;https://www.youtube.com/watch?v=J4aJfSxmWJE&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=32&t=0s\n" +
            ";;CIRCULO UNITARIO DE LA FUNCION TANGENTE;https://www.youtube.com/watch?v=hKmQoOtdQcA&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=33&t=0s\n" +
            ";;SENO COSENO Y TANGENTE EN ANGULOS CUADRANTALES;https://www.youtube.com/watch?v=vZl1n2vx8Po&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=34&t=0s\n" +
            ";;GRAFICAS DE LAS FUNCIONES TRIGONOMETRICAS;https://www.youtube.com/watch?v=CyWw1D4gayo&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=35&t=0s\n" +
            ";;AMPLITUD Y PERIODO EN LAS FUNCIONES TRIGONOMETRICAS;https://www.youtube.com/watch?v=wc3iKZpjPMg&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=36&t=0s\n" +
            ";;DESFASE Y TRASLADO VERTICASL DE UNA GRAFICA TRIGONOMETRICA;https://www.youtube.com/watch?v=2XWyYmjipnc&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=37&t=0s\n" +
            ";;GRAFICA DE LA FUNCION SENO 1;https://www.youtube.com/watch?v=OD7ItVU7xJU&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=38&t=0s\n" +
            ";;GRAFICA DE LA FUNCION SENO 2;https://www.youtube.com/watch?v=AgVBWBg35Rc&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=39&t=0s\n" +
            ";;GRAFICA DE LA FUNCION SENO 3;https://www.youtube.com/watch?v=Wh8-BA0X6Ro&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=40&t=0s\n" +
            ";;GRAFICA DE LA FUNCION COSENO 1;https://www.youtube.com/watch?v=two8KSo_xio&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=41&t=0s\n" +
            ";;GRAFICA DE LA FUNCION COSENO 2;https://www.youtube.com/watch?v=B7JnQ4HPsy8&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=42&t=0s\n" +
            ";;GRAFICA DE LA FUNCION COSENO 3;https://www.youtube.com/watch?v=XgpgMRkDZBo&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=43&t=0s\n" +
            ";;GRAFICA DE LA FUNCION TANGENTE;https://www.youtube.com/watch?v=xA8G5U6QhAU&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=44&t=0s\n" +
            ";;IDENTIDADES TRIGONOMETRICAS RECIPROCAS;https://www.youtube.com/watch?v=OQi3SKm642g&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=45&t=0s\n" +
            ";;IDENTIDADES TRIGONOMETRICAS 1;https://www.youtube.com/watch?v=5EiLMsjSbu0&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=46&t=0s\n" +
            ";;IDENTIDADES TRIGONOMETRICAS 2;https://www.youtube.com/watch?v=Fdr-Ab7T0zU&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=47&t=0s\n" +
            ";;IDENTIDADES TRIGONOMETRICAS 3;https://www.youtube.com/watch?v=isL8nSb5kHM&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=48&t=0s\n" +
            ";;IDENTIDADES TRIGONOMETRICAS 4;https://www.youtube.com/watch?v=3MdI_2bote8&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=49&t=0s\n" +
            ";;ECUACIONES TRIGONOMETRICAS 1;https://www.youtube.com/watch?v=2255Z0XwoGY&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=50&t=0s\n" +
            ";;ECUACIONES TRIGONOMETRICAS 2;https://www.youtube.com/watch?v=yK3fvVaPJ0g&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=51&t=0s\n" +
            ";;ECUACIONES TRIGONOMETRICAS 3;https://www.youtube.com/watch?v=i23IhZzqmO8&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=52&t=0s\n" +
            ";;ECUACIONES TRIGONOMETRICAS 4;https://www.youtube.com/watch?v=OhgJGKt7AGY&;=PLPAeMKN01yddNMrjDjM7YuWi08atvhvIa&index=53&t=0s"
    var desigualdades = ";;CONTABILIDAD;https://www.youtube.com/watch?v=sEzlnKI9hIk&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=2&t=0s\n" +
            ";;BALANCE DE SITUACION;https://www.youtube.com/watch?v=N3baJ0QxS5g&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=3&t=0s\n" +
            ";;COMPONENTES DE ACTIVO Y PASIVO;https://www.youtube.com/watch?v=1ZXNG_8nBpA&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=4&t=0s\n" +
            ";;CUENTAS DE ACTIVO;https://www.youtube.com/watch?v=7TjeYB4lPL8&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=5&t=0s\n" +
            ";;CUENTAS DE PASIVO Y PATRIMONIIO NETO;https://www.youtube.com/watch?v=GKpC5tepvkQ&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=6&t=0s\n" +
            ";;CARACTERISTICAS DE LA CONTABILIDAD;https://www.youtube.com/watch?v=eHvhUvfrmRc&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=7&t=0s\n" +
            ";;LIBROS DE CONTABILIDAD;https://www.youtube.com/watch?v=m_Xw8Ei85Xc&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=8&t=0s\n" +
            ";;CUENTAS DE BALANCE Y GESTION;https://www.youtube.com/watch?v=tFzL1GN9m_w&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=9&t=0s\n" +
            ";;COMO HACER ASIENTOS SIMPLES;https://www.youtube.com/watch?v=l1t7VI7BzxM&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=10&t=0s\n" +
            ";;COMO HACER ASIENTOS COMPUESTOS;https://www.youtube.com/watch?v=8WbzIRsFjUQ&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=11&t=0s\n" +
            ";;COMPRA Y VENTA DE MERCANCIAS;https://www.youtube.com/watch?v=wA8_UCa3Yps&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=12&t=0s\n" +
            ";;EL CICLO CONTABLE DE CUENTAS ANUALES;https://www.youtube.com/watch?v=kMEco6xL88A&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=13&t=0s\n" +
            ";;ESTRUCTURA DE UNA CUENTA DE PERDIDAS Y GANANCIAS;https://www.youtube.com/watch?v=01CIaotr08I&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=14&t=0s\n" +
            ";;DIFERENCIAS ENTRE TASAS CONTRIBUCIONES E IMPUESTOS;https://www.youtube.com/watch?v=Uah0F82ZOXk&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=15&t=0s\n" +
            ";;FONDO DE MANIOBRA;https://www.youtube.com/watch?v=V9Ysx39TO9g&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=16&t=0s\n" +
            ";;DIFERENTES SITUACIONES PATRIMONIALES;https://www.youtube.com/watch?v=nXKh2IqOD9Y&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=17&t=0s\n" +
            ";;PERIODO MEDIO DE MADURACION DE UNA EMPRESA PRODUCTIVA;https://www.youtube.com/watch?v=WkRqSuxuEC4&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=18&t=0s\n" +
            ";;PERIODO MEDIO DE MADURACION DE UNA EMPRESA COMERCIAL;https://www.youtube.com/watch?v=WODYYidFxwc&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=19&t=0s\n" +
            ";;COMO SUPERAR LA SUSPENSION DE PAGOS DE UNA EMPRESA;https://www.youtube.com/watch?v=FxLK94A4PFU&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=20&t=0s\n" +
            ";;FONDO DE MANIOBRA Y EL PERIODO MEDIO DE MADURACION;https://www.youtube.com/watch?v=AWzBHDN6GXw&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=21&t=0s\n" +
            ";;DIRECCION ESTRATEGICA DE LA EMPRESA;https://www.youtube.com/watch?v=XGhMbQkANX8&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=22&t=0s\n" +
            ";;TIPOS DE ESTRATEGIA EMPRESARIAL;https://www.youtube.com/watch?v=1lgSO34qFYU&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=23&t=0s\n" +
            ";;FACTORES DE LOCALIZACION DE LA EMPRESA;https://www.youtube.com/watch?v=pAbrn8t53ZQ&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=24&t=0s\n" +
            ";;COMO HACER UN BALANCE DE SITUACION;https://www.youtube.com/watch?v=jWJvCgEo6QY&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=25&t=0s\n" +
            ";;ANALISIS DE RATIOS FINANCIERAS;https://www.youtube.com/watch?v=tldiA2bYvFI&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=26&t=0s\n" +
            ";;CUENTA DE PERDIDAD Y GANANCIAS;https://www.youtube.com/watch?v=yfgZKkIGLDM&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=27&t=0s\n" +
            ";;ANALISIS DE RENDIBILIDAD DE LA EMPRESA;https://www.youtube.com/watch?v=NoxjGSW0Q_k&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=28&t=0s\n" +
            ";;TIPOS DE INVERSIONES;https://www.youtube.com/watch?v=rJnLZBw3Gag&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=29&t=0s\n" +
            ";;METODOS ESTATICOS DE SELECCIÓN DE INVERSIONES;https://www.youtube.com/watch?v=vLHO7asQ_6U&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=30&t=0s\n" +
            ";;METODOS DINAMICOS DE SELECCIÓN DE INVERSIONES;https://www.youtube.com/watch?v=6846yGFDdfM&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=31&t=0s\n" +
            ";;FUENTES DE FINANCIACION PROPIA;https://www.youtube.com/watch?v=qtQbAxBTcSU&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=32&t=0s\n" +
            ";;FINANCIACION AJENA A CORTO PLAZO;https://www.youtube.com/watch?v=rmUHAW4Ry1s&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=33&t=0s\n" +
            ";;FINANCIACION AJENA A LARGO PLAZO;https://www.youtube.com/watch?v=GHyT4Yy9cxU&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=34&t=0s\n" +
            ";;ESTRATEGIAS DE CRECIMIENTO INTERNO;https://www.youtube.com/watch?v=bnJA8cvA5CM&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=35&t=0s\n" +
            ";;ESTRATEGIAS DE CRECIMIENTO EXTERNO;https://www.youtube.com/watch?v=AtGEV_3RCtA&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=36&t=0s\n" +
            ";;MERCADO DE VALORES Y LA BOLSA;https://www.youtube.com/watch?v=13QXeXfDHhA&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=37&t=0s\n" +
            ";;INTERNACIONALIZACION DE LA ECONOMIA;https://www.youtube.com/watch?v=I4rUv31KNZQ&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=38&t=0s\n" +
            ";;PYMES;https://www.youtube.com/watch?v=mEC-_kHQpCg&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=39&t=0s\n" +
            ";;EMPRESAS MULTINACIONALES;https://www.youtube.com/watch?v=BJye1BSJOb4&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=40&t=0s\n" +
            ";;DESLOCALIZACION DE UNA EMPRESA;https://www.youtube.com/watch?v=WGYNA2nEDBM&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=41&t=0s\n" +
            ";;NUEVAS TECNOLOGIAS TIC Y LAS EMPRESAS;https://www.youtube.com/watch?v=Kq7QEvlfauE&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=42&t=0s\n" +
            ";;FACTORES DE PRODUCCION DE UNA EMPRESA;https://www.youtube.com/watch?v=DowZR8S0hTw&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=43&t=0s\n" +
            ";;INICIATIVA EMPRESARIAL;https://www.youtube.com/watch?v=8c8GnbVVQrI&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=44&t=0s\n" +
            ";;AUTOOCUPACION;https://www.youtube.com/watch?v=0fRUbNeb_6I&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=45&t=0s\n" +
            ";;CALCULAR EL UMBRAL DE RENTABILIDAD;https://www.youtube.com/watch?v=fhxqBTodAbA&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=46&t=0s\n" +
            ";;PLAN DE EMPRESA;https://www.youtube.com/watch?v=s0a8HhKDjDA&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=47&t=0s\n" +
            ";;COSTE DE OPORTUNIDAD;https://www.youtube.com/watch?v=ko76HktigYM&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=48&t=0s\n" +
            ";;PRODUCCION DISTRIBUCION Y CONSUMO;https://www.youtube.com/watch?v=I5SCNZsgw_I&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=49&t=0s\n" +
            ";;EL MERCADO DE CAPITALES Y EL DINERO;https://www.youtube.com/watch?v=PT9ORHFIXIM&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=50&t=0s\n" +
            ";;LEY DE OFERTA Y DEMANDA;https://www.youtube.com/watch?v=N2kZVB5yk6M&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=51&t=0s\n" +
            ";;EQUILIBRIO DE MERCADO;https://www.youtube.com/watch?v=h1FCQ2iGHi8&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=52&t=0s\n" +
            ";;ELASTICIDAD DE LA DEMANDA;https://www.youtube.com/watch?v=nGFRnO4OQOA&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=53&t=0s\n" +
            ";;TIPOS DE MERCADO Y COMPETENCIA ECONOMICA;https://www.youtube.com/watch?v=45cbEhf2NSI&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=54&t=0s\n" +
            ";;LAS BARRERAS DE UN MERCADO;https://www.youtube.com/watch?v=Yj5FPz52qz8&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=55&t=0s\n" +
            ";;EL MERCADO DE COMPETENCIA PERFECTA;https://www.youtube.com/watch?v=cA_rVPsYcGc&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=56&t=0s\n" +
            ";;LA COMPETENCIA MONOPO;https://www.youtube.com/watch?v=6uce6-QlYBI&;=PLlJ-LmCi75Kb67tEHDfwhVTOVfuX7aUiU&index=57&t=0s" +
            ";"


    var link = desigualdades.split(";")
    //3 7 11
    var tamanio = link.size

    for (i in 0..tamanio-4 step 4){
        println(";"+"economia"+";"+"economia basica"+";"+link[i+2]+";"+link[i+3]+";")
    }
    /*val anyMutableList = mutableListOf<String>()
    for (i in 0..tamanio-1){

        anyMutableList.add(link[i])
    }

    //anyMutableList.add("tutorials");
    //anyMutableList.add(0,"hola")
    println(anyMutableList)*/
// [bezkoder.com, tutorials]
*/




}