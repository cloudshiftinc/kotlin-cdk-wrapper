package io.cloudshiftdev.awscdk.services.codedeploy

import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class LambdaDeploymentConfig internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig,
) : BaseDeploymentConfig(cdkObject), ILambdaDeploymentConfig {
  public interface Builder {
    public fun deploymentConfigName(deploymentConfigName: String)

    public fun trafficRouting(trafficRouting: TrafficRouting)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig.Builder =
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig.Builder.create(scope, id)

    override fun deploymentConfigName(deploymentConfigName: String) {
      cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    override fun trafficRouting(trafficRouting: TrafficRouting) {
      cdkBuilder.trafficRouting(trafficRouting.let(TrafficRouting::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig =
        cdkBuilder.build()
  }

  public companion object {
    @Deprecated(message = "deprecated in CDK")
    public open fun doImport(
      _scope: CloudshiftdevConstructsConstruct,
      _id: String,
      props: LambdaDeploymentConfigImportProps,
    ): ILambdaDeploymentConfig =
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig.doImport(_scope.let(CloudshiftdevConstructsConstruct::unwrap),
        _id,
        props.let(LambdaDeploymentConfigImportProps::unwrap)).let(ILambdaDeploymentConfig::wrap)

    @Deprecated(message = "deprecated in CDK")
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fafbd60daf73a5800337fbe97f5b3805d8c2f09a126c3255cb4bcb3b42d78746")
    public open fun doImport(
      _scope: CloudshiftdevConstructsConstruct,
      _id: String,
      props: LambdaDeploymentConfigImportProps.Builder.() -> Unit,
    ): ILambdaDeploymentConfig = doImport(_scope, _id, LambdaDeploymentConfigImportProps(props))

    public open fun fromLambdaDeploymentConfigName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      lambdaDeploymentConfigName: String,
    ): ILambdaDeploymentConfig =
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig.fromLambdaDeploymentConfigName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, lambdaDeploymentConfigName).let(ILambdaDeploymentConfig::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): LambdaDeploymentConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return LambdaDeploymentConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig):
        LambdaDeploymentConfig = LambdaDeploymentConfig(cdkObject)

    internal fun unwrap(wrapped: LambdaDeploymentConfig):
        software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig = wrapped.cdkObject
  }
}
