@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface DeploymentStrategyProps {
  public fun deploymentStrategyName(): String? = unwrap(this).getDeploymentStrategyName()

  public fun description(): String? = unwrap(this).getDescription()

  public fun rolloutStrategy(): RolloutStrategy

  @CdkDslMarker
  public interface Builder {
    public fun deploymentStrategyName(deploymentStrategyName: String)

    public fun description(description: String)

    public fun rolloutStrategy(rolloutStrategy: RolloutStrategy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appconfig.DeploymentStrategyProps.Builder =
        software.amazon.awscdk.services.appconfig.DeploymentStrategyProps.builder()

    override fun deploymentStrategyName(deploymentStrategyName: String) {
      cdkBuilder.deploymentStrategyName(deploymentStrategyName)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun rolloutStrategy(rolloutStrategy: RolloutStrategy) {
      cdkBuilder.rolloutStrategy(rolloutStrategy.let(RolloutStrategy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appconfig.DeploymentStrategyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.DeploymentStrategyProps,
  ) : CdkObject(cdkObject), DeploymentStrategyProps {
    override fun deploymentStrategyName(): String? = unwrap(this).getDeploymentStrategyName()

    override fun description(): String? = unwrap(this).getDescription()

    override fun rolloutStrategy(): RolloutStrategy =
        unwrap(this).getRolloutStrategy().let(RolloutStrategy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentStrategyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.DeploymentStrategyProps):
        DeploymentStrategyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DeploymentStrategyProps):
        software.amazon.awscdk.services.appconfig.DeploymentStrategyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.DeploymentStrategyProps
  }
}
