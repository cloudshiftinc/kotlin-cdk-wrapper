@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public abstract class DeploymentStrategyId internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appconfig.DeploymentStrategyId,
) : CdkObject(cdkObject) {
  public open fun id(): String = unwrap(this).getId()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.DeploymentStrategyId,
  ) : DeploymentStrategyId(cdkObject)

  public companion object {
    public val ALL_AT_ONCE: DeploymentStrategyId =
        DeploymentStrategyId.wrap(software.amazon.awscdk.services.appconfig.DeploymentStrategyId.ALL_AT_ONCE)

    public val CANARY_10_PERCENT_20_MINUTES: DeploymentStrategyId =
        DeploymentStrategyId.wrap(software.amazon.awscdk.services.appconfig.DeploymentStrategyId.CANARY_10_PERCENT_20_MINUTES)

    public val LINEAR_20_PERCENT_EVERY_6_MINUTES: DeploymentStrategyId =
        DeploymentStrategyId.wrap(software.amazon.awscdk.services.appconfig.DeploymentStrategyId.LINEAR_20_PERCENT_EVERY_6_MINUTES)

    public val LINEAR_50_PERCENT_EVERY_30_SECONDS: DeploymentStrategyId =
        DeploymentStrategyId.wrap(software.amazon.awscdk.services.appconfig.DeploymentStrategyId.LINEAR_50_PERCENT_EVERY_30_SECONDS)

    public fun fromString(deploymentStrategyId: String): DeploymentStrategyId =
        software.amazon.awscdk.services.appconfig.DeploymentStrategyId.fromString(deploymentStrategyId).let(DeploymentStrategyId::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.DeploymentStrategyId):
        DeploymentStrategyId = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DeploymentStrategyId):
        software.amazon.awscdk.services.appconfig.DeploymentStrategyId = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.DeploymentStrategyId
  }
}
