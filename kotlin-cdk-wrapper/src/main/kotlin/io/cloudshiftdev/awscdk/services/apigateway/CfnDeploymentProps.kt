@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDeployment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * CfnDeploymentProps cfnDeploymentProps = CfnDeploymentProps.builder()
 * .restApiId("restApiId")
 * // the properties below are optional
 * .deploymentCanarySettings(DeploymentCanarySettingsProperty.builder()
 * .percentTraffic(123)
 * .stageVariableOverrides(Map.of(
 * "stageVariableOverridesKey", "stageVariableOverrides"))
 * .useStageCache(false)
 * .build())
 * .description("description")
 * .stageDescription(StageDescriptionProperty.builder()
 * .accessLogSetting(AccessLogSettingProperty.builder()
 * .destinationArn("destinationArn")
 * .format("format")
 * .build())
 * .cacheClusterEnabled(false)
 * .cacheClusterSize("cacheClusterSize")
 * .cacheDataEncrypted(false)
 * .cacheTtlInSeconds(123)
 * .cachingEnabled(false)
 * .canarySetting(CanarySettingProperty.builder()
 * .percentTraffic(123)
 * .stageVariableOverrides(Map.of(
 * "stageVariableOverridesKey", "stageVariableOverrides"))
 * .useStageCache(false)
 * .build())
 * .clientCertificateId("clientCertificateId")
 * .dataTraceEnabled(false)
 * .description("description")
 * .documentationVersion("documentationVersion")
 * .loggingLevel("loggingLevel")
 * .methodSettings(List.of(MethodSettingProperty.builder()
 * .cacheDataEncrypted(false)
 * .cacheTtlInSeconds(123)
 * .cachingEnabled(false)
 * .dataTraceEnabled(false)
 * .httpMethod("httpMethod")
 * .loggingLevel("loggingLevel")
 * .metricsEnabled(false)
 * .resourcePath("resourcePath")
 * .throttlingBurstLimit(123)
 * .throttlingRateLimit(123)
 * .build()))
 * .metricsEnabled(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .throttlingBurstLimit(123)
 * .throttlingRateLimit(123)
 * .tracingEnabled(false)
 * .variables(Map.of(
 * "variablesKey", "variables"))
 * .build())
 * .stageName("stageName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html)
 */
public interface CfnDeploymentProps {
  /**
   * The input configuration for a canary deployment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-deploymentcanarysettings)
   */
  public fun deploymentCanarySettings(): Any? = unwrap(this).getDeploymentCanarySettings()

  /**
   * The description for the Deployment resource to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The string identifier of the associated RestApi.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-restapiid)
   */
  public fun restApiId(): String

  /**
   * The description of the Stage resource for the Deployment resource to create.
   *
   * To specify a stage description, you must also provide a stage name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-stagedescription)
   */
  public fun stageDescription(): Any? = unwrap(this).getStageDescription()

  /**
   * The name of the Stage resource for the Deployment resource to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-stagename)
   */
  public fun stageName(): String? = unwrap(this).getStageName()

  /**
   * A builder for [CfnDeploymentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deploymentCanarySettings The input configuration for a canary deployment.
     */
    public fun deploymentCanarySettings(deploymentCanarySettings: IResolvable)

    /**
     * @param deploymentCanarySettings The input configuration for a canary deployment.
     */
    public
        fun deploymentCanarySettings(deploymentCanarySettings: CfnDeployment.DeploymentCanarySettingsProperty)

    /**
     * @param deploymentCanarySettings The input configuration for a canary deployment.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3013dc09b65a9f2e9eba5d102f1418a11ed0ef72d3b51c9e67d4918d966de43c")
    public
        fun deploymentCanarySettings(deploymentCanarySettings: CfnDeployment.DeploymentCanarySettingsProperty.Builder.() -> Unit)

    /**
     * @param description The description for the Deployment resource to create.
     */
    public fun description(description: String)

    /**
     * @param restApiId The string identifier of the associated RestApi. 
     */
    public fun restApiId(restApiId: String)

    /**
     * @param stageDescription The description of the Stage resource for the Deployment resource to
     * create.
     * To specify a stage description, you must also provide a stage name.
     */
    public fun stageDescription(stageDescription: IResolvable)

    /**
     * @param stageDescription The description of the Stage resource for the Deployment resource to
     * create.
     * To specify a stage description, you must also provide a stage name.
     */
    public fun stageDescription(stageDescription: CfnDeployment.StageDescriptionProperty)

    /**
     * @param stageDescription The description of the Stage resource for the Deployment resource to
     * create.
     * To specify a stage description, you must also provide a stage name.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb1d77af77ef0998ccfd71f1210bd11289acdd36fb0f32f319bdb1cc7786e4a9")
    public
        fun stageDescription(stageDescription: CfnDeployment.StageDescriptionProperty.Builder.() -> Unit)

    /**
     * @param stageName The name of the Stage resource for the Deployment resource to create.
     */
    public fun stageName(stageName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnDeploymentProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnDeploymentProps.builder()

    /**
     * @param deploymentCanarySettings The input configuration for a canary deployment.
     */
    override fun deploymentCanarySettings(deploymentCanarySettings: IResolvable) {
      cdkBuilder.deploymentCanarySettings(deploymentCanarySettings.let(IResolvable::unwrap))
    }

    /**
     * @param deploymentCanarySettings The input configuration for a canary deployment.
     */
    override
        fun deploymentCanarySettings(deploymentCanarySettings: CfnDeployment.DeploymentCanarySettingsProperty) {
      cdkBuilder.deploymentCanarySettings(deploymentCanarySettings.let(CfnDeployment.DeploymentCanarySettingsProperty::unwrap))
    }

    /**
     * @param deploymentCanarySettings The input configuration for a canary deployment.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3013dc09b65a9f2e9eba5d102f1418a11ed0ef72d3b51c9e67d4918d966de43c")
    override
        fun deploymentCanarySettings(deploymentCanarySettings: CfnDeployment.DeploymentCanarySettingsProperty.Builder.() -> Unit):
        Unit =
        deploymentCanarySettings(CfnDeployment.DeploymentCanarySettingsProperty(deploymentCanarySettings))

    /**
     * @param description The description for the Deployment resource to create.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param restApiId The string identifier of the associated RestApi. 
     */
    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    /**
     * @param stageDescription The description of the Stage resource for the Deployment resource to
     * create.
     * To specify a stage description, you must also provide a stage name.
     */
    override fun stageDescription(stageDescription: IResolvable) {
      cdkBuilder.stageDescription(stageDescription.let(IResolvable::unwrap))
    }

    /**
     * @param stageDescription The description of the Stage resource for the Deployment resource to
     * create.
     * To specify a stage description, you must also provide a stage name.
     */
    override fun stageDescription(stageDescription: CfnDeployment.StageDescriptionProperty) {
      cdkBuilder.stageDescription(stageDescription.let(CfnDeployment.StageDescriptionProperty::unwrap))
    }

    /**
     * @param stageDescription The description of the Stage resource for the Deployment resource to
     * create.
     * To specify a stage description, you must also provide a stage name.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb1d77af77ef0998ccfd71f1210bd11289acdd36fb0f32f319bdb1cc7786e4a9")
    override
        fun stageDescription(stageDescription: CfnDeployment.StageDescriptionProperty.Builder.() -> Unit):
        Unit = stageDescription(CfnDeployment.StageDescriptionProperty(stageDescription))

    /**
     * @param stageName The name of the Stage resource for the Deployment resource to create.
     */
    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnDeploymentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.CfnDeploymentProps,
  ) : CdkObject(cdkObject), CfnDeploymentProps {
    /**
     * The input configuration for a canary deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-deploymentcanarysettings)
     */
    override fun deploymentCanarySettings(): Any? = unwrap(this).getDeploymentCanarySettings()

    /**
     * The description for the Deployment resource to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-restapiid)
     */
    override fun restApiId(): String = unwrap(this).getRestApiId()

    /**
     * The description of the Stage resource for the Deployment resource to create.
     *
     * To specify a stage description, you must also provide a stage name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-stagedescription)
     */
    override fun stageDescription(): Any? = unwrap(this).getStageDescription()

    /**
     * The name of the Stage resource for the Deployment resource to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-stagename)
     */
    override fun stageName(): String? = unwrap(this).getStageName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeploymentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDeploymentProps):
        CfnDeploymentProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDeploymentProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeploymentProps):
        software.amazon.awscdk.services.apigateway.CfnDeploymentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.CfnDeploymentProps
  }
}
