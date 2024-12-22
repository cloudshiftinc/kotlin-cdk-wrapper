@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

public enum class HealthCheckType(
  private val cdkObject: software.amazon.awscdk.services.route53.HealthCheckType,
) {
  HTTP(software.amazon.awscdk.services.route53.HealthCheckType.HTTP),
  HTTPS(software.amazon.awscdk.services.route53.HealthCheckType.HTTPS),
  HTTP_STR_MATCH(software.amazon.awscdk.services.route53.HealthCheckType.HTTP_STR_MATCH),
  HTTPS_STR_MATCH(software.amazon.awscdk.services.route53.HealthCheckType.HTTPS_STR_MATCH),
  TCP(software.amazon.awscdk.services.route53.HealthCheckType.TCP),
  CLOUDWATCH_METRIC(software.amazon.awscdk.services.route53.HealthCheckType.CLOUDWATCH_METRIC),
  CALCULATED(software.amazon.awscdk.services.route53.HealthCheckType.CALCULATED),
  RECOVERY_CONTROL(software.amazon.awscdk.services.route53.HealthCheckType.RECOVERY_CONTROL),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.HealthCheckType):
        HealthCheckType = when (cdkObject) {
      software.amazon.awscdk.services.route53.HealthCheckType.HTTP -> HealthCheckType.HTTP
      software.amazon.awscdk.services.route53.HealthCheckType.HTTPS -> HealthCheckType.HTTPS
      software.amazon.awscdk.services.route53.HealthCheckType.HTTP_STR_MATCH ->
          HealthCheckType.HTTP_STR_MATCH
      software.amazon.awscdk.services.route53.HealthCheckType.HTTPS_STR_MATCH ->
          HealthCheckType.HTTPS_STR_MATCH
      software.amazon.awscdk.services.route53.HealthCheckType.TCP -> HealthCheckType.TCP
      software.amazon.awscdk.services.route53.HealthCheckType.CLOUDWATCH_METRIC ->
          HealthCheckType.CLOUDWATCH_METRIC
      software.amazon.awscdk.services.route53.HealthCheckType.CALCULATED ->
          HealthCheckType.CALCULATED
      software.amazon.awscdk.services.route53.HealthCheckType.RECOVERY_CONTROL ->
          HealthCheckType.RECOVERY_CONTROL
    }

    internal fun unwrap(wrapped: HealthCheckType):
        software.amazon.awscdk.services.route53.HealthCheckType = wrapped.cdkObject
  }
}
