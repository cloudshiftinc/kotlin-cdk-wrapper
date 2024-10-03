@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

public enum class HttpCodeElb(
  private val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeElb,
) {
  ELB_3XX_COUNT(software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeElb.ELB_3XX_COUNT),
  ELB_4XX_COUNT(software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeElb.ELB_4XX_COUNT),
  ELB_5XX_COUNT(software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeElb.ELB_5XX_COUNT),
  ELB_500_COUNT(software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeElb.ELB_500_COUNT),
  ELB_502_COUNT(software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeElb.ELB_502_COUNT),
  ELB_503_COUNT(software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeElb.ELB_503_COUNT),
  ELB_504_COUNT(software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeElb.ELB_504_COUNT),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeElb):
        HttpCodeElb = when (cdkObject) {
      software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeElb.ELB_3XX_COUNT ->
          HttpCodeElb.ELB_3XX_COUNT
      software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeElb.ELB_4XX_COUNT ->
          HttpCodeElb.ELB_4XX_COUNT
      software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeElb.ELB_5XX_COUNT ->
          HttpCodeElb.ELB_5XX_COUNT
      software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeElb.ELB_500_COUNT ->
          HttpCodeElb.ELB_500_COUNT
      software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeElb.ELB_502_COUNT ->
          HttpCodeElb.ELB_502_COUNT
      software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeElb.ELB_503_COUNT ->
          HttpCodeElb.ELB_503_COUNT
      software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeElb.ELB_504_COUNT ->
          HttpCodeElb.ELB_504_COUNT
    }

    internal fun unwrap(wrapped: HttpCodeElb):
        software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeElb = wrapped.cdkObject
  }
}
