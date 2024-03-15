@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.Number
import kotlin.String

public interface IDeploymentStrategy : IResource {
  public fun deploymentDurationInMinutes(): Number? = unwrap(this).getDeploymentDurationInMinutes()

  public fun deploymentStrategyArn(): String

  public fun deploymentStrategyId(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun finalBakeTimeInMinutes(): Number? = unwrap(this).getFinalBakeTimeInMinutes()

  public fun growthFactor(): Number? = unwrap(this).getGrowthFactor()

  public fun growthType(): GrowthType? = unwrap(this).getGrowthType()?.let(GrowthType::wrap)

  public fun name(): String? = unwrap(this).getName()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.IDeploymentStrategy,
  ) : CdkObject(cdkObject), IDeploymentStrategy {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun deploymentDurationInMinutes(): Number? =
        unwrap(this).getDeploymentDurationInMinutes()

    override fun deploymentStrategyArn(): String = unwrap(this).getDeploymentStrategyArn()

    override fun deploymentStrategyId(): String = unwrap(this).getDeploymentStrategyId()

    override fun description(): String? = unwrap(this).getDescription()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun finalBakeTimeInMinutes(): Number? = unwrap(this).getFinalBakeTimeInMinutes()

    override fun growthFactor(): Number? = unwrap(this).getGrowthFactor()

    override fun growthType(): GrowthType? = unwrap(this).getGrowthType()?.let(GrowthType::wrap)

    override fun name(): String? = unwrap(this).getName()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.IDeploymentStrategy):
        IDeploymentStrategy = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IDeploymentStrategy):
        software.amazon.awscdk.services.appconfig.IDeploymentStrategy = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.IDeploymentStrategy
  }
}
