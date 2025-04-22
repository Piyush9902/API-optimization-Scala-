
package com.example.containerapi.scala

case class ContainerMove(id: String, from: Int, to: Int)

object Engine {
  def optimize(moves: List[ContainerMove]): List[ContainerMove] = {
    moves.sortBy(move => math.abs(move.to - move.from))
  }

  def totalDistance(moves: List[ContainerMove]): Int = {
    moves.map(move => math.abs(move.to - move.from)).sum
  }
}
