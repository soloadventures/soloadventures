
class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch()
    {
        startTime=System.currentTimeMillis();
    }
    
        public long getEndTime() {
            return endTime;
        }
        public long getStartTime()
        {
            return startTime;
        }
        public void start()
        {
            startTime=System.currentTimeMillis();
        }
        public void stop()
        {
            endTime=System.currentTimeMillis();
        }
        
        public long getElapsedTime()
        {
            return endTime-startTime;
        }
    
    
    }
public class StopWatchSort {
    public static void main(String[] args) {
        int size = 100000;
        double[] list = new double[size];
		for(int i=0;i<list.length;i++)
		{
			list[i]= ((Math.random()*size+1)+0);
		}

        StopWatch stopWatch = new StopWatch();
        selectionSort(list);
        stopWatch.stop();

        System.out.println("The sort time is " + stopWatch.getElapsedTime());
    }

    /** The method for sorting the numbers */
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary;
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}