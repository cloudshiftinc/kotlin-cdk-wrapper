@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloud_assembly_schema

public enum class LoadBalancerListenerProtocol(
  private val cdkObject: software.amazon.awscdk.cloud_assembly_schema.LoadBalancerListenerProtocol,
) {
  HTTP(software.amazon.awscdk.cloud_assembly_schema.LoadBalancerListenerProtocol.HTTP),
  HTTPS(software.amazon.awscdk.cloud_assembly_schema.LoadBalancerListenerProtocol.HTTPS),
  TCP(software.amazon.awscdk.cloud_assembly_schema.LoadBalancerListenerProtocol.TCP),
  TLS(software.amazon.awscdk.cloud_assembly_schema.LoadBalancerListenerProtocol.TLS),
  UDP(software.amazon.awscdk.cloud_assembly_schema.LoadBalancerListenerProtocol.UDP),
  TCP_UDP(software.amazon.awscdk.cloud_assembly_schema.LoadBalancerListenerProtocol.TCP_UDP),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloud_assembly_schema.LoadBalancerListenerProtocol):
        LoadBalancerListenerProtocol = when (cdkObject) {
      software.amazon.awscdk.cloud_assembly_schema.LoadBalancerListenerProtocol.HTTP ->
          LoadBalancerListenerProtocol.HTTP
      software.amazon.awscdk.cloud_assembly_schema.LoadBalancerListenerProtocol.HTTPS ->
          LoadBalancerListenerProtocol.HTTPS
      software.amazon.awscdk.cloud_assembly_schema.LoadBalancerListenerProtocol.TCP ->
          LoadBalancerListenerProtocol.TCP
      software.amazon.awscdk.cloud_assembly_schema.LoadBalancerListenerProtocol.TLS ->
          LoadBalancerListenerProtocol.TLS
      software.amazon.awscdk.cloud_assembly_schema.LoadBalancerListenerProtocol.UDP ->
          LoadBalancerListenerProtocol.UDP
      software.amazon.awscdk.cloud_assembly_schema.LoadBalancerListenerProtocol.TCP_UDP ->
          LoadBalancerListenerProtocol.TCP_UDP
    }

    internal fun unwrap(wrapped: LoadBalancerListenerProtocol):
        software.amazon.awscdk.cloud_assembly_schema.LoadBalancerListenerProtocol =
        wrapped.cdkObject
  }
}
