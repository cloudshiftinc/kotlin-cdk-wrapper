package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Resource
import kotlin.Any
import kotlin.Boolean
import kotlin.String

public abstract class Authorizer internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.Authorizer,
) : Resource(cdkObject), IAuthorizer {
  public override fun authorizationType(): AuthorizationType? =
      unwrap(this).getAuthorizationType()?.let(AuthorizationType::wrap)

  public override fun authorizerId(): String = unwrap(this).getAuthorizerId()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.Authorizer,
  ) : Authorizer(cdkObject)

  public companion object {
    public open fun isAuthorizer(x: Any): Boolean =
        software.amazon.awscdk.services.apigateway.Authorizer.isAuthorizer(x)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.Authorizer): Authorizer
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: Authorizer): software.amazon.awscdk.services.apigateway.Authorizer
        = (wrapped as Wrapper).cdkObject
  }
}
