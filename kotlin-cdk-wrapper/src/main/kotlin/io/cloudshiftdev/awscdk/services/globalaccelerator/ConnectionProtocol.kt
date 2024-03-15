@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

public enum class ConnectionProtocol(
  private val cdkObject: software.amazon.awscdk.services.globalaccelerator.ConnectionProtocol,
) {
  TCP(software.amazon.awscdk.services.globalaccelerator.ConnectionProtocol.TCP),
  UDP(software.amazon.awscdk.services.globalaccelerator.ConnectionProtocol.UDP),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.ConnectionProtocol):
        ConnectionProtocol = when (cdkObject) {
      software.amazon.awscdk.services.globalaccelerator.ConnectionProtocol.TCP ->
          ConnectionProtocol.TCP
      software.amazon.awscdk.services.globalaccelerator.ConnectionProtocol.UDP ->
          ConnectionProtocol.UDP
    }

    internal fun unwrap(wrapped: ConnectionProtocol):
        software.amazon.awscdk.services.globalaccelerator.ConnectionProtocol = wrapped.cdkObject
  }
}
