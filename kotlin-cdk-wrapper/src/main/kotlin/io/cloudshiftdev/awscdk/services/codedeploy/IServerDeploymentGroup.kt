@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.autoscaling.IAutoScalingGroup
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.collections.List

public interface IServerDeploymentGroup : IResource {
  public fun application(): IServerApplication

  public fun autoScalingGroups(): List<IAutoScalingGroup> =
      unwrap(this).getAutoScalingGroups()?.map(IAutoScalingGroup::wrap) ?: emptyList()

  public fun deploymentConfig(): IServerDeploymentConfig

  public fun deploymentGroupArn(): String

  public fun deploymentGroupName(): String

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.IServerDeploymentGroup,
  ) : CdkObject(cdkObject), IServerDeploymentGroup {
    override fun application(): IServerApplication =
        unwrap(this).getApplication().let(IServerApplication::wrap)

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun autoScalingGroups(): List<IAutoScalingGroup> =
        unwrap(this).getAutoScalingGroups()?.map(IAutoScalingGroup::wrap) ?: emptyList()

    override fun deploymentConfig(): IServerDeploymentConfig =
        unwrap(this).getDeploymentConfig().let(IServerDeploymentConfig::wrap)

    override fun deploymentGroupArn(): String = unwrap(this).getDeploymentGroupArn()

    override fun deploymentGroupName(): String = unwrap(this).getDeploymentGroupName()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.IServerDeploymentGroup):
        IServerDeploymentGroup = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IServerDeploymentGroup):
        software.amazon.awscdk.services.codedeploy.IServerDeploymentGroup = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.IServerDeploymentGroup
  }
}
