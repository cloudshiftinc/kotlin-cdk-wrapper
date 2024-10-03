@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A custom Deployment Configuration for an EC2/on-premise Deployment Group.
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
public open class ServerDeploymentConfig(
  cdkObject: software.amazon.awscdk.services.codedeploy.ServerDeploymentConfig,
) : BaseDeploymentConfig(cdkObject),
    IServerDeploymentConfig {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ServerDeploymentConfigProps,
  ) :
      this(software.amazon.awscdk.services.codedeploy.ServerDeploymentConfig(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(ServerDeploymentConfigProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ServerDeploymentConfigProps.Builder.() -> Unit,
  ) : this(scope, id, ServerDeploymentConfigProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codedeploy.ServerDeploymentConfig].
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
     * Minimum number of healthy hosts.
     *
     * @param minimumHealthyHosts Minimum number of healthy hosts. 
     */
    public fun minimumHealthyHosts(minimumHealthyHosts: MinimumHealthyHosts)

    /**
     * Configure CodeDeploy to deploy your application to one Availability Zone at a time within an
     * AWS Region.
     *
     * Default: - deploy your application to a random selection of hosts across a Region
     *
     * @param zonalConfig Configure CodeDeploy to deploy your application to one Availability Zone
     * at a time within an AWS Region. 
     */
    public fun zonalConfig(zonalConfig: ZonalConfig)

    /**
     * Configure CodeDeploy to deploy your application to one Availability Zone at a time within an
     * AWS Region.
     *
     * Default: - deploy your application to a random selection of hosts across a Region
     *
     * @param zonalConfig Configure CodeDeploy to deploy your application to one Availability Zone
     * at a time within an AWS Region. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3705e1ebbc3f8dae2c5941e11c4ec0aa14384b967b8548cf7b90bf02f9115f22")
    public fun zonalConfig(zonalConfig: ZonalConfig.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.ServerDeploymentConfig.Builder =
        software.amazon.awscdk.services.codedeploy.ServerDeploymentConfig.Builder.create(scope, id)

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
     * Minimum number of healthy hosts.
     *
     * @param minimumHealthyHosts Minimum number of healthy hosts. 
     */
    override fun minimumHealthyHosts(minimumHealthyHosts: MinimumHealthyHosts) {
      cdkBuilder.minimumHealthyHosts(minimumHealthyHosts.let(MinimumHealthyHosts.Companion::unwrap))
    }

    /**
     * Configure CodeDeploy to deploy your application to one Availability Zone at a time within an
     * AWS Region.
     *
     * Default: - deploy your application to a random selection of hosts across a Region
     *
     * @param zonalConfig Configure CodeDeploy to deploy your application to one Availability Zone
     * at a time within an AWS Region. 
     */
    override fun zonalConfig(zonalConfig: ZonalConfig) {
      cdkBuilder.zonalConfig(zonalConfig.let(ZonalConfig.Companion::unwrap))
    }

    /**
     * Configure CodeDeploy to deploy your application to one Availability Zone at a time within an
     * AWS Region.
     *
     * Default: - deploy your application to a random selection of hosts across a Region
     *
     * @param zonalConfig Configure CodeDeploy to deploy your application to one Availability Zone
     * at a time within an AWS Region. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3705e1ebbc3f8dae2c5941e11c4ec0aa14384b967b8548cf7b90bf02f9115f22")
    override fun zonalConfig(zonalConfig: ZonalConfig.Builder.() -> Unit): Unit =
        zonalConfig(ZonalConfig(zonalConfig))

    public fun build(): software.amazon.awscdk.services.codedeploy.ServerDeploymentConfig =
        cdkBuilder.build()
  }

  public companion object {
    public val ALL_AT_ONCE: IServerDeploymentConfig =
        IServerDeploymentConfig.wrap(software.amazon.awscdk.services.codedeploy.ServerDeploymentConfig.ALL_AT_ONCE)

    public val HALF_AT_A_TIME: IServerDeploymentConfig =
        IServerDeploymentConfig.wrap(software.amazon.awscdk.services.codedeploy.ServerDeploymentConfig.HALF_AT_A_TIME)

    public val ONE_AT_A_TIME: IServerDeploymentConfig =
        IServerDeploymentConfig.wrap(software.amazon.awscdk.services.codedeploy.ServerDeploymentConfig.ONE_AT_A_TIME)

    public fun fromServerDeploymentConfigName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      serverDeploymentConfigName: String,
    ): IServerDeploymentConfig =
        software.amazon.awscdk.services.codedeploy.ServerDeploymentConfig.fromServerDeploymentConfigName(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, serverDeploymentConfigName).let(IServerDeploymentConfig::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ServerDeploymentConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ServerDeploymentConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.ServerDeploymentConfig):
        ServerDeploymentConfig = ServerDeploymentConfig(cdkObject)

    internal fun unwrap(wrapped: ServerDeploymentConfig):
        software.amazon.awscdk.services.codedeploy.ServerDeploymentConfig = wrapped.cdkObject as
        software.amazon.awscdk.services.codedeploy.ServerDeploymentConfig
  }
}
