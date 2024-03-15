@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

public enum class FailoverStatusCode(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.FailoverStatusCode,
) {
  FORBIDDEN(software.amazon.awscdk.services.cloudfront.FailoverStatusCode.FORBIDDEN),
  NOT_FOUND(software.amazon.awscdk.services.cloudfront.FailoverStatusCode.NOT_FOUND),
  INTERNAL_SERVER_ERROR(software.amazon.awscdk.services.cloudfront.FailoverStatusCode.INTERNAL_SERVER_ERROR),
  BAD_GATEWAY(software.amazon.awscdk.services.cloudfront.FailoverStatusCode.BAD_GATEWAY),
  SERVICE_UNAVAILABLE(software.amazon.awscdk.services.cloudfront.FailoverStatusCode.SERVICE_UNAVAILABLE),
  GATEWAY_TIMEOUT(software.amazon.awscdk.services.cloudfront.FailoverStatusCode.GATEWAY_TIMEOUT),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.FailoverStatusCode):
        FailoverStatusCode = when (cdkObject) {
      software.amazon.awscdk.services.cloudfront.FailoverStatusCode.FORBIDDEN ->
          FailoverStatusCode.FORBIDDEN
      software.amazon.awscdk.services.cloudfront.FailoverStatusCode.NOT_FOUND ->
          FailoverStatusCode.NOT_FOUND
      software.amazon.awscdk.services.cloudfront.FailoverStatusCode.INTERNAL_SERVER_ERROR ->
          FailoverStatusCode.INTERNAL_SERVER_ERROR
      software.amazon.awscdk.services.cloudfront.FailoverStatusCode.BAD_GATEWAY ->
          FailoverStatusCode.BAD_GATEWAY
      software.amazon.awscdk.services.cloudfront.FailoverStatusCode.SERVICE_UNAVAILABLE ->
          FailoverStatusCode.SERVICE_UNAVAILABLE
      software.amazon.awscdk.services.cloudfront.FailoverStatusCode.GATEWAY_TIMEOUT ->
          FailoverStatusCode.GATEWAY_TIMEOUT
    }

    internal fun unwrap(wrapped: FailoverStatusCode):
        software.amazon.awscdk.services.cloudfront.FailoverStatusCode = wrapped.cdkObject
  }
}
