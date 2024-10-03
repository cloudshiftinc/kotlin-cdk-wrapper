@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number

/**
 * Minimum number of healthy hosts per availability zone for a server deployment.
 *
 * Example:
 *
 * ```
 * ServerDeploymentConfig deploymentConfig = ServerDeploymentConfig.Builder.create(this,
 * "DeploymentConfiguration")
 * .minimumHealthyHosts(MinimumHealthyHosts.count(2))
 * .zonalConfig(ZonalConfig.builder()
 * .monitorDuration(Duration.minutes(30))
 * .firstZoneMonitorDuration(Duration.minutes(60))
 * .minimumHealthyHostsPerZone(MinimumHealthyHostsPerZone.count(1))
 * .build())
 * .build();
 * ```
 */
public open class MinimumHealthyHostsPerZone(
  cdkObject: software.amazon.awscdk.services.codedeploy.MinimumHealthyHostsPerZone,
) : CdkObject(cdkObject) {
  public companion object {
    public fun count(`value`: Number): MinimumHealthyHostsPerZone =
        software.amazon.awscdk.services.codedeploy.MinimumHealthyHostsPerZone.count(`value`).let(MinimumHealthyHostsPerZone::wrap)

    public fun percentage(`value`: Number): MinimumHealthyHostsPerZone =
        software.amazon.awscdk.services.codedeploy.MinimumHealthyHostsPerZone.percentage(`value`).let(MinimumHealthyHostsPerZone::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.MinimumHealthyHostsPerZone):
        MinimumHealthyHostsPerZone = MinimumHealthyHostsPerZone(cdkObject)

    internal fun unwrap(wrapped: MinimumHealthyHostsPerZone):
        software.amazon.awscdk.services.codedeploy.MinimumHealthyHostsPerZone = wrapped.cdkObject as
        software.amazon.awscdk.services.codedeploy.MinimumHealthyHostsPerZone
  }
}
