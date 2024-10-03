@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Complete base deployment config properties that are required to be supplied by the implementation
 * of the BaseDeploymentConfig class.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.codedeploy.*;
 * MinimumHealthyHosts minimumHealthyHosts;
 * MinimumHealthyHostsPerZone minimumHealthyHostsPerZone;
 * TrafficRouting trafficRouting;
 * BaseDeploymentConfigProps baseDeploymentConfigProps = BaseDeploymentConfigProps.builder()
 * .computePlatform(ComputePlatform.SERVER)
 * .deploymentConfigName("deploymentConfigName")
 * .minimumHealthyHosts(minimumHealthyHosts)
 * .trafficRouting(trafficRouting)
 * .zonalConfig(ZonalConfig.builder()
 * .firstZoneMonitorDuration(Duration.minutes(30))
 * .minimumHealthyHostsPerZone(minimumHealthyHostsPerZone)
 * .monitorDuration(Duration.minutes(30))
 * .build())
 * .build();
 * ```
 */
public interface BaseDeploymentConfigProps : BaseDeploymentConfigOptions {
  /**
   * The destination compute platform for the deployment.
   *
   * Default: ComputePlatform.Server
   */
  public fun computePlatform(): ComputePlatform? =
      unwrap(this).getComputePlatform()?.let(ComputePlatform::wrap)

  /**
   * Minimum number of healthy hosts.
   *
   * Default: None
   */
  public fun minimumHealthyHosts(): MinimumHealthyHosts? =
      unwrap(this).getMinimumHealthyHosts()?.let(MinimumHealthyHosts::wrap)

  /**
   * The configuration that specifies how traffic is shifted during a deployment.
   *
   * Only applicable to ECS and Lambda deployments, and must not be specified for Server
   * deployments.
   *
   * Default: None
   */
  public fun trafficRouting(): TrafficRouting? =
      unwrap(this).getTrafficRouting()?.let(TrafficRouting::wrap)

  /**
   * Configure CodeDeploy to deploy your application to one Availability Zone at a time within an
   * AWS Region.
   *
   * Default: - deploy your application to a random selection of hosts across a Region
   *
   * [Documentation](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config)
   */
  public fun zonalConfig(): ZonalConfig? = unwrap(this).getZonalConfig()?.let(ZonalConfig::wrap)

  /**
   * A builder for [BaseDeploymentConfigProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param computePlatform The destination compute platform for the deployment.
     */
    public fun computePlatform(computePlatform: ComputePlatform)

    /**
     * @param deploymentConfigName The physical, human-readable name of the Deployment
     * Configuration.
     */
    public fun deploymentConfigName(deploymentConfigName: String)

    /**
     * @param minimumHealthyHosts Minimum number of healthy hosts.
     */
    public fun minimumHealthyHosts(minimumHealthyHosts: MinimumHealthyHosts)

    /**
     * @param trafficRouting The configuration that specifies how traffic is shifted during a
     * deployment.
     * Only applicable to ECS and Lambda deployments, and must not be specified for Server
     * deployments.
     */
    public fun trafficRouting(trafficRouting: TrafficRouting)

    /**
     * @param zonalConfig Configure CodeDeploy to deploy your application to one Availability Zone
     * at a time within an AWS Region.
     */
    public fun zonalConfig(zonalConfig: ZonalConfig)

    /**
     * @param zonalConfig Configure CodeDeploy to deploy your application to one Availability Zone
     * at a time within an AWS Region.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb7a849cfade0f91271990f34e884fc52ee6597fb27f4c8f449bcaa75fd211b7")
    public fun zonalConfig(zonalConfig: ZonalConfig.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigProps.Builder =
        software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigProps.builder()

    /**
     * @param computePlatform The destination compute platform for the deployment.
     */
    override fun computePlatform(computePlatform: ComputePlatform) {
      cdkBuilder.computePlatform(computePlatform.let(ComputePlatform.Companion::unwrap))
    }

    /**
     * @param deploymentConfigName The physical, human-readable name of the Deployment
     * Configuration.
     */
    override fun deploymentConfigName(deploymentConfigName: String) {
      cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    /**
     * @param minimumHealthyHosts Minimum number of healthy hosts.
     */
    override fun minimumHealthyHosts(minimumHealthyHosts: MinimumHealthyHosts) {
      cdkBuilder.minimumHealthyHosts(minimumHealthyHosts.let(MinimumHealthyHosts.Companion::unwrap))
    }

    /**
     * @param trafficRouting The configuration that specifies how traffic is shifted during a
     * deployment.
     * Only applicable to ECS and Lambda deployments, and must not be specified for Server
     * deployments.
     */
    override fun trafficRouting(trafficRouting: TrafficRouting) {
      cdkBuilder.trafficRouting(trafficRouting.let(TrafficRouting.Companion::unwrap))
    }

    /**
     * @param zonalConfig Configure CodeDeploy to deploy your application to one Availability Zone
     * at a time within an AWS Region.
     */
    override fun zonalConfig(zonalConfig: ZonalConfig) {
      cdkBuilder.zonalConfig(zonalConfig.let(ZonalConfig.Companion::unwrap))
    }

    /**
     * @param zonalConfig Configure CodeDeploy to deploy your application to one Availability Zone
     * at a time within an AWS Region.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb7a849cfade0f91271990f34e884fc52ee6597fb27f4c8f449bcaa75fd211b7")
    override fun zonalConfig(zonalConfig: ZonalConfig.Builder.() -> Unit): Unit =
        zonalConfig(ZonalConfig(zonalConfig))

    public fun build(): software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigProps,
  ) : CdkObject(cdkObject),
      BaseDeploymentConfigProps {
    /**
     * The destination compute platform for the deployment.
     *
     * Default: ComputePlatform.Server
     */
    override fun computePlatform(): ComputePlatform? =
        unwrap(this).getComputePlatform()?.let(ComputePlatform::wrap)

    /**
     * The physical, human-readable name of the Deployment Configuration.
     *
     * Default: - automatically generated name
     */
    override fun deploymentConfigName(): String? = unwrap(this).getDeploymentConfigName()

    /**
     * Minimum number of healthy hosts.
     *
     * Default: None
     */
    override fun minimumHealthyHosts(): MinimumHealthyHosts? =
        unwrap(this).getMinimumHealthyHosts()?.let(MinimumHealthyHosts::wrap)

    /**
     * The configuration that specifies how traffic is shifted during a deployment.
     *
     * Only applicable to ECS and Lambda deployments, and must not be specified for Server
     * deployments.
     *
     * Default: None
     */
    override fun trafficRouting(): TrafficRouting? =
        unwrap(this).getTrafficRouting()?.let(TrafficRouting::wrap)

    /**
     * Configure CodeDeploy to deploy your application to one Availability Zone at a time within an
     * AWS Region.
     *
     * Default: - deploy your application to a random selection of hosts across a Region
     *
     * [Documentation](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations-create.html#zonal-config)
     */
    override fun zonalConfig(): ZonalConfig? = unwrap(this).getZonalConfig()?.let(ZonalConfig::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BaseDeploymentConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigProps):
        BaseDeploymentConfigProps = CdkObjectWrappers.wrap(cdkObject) as? BaseDeploymentConfigProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseDeploymentConfigProps):
        software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigProps
  }
}
