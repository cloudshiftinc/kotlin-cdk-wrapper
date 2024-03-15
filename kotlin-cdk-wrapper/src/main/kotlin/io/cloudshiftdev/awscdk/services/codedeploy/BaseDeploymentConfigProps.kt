@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Complete base deployment config properties that are required to be supplied by the implementation
 * of the BaseDeploymentConfig class.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codedeploy.*;
 * MinimumHealthyHosts minimumHealthyHosts;
 * TrafficRouting trafficRouting;
 * BaseDeploymentConfigProps baseDeploymentConfigProps = BaseDeploymentConfigProps.builder()
 * .computePlatform(ComputePlatform.SERVER)
 * .deploymentConfigName("deploymentConfigName")
 * .minimumHealthyHosts(minimumHealthyHosts)
 * .trafficRouting(trafficRouting)
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
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigProps.Builder =
        software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigProps.builder()

    /**
     * @param computePlatform The destination compute platform for the deployment.
     */
    override fun computePlatform(computePlatform: ComputePlatform) {
      cdkBuilder.computePlatform(computePlatform.let(ComputePlatform::unwrap))
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
      cdkBuilder.minimumHealthyHosts(minimumHealthyHosts.let(MinimumHealthyHosts::unwrap))
    }

    /**
     * @param trafficRouting The configuration that specifies how traffic is shifted during a
     * deployment.
     * Only applicable to ECS and Lambda deployments, and must not be specified for Server
     * deployments.
     */
    override fun trafficRouting(trafficRouting: TrafficRouting) {
      cdkBuilder.trafficRouting(trafficRouting.let(TrafficRouting::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigProps,
  ) : CdkObject(cdkObject), BaseDeploymentConfigProps {
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
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BaseDeploymentConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigProps):
        BaseDeploymentConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseDeploymentConfigProps):
        software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigProps
  }
}
