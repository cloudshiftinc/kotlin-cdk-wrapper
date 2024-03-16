@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.Deprecated
import kotlin.String

/**
 * Interface for CloudFront OriginAccessIdentity.
 */
public interface IOriginAccessIdentity : IResource, IGrantable {
  /**
   * The Origin Access Identity Id (physical id) This was called originAccessIdentityName before.
   */
  public fun originAccessIdentityId(): String

  /**
   * (deprecated) The Origin Access Identity Id (physical id) It is misnamed and superseded by the
   * correctly named originAccessIdentityId.
   *
   * @deprecated use originAccessIdentityId instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun originAccessIdentityName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.IOriginAccessIdentity):
        IOriginAccessIdentity = CdkObjectWrappers.wrap(cdkObject) as IOriginAccessIdentity

    internal fun unwrap(wrapped: IOriginAccessIdentity):
        software.amazon.awscdk.services.cloudfront.IOriginAccessIdentity = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.IOriginAccessIdentity
  }
}
