package io.cloudshiftdev.awscdk.services.ec2

public enum class FlowLogTrafficType(
  private val cdkObject: software.amazon.awscdk.services.ec2.FlowLogTrafficType,
) {
  ACCEPT(software.amazon.awscdk.services.ec2.FlowLogTrafficType.ACCEPT),
  ALL(software.amazon.awscdk.services.ec2.FlowLogTrafficType.ALL),
  REJECT(software.amazon.awscdk.services.ec2.FlowLogTrafficType.REJECT),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.FlowLogTrafficType):
        FlowLogTrafficType = when (cdkObject) {
      software.amazon.awscdk.services.ec2.FlowLogTrafficType.ACCEPT -> FlowLogTrafficType.ACCEPT
      software.amazon.awscdk.services.ec2.FlowLogTrafficType.ALL -> FlowLogTrafficType.ALL
      software.amazon.awscdk.services.ec2.FlowLogTrafficType.REJECT -> FlowLogTrafficType.REJECT
    }

    internal fun unwrap(wrapped: FlowLogTrafficType):
        software.amazon.awscdk.services.ec2.FlowLogTrafficType = wrapped.cdkObject
  }
}
