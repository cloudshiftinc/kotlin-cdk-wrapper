@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for DeploymentStrategy.
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
 */
public interface DeploymentStrategyProps {
  /**
   * A name for the deployment strategy.
   *
   * Default: - A name is generated.
   */
  public fun deploymentStrategyName(): String? = unwrap(this).getDeploymentStrategyName()

  /**
   * A description of the deployment strategy.
   *
   * Default: - No description.
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The rollout strategy for the deployment strategy.
   *
   * You can use predefined deployment
   * strategies, such as RolloutStrategy.ALL_AT_ONCE,
   * RolloutStrategy.LINEAR_50_PERCENT_EVERY_30_SECONDS,
   * or RolloutStrategy.CANARY_10_PERCENT_20_MINUTES.
   */
  public fun rolloutStrategy(): RolloutStrategy

  /**
   * A builder for [DeploymentStrategyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deploymentStrategyName A name for the deployment strategy.
     */
    public fun deploymentStrategyName(deploymentStrategyName: String)

    /**
     * @param description A description of the deployment strategy.
     */
    public fun description(description: String)

    /**
     * @param rolloutStrategy The rollout strategy for the deployment strategy. 
     * You can use predefined deployment
     * strategies, such as RolloutStrategy.ALL_AT_ONCE,
     * RolloutStrategy.LINEAR_50_PERCENT_EVERY_30_SECONDS,
     * or RolloutStrategy.CANARY_10_PERCENT_20_MINUTES.
     */
    public fun rolloutStrategy(rolloutStrategy: RolloutStrategy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appconfig.DeploymentStrategyProps.Builder =
        software.amazon.awscdk.services.appconfig.DeploymentStrategyProps.builder()

    /**
     * @param deploymentStrategyName A name for the deployment strategy.
     */
    override fun deploymentStrategyName(deploymentStrategyName: String) {
      cdkBuilder.deploymentStrategyName(deploymentStrategyName)
    }

    /**
     * @param description A description of the deployment strategy.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param rolloutStrategy The rollout strategy for the deployment strategy. 
     * You can use predefined deployment
     * strategies, such as RolloutStrategy.ALL_AT_ONCE,
     * RolloutStrategy.LINEAR_50_PERCENT_EVERY_30_SECONDS,
     * or RolloutStrategy.CANARY_10_PERCENT_20_MINUTES.
     */
    override fun rolloutStrategy(rolloutStrategy: RolloutStrategy) {
      cdkBuilder.rolloutStrategy(rolloutStrategy.let(RolloutStrategy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appconfig.DeploymentStrategyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appconfig.DeploymentStrategyProps,
  ) : CdkObject(cdkObject), DeploymentStrategyProps {
    /**
     * A name for the deployment strategy.
     *
     * Default: - A name is generated.
     */
    override fun deploymentStrategyName(): String? = unwrap(this).getDeploymentStrategyName()

    /**
     * A description of the deployment strategy.
     *
     * Default: - No description.
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The rollout strategy for the deployment strategy.
     *
     * You can use predefined deployment
     * strategies, such as RolloutStrategy.ALL_AT_ONCE,
     * RolloutStrategy.LINEAR_50_PERCENT_EVERY_30_SECONDS,
     * or RolloutStrategy.CANARY_10_PERCENT_20_MINUTES.
     */
    override fun rolloutStrategy(): RolloutStrategy =
        unwrap(this).getRolloutStrategy().let(RolloutStrategy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentStrategyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.DeploymentStrategyProps):
        DeploymentStrategyProps = CdkObjectWrappers.wrap(cdkObject) as? DeploymentStrategyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DeploymentStrategyProps):
        software.amazon.awscdk.services.appconfig.DeploymentStrategyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.DeploymentStrategyProps
  }
}
