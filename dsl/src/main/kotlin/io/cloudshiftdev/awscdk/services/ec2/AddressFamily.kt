package io.cloudshiftdev.awscdk.services.ec2

public enum class AddressFamily(
  private val cdkObject: software.amazon.awscdk.services.ec2.AddressFamily,
) {
  IP_V4(software.amazon.awscdk.services.ec2.AddressFamily.IP_V4),
  IP_V6(software.amazon.awscdk.services.ec2.AddressFamily.IP_V6),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AddressFamily): AddressFamily =
        when (cdkObject) {
      software.amazon.awscdk.services.ec2.AddressFamily.IP_V4 -> AddressFamily.IP_V4
      software.amazon.awscdk.services.ec2.AddressFamily.IP_V6 -> AddressFamily.IP_V6
    }

    internal fun unwrap(wrapped: AddressFamily): software.amazon.awscdk.services.ec2.AddressFamily =
        wrapped.cdkObject
  }
}
