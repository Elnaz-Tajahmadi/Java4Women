
import java.util.ArrayList;

public class ForOnlineTest {

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        int n = io.getInt();
        int m = io.getInt();
        
        int[] os = new int[n];
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

        // read balances
        for(int i = 0; i < n; ++i)
        {
            os[i] = io.getInt();
            
            ArrayList<Integer> cluster = new ArrayList<Integer>();
            cluster.add(i);
            
            graph.add(cluster);
        }

        // read friendships
        for(int i = 0; i < m; ++i)
        {
            int p1 = io.getInt();
            int p2 = io.getInt();
            
            int p1c = -1;
            int p2c = -1;
            
            // find first person
            for (int j = 0; j < graph.size(); ++j)
                if(graph.get(j).contains(p1))
                {
                    p1c = j;
                    break;
                }
            
            // find find second person
            for (int j = 0; j < graph.size(); ++j)
                if(graph.get(j).contains(p2))
                {
                    p2c = j;
                    break;
                }
            
            // join clusters
            if(p1c != p2c)
            {
                graph.get(p1c).addAll(graph.get(p2c));
                graph.remove(p2c);
            }
        }
        
        // check possibility
        boolean result = true;
        for(ArrayList<Integer> cluster : graph)
        {
            int sum = 0;
            
            for(int person : cluster)
                sum += os[person];
            
            if(sum != 0)
            {
                result = false;
                break;
            }
        }
        
        if(result)
            io.format("POSSIBLE");
        else
            io.format("IMPOSSIBLE");
        
        io.close();
    }
    
}

