@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IEcsDeploymentGroup : IResource {
  public fun application(): IEcsApplication

  public fun deploymentConfig(): IEcsDeploymentConfig

  public fun deploymentGroupArn(): String

  public fun deploymentGroupName(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.IEcsDeploymentGroup,
  ) : CdkObject(cdkObject), IEcsDeploymentGroup {
    override fun application(): IEcsApplication =
        unwrap(this).getApplication().let(IEcsApplication::wrap)

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun deploymentConfig(): IEcsDeploymentConfig =
        unwrap(this).getDeploymentConfig().let(IEcsDeploymentConfig::wrap)

    override fun deploymentGroupArn(): String = unwrap(this).getDeploymentGroupArn()

    override fun deploymentGroupName(): String = unwrap(this).getDeploymentGroupName()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.IEcsDeploymentGroup):
        IEcsDeploymentGroup = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEcsDeploymentGroup):
        software.amazon.awscdk.services.codedeploy.IEcsDeploymentGroup = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.IEcsDeploymentGroup
  }
}
