package com.thoughtworks.learningplatform.marsrover


import spock.lang.Specification

class DetectionZoneTest extends Specification {

  def "there is a detection zone"() {
    when:
      def detectionZone = new DetectionZone(10, 10)
    then:
      detectionZone.contains(new DetectionZone.Position(9, 3))
  }
}