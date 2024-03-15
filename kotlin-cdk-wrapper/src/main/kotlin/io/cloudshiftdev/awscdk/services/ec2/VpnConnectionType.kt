@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

public enum class VpnConnectionType(
  private val cdkObject: software.amazon.awscdk.services.ec2.VpnConnectionType,
) {
  IPSEC_1(software.amazon.awscdk.services.ec2.VpnConnectionType.IPSEC_1),
  DUMMY(software.amazon.awscdk.services.ec2.VpnConnectionType.DUMMY),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VpnConnectionType):
        VpnConnectionType = when (cdkObject) {
      software.amazon.awscdk.services.ec2.VpnConnectionType.IPSEC_1 -> VpnConnectionType.IPSEC_1
      software.amazon.awscdk.services.ec2.VpnConnectionType.DUMMY -> VpnConnectionType.DUMMY
    }

    internal fun unwrap(wrapped: VpnConnectionType):
        software.amazon.awscdk.services.ec2.VpnConnectionType = wrapped.cdkObject
  }
}
