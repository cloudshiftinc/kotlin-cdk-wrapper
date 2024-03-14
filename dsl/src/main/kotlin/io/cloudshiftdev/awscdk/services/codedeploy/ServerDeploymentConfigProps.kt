package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface ServerDeploymentConfigProps : BaseDeploymentConfigOptions {
  /**
   * Minimum number of healthy hosts.
   */
  public fun minimumHealthyHosts(): MinimumHealthyHosts

  /**
   * A builder for [ServerDeploymentConfigProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deploymentConfigName The physical, human-readable name of the Deployment
     * Configuration.
     */
    public fun deploymentConfigName(deploymentConfigName: String)

    /**
     * @param minimumHealthyHosts Minimum number of healthy hosts. 
     */
    public fun minimumHealthyHosts(minimumHealthyHosts: MinimumHealthyHosts)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.ServerDeploymentConfigProps.Builder =
        software.amazon.awscdk.services.codedeploy.ServerDeploymentConfigProps.builder()

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

    public fun build(): software.amazon.awscdk.services.codedeploy.ServerDeploymentConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.ServerDeploymentConfigProps,
  ) : CdkObject(cdkObject), ServerDeploymentConfigProps {
    /**
     * The physical, human-readable name of the Deployment Configuration.
     *
     * Default: - automatically generated name
     */
    override fun deploymentConfigName(): String? = unwrap(this).getDeploymentConfigName()

    /**
     * Minimum number of healthy hosts.
     */
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
