@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A custom Deployment Configuration for an EC2/on-premise Deployment Group.
 *
 * Example:
 *
 * ```
 * ServerDeploymentGroup deploymentGroup = ServerDeploymentGroup.Builder.create(this,
 * "CodeDeployDeploymentGroup")
 * .deploymentConfig(ServerDeploymentConfig.ALL_AT_ONCE)
 * .build();
 * ```
 */
public open class ServerDeploymentConfig(
  cdkObject: software.amazon.awscdk.services.codedeploy.ServerDeploymentConfig,
) : BaseDeploymentConfig(cdkObject), IServerDeploymentConfig {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ServerDeploymentConfigProps,
  ) :
      this(software.amazon.awscdk.services.codedeploy.ServerDeploymentConfig(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(ServerDeploymentConfigProps::unwrap))
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
      cdkBuilder.minimumHealthyHosts(minimumHealthyHosts.let(MinimumHealthyHosts::unwrap))
    }

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
        software.amazon.awscdk.services.codedeploy.ServerDeploymentConfig.fromServerDeploymentConfigName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
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
