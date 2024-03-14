package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
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

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codedeploy.IServerDeploymentGroup,
  ) : IServerDeploymentGroup {
    public override fun application(): IServerApplication =
        unwrap(this).getApplication().let(IServerApplication::wrap)

    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun autoScalingGroups(): List<IAutoScalingGroup> =
        unwrap(this).getAutoScalingGroups()?.map(IAutoScalingGroup::wrap) ?: emptyList()

    public override fun deploymentConfig(): IServerDeploymentConfig =
        unwrap(this).getDeploymentConfig().let(IServerDeploymentConfig::wrap)

    public override fun deploymentGroupArn(): String = unwrap(this).getDeploymentGroupArn()

    public override fun deploymentGroupName(): String = unwrap(this).getDeploymentGroupName()

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.IServerDeploymentGroup):
        IServerDeploymentGroup = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IServerDeploymentGroup):
        software.amazon.awscdk.services.codedeploy.IServerDeploymentGroup = (wrapped as
        Wrapper).cdkObject
  }
}
