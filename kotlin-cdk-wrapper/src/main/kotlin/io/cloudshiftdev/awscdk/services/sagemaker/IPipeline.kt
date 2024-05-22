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
 * The interface for a SageMaker Pipeline resource.
 */
public interface IPipeline : IResource {
  /**
   * Permits an IAM principal to start this pipeline execution.
   *
   * @param grantee The principal to grant access to. 
   */
  public fun grantStartPipelineExecution(grantee: IGrantable): Grant

  /**
   * The ARN of the pipeline.
   */
  public fun pipelineArn(): String

  /**
   * The name of the pipeline.
   */
  public fun pipelineName(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sagemaker.IPipeline,
  ) : CdkObject(cdkObject), IPipeline {
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
     * Permits an IAM principal to start this pipeline execution.
     *
     * @param grantee The principal to grant access to. 
     */
    override fun grantStartPipelineExecution(grantee: IGrantable): Grant =
        unwrap(this).grantStartPipelineExecution(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The ARN of the pipeline.
     */
    override fun pipelineArn(): String = unwrap(this).getPipelineArn()

    /**
     * The name of the pipeline.
     */
    override fun pipelineName(): String = unwrap(this).getPipelineName()

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.IPipeline): IPipeline =
        CdkObjectWrappers.wrap(cdkObject) as? IPipeline ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IPipeline): software.amazon.awscdk.services.sagemaker.IPipeline =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.IPipeline
  }
}
