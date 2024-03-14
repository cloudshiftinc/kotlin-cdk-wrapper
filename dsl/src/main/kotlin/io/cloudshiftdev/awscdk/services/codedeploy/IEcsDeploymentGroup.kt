package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IEcsDeploymentGroup : IResource {
  public fun application(): IEcsApplication

  public fun deploymentConfig(): IEcsDeploymentConfig

  public fun deploymentGroupArn(): String

  public fun deploymentGroupName(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codedeploy.IEcsDeploymentGroup,
  ) : IEcsDeploymentGroup {
    public override fun application(): IEcsApplication =
        unwrap(this).getApplication().let(IEcsApplication::wrap)

    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun deploymentConfig(): IEcsDeploymentConfig =
        unwrap(this).getDeploymentConfig().let(IEcsDeploymentConfig::wrap)

    public override fun deploymentGroupArn(): String = unwrap(this).getDeploymentGroupArn()

    public override fun deploymentGroupName(): String = unwrap(this).getDeploymentGroupName()

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.IEcsDeploymentGroup):
        IEcsDeploymentGroup = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEcsDeploymentGroup):
        software.amazon.awscdk.services.codedeploy.IEcsDeploymentGroup = (wrapped as
        Wrapper).cdkObject
  }
}
