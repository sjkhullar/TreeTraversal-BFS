package org.learn.Question;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {

	public static void levelOrder(Node root) {
		if (root == null) {
			System.out.println("Queue is empty");
			return;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			Node node = queue.poll();
			System.out.printf("%d ", node.data);
			if (node.left != null) {
				queue.offer(node.left);
			}
			if (node.right != null) {
				queue.offer(node.right);
			}
		}
	}
}
