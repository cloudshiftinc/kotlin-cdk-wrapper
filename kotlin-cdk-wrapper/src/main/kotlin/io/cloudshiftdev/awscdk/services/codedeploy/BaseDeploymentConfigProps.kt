@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface BaseDeploymentConfigProps : BaseDeploymentConfigOptions {
  public fun computePlatform(): ComputePlatform? =
      unwrap(this).getComputePlatform()?.let(ComputePlatform::wrap)

  public fun minimumHealthyHosts(): MinimumHealthyHosts? =
      unwrap(this).getMinimumHealthyHosts()?.let(MinimumHealthyHosts::wrap)

  public fun trafficRouting(): TrafficRouting? =
      unwrap(this).getTrafficRouting()?.let(TrafficRouting::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun computePlatform(computePlatform: ComputePlatform)

    public fun deploymentConfigName(deploymentConfigName: String)

    public fun minimumHealthyHosts(minimumHealthyHosts: MinimumHealthyHosts)

    public fun trafficRouting(trafficRouting: TrafficRouting)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigProps.Builder =
        software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigProps.builder()

    override fun computePlatform(computePlatform: ComputePlatform) {
      cdkBuilder.computePlatform(computePlatform.let(ComputePlatform::unwrap))
    }

    override fun deploymentConfigName(deploymentConfigName: String) {
      cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    override fun minimumHealthyHosts(minimumHealthyHosts: MinimumHealthyHosts) {
      cdkBuilder.minimumHealthyHosts(minimumHealthyHosts.let(MinimumHealthyHosts::unwrap))
    }

    override fun trafficRouting(trafficRouting: TrafficRouting) {
      cdkBuilder.trafficRouting(trafficRouting.let(TrafficRouting::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigProps,
  ) : CdkObject(cdkObject), BaseDeploymentConfigProps {
    override fun computePlatform(): ComputePlatform? =
        unwrap(this).getComputePlatform()?.let(ComputePlatform::wrap)

    override fun deploymentConfigName(): String? = unwrap(this).getDeploymentConfigName()

    override fun minimumHealthyHosts(): MinimumHealthyHosts? =
        unwrap(this).getMinimumHealthyHosts()?.let(MinimumHealthyHosts::wrap)

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
