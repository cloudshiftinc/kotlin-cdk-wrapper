package io.cloudshiftdev.awscdk.services.apigateway

import kotlin.String

public interface IAuthorizer {
  public fun authorizationType(): AuthorizationType? =
      unwrap(this).getAuthorizationType()?.let(AuthorizationType::wrap)

  public fun authorizerId(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.IAuthorizer,
  ) : IAuthorizer {
    public override fun authorizationType(): AuthorizationType? =
        unwrap(this).getAuthorizationType()?.let(AuthorizationType::wrap)

    public override fun authorizerId(): String = unwrap(this).getAuthorizerId()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IAuthorizer):
        IAuthorizer = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAuthorizer):
        software.amazon.awscdk.services.apigateway.IAuthorizer = (wrapped as Wrapper).cdkObject
  }
}
