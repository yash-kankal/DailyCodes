class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
       
        int[] inDegree = new int[numCourses];

        List<List<Integer>> graph = new ArrayList<>();

        for(int i = 0 ; i < numCourses ; i++)
        {
            graph.add(new ArrayList<>());
        }

        for(int i = 0 ; i < prerequisites.length; i++)
        {
            int to = prerequisites[i][0];
            int from = prerequisites[i][1];

            graph.get(from).add(to);

            inDegree[to]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < numCourses ; i++)
        {
            if(inDegree[i] == 0)
            {
                queue.add(i);
            }
        }

        int[] order = new int[numCourses];

        int index = 0;

        while(!queue.isEmpty())
        {
            int current = queue.poll();

            order[index] = current;

            index++;

            List<Integer> neighbors = graph.get(current);

            for(int i = 0 ; i < neighbors.size(); i++)
            {
                int neighbor = neighbors.get(i);

                inDegree[neighbor]--;

                if(inDegree[neighbor] == 0)
                {
                    queue.offer(neighbor);
                }
            }

        }

        
        if(index == numCourses)
        {
            return order;
        }
        
        return new int[0];
       
    }
}