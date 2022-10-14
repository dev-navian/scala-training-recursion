package io.turntabl
package abstractDataTypes

import org.scalatest.funsuite.AnyFunSuite

class BinaryTreeTest extends AnyFunSuite {
  val leaf: BinaryTree[Int] = Leaf(5);

  val treeOne: Branch[Int] = Branch(
    Branch(Branch(Leaf(8), Leaf(10)), Leaf(11)),
    Branch(Branch(Leaf(18), Leaf(20)), Leaf(22))
  )

  test("left child of a leaf should throw a NoSuchElementException") {
    assertThrows[NoSuchElementException] {
      leaf.left
    }
  }

  test("value of a branch should throw a NoSuchElementException") {
    assertThrows[NoSuchElementException] {
      treeOne.value
    }
  }

  test("the size of a leaf should return 1") {
    assert(leaf.size == 1)
    assert(leaf.size != 0)
  }

  test("should return the appropriate size of a branch") {
    assert(treeOne.size == 6)
  }

}
