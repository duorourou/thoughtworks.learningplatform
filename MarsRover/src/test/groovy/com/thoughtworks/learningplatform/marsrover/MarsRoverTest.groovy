package com.thoughtworks.learningplatform.marsrover


import spock.lang.Specification

class MarsRoverTest extends Specification {

  def "mars rover will start detection from a given position" () {
    given:
      def position = new DetectionZone.Position(7, 8)
    when:
      new MarsRover(position)
    then:
      true
  }
}
