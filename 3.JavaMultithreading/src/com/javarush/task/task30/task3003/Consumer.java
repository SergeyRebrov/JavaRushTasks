package com.javarush.task.task30.task3003;

import java.util.concurrent.TransferQueue;

/**
 * Created by Sergey on 14.02.2017.
 */
public class Consumer implements Runnable
{
    private TransferQueue<ShareItem> queue;

    public Consumer(TransferQueue<ShareItem> queue)
    {
        this.queue = queue;
    }

    @Override
    public void run()
    {
        try
        {
            Thread.sleep(450);
            while (true)
            {
                System.out.format("Processing " + queue.take().toString());
                System.out.println();
            }
        }
        catch (InterruptedException ignore)
        {
        }

    }
}
