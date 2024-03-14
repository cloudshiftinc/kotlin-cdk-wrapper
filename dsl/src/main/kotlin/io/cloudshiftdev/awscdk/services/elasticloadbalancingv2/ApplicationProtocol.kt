package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

public enum class ApplicationProtocol(
  private val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol,
) {
  HTTP(software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol.HTTP),
  HTTPS(software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol.HTTPS),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol):
        ApplicationProtocol = when (cdkObject) {
      software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol.HTTP ->
          ApplicationProtocol.HTTP
      software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol.HTTPS ->
          ApplicationProtocol.HTTPS
    }

    internal fun unwrap(wrapped: ApplicationProtocol):
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol =
        wrapped.cdkObject
  }
}
