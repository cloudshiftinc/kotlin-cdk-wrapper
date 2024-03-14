package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public abstract class DeploymentStrategyId internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appconfig.DeploymentStrategyId,
) : CdkObject(cdkObject) {
  /**
   * The deployment strategy ID.
   */
  public open fun id(): String = unwrap(this).getId()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.DeploymentStrategyId,
  ) : DeploymentStrategyId(cdkObject)

  public companion object {
    public fun fromString(deploymentStrategyId: String): DeploymentStrategyId =
        software.amazon.awscdk.services.appconfig.DeploymentStrategyId.fromString(deploymentStrategyId).let(DeploymentStrategyId::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.DeploymentStrategyId):
        DeploymentStrategyId = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DeploymentStrategyId):
        software.amazon.awscdk.services.appconfig.DeploymentStrategyId = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.DeploymentStrategyId
  }
}
