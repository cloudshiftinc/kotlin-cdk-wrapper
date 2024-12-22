@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

public enum class InsufficientDataHealthStatusEnum(
  private val cdkObject: software.amazon.awscdk.services.route53.InsufficientDataHealthStatusEnum,
) {
  HEALTHY(software.amazon.awscdk.services.route53.InsufficientDataHealthStatusEnum.HEALTHY),
  UNHEALTHY(software.amazon.awscdk.services.route53.InsufficientDataHealthStatusEnum.UNHEALTHY),
  LAST_KNOWN_STATUS(software.amazon.awscdk.services.route53.InsufficientDataHealthStatusEnum.LAST_KNOWN_STATUS),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53.InsufficientDataHealthStatusEnum):
        InsufficientDataHealthStatusEnum = when (cdkObject) {
      software.amazon.awscdk.services.route53.InsufficientDataHealthStatusEnum.HEALTHY ->
          InsufficientDataHealthStatusEnum.HEALTHY
      software.amazon.awscdk.services.route53.InsufficientDataHealthStatusEnum.UNHEALTHY ->
          InsufficientDataHealthStatusEnum.UNHEALTHY
      software.amazon.awscdk.services.route53.InsufficientDataHealthStatusEnum.LAST_KNOWN_STATUS ->
          InsufficientDataHealthStatusEnum.LAST_KNOWN_STATUS
    }

    internal fun unwrap(wrapped: InsufficientDataHealthStatusEnum):
        software.amazon.awscdk.services.route53.InsufficientDataHealthStatusEnum = wrapped.cdkObject
  }
}
