@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

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
 * The interface for a SageMaker Endpoint resource.
 */
public interface IEndpoint : IResource {
  /**
   * The ARN of the endpoint.
   */
  public fun endpointArn(): String

  /**
   * The name of the endpoint.
   */
  public fun endpointName(): String

  /**
   * Permits an IAM principal to invoke this endpoint.
   *
   * @param grantee The principal to grant access to. 
   */
  public fun grantInvoke(grantee: IGrantable): Grant

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.IEndpoint,
  ) : CdkObject(cdkObject), IEndpoint {
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
     * The ARN of the endpoint.
     */
    override fun endpointArn(): String = unwrap(this).getEndpointArn()

    /**
     * The name of the endpoint.
     */
    override fun endpointName(): String = unwrap(this).getEndpointName()

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
     * Permits an IAM principal to invoke this endpoint.
     *
     * @param grantee The principal to grant access to. 
     */
    override fun grantInvoke(grantee: IGrantable): Grant =
        unwrap(this).grantInvoke(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.IEndpoint): IEndpoint =
        CdkObjectWrappers.wrap(cdkObject) as? IEndpoint ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEndpoint): software.amazon.awscdk.services.sagemaker.IEndpoint =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.IEndpoint
  }
}
