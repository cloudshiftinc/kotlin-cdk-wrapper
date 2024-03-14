package io.cloudshiftdev.awscdk.services.ec2

public enum class DefaultInstanceTenancy(
  private val cdkObject: software.amazon.awscdk.services.ec2.DefaultInstanceTenancy,
) {
  DEFAULT(software.amazon.awscdk.services.ec2.DefaultInstanceTenancy.DEFAULT),
  DEDICATED(software.amazon.awscdk.services.ec2.DefaultInstanceTenancy.DEDICATED),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.DefaultInstanceTenancy):
        DefaultInstanceTenancy = when (cdkObject) {
      software.amazon.awscdk.services.ec2.DefaultInstanceTenancy.DEFAULT ->
          DefaultInstanceTenancy.DEFAULT
      software.amazon.awscdk.services.ec2.DefaultInstanceTenancy.DEDICATED ->
          DefaultInstanceTenancy.DEDICATED
    }

    internal fun unwrap(wrapped: DefaultInstanceTenancy):
        software.amazon.awscdk.services.ec2.DefaultInstanceTenancy = wrapped.cdkObject
  }
}
