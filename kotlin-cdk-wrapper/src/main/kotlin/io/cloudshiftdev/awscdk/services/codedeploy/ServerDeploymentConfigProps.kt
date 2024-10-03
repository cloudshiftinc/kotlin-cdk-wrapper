@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Construction properties of `ServerDeploymentConfig`.
 *
 * Example:
 *
 * ```
 * ServerDeploymentConfig deploymentConfig = ServerDeploymentConfig.Builder.create(this,
 * "DeploymentConfiguration")
 * .deploymentConfigName("MyDeploymentConfiguration") // optional property
 * // one of these is required, but both cannot be specified at the same time
 * .minimumHealthyHosts(MinimumHealthyHosts.count(2))
 * .build();
 * ```
 */
public interface ServerDeploymentConfigProps : BaseDeploymentConfigOptions {
  /**
   * Minimum number of healthy hosts.
   */
  public fun minimumHealthyHosts(): MinimumHealthyHosts

  /**
   * Configure CodeDeploy to deploy your application to one Availability Zone at a time within an
   * AWS Region.
   *
   * Default: - deploy your application to a random selection of hosts across a Region
   */
  public fun zonalConfig(): ZonalConfig? = unwrap(this).getZonalConfig()?.let(ZonalConfig::wrap)

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
    @JvmName("89add2f760630fa9d78509219bf9a35f54a4cb9909e47cd9178b27e50776bf84")
    public fun zonalConfig(zonalConfig: ZonalConfig.Builder.() -> Unit)
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
      cdkBuilder.minimumHealthyHosts(minimumHealthyHosts.let(MinimumHealthyHosts.Companion::unwrap))
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
    @JvmName("89add2f760630fa9d78509219bf9a35f54a4cb9909e47cd9178b27e50776bf84")
    override fun zonalConfig(zonalConfig: ZonalConfig.Builder.() -> Unit): Unit =
        zonalConfig(ZonalConfig(zonalConfig))

    public fun build(): software.amazon.awscdk.services.codedeploy.ServerDeploymentConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codedeploy.ServerDeploymentConfigProps,
  ) : CdkObject(cdkObject),
      ServerDeploymentConfigProps {
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

    /**
     * Configure CodeDeploy to deploy your application to one Availability Zone at a time within an
     * AWS Region.
     *
     * Default: - deploy your application to a random selection of hosts across a Region
     */
    override fun zonalConfig(): ZonalConfig? = unwrap(this).getZonalConfig()?.let(ZonalConfig::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ServerDeploymentConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.ServerDeploymentConfigProps):
        ServerDeploymentConfigProps = CdkObjectWrappers.wrap(cdkObject) as?
        ServerDeploymentConfigProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServerDeploymentConfigProps):
        software.amazon.awscdk.services.codedeploy.ServerDeploymentConfigProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codedeploy.ServerDeploymentConfigProps
  }
}
