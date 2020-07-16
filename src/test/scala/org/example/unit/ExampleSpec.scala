package org.example.unit
import org.example.HelloWorld
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class ExampleSpec extends AnyFlatSpec with Matchers {

  behavior of "example project"

  it should "compute text message" in {
    assert(HelloWorld.computeMessage() == "hello: ")
  }

  behavior of "number"

  it should "compute result number" in {
    assert(HelloWorld.computeNumber()== 1234)
  }
}
