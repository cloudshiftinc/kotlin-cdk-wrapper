@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

public enum class XffHeaderProcessingMode(
  private val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.XffHeaderProcessingMode,
) {
  APPEND(software.amazon.awscdk.services.elasticloadbalancingv2.XffHeaderProcessingMode.APPEND),
  PRESERVE(software.amazon.awscdk.services.elasticloadbalancingv2.XffHeaderProcessingMode.PRESERVE),
  REMOVE(software.amazon.awscdk.services.elasticloadbalancingv2.XffHeaderProcessingMode.REMOVE),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.XffHeaderProcessingMode):
        XffHeaderProcessingMode = when (cdkObject) {
      software.amazon.awscdk.services.elasticloadbalancingv2.XffHeaderProcessingMode.APPEND ->
          XffHeaderProcessingMode.APPEND
      software.amazon.awscdk.services.elasticloadbalancingv2.XffHeaderProcessingMode.PRESERVE ->
          XffHeaderProcessingMode.PRESERVE
      software.amazon.awscdk.services.elasticloadbalancingv2.XffHeaderProcessingMode.REMOVE ->
          XffHeaderProcessingMode.REMOVE
    }

    internal fun unwrap(wrapped: XffHeaderProcessingMode):
        software.amazon.awscdk.services.elasticloadbalancingv2.XffHeaderProcessingMode =
        wrapped.cdkObject
  }
}
