public class Programm{
    public static void main(String[] args){
        final int ARGS_SIZE=3;
        if(args.length!=ARGS_SIZE){
            System.out.println("Охрана отмена! Ввели "+args.length+" аргументов. А нужно "+ARGS_SIZE+"!!!");
        }
        else{
            int firstVar=Integer.parseInt(args[0]);
            int secondVar=Integer.parseInt(args[1]);
            System.out.println(args[2]);
            switch(args[2]){
                case "conjunction":
                    System.out.println(firstVar + " & " + secondVar+"=" + (firstVar&secondVar));
                    break;
                case "disjunction":
                    System.out.println(args[2] + " " + firstVar + " | " + secondVar+"=" + (firstVar|secondVar));
                    break;
                default:
                    System.out.println("Programm can not do "+args[2]+" operation");
                    break;
            }
        }
    }
}
