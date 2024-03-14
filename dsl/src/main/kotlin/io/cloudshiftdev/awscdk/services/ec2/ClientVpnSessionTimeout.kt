package io.cloudshiftdev.awscdk.services.ec2

public enum class ClientVpnSessionTimeout(
  private val cdkObject: software.amazon.awscdk.services.ec2.ClientVpnSessionTimeout,
) {
  EIGHT_HOURS(software.amazon.awscdk.services.ec2.ClientVpnSessionTimeout.EIGHT_HOURS),
  TEN_HOURS(software.amazon.awscdk.services.ec2.ClientVpnSessionTimeout.TEN_HOURS),
  TWELVE_HOURS(software.amazon.awscdk.services.ec2.ClientVpnSessionTimeout.TWELVE_HOURS),
  TWENTY_FOUR_HOURS(software.amazon.awscdk.services.ec2.ClientVpnSessionTimeout.TWENTY_FOUR_HOURS),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ClientVpnSessionTimeout):
        ClientVpnSessionTimeout = when (cdkObject) {
      software.amazon.awscdk.services.ec2.ClientVpnSessionTimeout.EIGHT_HOURS ->
          ClientVpnSessionTimeout.EIGHT_HOURS
      software.amazon.awscdk.services.ec2.ClientVpnSessionTimeout.TEN_HOURS ->
          ClientVpnSessionTimeout.TEN_HOURS
      software.amazon.awscdk.services.ec2.ClientVpnSessionTimeout.TWELVE_HOURS ->
          ClientVpnSessionTimeout.TWELVE_HOURS
      software.amazon.awscdk.services.ec2.ClientVpnSessionTimeout.TWENTY_FOUR_HOURS ->
          ClientVpnSessionTimeout.TWENTY_FOUR_HOURS
    }

    internal fun unwrap(wrapped: ClientVpnSessionTimeout):
        software.amazon.awscdk.services.ec2.ClientVpnSessionTimeout = wrapped.cdkObject
  }
}
