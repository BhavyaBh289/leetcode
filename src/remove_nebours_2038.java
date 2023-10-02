import java.util.ArrayList;

public class remove_nebours_2038 {
    private boolean winnerOfGame(String colors) {
        ArrayList<Boolean> a=new ArrayList<>(colors.length());
        for(int i=0;i<colors.length();i++){
            if (colors.charAt(i)=='A'){
                a.add(Boolean.TRUE);
            }else {
                a.add(Boolean.FALSE);
            }
        }
        int alice = play(a,true);
        int bob=play(a,false);
        return alice>bob;
    }

    public int play(ArrayList<Boolean> a, boolean b) {
        int k=0;
        for (int i=1;i<a.size()-1;i++){
            if(a.get(i-1)==a.get(i)&a.get(i)==a.get(i+1)&a.get(i)==b){
                a.remove(i);
                i--;
                k+=1;
            }
        }
        return k;
    }

    public static void main(String[]args){
        String s = new String("BBBAAAABB");
        remove_nebours_2038 a = new remove_nebours_2038();
        System.out.println(a.winnerOfGame(s));
    }
}
