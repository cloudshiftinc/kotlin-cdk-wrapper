package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

public enum class UnauthenticatedAction(
  private val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.UnauthenticatedAction,
) {
  DENY(software.amazon.awscdk.services.elasticloadbalancingv2.UnauthenticatedAction.DENY),
  ALLOW(software.amazon.awscdk.services.elasticloadbalancingv2.UnauthenticatedAction.ALLOW),
  AUTHENTICATE(software.amazon.awscdk.services.elasticloadbalancingv2.UnauthenticatedAction.AUTHENTICATE),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.UnauthenticatedAction):
        UnauthenticatedAction = when (cdkObject) {
      software.amazon.awscdk.services.elasticloadbalancingv2.UnauthenticatedAction.DENY ->
          UnauthenticatedAction.DENY
      software.amazon.awscdk.services.elasticloadbalancingv2.UnauthenticatedAction.ALLOW ->
          UnauthenticatedAction.ALLOW
      software.amazon.awscdk.services.elasticloadbalancingv2.UnauthenticatedAction.AUTHENTICATE ->
          UnauthenticatedAction.AUTHENTICATE
    }

    internal fun unwrap(wrapped: UnauthenticatedAction):
        software.amazon.awscdk.services.elasticloadbalancingv2.UnauthenticatedAction =
        wrapped.cdkObject
  }
}
