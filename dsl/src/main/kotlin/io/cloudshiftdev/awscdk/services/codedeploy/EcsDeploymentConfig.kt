package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class EcsDeploymentConfig internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codedeploy.EcsDeploymentConfig,
) : BaseDeploymentConfig(cdkObject), IEcsDeploymentConfig {
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
      cdkBuilder.trafficRouting(trafficRouting.let(TrafficRouting::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.EcsDeploymentConfig =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromEcsDeploymentConfigName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      ecsDeploymentConfigName: String,
    ): IEcsDeploymentConfig =
        software.amazon.awscdk.services.codedeploy.EcsDeploymentConfig.fromEcsDeploymentConfigName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
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
        software.amazon.awscdk.services.codedeploy.EcsDeploymentConfig = wrapped.cdkObject
  }
}
