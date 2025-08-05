@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Node
import kotlin.String

/**
 * Represents a VPC origin.
 */
public interface IVpcOrigin : IResource {
  /**
   * The domain name of the CloudFront VPC origin endpoint configuration.
   */
  public fun domainName(): String? = unwrap(this).getDomainName()

  /**
   * The VPC origin ARN.
   */
  public fun vpcOriginArn(): String

  /**
   * The VPC origin ID.
   */
  public fun vpcOriginId(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.IVpcOrigin,
  ) : CdkObject(cdkObject),
      IVpcOrigin {
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
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * The domain name of the CloudFront VPC origin endpoint configuration.
     */
    override fun domainName(): String? = unwrap(this).getDomainName()

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

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    /**
     * The VPC origin ARN.
     */
    override fun vpcOriginArn(): String = unwrap(this).getVpcOriginArn()

    /**
     * The VPC origin ID.
     */
    override fun vpcOriginId(): String = unwrap(this).getVpcOriginId()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.IVpcOrigin): IVpcOrigin
        = CdkObjectWrappers.wrap(cdkObject) as? IVpcOrigin ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IVpcOrigin): software.amazon.awscdk.services.cloudfront.IVpcOrigin
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.IVpcOrigin
  }
}
