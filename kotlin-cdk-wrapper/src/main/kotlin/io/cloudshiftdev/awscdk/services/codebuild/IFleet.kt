@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Node
import kotlin.String

/**
 * Represents a [Fleet] for a reserved capacity CodeBuild project.
 */
public interface IFleet : IResource {
  /**
   * The compute type of the fleet.
   *
   * [Documentation](https://docs.aws.amazon.com/cdk/api/v2/docs/aws-cdk-lib.aws_codebuild.ComputeType.html)
   */
  public fun computeType(): FleetComputeType

  /**
   * The build environment (operating system/architecture/accelerator) type made available to
   * projects using this fleet.
   */
  public fun environmentType(): EnvironmentType

  /**
   * The ARN of the fleet.
   */
  public fun fleetArn(): String

  /**
   * The name of the fleet.
   */
  public fun fleetName(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codebuild.IFleet,
  ) : CdkObject(cdkObject),
      IFleet {
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
     * The compute type of the fleet.
     *
     * [Documentation](https://docs.aws.amazon.com/cdk/api/v2/docs/aws-cdk-lib.aws_codebuild.ComputeType.html)
     */
    override fun computeType(): FleetComputeType =
        unwrap(this).getComputeType().let(FleetComputeType::wrap)

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
     * The build environment (operating system/architecture/accelerator) type made available to
     * projects using this fleet.
     */
    override fun environmentType(): EnvironmentType =
        unwrap(this).getEnvironmentType().let(EnvironmentType::wrap)

    /**
     * The ARN of the fleet.
     */
    override fun fleetArn(): String = unwrap(this).getFleetArn()

    /**
     * The name of the fleet.
     */
    override fun fleetName(): String = unwrap(this).getFleetName()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.IFleet): IFleet =
        CdkObjectWrappers.wrap(cdkObject) as? IFleet ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IFleet): software.amazon.awscdk.services.codebuild.IFleet =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.IFleet
  }
}
