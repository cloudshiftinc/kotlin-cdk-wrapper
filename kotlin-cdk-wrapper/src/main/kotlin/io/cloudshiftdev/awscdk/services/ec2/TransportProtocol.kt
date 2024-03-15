@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

public enum class TransportProtocol(
  private val cdkObject: software.amazon.awscdk.services.ec2.TransportProtocol,
) {
  TCP(software.amazon.awscdk.services.ec2.TransportProtocol.TCP),
  UDP(software.amazon.awscdk.services.ec2.TransportProtocol.UDP),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.TransportProtocol):
        TransportProtocol = when (cdkObject) {
      software.amazon.awscdk.services.ec2.TransportProtocol.TCP -> TransportProtocol.TCP
      software.amazon.awscdk.services.ec2.TransportProtocol.UDP -> TransportProtocol.UDP
    }

    internal fun unwrap(wrapped: TransportProtocol):
        software.amazon.awscdk.services.ec2.TransportProtocol = wrapped.cdkObject
  }
}
