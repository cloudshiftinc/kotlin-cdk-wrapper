package io.cloudshiftdev.awscdk.services.codedeploy

import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ServerDeploymentConfig internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codedeploy.ServerDeploymentConfig,
) : BaseDeploymentConfig(cdkObject), IServerDeploymentConfig {
  public interface Builder {
    public fun deploymentConfigName(deploymentConfigName: String)

    public fun minimumHealthyHosts(minimumHealthyHosts: MinimumHealthyHosts)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.ServerDeploymentConfig.Builder =
        software.amazon.awscdk.services.codedeploy.ServerDeploymentConfig.Builder.create(scope, id)

    override fun deploymentConfigName(deploymentConfigName: String) {
      cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    override fun minimumHealthyHosts(minimumHealthyHosts: MinimumHealthyHosts) {
      cdkBuilder.minimumHealthyHosts(minimumHealthyHosts.let(MinimumHealthyHosts::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.ServerDeploymentConfig =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromServerDeploymentConfigName(
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
        software.amazon.awscdk.services.codedeploy.ServerDeploymentConfig = wrapped.cdkObject
  }
}
