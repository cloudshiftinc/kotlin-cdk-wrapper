package io.cloudshiftdev.awscdk.services.appconfig

import kotlin.String

public abstract class DeploymentStrategyId internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appconfig.DeploymentStrategyId,
) {
  public open fun id(): String = unwrap(this).getId()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appconfig.DeploymentStrategyId,
  ) : DeploymentStrategyId(cdkObject)

  public companion object {
    public open fun fromString(deploymentStrategyId: String): DeploymentStrategyId =
        software.amazon.awscdk.services.appconfig.DeploymentStrategyId.fromString(deploymentStrategyId).let(DeploymentStrategyId::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.DeploymentStrategyId):
        DeploymentStrategyId = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DeploymentStrategyId):
        software.amazon.awscdk.services.appconfig.DeploymentStrategyId = (wrapped as
        Wrapper).cdkObject
  }
}
