@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Construction properties of `LambdaDeploymentConfig`.
 *
 * Example:
 *
 * ```
 * LambdaApplication application;
 * Alias alias;
 * LambdaDeploymentConfig config = LambdaDeploymentConfig.Builder.create(this, "CustomConfig")
 * .trafficRouting(TimeBasedCanaryTrafficRouting.Builder.create()
 * .interval(Duration.minutes(15))
 * .percentage(5)
 * .build())
 * .build();
 * LambdaDeploymentGroup deploymentGroup = LambdaDeploymentGroup.Builder.create(this,
 * "BlueGreenDeployment")
 * .application(application)
 * .alias(alias)
 * .deploymentConfig(config)
 * .build();
 * ```
 */
public interface LambdaDeploymentConfigProps : BaseDeploymentConfigOptions {
  /**
   * The configuration that specifies how traffic is shifted from the 'blue' target group to the
   * 'green' target group during a deployment.
   *
   * Default: AllAtOnce
   */
  public fun trafficRouting(): TrafficRouting? =
      unwrap(this).getTrafficRouting()?.let(TrafficRouting::wrap)

  /**
   * A builder for [LambdaDeploymentConfigProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deploymentConfigName The physical, human-readable name of the Deployment
     * Configuration.
     */
    public fun deploymentConfigName(deploymentConfigName: String)

    /**
     * @param trafficRouting The configuration that specifies how traffic is shifted from the 'blue'
     * target group to the 'green' target group during a deployment.
     */
    public fun trafficRouting(trafficRouting: TrafficRouting)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigProps.Builder =
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigProps.builder()

    /**
     * @param deploymentConfigName The physical, human-readable name of the Deployment
     * Configuration.
     */
    override fun deploymentConfigName(deploymentConfigName: String) {
      cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    /**
     * @param trafficRouting The configuration that specifies how traffic is shifted from the 'blue'
     * target group to the 'green' target group during a deployment.
     */
    override fun trafficRouting(trafficRouting: TrafficRouting) {
      cdkBuilder.trafficRouting(trafficRouting.let(TrafficRouting.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigProps,
  ) : CdkObject(cdkObject),
      LambdaDeploymentConfigProps {
    /**
     * The physical, human-readable name of the Deployment Configuration.
     *
     * Default: - automatically generated name
     */
    override fun deploymentConfigName(): String? = unwrap(this).getDeploymentConfigName()

    /**
     * The configuration that specifies how traffic is shifted from the 'blue' target group to the
     * 'green' target group during a deployment.
     *
     * Default: AllAtOnce
     */
    override fun trafficRouting(): TrafficRouting? =
        unwrap(this).getTrafficRouting()?.let(TrafficRouting::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaDeploymentConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigProps):
        LambdaDeploymentConfigProps = CdkObjectWrappers.wrap(cdkObject) as?
        LambdaDeploymentConfigProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaDeploymentConfigProps):
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigProps
  }
}
