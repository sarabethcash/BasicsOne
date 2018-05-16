package io.github.sarabethcash;

class One {
    public void msg() {
        System.out.println("Hello\nsarabethcash\n");
    }
}

class Two{
    public void sum(){
        int total = 74 + 36;

        System.out.println(total + "\n");
    }
}

class Three{
    public void dividend(){
        int total = 50 / 3;

        System.out.println(total + "\n");
    }
}

class Four {
    public void operations() {
        System.out.print(-5 + 8 * 6 + " ");
        System.out.print((55 + 9) % 9 + " ");
        System.out.print(20 + -3 * 5 / 8 + " ");
        System.out.print(5 + 15 / 3 * 2 - 8 % 3 + "\n");
    }
}

class Five{
    public void product(int x, int y){
        System.out.println(x * y + "\n");
    }
}

class Six{
    public void operations(int a, int b){
        System.out.print(a + b + " ");
        System.out.print(a - b + " ");
        System.out.print(a * b + " ");
        System.out.print(a / b + " ");
        System.out.print(a % b + "\n");
    }
}

class Seven {
    public void timesTable(int c){
        for(int i = 1; i < 11; i++) {
            int j = i * c;
            System.out.print(j + " ");
        }
        System.out.println(" ");
    }
}

class Eight{
    public void msg(){
        System.out.println("");
        System.out.println("   J    a    v     v   a");
        System.out.println("   J   a a    v   v   a a");
        System.out.println("J  J  aaaaa    v v   aaaaa");
        System.out.println(" JJ  a     a    v   a     a\n");
    }
}

class Nine{
    public void compute(){
        double compute = ((25.5 * 3.5 - 3.5 * 3.5)/(40.5 - 4.5));

        System.out.println(compute + "\n");
    }
}

class Ten{
    public void compute(){
        double compute = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));

        System.out.println(compute + "\n");
    }
}