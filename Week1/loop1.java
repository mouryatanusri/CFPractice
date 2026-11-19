package Week1;
//To print Multiples of 5 from 0 to 100 
//My Approach
/*class loop1 {
    public static void main(String[] args) {
        for(int i = 0; i<=100; i++) {
            if(i%5==0) {
            System.out.println(i);
            }
        }
    }
} */
//Nandy's Approach
/*class loop1 {
    public static void main(String[] args) {
        for(int i = 0; i<=100; i=i+5) {
            System.out.println(i);
         }
    }
} */
//Using for loop
    /* class loop1 {
        public static void main(String[] args) {
            for(int i = 10; i >= 0; i--) {
                System.out.println(i);
            }
        }
    } */

//Using while loop
      /*  class loop1 {
            public static void main(String[] args) {
                int i = 10;
                while(i >=0 ) {
                    System.out.println(i);
                    i--;
                }
            }
        } */

//Using do while loop

            class loop1 {
                public static void main(String[] args) {
                    int i = 10;
                    do {
                        System.out.println(i);
                        i--;
                    } while(i>=0);
                }
            }


