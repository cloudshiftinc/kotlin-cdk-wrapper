@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CustomLambdaDeploymentConfig internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfig,
) : Resource(cdkObject), ILambdaDeploymentConfig {
  @Deprecated(message = "deprecated in CDK")
  public override fun deploymentConfigArn(): String = unwrap(this).getDeploymentConfigArn()

  @Deprecated(message = "deprecated in CDK")
  public override fun deploymentConfigName(): String = unwrap(this).getDeploymentConfigName()

  @CdkDslMarker
  @Deprecated(message = "deprecated in CDK")
  public interface Builder {
    @Deprecated(message = "deprecated in CDK")
    public fun deploymentConfigName(deploymentConfigName: String)

    @Deprecated(message = "deprecated in CDK")
    public fun interval(interval: Duration)

    @Deprecated(message = "deprecated in CDK")
    public fun percentage(percentage: Number)

    @Deprecated(message = "deprecated in CDK")
    public fun type(type: CustomLambdaDeploymentConfigType)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfig.Builder =
        software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfig.Builder.create(scope,
        id)

    @Deprecated(message = "deprecated in CDK")
    override fun deploymentConfigName(deploymentConfigName: String) {
      cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun interval(interval: Duration) {
      cdkBuilder.interval(interval.let(Duration::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun percentage(percentage: Number) {
      cdkBuilder.percentage(percentage)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun type(type: CustomLambdaDeploymentConfigType) {
      cdkBuilder.type(type.let(CustomLambdaDeploymentConfigType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfig =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CustomLambdaDeploymentConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CustomLambdaDeploymentConfig(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfig):
        CustomLambdaDeploymentConfig = CustomLambdaDeploymentConfig(cdkObject)

    internal fun unwrap(wrapped: CustomLambdaDeploymentConfig):
        software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfig = wrapped.cdkObject
  }
}
