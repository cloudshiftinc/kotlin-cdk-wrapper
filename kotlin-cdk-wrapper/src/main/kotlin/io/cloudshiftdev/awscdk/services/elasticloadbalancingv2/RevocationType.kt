@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

public enum class RevocationType(
  private val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.RevocationType,
) {
  CRL(software.amazon.awscdk.services.elasticloadbalancingv2.RevocationType.CRL),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.RevocationType):
        RevocationType = when (cdkObject) {
      software.amazon.awscdk.services.elasticloadbalancingv2.RevocationType.CRL ->
          RevocationType.CRL
    }

    internal fun unwrap(wrapped: RevocationType):
        software.amazon.awscdk.services.elasticloadbalancingv2.RevocationType = wrapped.cdkObject
  }
}
