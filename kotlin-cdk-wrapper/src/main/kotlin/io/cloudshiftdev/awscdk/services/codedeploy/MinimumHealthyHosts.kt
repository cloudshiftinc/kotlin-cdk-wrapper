@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number

/**
 * Minimum number of healthy hosts for a server deployment.
 *
 * Example:
 *
 * ```
 * ServerDeploymentConfig deploymentConfig = ServerDeploymentConfig.Builder.create(this,
 * "DeploymentConfiguration")
 * .deploymentConfigName("MyDeploymentConfiguration") // optional property
 * // one of these is required, but both cannot be specified at the same time
 * .minimumHealthyHosts(MinimumHealthyHosts.count(2))
 * .build();
 * ```
 */
public open class MinimumHealthyHosts(
  cdkObject: software.amazon.awscdk.services.codedeploy.MinimumHealthyHosts,
) : CdkObject(cdkObject) {
  public companion object {
    public fun count(`value`: Number): MinimumHealthyHosts =
        software.amazon.awscdk.services.codedeploy.MinimumHealthyHosts.count(`value`).let(MinimumHealthyHosts::wrap)

    public fun percentage(`value`: Number): MinimumHealthyHosts =
        software.amazon.awscdk.services.codedeploy.MinimumHealthyHosts.percentage(`value`).let(MinimumHealthyHosts::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.MinimumHealthyHosts):
        MinimumHealthyHosts = MinimumHealthyHosts(cdkObject)

    internal fun unwrap(wrapped: MinimumHealthyHosts):
        software.amazon.awscdk.services.codedeploy.MinimumHealthyHosts = wrapped.cdkObject as
        software.amazon.awscdk.services.codedeploy.MinimumHealthyHosts
  }
}
