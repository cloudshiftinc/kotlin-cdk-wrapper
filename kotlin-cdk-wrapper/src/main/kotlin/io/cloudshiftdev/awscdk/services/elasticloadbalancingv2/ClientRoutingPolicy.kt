@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

public enum class ClientRoutingPolicy(
  private val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ClientRoutingPolicy,
) {
  AVAILABILITY_ZONE_AFFINITY(software.amazon.awscdk.services.elasticloadbalancingv2.ClientRoutingPolicy.AVAILABILITY_ZONE_AFFINITY),
  PARTIAL_AVAILABILITY_ZONE_AFFINITY(software.amazon.awscdk.services.elasticloadbalancingv2.ClientRoutingPolicy.PARTIAL_AVAILABILITY_ZONE_AFFINITY),
  ANY_AVAILABILITY_ZONE(software.amazon.awscdk.services.elasticloadbalancingv2.ClientRoutingPolicy.ANY_AVAILABILITY_ZONE),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ClientRoutingPolicy):
        ClientRoutingPolicy = when (cdkObject) {
      software.amazon.awscdk.services.elasticloadbalancingv2.ClientRoutingPolicy.AVAILABILITY_ZONE_AFFINITY ->
          ClientRoutingPolicy.AVAILABILITY_ZONE_AFFINITY
      software.amazon.awscdk.services.elasticloadbalancingv2.ClientRoutingPolicy.PARTIAL_AVAILABILITY_ZONE_AFFINITY ->
          ClientRoutingPolicy.PARTIAL_AVAILABILITY_ZONE_AFFINITY
      software.amazon.awscdk.services.elasticloadbalancingv2.ClientRoutingPolicy.ANY_AVAILABILITY_ZONE ->
          ClientRoutingPolicy.ANY_AVAILABILITY_ZONE
    }

    internal fun unwrap(wrapped: ClientRoutingPolicy):
        software.amazon.awscdk.services.elasticloadbalancingv2.ClientRoutingPolicy =
        wrapped.cdkObject
  }
}
