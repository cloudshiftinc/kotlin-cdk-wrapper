@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

public enum class AlpnPolicy(
  private val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.AlpnPolicy,
) {
  HTTP1_ONLY(software.amazon.awscdk.services.elasticloadbalancingv2.AlpnPolicy.HTTP1_ONLY),
  HTTP2_ONLY(software.amazon.awscdk.services.elasticloadbalancingv2.AlpnPolicy.HTTP2_ONLY),
  HTTP2_OPTIONAL(software.amazon.awscdk.services.elasticloadbalancingv2.AlpnPolicy.HTTP2_OPTIONAL),
  HTTP2_PREFERRED(software.amazon.awscdk.services.elasticloadbalancingv2.AlpnPolicy.HTTP2_PREFERRED),
  NONE(software.amazon.awscdk.services.elasticloadbalancingv2.AlpnPolicy.NONE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.AlpnPolicy):
        AlpnPolicy = when (cdkObject) {
      software.amazon.awscdk.services.elasticloadbalancingv2.AlpnPolicy.HTTP1_ONLY ->
          AlpnPolicy.HTTP1_ONLY
      software.amazon.awscdk.services.elasticloadbalancingv2.AlpnPolicy.HTTP2_ONLY ->
          AlpnPolicy.HTTP2_ONLY
      software.amazon.awscdk.services.elasticloadbalancingv2.AlpnPolicy.HTTP2_OPTIONAL ->
          AlpnPolicy.HTTP2_OPTIONAL
      software.amazon.awscdk.services.elasticloadbalancingv2.AlpnPolicy.HTTP2_PREFERRED ->
          AlpnPolicy.HTTP2_PREFERRED
      software.amazon.awscdk.services.elasticloadbalancingv2.AlpnPolicy.NONE -> AlpnPolicy.NONE
    }

    internal fun unwrap(wrapped: AlpnPolicy):
        software.amazon.awscdk.services.elasticloadbalancingv2.AlpnPolicy = wrapped.cdkObject
  }
}
