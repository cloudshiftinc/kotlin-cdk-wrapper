@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.constructs.Node
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.IOriginAccessIdentity,
  ) : CdkObject(cdkObject), IOriginAccessIdentity {
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
     * The principal to grant permissions to.
     */
    override fun grantPrincipal(): IPrincipal =
        unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The Origin Access Identity Id (physical id) This was called originAccessIdentityName before.
     */
    override fun originAccessIdentityId(): String = unwrap(this).getOriginAccessIdentityId()

    /**
     * (deprecated) The Origin Access Identity Id (physical id) It is misnamed and superseded by the
     * correctly named originAccessIdentityId.
     *
     * @deprecated use originAccessIdentityId instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun originAccessIdentityName(): String = unwrap(this).getOriginAccessIdentityName()

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.IOriginAccessIdentity):
        IOriginAccessIdentity = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IOriginAccessIdentity):
        software.amazon.awscdk.services.cloudfront.IOriginAccessIdentity = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.IOriginAccessIdentity
  }
}
