@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IGrantable

/**
 * Authorization token to access private ECR repositories in the current environment via Docker CLI.
 *
 * Example:
 *
 * ```
 * User user = new User(this, "User");
 * AuthorizationToken.grantRead(user);
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AmazonECR/latest/userguide/registry_auth.html)
 */
public open class AuthorizationToken(
  cdkObject: software.amazon.awscdk.services.ecr.AuthorizationToken,
) : CdkObject(cdkObject) {
  public companion object {
    public fun grantRead(grantee: IGrantable) {
      software.amazon.awscdk.services.ecr.AuthorizationToken.grantRead(grantee.let(IGrantable.Companion::unwrap))
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.AuthorizationToken):
        AuthorizationToken = AuthorizationToken(cdkObject)

    internal fun unwrap(wrapped: AuthorizationToken):
        software.amazon.awscdk.services.ecr.AuthorizationToken = wrapped.cdkObject as
        software.amazon.awscdk.services.ecr.AuthorizationToken
  }
}
