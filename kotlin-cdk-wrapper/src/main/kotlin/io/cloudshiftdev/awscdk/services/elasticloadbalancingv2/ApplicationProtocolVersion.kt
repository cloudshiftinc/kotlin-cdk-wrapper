@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

public enum class ApplicationProtocolVersion(
  private val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion,
) {
  GRPC(software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion.GRPC),
  HTTP1(software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion.HTTP1),
  HTTP2(software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion.HTTP2),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion):
        ApplicationProtocolVersion = when (cdkObject) {
      software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion.GRPC ->
          ApplicationProtocolVersion.GRPC
      software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion.HTTP1 ->
          ApplicationProtocolVersion.HTTP1
      software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion.HTTP2 ->
          ApplicationProtocolVersion.HTTP2
    }

    internal fun unwrap(wrapped: ApplicationProtocolVersion):
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion =
        wrapped.cdkObject
  }
}
