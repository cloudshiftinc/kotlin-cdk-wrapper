package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IGrantable

public open class PublicGalleryAuthorizationToken internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ecr.PublicGalleryAuthorizationToken,
) : CdkObject(cdkObject) {
  public companion object {
    public fun grantRead(grantee: IGrantable) {
      software.amazon.awscdk.services.ecr.PublicGalleryAuthorizationToken.grantRead(grantee.let(IGrantable::unwrap))
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecr.PublicGalleryAuthorizationToken):
        PublicGalleryAuthorizationToken = PublicGalleryAuthorizationToken(cdkObject)

    internal fun unwrap(wrapped: PublicGalleryAuthorizationToken):
        software.amazon.awscdk.services.ecr.PublicGalleryAuthorizationToken = wrapped.cdkObject
  }
}
