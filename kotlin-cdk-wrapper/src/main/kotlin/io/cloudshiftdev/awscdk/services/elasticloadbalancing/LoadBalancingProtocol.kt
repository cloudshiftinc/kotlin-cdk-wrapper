@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancing

public enum class LoadBalancingProtocol(
  private val cdkObject: software.amazon.awscdk.services.elasticloadbalancing.LoadBalancingProtocol,
) {
  TCP(software.amazon.awscdk.services.elasticloadbalancing.LoadBalancingProtocol.TCP),
  SSL(software.amazon.awscdk.services.elasticloadbalancing.LoadBalancingProtocol.SSL),
  HTTP(software.amazon.awscdk.services.elasticloadbalancing.LoadBalancingProtocol.HTTP),
  HTTPS(software.amazon.awscdk.services.elasticloadbalancing.LoadBalancingProtocol.HTTPS),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancing.LoadBalancingProtocol):
        LoadBalancingProtocol = when (cdkObject) {
      software.amazon.awscdk.services.elasticloadbalancing.LoadBalancingProtocol.TCP ->
          LoadBalancingProtocol.TCP
      software.amazon.awscdk.services.elasticloadbalancing.LoadBalancingProtocol.SSL ->
          LoadBalancingProtocol.SSL
      software.amazon.awscdk.services.elasticloadbalancing.LoadBalancingProtocol.HTTP ->
          LoadBalancingProtocol.HTTP
      software.amazon.awscdk.services.elasticloadbalancing.LoadBalancingProtocol.HTTPS ->
          LoadBalancingProtocol.HTTPS
    }

    internal fun unwrap(wrapped: LoadBalancingProtocol):
        software.amazon.awscdk.services.elasticloadbalancing.LoadBalancingProtocol =
        wrapped.cdkObject
  }
}
