@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnDeploymentProps {
  public fun deploymentCanarySettings(): Any? = unwrap(this).getDeploymentCanarySettings()

  public fun description(): String? = unwrap(this).getDescription()

  public fun restApiId(): String

  public fun stageDescription(): Any? = unwrap(this).getStageDescription()

  public fun stageName(): String? = unwrap(this).getStageName()

  @CdkDslMarker
  public interface Builder {
    public fun deploymentCanarySettings(deploymentCanarySettings: IResolvable)

    public
        fun deploymentCanarySettings(deploymentCanarySettings: CfnDeployment.DeploymentCanarySettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3013dc09b65a9f2e9eba5d102f1418a11ed0ef72d3b51c9e67d4918d966de43c")
    public
        fun deploymentCanarySettings(deploymentCanarySettings: CfnDeployment.DeploymentCanarySettingsProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun restApiId(restApiId: String)

    public fun stageDescription(stageDescription: IResolvable)

    public fun stageDescription(stageDescription: CfnDeployment.StageDescriptionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb1d77af77ef0998ccfd71f1210bd11289acdd36fb0f32f319bdb1cc7786e4a9")
    public
        fun stageDescription(stageDescription: CfnDeployment.StageDescriptionProperty.Builder.() -> Unit)

    public fun stageName(stageName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnDeploymentProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnDeploymentProps.builder()

    override fun deploymentCanarySettings(deploymentCanarySettings: IResolvable) {
      cdkBuilder.deploymentCanarySettings(deploymentCanarySettings.let(IResolvable::unwrap))
    }

    override
        fun deploymentCanarySettings(deploymentCanarySettings: CfnDeployment.DeploymentCanarySettingsProperty) {
      cdkBuilder.deploymentCanarySettings(deploymentCanarySettings.let(CfnDeployment.DeploymentCanarySettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3013dc09b65a9f2e9eba5d102f1418a11ed0ef72d3b51c9e67d4918d966de43c")
    override
        fun deploymentCanarySettings(deploymentCanarySettings: CfnDeployment.DeploymentCanarySettingsProperty.Builder.() -> Unit):
        Unit =
        deploymentCanarySettings(CfnDeployment.DeploymentCanarySettingsProperty(deploymentCanarySettings))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    override fun stageDescription(stageDescription: IResolvable) {
      cdkBuilder.stageDescription(stageDescription.let(IResolvable::unwrap))
    }

    override fun stageDescription(stageDescription: CfnDeployment.StageDescriptionProperty) {
      cdkBuilder.stageDescription(stageDescription.let(CfnDeployment.StageDescriptionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb1d77af77ef0998ccfd71f1210bd11289acdd36fb0f32f319bdb1cc7786e4a9")
    override
        fun stageDescription(stageDescription: CfnDeployment.StageDescriptionProperty.Builder.() -> Unit):
        Unit = stageDescription(CfnDeployment.StageDescriptionProperty(stageDescription))

    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnDeploymentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.CfnDeploymentProps,
  ) : CdkObject(cdkObject), CfnDeploymentProps {
    override fun deploymentCanarySettings(): Any? = unwrap(this).getDeploymentCanarySettings()

    override fun description(): String? = unwrap(this).getDescription()

    override fun restApiId(): String = unwrap(this).getRestApiId()

    override fun stageDescription(): Any? = unwrap(this).getStageDescription()

    override fun stageName(): String? = unwrap(this).getStageName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeploymentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDeploymentProps):
        CfnDeploymentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeploymentProps):
        software.amazon.awscdk.services.apigateway.CfnDeploymentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.CfnDeploymentProps
  }
}
