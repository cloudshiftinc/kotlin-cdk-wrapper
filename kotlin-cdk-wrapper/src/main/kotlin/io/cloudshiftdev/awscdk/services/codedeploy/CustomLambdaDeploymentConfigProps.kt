@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CustomLambdaDeploymentConfigProps {
  @Deprecated(message = "deprecated in CDK")
  public fun deploymentConfigName(): String? = unwrap(this).getDeploymentConfigName()

  @Deprecated(message = "deprecated in CDK")
  public fun interval(): Duration

  @Deprecated(message = "deprecated in CDK")
  public fun percentage(): Number

  @Deprecated(message = "deprecated in CDK")
  public fun type(): CustomLambdaDeploymentConfigType

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

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigProps.Builder =
        software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigProps.builder()

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

    public fun build(): software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigProps,
  ) : CdkObject(cdkObject), CustomLambdaDeploymentConfigProps {
    @Deprecated(message = "deprecated in CDK")
    override fun deploymentConfigName(): String? = unwrap(this).getDeploymentConfigName()

    @Deprecated(message = "deprecated in CDK")
    override fun interval(): Duration = unwrap(this).getInterval().let(Duration::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun percentage(): Number = unwrap(this).getPercentage()

    @Deprecated(message = "deprecated in CDK")
    override fun type(): CustomLambdaDeploymentConfigType =
        unwrap(this).getType().let(CustomLambdaDeploymentConfigType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomLambdaDeploymentConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigProps):
        CustomLambdaDeploymentConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomLambdaDeploymentConfigProps):
        software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codedeploy.CustomLambdaDeploymentConfigProps
  }
}
