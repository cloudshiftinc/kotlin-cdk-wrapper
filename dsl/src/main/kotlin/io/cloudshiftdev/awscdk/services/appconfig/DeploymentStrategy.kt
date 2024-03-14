package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.Resource
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class DeploymentStrategy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appconfig.DeploymentStrategy,
) : Resource(cdkObject), IDeploymentStrategy {
  public override fun deploymentDurationInMinutes(): Number? =
      unwrap(this).getDeploymentDurationInMinutes()

  public override fun deploymentStrategyArn(): String = unwrap(this).getDeploymentStrategyArn()

  public override fun deploymentStrategyId(): String = unwrap(this).getDeploymentStrategyId()

  public override fun description(): String? = unwrap(this).getDescription()

  public override fun finalBakeTimeInMinutes(): Number? = unwrap(this).getFinalBakeTimeInMinutes()

  public override fun growthFactor(): Number? = unwrap(this).getGrowthFactor()

  public override fun growthType(): GrowthType? =
      unwrap(this).getGrowthType()?.let(GrowthType::wrap)

  public override fun name(): String? = unwrap(this).getName()

  public interface Builder {
    public fun deploymentStrategyName(deploymentStrategyName: String) {
    }

    public fun description(description: String) {
    }

    public fun rolloutStrategy(rolloutStrategy: RolloutStrategy) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.DeploymentStrategy.Builder =
        software.amazon.awscdk.services.appconfig.DeploymentStrategy.Builder.create(scope, id)

    public override fun deploymentStrategyName(deploymentStrategyName: String) {
      cdkBuilder.deploymentStrategyName(deploymentStrategyName)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun rolloutStrategy(rolloutStrategy: RolloutStrategy) {
      cdkBuilder.rolloutStrategy(rolloutStrategy.let(RolloutStrategy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appconfig.DeploymentStrategy =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromDeploymentStrategyArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      deploymentStrategyArn: String,
    ): IDeploymentStrategy =
        software.amazon.awscdk.services.appconfig.DeploymentStrategy.fromDeploymentStrategyArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, deploymentStrategyArn).let(IDeploymentStrategy::wrap)

    public open fun fromDeploymentStrategyId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      deploymentStrategyId: DeploymentStrategyId,
    ): IDeploymentStrategy =
        software.amazon.awscdk.services.appconfig.DeploymentStrategy.fromDeploymentStrategyId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, deploymentStrategyId.let(DeploymentStrategyId::unwrap)).let(IDeploymentStrategy::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): DeploymentStrategy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return DeploymentStrategy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.DeploymentStrategy):
        DeploymentStrategy = DeploymentStrategy(cdkObject)

    internal fun unwrap(wrapped: DeploymentStrategy):
        software.amazon.awscdk.services.appconfig.DeploymentStrategy = wrapped.cdkObject
  }
}
