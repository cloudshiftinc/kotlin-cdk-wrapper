package io.cloudshiftdev.awscdk.services.ecs

public enum class Protocol(
  private val cdkObject: software.amazon.awscdk.services.ecs.Protocol,
) {
  TCP(software.amazon.awscdk.services.ecs.Protocol.TCP),
  UDP(software.amazon.awscdk.services.ecs.Protocol.UDP),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.Protocol): Protocol = when
        (cdkObject) {
      software.amazon.awscdk.services.ecs.Protocol.TCP -> Protocol.TCP
      software.amazon.awscdk.services.ecs.Protocol.UDP -> Protocol.UDP
    }

    internal fun unwrap(wrapped: Protocol): software.amazon.awscdk.services.ecs.Protocol =
        wrapped.cdkObject
  }
}
