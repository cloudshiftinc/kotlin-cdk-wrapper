@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IGrantable

/**
 * Authorization token to access the global public ECR Gallery via Docker CLI.
 *
 * Example:
 *
 * ```
 * User user = new User(this, "User");
 * PublicGalleryAuthorizationToken.grantRead(user);
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AmazonECR/latest/public/public-registries.html#public-registry-auth)
 */
public open class PublicGalleryAuthorizationToken(
  cdkObject: software.amazon.awscdk.services.ecr.PublicGalleryAuthorizationToken,
) : CdkObject(cdkObject) {
  public companion object {
    public fun grantRead(grantee: IGrantable) {
      software.amazon.awscdk.services.ecr.PublicGalleryAuthorizationToken.grantRead(grantee.let(IGrantable::unwrap))
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecr.PublicGalleryAuthorizationToken):
        PublicGalleryAuthorizationToken = PublicGalleryAuthorizationToken(cdkObject)

    internal fun unwrap(wrapped: PublicGalleryAuthorizationToken):
        software.amazon.awscdk.services.ecr.PublicGalleryAuthorizationToken = wrapped.cdkObject as
        software.amazon.awscdk.services.ecr.PublicGalleryAuthorizationToken
  }
}
