@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.String

/**
 * Interface for CloudFront distributions.
 */
public interface IDistribution : IResource {
  /**
   * The domain name of the Distribution, such as d111111abcdef8.cloudfront.net.
   */
  public fun distributionDomainName(): String

  /**
   * The distribution ID for this distribution.
   */
  public fun distributionId(): String

  /**
   * Adds an IAM policy statement associated with this distribution to an IAM principal's policy.
   *
   * @param identity The principal. 
   * @param actions The set of actions to allow (i.e. "cloudfront:ListInvalidations"). 
   */
  public fun grant(identity: IGrantable, actions: String): Grant

  /**
   * Grant to create invalidations for this bucket to an IAM principal (Role/Group/User).
   *
   * @param identity The principal. 
   */
  public fun grantCreateInvalidation(identity: IGrantable): Grant

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.IDistribution):
        IDistribution = CdkObjectWrappers.wrap(cdkObject) as IDistribution

    internal fun unwrap(wrapped: IDistribution):
        software.amazon.awscdk.services.cloudfront.IDistribution = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cloudfront.IDistribution
  }
}
