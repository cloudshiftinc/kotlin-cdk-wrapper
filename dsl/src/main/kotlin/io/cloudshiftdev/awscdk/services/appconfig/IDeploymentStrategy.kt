package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
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

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appconfig.IDeploymentStrategy,
  ) : IDeploymentStrategy {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun deploymentDurationInMinutes(): Number? =
        unwrap(this).getDeploymentDurationInMinutes()

    public override fun deploymentStrategyArn(): String = unwrap(this).getDeploymentStrategyArn()

    public override fun deploymentStrategyId(): String = unwrap(this).getDeploymentStrategyId()

    public override fun description(): String? = unwrap(this).getDescription()

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun finalBakeTimeInMinutes(): Number? = unwrap(this).getFinalBakeTimeInMinutes()

    public override fun growthFactor(): Number? = unwrap(this).getGrowthFactor()

    public override fun growthType(): GrowthType? =
        unwrap(this).getGrowthType()?.let(GrowthType::wrap)

    public override fun name(): String? = unwrap(this).getName()

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.IDeploymentStrategy):
        IDeploymentStrategy = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IDeploymentStrategy):
        software.amazon.awscdk.services.appconfig.IDeploymentStrategy = (wrapped as
        Wrapper).cdkObject
  }
}
