package io.cloudshiftdev.awscdk.services.ec2

public enum class VpnPort(
  private val cdkObject: software.amazon.awscdk.services.ec2.VpnPort,
) {
  HTTPS(software.amazon.awscdk.services.ec2.VpnPort.HTTPS),
  OPENVPN(software.amazon.awscdk.services.ec2.VpnPort.OPENVPN),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VpnPort): VpnPort = when
        (cdkObject) {
      software.amazon.awscdk.services.ec2.VpnPort.HTTPS -> VpnPort.HTTPS
      software.amazon.awscdk.services.ec2.VpnPort.OPENVPN -> VpnPort.OPENVPN
    }

    internal fun unwrap(wrapped: VpnPort): software.amazon.awscdk.services.ec2.VpnPort =
        wrapped.cdkObject
  }
}
