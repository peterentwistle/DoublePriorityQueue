Double Priority Queue
==========

A quick implementation of a generic double priority queue, made for the /r/dailyprogrammer subreddit: http://www.reddit.com/r/dailyprogrammer/comments/2vkwgb/20150211_challenge_201_practical_exercise_get/

## Example usage:

```java
DoublePriorityQueue<String> q = new DoublePriorityQueue<String>();

q.enqueue("Bread", 1.99, 3);
q.enqueue("Orange Juice", 2.49, 2);
q.enqueue("Chocolate Bar", 0.89, 7);
q.enqueue("Orange Juice", 2.49, 2);

System.out.println("Count: " + q.count());
System.out.println("Dequeued: " + q.dequeueA());
System.out.println("Count: " + q.count());
System.out.println("Dequeued: " + q.dequeueB());
System.out.println("Dequeued: " + q.dequeueFirst());
q.clear();
System.out.println("Count: " + q.count());
```

## Output:

```
Count: 4
Dequeued: Orange Juice
Count: 3
Dequeued: Chocolate Bar
Dequeued: Bread
Count: 0
```
