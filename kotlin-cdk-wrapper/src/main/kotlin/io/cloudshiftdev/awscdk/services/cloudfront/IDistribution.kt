@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Node
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
  public fun grant(identity: IGrantable, vararg actions: String): Grant

  /**
   * Grant to create invalidations for this bucket to an IAM principal (Role/Group/User).
   *
   * @param identity The principal. 
   */
  public fun grantCreateInvalidation(identity: IGrantable): Grant

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.IDistribution,
  ) : CdkObject(cdkObject), IDistribution {
    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
    }

    /**
     * The domain name of the Distribution, such as d111111abcdef8.cloudfront.net.
     */
    override fun distributionDomainName(): String = unwrap(this).getDistributionDomainName()

    /**
     * The distribution ID for this distribution.
     */
    override fun distributionId(): String = unwrap(this).getDistributionId()

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    /**
     * Adds an IAM policy statement associated with this distribution to an IAM principal's policy.
     *
     * @param identity The principal. 
     * @param actions The set of actions to allow (i.e. "cloudfront:ListInvalidations"). 
     */
    override fun grant(identity: IGrantable, vararg actions: String): Grant =
        unwrap(this).grant(identity.let(IGrantable::unwrap), *actions).let(Grant::wrap)

    /**
     * Grant to create invalidations for this bucket to an IAM principal (Role/Group/User).
     *
     * @param identity The principal. 
     */
    override fun grantCreateInvalidation(identity: IGrantable): Grant =
        unwrap(this).grantCreateInvalidation(identity.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.IDistribution):
        IDistribution = CdkObjectWrappers.wrap(cdkObject) as? IDistribution ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IDistribution):
        software.amazon.awscdk.services.cloudfront.IDistribution = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cloudfront.IDistribution
  }
}
