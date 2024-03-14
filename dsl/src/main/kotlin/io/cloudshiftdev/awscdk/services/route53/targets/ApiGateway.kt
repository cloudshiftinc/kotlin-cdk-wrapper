package io.cloudshiftdev.awscdk.services.route53.targets

public open class ApiGateway internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.route53.targets.ApiGateway,
) : ApiGatewayDomain(cdkObject) {
  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.targets.ApiGateway):
        ApiGateway = ApiGateway(cdkObject)

    internal fun unwrap(wrapped: ApiGateway):
        software.amazon.awscdk.services.route53.targets.ApiGateway = wrapped.cdkObject
  }
}
