package io.cloudshiftdev.awscdk.services.codedeploy

import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class EcsDeploymentConfig internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codedeploy.EcsDeploymentConfig,
) : BaseDeploymentConfig(cdkObject), IEcsDeploymentConfig {
  public interface Builder {
    public fun deploymentConfigName(deploymentConfigName: String) {
    }

    public fun trafficRouting(trafficRouting: TrafficRouting) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codedeploy.EcsDeploymentConfig.Builder =
        software.amazon.awscdk.services.codedeploy.EcsDeploymentConfig.Builder.create(scope, id)

    public override fun deploymentConfigName(deploymentConfigName: String) {
      cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    public override fun trafficRouting(trafficRouting: TrafficRouting) {
      cdkBuilder.trafficRouting(trafficRouting.let(TrafficRouting::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.EcsDeploymentConfig =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromEcsDeploymentConfigName(
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
