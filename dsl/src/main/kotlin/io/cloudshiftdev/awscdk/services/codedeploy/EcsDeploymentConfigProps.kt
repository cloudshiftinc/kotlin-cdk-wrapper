package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface EcsDeploymentConfigProps : BaseDeploymentConfigOptions {
  /**
   * The configuration that specifies how traffic is shifted from the 'blue' target group to the
   * 'green' target group during a deployment.
   *
   * Default: AllAtOnce
   */
  public fun trafficRouting(): TrafficRouting? =
      unwrap(this).getTrafficRouting()?.let(TrafficRouting::wrap)

  /**
   * A builder for [EcsDeploymentConfigProps]
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
        software.amazon.awscdk.services.codedeploy.EcsDeploymentConfigProps.Builder =
        software.amazon.awscdk.services.codedeploy.EcsDeploymentConfigProps.builder()

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
      cdkBuilder.trafficRouting(trafficRouting.let(TrafficRouting::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.EcsDeploymentConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.EcsDeploymentConfigProps,
  ) : CdkObject(cdkObject), EcsDeploymentConfigProps {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): EcsDeploymentConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.EcsDeploymentConfigProps):
        EcsDeploymentConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcsDeploymentConfigProps):
        software.amazon.awscdk.services.codedeploy.EcsDeploymentConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.EcsDeploymentConfigProps
  }
}
