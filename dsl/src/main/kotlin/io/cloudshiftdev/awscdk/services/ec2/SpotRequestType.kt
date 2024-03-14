package io.cloudshiftdev.awscdk.services.ec2

public enum class SpotRequestType(
  private val cdkObject: software.amazon.awscdk.services.ec2.SpotRequestType,
) {
  ONE_TIME(software.amazon.awscdk.services.ec2.SpotRequestType.ONE_TIME),
  PERSISTENT(software.amazon.awscdk.services.ec2.SpotRequestType.PERSISTENT),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.SpotRequestType):
        SpotRequestType = when (cdkObject) {
      software.amazon.awscdk.services.ec2.SpotRequestType.ONE_TIME -> SpotRequestType.ONE_TIME
      software.amazon.awscdk.services.ec2.SpotRequestType.PERSISTENT -> SpotRequestType.PERSISTENT
    }

    internal fun unwrap(wrapped: SpotRequestType):
        software.amazon.awscdk.services.ec2.SpotRequestType = wrapped.cdkObject
  }
}
