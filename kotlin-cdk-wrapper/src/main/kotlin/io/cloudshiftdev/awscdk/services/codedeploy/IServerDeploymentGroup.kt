@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.autoscaling.IAutoScalingGroup
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.collections.List

/**
 *
 */
public interface IServerDeploymentGroup : IResource {
  /**
   *
   */
  public fun application(): IServerApplication

  /**
   *
   */
  public fun autoScalingGroups(): List<IAutoScalingGroup> =
      unwrap(this).getAutoScalingGroups()?.map(IAutoScalingGroup::wrap) ?: emptyList()

  /**
   *
   */
  public fun deploymentConfig(): IServerDeploymentConfig

  /**
   *
   */
  public fun deploymentGroupArn(): String

  /**
   *
   */
  public fun deploymentGroupName(): String

  /**
   *
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codedeploy.IServerDeploymentGroup,
  ) : CdkObject(cdkObject), IServerDeploymentGroup {
    /**
     *
     */
    override fun application(): IServerApplication =
        unwrap(this).getApplication().let(IServerApplication::wrap)

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
     *
     */
    override fun autoScalingGroups(): List<IAutoScalingGroup> =
        unwrap(this).getAutoScalingGroups()?.map(IAutoScalingGroup::wrap) ?: emptyList()

    /**
     *
     */
    override fun deploymentConfig(): IServerDeploymentConfig =
        unwrap(this).getDeploymentConfig().let(IServerDeploymentConfig::wrap)

    /**
     *
     */
    override fun deploymentGroupArn(): String = unwrap(this).getDeploymentGroupArn()

    /**
     *
     */
    override fun deploymentGroupName(): String = unwrap(this).getDeploymentGroupName()

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
     *
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.IServerDeploymentGroup):
        IServerDeploymentGroup = CdkObjectWrappers.wrap(cdkObject) as? IServerDeploymentGroup ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IServerDeploymentGroup):
        software.amazon.awscdk.services.codedeploy.IServerDeploymentGroup = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.IServerDeploymentGroup
  }
}
