@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An AWS AppConfig deployment strategy.
 *
 * Example:
 *
 * ```
 * DeploymentStrategy.Builder.create(this, "MyDeploymentStrategy")
 * .rolloutStrategy(RolloutStrategy.linear(RolloutStrategyProps.builder()
 * .growthFactor(20)
 * .deploymentDuration(Duration.minutes(30))
 * .finalBakeTime(Duration.minutes(30))
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-creating-deployment-strategy.html)
 */
public open class DeploymentStrategy(
  cdkObject: software.amazon.awscdk.services.appconfig.DeploymentStrategy,
) : Resource(cdkObject), IDeploymentStrategy {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: DeploymentStrategyProps,
  ) :
      this(software.amazon.awscdk.services.appconfig.DeploymentStrategy(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(DeploymentStrategyProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: DeploymentStrategyProps.Builder.() -> Unit,
  ) : this(scope, id, DeploymentStrategyProps(props)
  )

  /**
   * The deployment duration in minutes of the deployment strategy.
   */
  public override fun deploymentDurationInMinutes(): Number? =
      unwrap(this).getDeploymentDurationInMinutes()

  /**
   * The Amazon Resource Name (ARN) of the deployment strategy.
   */
  public override fun deploymentStrategyArn(): String = unwrap(this).getDeploymentStrategyArn()

  /**
   * The ID of the deployment strategy.
   */
  public override fun deploymentStrategyId(): String = unwrap(this).getDeploymentStrategyId()

  /**
   * The description of the deployment strategy.
   */
  public override fun description(): String? = unwrap(this).getDescription()

  /**
   * The final bake time in minutes of the deployment strategy.
   */
  public override fun finalBakeTimeInMinutes(): Number? = unwrap(this).getFinalBakeTimeInMinutes()

  /**
   * The growth factor of the deployment strategy.
   */
  public override fun growthFactor(): Number? = unwrap(this).getGrowthFactor()

  /**
   * The growth type of the deployment strategy.
   */
  public override fun growthType(): GrowthType? =
      unwrap(this).getGrowthType()?.let(GrowthType::wrap)

  /**
   * The name of the deployment strategy.
   */
  public override fun name(): String? = unwrap(this).getName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appconfig.DeploymentStrategy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A name for the deployment strategy.
     *
     * Default: - A name is generated.
     *
     * @param deploymentStrategyName A name for the deployment strategy. 
     */
    public fun deploymentStrategyName(deploymentStrategyName: String)

    /**
     * A description of the deployment strategy.
     *
     * Default: - No description.
     *
     * @param description A description of the deployment strategy. 
     */
    public fun description(description: String)

    /**
     * The rollout strategy for the deployment strategy.
     *
     * You can use predefined deployment
     * strategies, such as RolloutStrategy.ALL_AT_ONCE,
     * RolloutStrategy.LINEAR_50_PERCENT_EVERY_30_SECONDS,
     * or RolloutStrategy.CANARY_10_PERCENT_20_MINUTES.
     *
     * @param rolloutStrategy The rollout strategy for the deployment strategy. 
     */
    public fun rolloutStrategy(rolloutStrategy: RolloutStrategy)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.DeploymentStrategy.Builder =
        software.amazon.awscdk.services.appconfig.DeploymentStrategy.Builder.create(scope, id)

    /**
     * A name for the deployment strategy.
     *
     * Default: - A name is generated.
     *
     * @param deploymentStrategyName A name for the deployment strategy. 
     */
    override fun deploymentStrategyName(deploymentStrategyName: String) {
      cdkBuilder.deploymentStrategyName(deploymentStrategyName)
    }

    /**
     * A description of the deployment strategy.
     *
     * Default: - No description.
     *
     * @param description A description of the deployment strategy. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The rollout strategy for the deployment strategy.
     *
     * You can use predefined deployment
     * strategies, such as RolloutStrategy.ALL_AT_ONCE,
     * RolloutStrategy.LINEAR_50_PERCENT_EVERY_30_SECONDS,
     * or RolloutStrategy.CANARY_10_PERCENT_20_MINUTES.
     *
     * @param rolloutStrategy The rollout strategy for the deployment strategy. 
     */
    override fun rolloutStrategy(rolloutStrategy: RolloutStrategy) {
      cdkBuilder.rolloutStrategy(rolloutStrategy.let(RolloutStrategy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appconfig.DeploymentStrategy =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromDeploymentStrategyArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      deploymentStrategyArn: String,
    ): IDeploymentStrategy =
        software.amazon.awscdk.services.appconfig.DeploymentStrategy.fromDeploymentStrategyArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, deploymentStrategyArn).let(IDeploymentStrategy::wrap)

    public fun fromDeploymentStrategyId(
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
        software.amazon.awscdk.services.appconfig.DeploymentStrategy = wrapped.cdkObject as
        software.amazon.awscdk.services.appconfig.DeploymentStrategy
  }
}
