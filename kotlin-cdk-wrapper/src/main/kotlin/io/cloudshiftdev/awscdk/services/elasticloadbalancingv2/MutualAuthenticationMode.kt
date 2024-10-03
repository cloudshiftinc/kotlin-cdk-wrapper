@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

public enum class MutualAuthenticationMode(
  private val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.MutualAuthenticationMode,
) {
  OFF(software.amazon.awscdk.services.elasticloadbalancingv2.MutualAuthenticationMode.OFF),
  PASS_THROUGH(software.amazon.awscdk.services.elasticloadbalancingv2.MutualAuthenticationMode.PASS_THROUGH),
  VERIFY(software.amazon.awscdk.services.elasticloadbalancingv2.MutualAuthenticationMode.VERIFY),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.MutualAuthenticationMode):
        MutualAuthenticationMode = when (cdkObject) {
      software.amazon.awscdk.services.elasticloadbalancingv2.MutualAuthenticationMode.OFF ->
          MutualAuthenticationMode.OFF
      software.amazon.awscdk.services.elasticloadbalancingv2.MutualAuthenticationMode.PASS_THROUGH ->
          MutualAuthenticationMode.PASS_THROUGH
      software.amazon.awscdk.services.elasticloadbalancingv2.MutualAuthenticationMode.VERIFY ->
          MutualAuthenticationMode.VERIFY
    }

    internal fun unwrap(wrapped: MutualAuthenticationMode):
        software.amazon.awscdk.services.elasticloadbalancingv2.MutualAuthenticationMode =
        wrapped.cdkObject
  }
}
