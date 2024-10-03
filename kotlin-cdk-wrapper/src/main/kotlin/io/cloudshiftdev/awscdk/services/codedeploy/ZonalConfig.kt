@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Configuration for CodeDeploy to deploy your application to one Availability Zone at a time within
 * an AWS Region.
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
public interface ZonalConfig {
  /**
   * The period of time that CodeDeploy must wait after completing a deployment to the first
   * Availability Zone.
   *
   * Accepted Values:
   *
   * * 0
   * * Greater than or equal to 1
   *
   * Default: - the same value as `monitorDuration`
   */
  public fun firstZoneMonitorDuration(): Duration? =
      unwrap(this).getFirstZoneMonitorDuration()?.let(Duration::wrap)

  /**
   * The number or percentage of instances that must remain available per Availability Zone during a
   * deployment.
   *
   * This option works in conjunction with the `minimumHealthyHosts` option.
   *
   * Default: - 0 percent
   *
   * [Documentation](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html#minimum-healthy-hosts-az)
   */
  public fun minimumHealthyHostsPerZone(): MinimumHealthyHostsPerZone? =
      unwrap(this).getMinimumHealthyHostsPerZone()?.let(MinimumHealthyHostsPerZone::wrap)

  /**
   * The period of time that CodeDeploy must wait after completing a deployment to an Availability
   * Zone.
   *
   * Accepted Values:
   *
   * * 0
   * * Greater than or equal to 1
   *
   * Default: - CodeDeploy starts deploying to the next Availability Zone immediately
   */
  public fun monitorDuration(): Duration? = unwrap(this).getMonitorDuration()?.let(Duration::wrap)

  /**
   * A builder for [ZonalConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param firstZoneMonitorDuration The period of time that CodeDeploy must wait after completing
     * a deployment to the first Availability Zone.
     * Accepted Values:
     *
     * * 0
     * * Greater than or equal to 1
     */
    public fun firstZoneMonitorDuration(firstZoneMonitorDuration: Duration)

    /**
     * @param minimumHealthyHostsPerZone The number or percentage of instances that must remain
     * available per Availability Zone during a deployment.
     * This option works in conjunction with the `minimumHealthyHosts` option.
     */
    public fun minimumHealthyHostsPerZone(minimumHealthyHostsPerZone: MinimumHealthyHostsPerZone)

    /**
     * @param monitorDuration The period of time that CodeDeploy must wait after completing a
     * deployment to an Availability Zone.
     * Accepted Values:
     *
     * * 0
     * * Greater than or equal to 1
     */
    public fun monitorDuration(monitorDuration: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codedeploy.ZonalConfig.Builder =
        software.amazon.awscdk.services.codedeploy.ZonalConfig.builder()

    /**
     * @param firstZoneMonitorDuration The period of time that CodeDeploy must wait after completing
     * a deployment to the first Availability Zone.
     * Accepted Values:
     *
     * * 0
     * * Greater than or equal to 1
     */
    override fun firstZoneMonitorDuration(firstZoneMonitorDuration: Duration) {
      cdkBuilder.firstZoneMonitorDuration(firstZoneMonitorDuration.let(Duration.Companion::unwrap))
    }

    /**
     * @param minimumHealthyHostsPerZone The number or percentage of instances that must remain
     * available per Availability Zone during a deployment.
     * This option works in conjunction with the `minimumHealthyHosts` option.
     */
    override
        fun minimumHealthyHostsPerZone(minimumHealthyHostsPerZone: MinimumHealthyHostsPerZone) {
      cdkBuilder.minimumHealthyHostsPerZone(minimumHealthyHostsPerZone.let(MinimumHealthyHostsPerZone.Companion::unwrap))
    }

    /**
     * @param monitorDuration The period of time that CodeDeploy must wait after completing a
     * deployment to an Availability Zone.
     * Accepted Values:
     *
     * * 0
     * * Greater than or equal to 1
     */
    override fun monitorDuration(monitorDuration: Duration) {
      cdkBuilder.monitorDuration(monitorDuration.let(Duration.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.ZonalConfig = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codedeploy.ZonalConfig,
  ) : CdkObject(cdkObject),
      ZonalConfig {
    /**
     * The period of time that CodeDeploy must wait after completing a deployment to the first
     * Availability Zone.
     *
     * Accepted Values:
     *
     * * 0
     * * Greater than or equal to 1
     *
     * Default: - the same value as `monitorDuration`
     */
    override fun firstZoneMonitorDuration(): Duration? =
        unwrap(this).getFirstZoneMonitorDuration()?.let(Duration::wrap)

    /**
     * The number or percentage of instances that must remain available per Availability Zone during
     * a deployment.
     *
     * This option works in conjunction with the `minimumHealthyHosts` option.
     *
     * Default: - 0 percent
     *
     * [Documentation](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-health.html#minimum-healthy-hosts-az)
     */
    override fun minimumHealthyHostsPerZone(): MinimumHealthyHostsPerZone? =
        unwrap(this).getMinimumHealthyHostsPerZone()?.let(MinimumHealthyHostsPerZone::wrap)

    /**
     * The period of time that CodeDeploy must wait after completing a deployment to an Availability
     * Zone.
     *
     * Accepted Values:
     *
     * * 0
     * * Greater than or equal to 1
     *
     * Default: - CodeDeploy starts deploying to the next Availability Zone immediately
     */
    override fun monitorDuration(): Duration? =
        unwrap(this).getMonitorDuration()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ZonalConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.ZonalConfig):
        ZonalConfig = CdkObjectWrappers.wrap(cdkObject) as? ZonalConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ZonalConfig):
        software.amazon.awscdk.services.codedeploy.ZonalConfig = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codedeploy.ZonalConfig
  }
}
