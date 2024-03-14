package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

public enum class HttpCodeTarget(
  private val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeTarget,
) {
  TARGET_2XX_COUNT(software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeTarget.TARGET_2XX_COUNT),
  TARGET_3XX_COUNT(software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeTarget.TARGET_3XX_COUNT),
  TARGET_4XX_COUNT(software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeTarget.TARGET_4XX_COUNT),
  TARGET_5XX_COUNT(software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeTarget.TARGET_5XX_COUNT),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeTarget):
        HttpCodeTarget = when (cdkObject) {
      software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeTarget.TARGET_2XX_COUNT ->
          HttpCodeTarget.TARGET_2XX_COUNT
      software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeTarget.TARGET_3XX_COUNT ->
          HttpCodeTarget.TARGET_3XX_COUNT
      software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeTarget.TARGET_4XX_COUNT ->
          HttpCodeTarget.TARGET_4XX_COUNT
      software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeTarget.TARGET_5XX_COUNT ->
          HttpCodeTarget.TARGET_5XX_COUNT
    }

    internal fun unwrap(wrapped: HttpCodeTarget):
        software.amazon.awscdk.services.elasticloadbalancingv2.HttpCodeTarget = wrapped.cdkObject
  }
}
