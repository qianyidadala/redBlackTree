package com.test.entity;

public class TreeEntity<T> {

	private TreeEntity<T> parent;
	
	private TreeEntity<T> left;
	
	private TreeEntity<T> right;
	
	private Boolean color;
	
	private T value;

	public TreeEntity<T> getParent() {
		return parent;
	}

	public void setParent(TreeEntity<T> parent) {
		this.parent = parent;
	}

	public TreeEntity<T> getLeft() {
		return left;
	}

	public void setLeft(TreeEntity<T> left) {
		this.left = left;
	}

	public TreeEntity<T> getRight() {
		return right;
	}

	public void setRight(TreeEntity<T> right) {
		this.right = right;
	}

	public Boolean getColor() {
		return color;
	}

	public void setColor(Boolean color) {
		this.color = color;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "TreeEntity [parent=" + parent + ", left=" + left + ", right=" + right + ", color=" + color + ", value="
				+ value + "]";
	}
	
}
