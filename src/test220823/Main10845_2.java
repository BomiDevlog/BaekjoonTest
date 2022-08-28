package test220823;
//[백준/자바] 10845번 큐


/*
정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 여섯 가지이다.

push X: 정수 X를 큐에 넣는 연산이다. 		//push는 출력안함 
pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 큐에 들어있는 정수의 개수를 출력한다.
empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.

 */

/*
 * *LinkedList : 인접 참조를 링크해서 체인처럼 관리하는 컬렉션
 * 			   데이터를 저장한 후 수시로 데이터를 삽입하거나 삭제, 수정해야 할 경우 적합
 * ArrayList : 순차적으로 데이터를 저장할 때 적합함. 검색할 때 상대적으로 빠름.
 * */

import java.util.LinkedList;    
import java.util.Queue;

import java.io.*;
import java.util.*;

public class Main10845_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());	// 출력 횟수
		
		Queue<Integer> q = new LinkedList<Integer>();//자료구조 큐 생성
		
		
		int lastNum=-1;// 정수가 없으면 -1이니 디폴트값으로 설정 설정.
		
		for(int i =0;i<n;i++) {
			String str = br.readLine();
			String[] arr=str.split(" "); //split() : 특정 문자열을 기준으로 문자열을 잘라서 배열에 넣어주는 함수 //arr0에서 arr1에 값x가 들어감
			
			
			switch(arr[0]) {	
			case "push": 								//push X: 정수 X를 큐에 넣는 연산
				q.add(Integer.parseInt(arr[1]));
				lastNum=Integer.parseInt(arr[1]);
				break;
				
			case "size": 								//size: 큐에 들어있는 정수의 개수를 출력
				//bw.write(q.size()+"\n");
				System.out.println(q.size());
				break;
				
			
			case "empty": 								//empty: 큐가 비어있으면 1, 아니면 0을 출력
				if(q.isEmpty()) //bw.write(1+"\n");
					System.out.println(1);
				else //bw.write(0+"\n");
					System.out.println(0);
				break;
				
			case "front": 								//front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력
				if(q.isEmpty()) //bw.write(-1+"\n");
					System.out.println(-1);
				else //bw.write(q.peek()+"\n");
					System.out.println(q.peek());		//peek() : 스택의 맨위의 원소를 반환 = 가장 나중에 들어간 자료 반환
				break;
				
			case "pop": 								//pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력
				if(q.isEmpty())// bw.write(-1+"\n");
					System.out.println(-1);
				else //bw.write(q.poll()+"\n");
					System.out.println(q.poll());
				break;
				
			case "back": 								//back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력
				if(q.isEmpty()) //bw.write(-1+"\n");
					System.out.println(-1);
				else //bw.write(lastNum+"\n");
					System.out.println(lastNum);
				break;
			}
			
			}
			br.close();
			
		}
}

	
/*
	 * Queue란?

Queue의 사전적 의미는 무엇을 기다리는 사람,차량 등의 줄 혹을 줄을 서서 기다리는 것을 의미

이처럼 줄을 지어 순서대로 처리되는 것이 큐라는 자료구조 . 
큐는 데이터를 일시적으로 쌓아두기 위한 자료구조로 스택과는 다르게 FIFO(First In First Out)의 형태를 가진다. 
FIFO 형태는 뜻 그대로 먼저 들어온 데이터가 가장 먼저 나가는 구조를 말함 

Enqueue: 큐 맨 뒤에 데이터 추가
Dequeue: 큐 맨 앞쪽의 데이터 삭제 

​

Queue의 특징 

먼저 들어간 자료가 먼저 나오는 구조 FIFO(First In First Out)구조

큐는 한 쪽 끝은 프론트(front)로 정하여 삭제 연산만 수행함

다른 한 쪽 끝은 리어(rear)로 정하여 삽입 연산만 수행함

그래프의 넓이 우선 탐색(BFS)에서 사용

컴퓨터 버퍼에서 주로 사용, 마구 입력이 되었으나 처리를 하지 못할 때, 버퍼(큐)를 만들어 대기 시킴

*Queue선언

import java.util.LinkedList;
import java.util.Queue;
public class QueueTest {
	Queue<Integer> queue = new LinkedList<>(); //int형 queue선언 LinkedList 이용
	Queue<String> queue1 = new LinkedList<>(); //String형 queue선언 LinkedList 이용
}
자바에서 큐는 LinkedList를 활용하여 생성해야 한다. 

그렇기에 Queue와 LinkedList가 다 import되어 있어야 사용이 가능하다 Queue<Element> queue = new LinkedList<>()와 같이 선언해주면 된다.

*Queue 값 추가 

Queue<Integer> queue = new LinkedList<>(); //int형 queue선언 LinkedList 이용
queue.add(1);
queue.add(2);
자바에서 queue값을 추가하고 싶다면 add(value) 또는 offer(value)라는 메서드를 활용하면 된다.

add(value) 메서드의 경우 만약 삽입에 성공하면 true를 반환하고, 큐에 여유 공간이 없어 삽입에 실패하면 IllegalStateException을 발생시킨다.  offer는 삽입에 실패하면 false를 리턴 

​

*Queue값 삭제 

Queue<Integer> queue = new LinkedList<>(); //int형 queue선언 LinkedList 이용
queue.offer(1);
queue.offer(2);
queue.offer(3);
queue.poll();
queue.remove();
queue.clear();
queue에서 값을 제거하고 싶다면 poll()이나 remove라는 메서드를 사용하면 된다. 

pol()함수는 큐가 비어있으면 null을 반환, remove를 하면 가장 앞쪽에 있는 원소의 값이 제거된다. remove는 큐가 비어있으면 fasle를 반환 queue의 모든 요소를 제거하려면 clear() 메서드를 사용

​

*Queue에서 가장 먼저 들어간 값 출력 

Queue<Integer> queue = new LinkedList<>(); //int형 queue선언 LinkedList 이용
queue.offer(1);
queue.offer(2);
queue.offer(3);
System.out.println(queue.peek());
Queue에서 첫번째로 저장된 값을 참조하고 싶다면 peek()라는 메서드를 사용하면 된다.


	 * */



