package io.cloudshiftdev.awscdk.services.apigatewayv2

public enum class PassthroughBehavior(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.PassthroughBehavior,
) {
  WHEN_NO_MATCH(software.amazon.awscdk.services.apigatewayv2.PassthroughBehavior.WHEN_NO_MATCH),
  NEVER(software.amazon.awscdk.services.apigatewayv2.PassthroughBehavior.NEVER),
  WHEN_NO_TEMPLATES(software.amazon.awscdk.services.apigatewayv2.PassthroughBehavior.WHEN_NO_TEMPLATES),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.PassthroughBehavior):
        PassthroughBehavior = when (cdkObject) {
      software.amazon.awscdk.services.apigatewayv2.PassthroughBehavior.WHEN_NO_MATCH ->
          PassthroughBehavior.WHEN_NO_MATCH
      software.amazon.awscdk.services.apigatewayv2.PassthroughBehavior.NEVER ->
          PassthroughBehavior.NEVER
      software.amazon.awscdk.services.apigatewayv2.PassthroughBehavior.WHEN_NO_TEMPLATES ->
          PassthroughBehavior.WHEN_NO_TEMPLATES
    }

    internal fun unwrap(wrapped: PassthroughBehavior):
        software.amazon.awscdk.services.apigatewayv2.PassthroughBehavior = wrapped.cdkObject
  }
}
