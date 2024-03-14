package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String

public abstract class IntegrationCredentials internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.IntegrationCredentials,
) {
  /**
   * The ARN of the credentials.
   */
  public open fun credentialsArn(): String = unwrap(this).getCredentialsArn()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.IntegrationCredentials,
  ) : IntegrationCredentials(cdkObject)

  public companion object {
    public fun fromRole(role: IRole): IntegrationCredentials =
        software.amazon.awscdk.services.apigatewayv2.IntegrationCredentials.fromRole(role.let(IRole::unwrap)).let(IntegrationCredentials::wrap)

    public fun useCallerIdentity(): IntegrationCredentials =
        software.amazon.awscdk.services.apigatewayv2.IntegrationCredentials.useCallerIdentity().let(IntegrationCredentials::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IntegrationCredentials):
        IntegrationCredentials = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IntegrationCredentials):
        software.amazon.awscdk.services.apigatewayv2.IntegrationCredentials = (wrapped as
        Wrapper).cdkObject
  }
}
