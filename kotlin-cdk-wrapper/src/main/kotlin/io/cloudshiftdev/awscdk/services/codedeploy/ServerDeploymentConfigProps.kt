@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface ServerDeploymentConfigProps : BaseDeploymentConfigOptions {
  public fun minimumHealthyHosts(): MinimumHealthyHosts

  @CdkDslMarker
  public interface Builder {
    public fun deploymentConfigName(deploymentConfigName: String)

    public fun minimumHealthyHosts(minimumHealthyHosts: MinimumHealthyHosts)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.ServerDeploymentConfigProps.Builder =
        software.amazon.awscdk.services.codedeploy.ServerDeploymentConfigProps.builder()

    override fun deploymentConfigName(deploymentConfigName: String) {
      cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    override fun minimumHealthyHosts(minimumHealthyHosts: MinimumHealthyHosts) {
      cdkBuilder.minimumHealthyHosts(minimumHealthyHosts.let(MinimumHealthyHosts::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.ServerDeploymentConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.ServerDeploymentConfigProps,
  ) : CdkObject(cdkObject), ServerDeploymentConfigProps {
    override fun deploymentConfigName(): String? = unwrap(this).getDeploymentConfigName()

    override fun minimumHealthyHosts(): MinimumHealthyHosts =
        unwrap(this).getMinimumHealthyHosts().let(MinimumHealthyHosts::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ServerDeploymentConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.ServerDeploymentConfigProps):
        ServerDeploymentConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServerDeploymentConfigProps):
        software.amazon.awscdk.services.codedeploy.ServerDeploymentConfigProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codedeploy.ServerDeploymentConfigProps
  }
}
