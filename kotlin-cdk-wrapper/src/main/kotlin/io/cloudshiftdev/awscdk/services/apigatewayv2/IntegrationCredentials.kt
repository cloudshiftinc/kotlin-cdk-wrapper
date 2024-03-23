@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String

/**
 * Credentials used for AWS Service integrations.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * Role role;
 * IntegrationCredentials integrationCredentials = IntegrationCredentials.fromRole(role);
 * ```
 */
public abstract class IntegrationCredentials(
  cdkObject: software.amazon.awscdk.services.apigatewayv2.IntegrationCredentials,
) : CdkObject(cdkObject) {
  /**
   * The ARN of the credentials.
   */
  public open fun credentialsArn(): String = unwrap(this).getCredentialsArn()

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigatewayv2.IntegrationCredentials,
  ) : IntegrationCredentials(cdkObject)

  public companion object {
    public fun fromRole(role: IRole): IntegrationCredentials =
        software.amazon.awscdk.services.apigatewayv2.IntegrationCredentials.fromRole(role.let(IRole::unwrap)).let(IntegrationCredentials::wrap)

    public fun useCallerIdentity(): IntegrationCredentials =
        software.amazon.awscdk.services.apigatewayv2.IntegrationCredentials.useCallerIdentity().let(IntegrationCredentials::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IntegrationCredentials):
        IntegrationCredentials = CdkObjectWrappers.wrap(cdkObject) as? IntegrationCredentials ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IntegrationCredentials):
        software.amazon.awscdk.services.apigatewayv2.IntegrationCredentials = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.IntegrationCredentials
  }
}
