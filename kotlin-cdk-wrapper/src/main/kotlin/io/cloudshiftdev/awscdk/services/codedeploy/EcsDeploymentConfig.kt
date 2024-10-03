@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A custom Deployment Configuration for an ECS Deployment Group.
 *
 * Example:
 *
 * ```
 * FargateService service;
 * ITargetGroup blueTargetGroup;
 * ITargetGroup greenTargetGroup;
 * IApplicationListener listener;
 * IApplicationListener testListener;
 * EcsDeploymentGroup.Builder.create(this, "BlueGreenDG")
 * .autoRollback(AutoRollbackConfig.builder()
 * // CodeDeploy will automatically roll back if the 8-hour approval period times out and the
 * deployment stops
 * .stoppedDeployment(true)
 * .build())
 * .service(service)
 * .blueGreenDeploymentConfig(EcsBlueGreenDeploymentConfig.builder()
 * // The deployment will wait for approval for up to 8 hours before stopping the deployment
 * .deploymentApprovalWaitTime(Duration.hours(8))
 * .blueTargetGroup(blueTargetGroup)
 * .greenTargetGroup(greenTargetGroup)
 * .listener(listener)
 * .testListener(testListener)
 * .build())
 * .deploymentConfig(EcsDeploymentConfig.CANARY_10PERCENT_5MINUTES)
 * .build();
 * ```
 */
public open class EcsDeploymentConfig(
  cdkObject: software.amazon.awscdk.services.codedeploy.EcsDeploymentConfig,
) : BaseDeploymentConfig(cdkObject),
    IEcsDeploymentConfig {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.codedeploy.EcsDeploymentConfig(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: EcsDeploymentConfigProps,
  ) :
      this(software.amazon.awscdk.services.codedeploy.EcsDeploymentConfig(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(EcsDeploymentConfigProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: EcsDeploymentConfigProps.Builder.() -> Unit,
  ) : this(scope, id, EcsDeploymentConfigProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codedeploy.EcsDeploymentConfig].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The physical, human-readable name of the Deployment Configuration.
     *
     * Default: - automatically generated name
     *
     * @param deploymentConfigName The physical, human-readable name of the Deployment
     * Configuration. 
     */
    public fun deploymentConfigName(deploymentConfigName: String)

    /**
     * The configuration that specifies how traffic is shifted from the 'blue' target group to the
     * 'green' target group during a deployment.
     *
     * Default: AllAtOnce
     *
     * @param trafficRouting The configuration that specifies how traffic is shifted from the 'blue'
     * target group to the 'green' target group during a deployment. 
     */
    public fun trafficRouting(trafficRouting: TrafficRouting)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codedeploy.EcsDeploymentConfig.Builder =
        software.amazon.awscdk.services.codedeploy.EcsDeploymentConfig.Builder.create(scope, id)

    /**
     * The physical, human-readable name of the Deployment Configuration.
     *
     * Default: - automatically generated name
     *
     * @param deploymentConfigName The physical, human-readable name of the Deployment
     * Configuration. 
     */
    override fun deploymentConfigName(deploymentConfigName: String) {
      cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    /**
     * The configuration that specifies how traffic is shifted from the 'blue' target group to the
     * 'green' target group during a deployment.
     *
     * Default: AllAtOnce
     *
     * @param trafficRouting The configuration that specifies how traffic is shifted from the 'blue'
     * target group to the 'green' target group during a deployment. 
     */
    override fun trafficRouting(trafficRouting: TrafficRouting) {
      cdkBuilder.trafficRouting(trafficRouting.let(TrafficRouting.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.EcsDeploymentConfig =
        cdkBuilder.build()
  }

  public companion object {
    public val ALL_AT_ONCE: IEcsDeploymentConfig =
        IEcsDeploymentConfig.wrap(software.amazon.awscdk.services.codedeploy.EcsDeploymentConfig.ALL_AT_ONCE)

    public val CANARY_10_PERCENT_15_MINUTES: IEcsDeploymentConfig =
        IEcsDeploymentConfig.wrap(software.amazon.awscdk.services.codedeploy.EcsDeploymentConfig.CANARY_10_PERCENT_15_MINUTES)

    public val CANARY_10_PERCENT_5_MINUTES: IEcsDeploymentConfig =
        IEcsDeploymentConfig.wrap(software.amazon.awscdk.services.codedeploy.EcsDeploymentConfig.CANARY_10_PERCENT_5_MINUTES)

    public val LINEAR_10_PERCENT_EVERY_1_MINUTES: IEcsDeploymentConfig =
        IEcsDeploymentConfig.wrap(software.amazon.awscdk.services.codedeploy.EcsDeploymentConfig.LINEAR_10_PERCENT_EVERY_1_MINUTES)

    public val LINEAR_10_PERCENT_EVERY_3_MINUTES: IEcsDeploymentConfig =
        IEcsDeploymentConfig.wrap(software.amazon.awscdk.services.codedeploy.EcsDeploymentConfig.LINEAR_10_PERCENT_EVERY_3_MINUTES)

    public fun fromEcsDeploymentConfigName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      ecsDeploymentConfigName: String,
    ): IEcsDeploymentConfig =
        software.amazon.awscdk.services.codedeploy.EcsDeploymentConfig.fromEcsDeploymentConfigName(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, ecsDeploymentConfigName).let(IEcsDeploymentConfig::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EcsDeploymentConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EcsDeploymentConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.EcsDeploymentConfig):
        EcsDeploymentConfig = EcsDeploymentConfig(cdkObject)

    internal fun unwrap(wrapped: EcsDeploymentConfig):
        software.amazon.awscdk.services.codedeploy.EcsDeploymentConfig = wrapped.cdkObject as
        software.amazon.awscdk.services.codedeploy.EcsDeploymentConfig
  }
}
