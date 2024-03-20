@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::ApiGateway::Deployment` resource deploys an API Gateway `RestApi` resource to a stage
 * so that clients can call the API over the internet.
 *
 * The stage acts as an environment.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * CfnDeployment cfnDeployment = CfnDeployment.Builder.create(this, "MyCfnDeployment")
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
public open class CfnDeployment internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.CfnDeployment,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeploymentProps,
  ) :
      this(software.amazon.awscdk.services.apigateway.CfnDeployment(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnDeploymentProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeploymentProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDeploymentProps(props)
  )

  /**
   * The ID for the deployment.
   *
   * For example: `abc123` .
   */
  public open fun attrDeploymentId(): String = unwrap(this).getAttrDeploymentId()

  /**
   * The input configuration for a canary deployment.
   */
  public open fun deploymentCanarySettings(): Any? = unwrap(this).getDeploymentCanarySettings()

  /**
   * The input configuration for a canary deployment.
   */
  public open fun deploymentCanarySettings(`value`: IResolvable) {
    unwrap(this).setDeploymentCanarySettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * The input configuration for a canary deployment.
   */
  public open fun deploymentCanarySettings(`value`: DeploymentCanarySettingsProperty) {
    unwrap(this).setDeploymentCanarySettings(`value`.let(DeploymentCanarySettingsProperty::unwrap))
  }

  /**
   * The input configuration for a canary deployment.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9d366cb36b5ef986853d4804c23d44ce7bb106cf9af58824eda92be6e1ce71c4")
  public open
      fun deploymentCanarySettings(`value`: DeploymentCanarySettingsProperty.Builder.() -> Unit):
      Unit = deploymentCanarySettings(DeploymentCanarySettingsProperty(`value`))

  /**
   * The description for the Deployment resource to create.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description for the Deployment resource to create.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The string identifier of the associated RestApi.
   */
  public open fun restApiId(): String = unwrap(this).getRestApiId()

  /**
   * The string identifier of the associated RestApi.
   */
  public open fun restApiId(`value`: String) {
    unwrap(this).setRestApiId(`value`)
  }

  /**
   * The description of the Stage resource for the Deployment resource to create.
   */
  public open fun stageDescription(): Any? = unwrap(this).getStageDescription()

  /**
   * The description of the Stage resource for the Deployment resource to create.
   */
  public open fun stageDescription(`value`: IResolvable) {
    unwrap(this).setStageDescription(`value`.let(IResolvable::unwrap))
  }

  /**
   * The description of the Stage resource for the Deployment resource to create.
   */
  public open fun stageDescription(`value`: StageDescriptionProperty) {
    unwrap(this).setStageDescription(`value`.let(StageDescriptionProperty::unwrap))
  }

  /**
   * The description of the Stage resource for the Deployment resource to create.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("018a3947152cf04cd71ae0586b87d17750430e4e6379ebe4c2ca2384c653bb3a")
  public open fun stageDescription(`value`: StageDescriptionProperty.Builder.() -> Unit): Unit =
      stageDescription(StageDescriptionProperty(`value`))

  /**
   * The name of the Stage resource for the Deployment resource to create.
   */
  public open fun stageName(): String? = unwrap(this).getStageName()

  /**
   * The name of the Stage resource for the Deployment resource to create.
   */
  public open fun stageName(`value`: String) {
    unwrap(this).setStageName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.CfnDeployment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The input configuration for a canary deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-deploymentcanarysettings)
     * @param deploymentCanarySettings The input configuration for a canary deployment. 
     */
    public fun deploymentCanarySettings(deploymentCanarySettings: IResolvable)

    /**
     * The input configuration for a canary deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-deploymentcanarysettings)
     * @param deploymentCanarySettings The input configuration for a canary deployment. 
     */
    public fun deploymentCanarySettings(deploymentCanarySettings: DeploymentCanarySettingsProperty)

    /**
     * The input configuration for a canary deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-deploymentcanarysettings)
     * @param deploymentCanarySettings The input configuration for a canary deployment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21ca97cf0bfe9c1d1a8e979a091cf9b903730552a61247da8173598a65b875e7")
    public
        fun deploymentCanarySettings(deploymentCanarySettings: DeploymentCanarySettingsProperty.Builder.() -> Unit)

    /**
     * The description for the Deployment resource to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-description)
     * @param description The description for the Deployment resource to create. 
     */
    public fun description(description: String)

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-restapiid)
     * @param restApiId The string identifier of the associated RestApi. 
     */
    public fun restApiId(restApiId: String)

    /**
     * The description of the Stage resource for the Deployment resource to create.
     *
     * To specify a stage description, you must also provide a stage name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-stagedescription)
     * @param stageDescription The description of the Stage resource for the Deployment resource to
     * create. 
     */
    public fun stageDescription(stageDescription: IResolvable)

    /**
     * The description of the Stage resource for the Deployment resource to create.
     *
     * To specify a stage description, you must also provide a stage name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-stagedescription)
     * @param stageDescription The description of the Stage resource for the Deployment resource to
     * create. 
     */
    public fun stageDescription(stageDescription: StageDescriptionProperty)

    /**
     * The description of the Stage resource for the Deployment resource to create.
     *
     * To specify a stage description, you must also provide a stage name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-stagedescription)
     * @param stageDescription The description of the Stage resource for the Deployment resource to
     * create. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e7de6599aa5bbb04a85de443363a03d57d178779fe82e4ad4710eb5076fe1fd")
    public fun stageDescription(stageDescription: StageDescriptionProperty.Builder.() -> Unit)

    /**
     * The name of the Stage resource for the Deployment resource to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-stagename)
     * @param stageName The name of the Stage resource for the Deployment resource to create. 
     */
    public fun stageName(stageName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnDeployment.Builder =
        software.amazon.awscdk.services.apigateway.CfnDeployment.Builder.create(scope, id)

    /**
     * The input configuration for a canary deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-deploymentcanarysettings)
     * @param deploymentCanarySettings The input configuration for a canary deployment. 
     */
    override fun deploymentCanarySettings(deploymentCanarySettings: IResolvable) {
      cdkBuilder.deploymentCanarySettings(deploymentCanarySettings.let(IResolvable::unwrap))
    }

    /**
     * The input configuration for a canary deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-deploymentcanarysettings)
     * @param deploymentCanarySettings The input configuration for a canary deployment. 
     */
    override
        fun deploymentCanarySettings(deploymentCanarySettings: DeploymentCanarySettingsProperty) {
      cdkBuilder.deploymentCanarySettings(deploymentCanarySettings.let(DeploymentCanarySettingsProperty::unwrap))
    }

    /**
     * The input configuration for a canary deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-deploymentcanarysettings)
     * @param deploymentCanarySettings The input configuration for a canary deployment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21ca97cf0bfe9c1d1a8e979a091cf9b903730552a61247da8173598a65b875e7")
    override
        fun deploymentCanarySettings(deploymentCanarySettings: DeploymentCanarySettingsProperty.Builder.() -> Unit):
        Unit = deploymentCanarySettings(DeploymentCanarySettingsProperty(deploymentCanarySettings))

    /**
     * The description for the Deployment resource to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-description)
     * @param description The description for the Deployment resource to create. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-restapiid)
     * @param restApiId The string identifier of the associated RestApi. 
     */
    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    /**
     * The description of the Stage resource for the Deployment resource to create.
     *
     * To specify a stage description, you must also provide a stage name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-stagedescription)
     * @param stageDescription The description of the Stage resource for the Deployment resource to
     * create. 
     */
    override fun stageDescription(stageDescription: IResolvable) {
      cdkBuilder.stageDescription(stageDescription.let(IResolvable::unwrap))
    }

    /**
     * The description of the Stage resource for the Deployment resource to create.
     *
     * To specify a stage description, you must also provide a stage name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-stagedescription)
     * @param stageDescription The description of the Stage resource for the Deployment resource to
     * create. 
     */
    override fun stageDescription(stageDescription: StageDescriptionProperty) {
      cdkBuilder.stageDescription(stageDescription.let(StageDescriptionProperty::unwrap))
    }

    /**
     * The description of the Stage resource for the Deployment resource to create.
     *
     * To specify a stage description, you must also provide a stage name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-stagedescription)
     * @param stageDescription The description of the Stage resource for the Deployment resource to
     * create. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e7de6599aa5bbb04a85de443363a03d57d178779fe82e4ad4710eb5076fe1fd")
    override fun stageDescription(stageDescription: StageDescriptionProperty.Builder.() -> Unit):
        Unit = stageDescription(StageDescriptionProperty(stageDescription))

    /**
     * The name of the Stage resource for the Deployment resource to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-stagename)
     * @param stageName The name of the Stage resource for the Deployment resource to create. 
     */
    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnDeployment =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apigateway.CfnDeployment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDeployment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDeployment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDeployment):
        CfnDeployment = CfnDeployment(cdkObject)

    internal fun unwrap(wrapped: CfnDeployment):
        software.amazon.awscdk.services.apigateway.CfnDeployment = wrapped.cdkObject
  }

  /**
   * `StageDescription` is a property of the
   * [AWS::ApiGateway::Deployment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html)
   * resource that configures a deployment stage.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigateway.*;
   * StageDescriptionProperty stageDescriptionProperty = StageDescriptionProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html)
   */
  public interface StageDescriptionProperty {
    /**
     * Specifies settings for logging access in this stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-accesslogsetting)
     */
    public fun accessLogSetting(): Any? = unwrap(this).getAccessLogSetting()

    /**
     * Specifies whether a cache cluster is enabled for the stage.
     *
     * To activate a method-level cache, set `CachingEnabled` to `true` for a method.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cacheclusterenabled)
     */
    public fun cacheClusterEnabled(): Any? = unwrap(this).getCacheClusterEnabled()

    /**
     * The size of the stage's cache cluster.
     *
     * For more information, see
     * [cacheClusterSize](https://docs.aws.amazon.com/apigateway/latest/api/API_CreateStage.html#apigw-CreateStage-request-cacheClusterSize)
     * in the *API Gateway API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cacheclustersize)
     */
    public fun cacheClusterSize(): String? = unwrap(this).getCacheClusterSize()

    /**
     * Indicates whether the cached responses are encrypted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachedataencrypted)
     */
    public fun cacheDataEncrypted(): Any? = unwrap(this).getCacheDataEncrypted()

    /**
     * The time-to-live (TTL) period, in seconds, that specifies how long API Gateway caches
     * responses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachettlinseconds)
     */
    public fun cacheTtlInSeconds(): Number? = unwrap(this).getCacheTtlInSeconds()

    /**
     * Indicates whether responses are cached and returned for requests.
     *
     * You must enable a cache cluster on the stage to cache responses. For more information, see
     * [Enable API Gateway Caching in a Stage to Enhance API
     * Performance](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-caching.html)
     * in the *API Gateway Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachingenabled)
     */
    public fun cachingEnabled(): Any? = unwrap(this).getCachingEnabled()

    /**
     * Specifies settings for the canary deployment in this stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-canarysetting)
     */
    public fun canarySetting(): Any? = unwrap(this).getCanarySetting()

    /**
     * The identifier of the client certificate that API Gateway uses to call your integration
     * endpoints in the stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-clientcertificateid)
     */
    public fun clientCertificateId(): String? = unwrap(this).getClientCertificateId()

    /**
     * Indicates whether data trace logging is enabled for methods in the stage.
     *
     * API Gateway pushes these logs to Amazon CloudWatch Logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-datatraceenabled)
     */
    public fun dataTraceEnabled(): Any? = unwrap(this).getDataTraceEnabled()

    /**
     * A description of the purpose of the stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The version identifier of the API documentation snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-documentationversion)
     */
    public fun documentationVersion(): String? = unwrap(this).getDocumentationVersion()

    /**
     * The logging level for this method.
     *
     * For valid values, see the `loggingLevel` property of the
     * [MethodSetting](https://docs.aws.amazon.com/apigateway/latest/api/API_MethodSetting.html)
     * resource in the *Amazon API Gateway API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-logginglevel)
     */
    public fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

    /**
     * Configures settings for all of the stage's methods.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-methodsettings)
     */
    public fun methodSettings(): Any? = unwrap(this).getMethodSettings()

    /**
     * Indicates whether Amazon CloudWatch metrics are enabled for methods in the stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-metricsenabled)
     */
    public fun metricsEnabled(): Any? = unwrap(this).getMetricsEnabled()

    /**
     * An array of arbitrary tags (key-value pairs) to associate with the stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-tags)
     */
    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The target request burst rate limit.
     *
     * This allows more requests through for a period of time than the target rate limit. For more
     * information, see [Manage API Request
     * Throttling](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-request-throttling.html)
     * in the *API Gateway Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-throttlingburstlimit)
     */
    public fun throttlingBurstLimit(): Number? = unwrap(this).getThrottlingBurstLimit()

    /**
     * The target request steady-state rate limit.
     *
     * For more information, see [Manage API Request
     * Throttling](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-request-throttling.html)
     * in the *API Gateway Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-throttlingratelimit)
     */
    public fun throttlingRateLimit(): Number? = unwrap(this).getThrottlingRateLimit()

    /**
     * Specifies whether active tracing with X-ray is enabled for this stage.
     *
     * For more information, see [Trace API Gateway API Execution with AWS
     * X-Ray](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-xray.html) in the
     * *API Gateway Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-tracingenabled)
     */
    public fun tracingEnabled(): Any? = unwrap(this).getTracingEnabled()

    /**
     * A map that defines the stage variables.
     *
     * Variable names must consist of alphanumeric characters, and the values must match the
     * following regular expression: `[A-Za-z0-9-._~:/?#&amp;=,]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-variables)
     */
    public fun variables(): Any? = unwrap(this).getVariables()

    /**
     * A builder for [StageDescriptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessLogSetting Specifies settings for logging access in this stage.
       */
      public fun accessLogSetting(accessLogSetting: IResolvable)

      /**
       * @param accessLogSetting Specifies settings for logging access in this stage.
       */
      public fun accessLogSetting(accessLogSetting: AccessLogSettingProperty)

      /**
       * @param accessLogSetting Specifies settings for logging access in this stage.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("476e53c17a3b38067a9a4f0ebc1b0b130141d08358a93bf466e1945f63cf7472")
      public fun accessLogSetting(accessLogSetting: AccessLogSettingProperty.Builder.() -> Unit)

      /**
       * @param cacheClusterEnabled Specifies whether a cache cluster is enabled for the stage.
       * To activate a method-level cache, set `CachingEnabled` to `true` for a method.
       */
      public fun cacheClusterEnabled(cacheClusterEnabled: Boolean)

      /**
       * @param cacheClusterEnabled Specifies whether a cache cluster is enabled for the stage.
       * To activate a method-level cache, set `CachingEnabled` to `true` for a method.
       */
      public fun cacheClusterEnabled(cacheClusterEnabled: IResolvable)

      /**
       * @param cacheClusterSize The size of the stage's cache cluster.
       * For more information, see
       * [cacheClusterSize](https://docs.aws.amazon.com/apigateway/latest/api/API_CreateStage.html#apigw-CreateStage-request-cacheClusterSize)
       * in the *API Gateway API Reference* .
       */
      public fun cacheClusterSize(cacheClusterSize: String)

      /**
       * @param cacheDataEncrypted Indicates whether the cached responses are encrypted.
       */
      public fun cacheDataEncrypted(cacheDataEncrypted: Boolean)

      /**
       * @param cacheDataEncrypted Indicates whether the cached responses are encrypted.
       */
      public fun cacheDataEncrypted(cacheDataEncrypted: IResolvable)

      /**
       * @param cacheTtlInSeconds The time-to-live (TTL) period, in seconds, that specifies how long
       * API Gateway caches responses.
       */
      public fun cacheTtlInSeconds(cacheTtlInSeconds: Number)

      /**
       * @param cachingEnabled Indicates whether responses are cached and returned for requests.
       * You must enable a cache cluster on the stage to cache responses. For more information, see
       * [Enable API Gateway Caching in a Stage to Enhance API
       * Performance](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-caching.html)
       * in the *API Gateway Developer Guide* .
       */
      public fun cachingEnabled(cachingEnabled: Boolean)

      /**
       * @param cachingEnabled Indicates whether responses are cached and returned for requests.
       * You must enable a cache cluster on the stage to cache responses. For more information, see
       * [Enable API Gateway Caching in a Stage to Enhance API
       * Performance](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-caching.html)
       * in the *API Gateway Developer Guide* .
       */
      public fun cachingEnabled(cachingEnabled: IResolvable)

      /**
       * @param canarySetting Specifies settings for the canary deployment in this stage.
       */
      public fun canarySetting(canarySetting: IResolvable)

      /**
       * @param canarySetting Specifies settings for the canary deployment in this stage.
       */
      public fun canarySetting(canarySetting: CanarySettingProperty)

      /**
       * @param canarySetting Specifies settings for the canary deployment in this stage.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8948c21342fa6203010c93bd677f84e3fb2e90cc6c8fb095b4ad6010817b89f1")
      public fun canarySetting(canarySetting: CanarySettingProperty.Builder.() -> Unit)

      /**
       * @param clientCertificateId The identifier of the client certificate that API Gateway uses
       * to call your integration endpoints in the stage.
       */
      public fun clientCertificateId(clientCertificateId: String)

      /**
       * @param dataTraceEnabled Indicates whether data trace logging is enabled for methods in the
       * stage.
       * API Gateway pushes these logs to Amazon CloudWatch Logs.
       */
      public fun dataTraceEnabled(dataTraceEnabled: Boolean)

      /**
       * @param dataTraceEnabled Indicates whether data trace logging is enabled for methods in the
       * stage.
       * API Gateway pushes these logs to Amazon CloudWatch Logs.
       */
      public fun dataTraceEnabled(dataTraceEnabled: IResolvable)

      /**
       * @param description A description of the purpose of the stage.
       */
      public fun description(description: String)

      /**
       * @param documentationVersion The version identifier of the API documentation snapshot.
       */
      public fun documentationVersion(documentationVersion: String)

      /**
       * @param loggingLevel The logging level for this method.
       * For valid values, see the `loggingLevel` property of the
       * [MethodSetting](https://docs.aws.amazon.com/apigateway/latest/api/API_MethodSetting.html)
       * resource in the *Amazon API Gateway API Reference* .
       */
      public fun loggingLevel(loggingLevel: String)

      /**
       * @param methodSettings Configures settings for all of the stage's methods.
       */
      public fun methodSettings(methodSettings: IResolvable)

      /**
       * @param methodSettings Configures settings for all of the stage's methods.
       */
      public fun methodSettings(methodSettings: List<Any>)

      /**
       * @param methodSettings Configures settings for all of the stage's methods.
       */
      public fun methodSettings(vararg methodSettings: Any)

      /**
       * @param metricsEnabled Indicates whether Amazon CloudWatch metrics are enabled for methods
       * in the stage.
       */
      public fun metricsEnabled(metricsEnabled: Boolean)

      /**
       * @param metricsEnabled Indicates whether Amazon CloudWatch metrics are enabled for methods
       * in the stage.
       */
      public fun metricsEnabled(metricsEnabled: IResolvable)

      /**
       * @param tags An array of arbitrary tags (key-value pairs) to associate with the stage.
       */
      public fun tags(tags: List<CfnTag>)

      /**
       * @param tags An array of arbitrary tags (key-value pairs) to associate with the stage.
       */
      public fun tags(vararg tags: CfnTag)

      /**
       * @param throttlingBurstLimit The target request burst rate limit.
       * This allows more requests through for a period of time than the target rate limit. For more
       * information, see [Manage API Request
       * Throttling](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-request-throttling.html)
       * in the *API Gateway Developer Guide* .
       */
      public fun throttlingBurstLimit(throttlingBurstLimit: Number)

      /**
       * @param throttlingRateLimit The target request steady-state rate limit.
       * For more information, see [Manage API Request
       * Throttling](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-request-throttling.html)
       * in the *API Gateway Developer Guide* .
       */
      public fun throttlingRateLimit(throttlingRateLimit: Number)

      /**
       * @param tracingEnabled Specifies whether active tracing with X-ray is enabled for this
       * stage.
       * For more information, see [Trace API Gateway API Execution with AWS
       * X-Ray](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-xray.html) in
       * the *API Gateway Developer Guide* .
       */
      public fun tracingEnabled(tracingEnabled: Boolean)

      /**
       * @param tracingEnabled Specifies whether active tracing with X-ray is enabled for this
       * stage.
       * For more information, see [Trace API Gateway API Execution with AWS
       * X-Ray](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-xray.html) in
       * the *API Gateway Developer Guide* .
       */
      public fun tracingEnabled(tracingEnabled: IResolvable)

      /**
       * @param variables A map that defines the stage variables.
       * Variable names must consist of alphanumeric characters, and the values must match the
       * following regular expression: `[A-Za-z0-9-._~:/?#&amp;=,]+` .
       */
      public fun variables(variables: IResolvable)

      /**
       * @param variables A map that defines the stage variables.
       * Variable names must consist of alphanumeric characters, and the values must match the
       * following regular expression: `[A-Za-z0-9-._~:/?#&amp;=,]+` .
       */
      public fun variables(variables: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnDeployment.StageDescriptionProperty.Builder
          =
          software.amazon.awscdk.services.apigateway.CfnDeployment.StageDescriptionProperty.builder()

      /**
       * @param accessLogSetting Specifies settings for logging access in this stage.
       */
      override fun accessLogSetting(accessLogSetting: IResolvable) {
        cdkBuilder.accessLogSetting(accessLogSetting.let(IResolvable::unwrap))
      }

      /**
       * @param accessLogSetting Specifies settings for logging access in this stage.
       */
      override fun accessLogSetting(accessLogSetting: AccessLogSettingProperty) {
        cdkBuilder.accessLogSetting(accessLogSetting.let(AccessLogSettingProperty::unwrap))
      }

      /**
       * @param accessLogSetting Specifies settings for logging access in this stage.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("476e53c17a3b38067a9a4f0ebc1b0b130141d08358a93bf466e1945f63cf7472")
      override fun accessLogSetting(accessLogSetting: AccessLogSettingProperty.Builder.() -> Unit):
          Unit = accessLogSetting(AccessLogSettingProperty(accessLogSetting))

      /**
       * @param cacheClusterEnabled Specifies whether a cache cluster is enabled for the stage.
       * To activate a method-level cache, set `CachingEnabled` to `true` for a method.
       */
      override fun cacheClusterEnabled(cacheClusterEnabled: Boolean) {
        cdkBuilder.cacheClusterEnabled(cacheClusterEnabled)
      }

      /**
       * @param cacheClusterEnabled Specifies whether a cache cluster is enabled for the stage.
       * To activate a method-level cache, set `CachingEnabled` to `true` for a method.
       */
      override fun cacheClusterEnabled(cacheClusterEnabled: IResolvable) {
        cdkBuilder.cacheClusterEnabled(cacheClusterEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param cacheClusterSize The size of the stage's cache cluster.
       * For more information, see
       * [cacheClusterSize](https://docs.aws.amazon.com/apigateway/latest/api/API_CreateStage.html#apigw-CreateStage-request-cacheClusterSize)
       * in the *API Gateway API Reference* .
       */
      override fun cacheClusterSize(cacheClusterSize: String) {
        cdkBuilder.cacheClusterSize(cacheClusterSize)
      }

      /**
       * @param cacheDataEncrypted Indicates whether the cached responses are encrypted.
       */
      override fun cacheDataEncrypted(cacheDataEncrypted: Boolean) {
        cdkBuilder.cacheDataEncrypted(cacheDataEncrypted)
      }

      /**
       * @param cacheDataEncrypted Indicates whether the cached responses are encrypted.
       */
      override fun cacheDataEncrypted(cacheDataEncrypted: IResolvable) {
        cdkBuilder.cacheDataEncrypted(cacheDataEncrypted.let(IResolvable::unwrap))
      }

      /**
       * @param cacheTtlInSeconds The time-to-live (TTL) period, in seconds, that specifies how long
       * API Gateway caches responses.
       */
      override fun cacheTtlInSeconds(cacheTtlInSeconds: Number) {
        cdkBuilder.cacheTtlInSeconds(cacheTtlInSeconds)
      }

      /**
       * @param cachingEnabled Indicates whether responses are cached and returned for requests.
       * You must enable a cache cluster on the stage to cache responses. For more information, see
       * [Enable API Gateway Caching in a Stage to Enhance API
       * Performance](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-caching.html)
       * in the *API Gateway Developer Guide* .
       */
      override fun cachingEnabled(cachingEnabled: Boolean) {
        cdkBuilder.cachingEnabled(cachingEnabled)
      }

      /**
       * @param cachingEnabled Indicates whether responses are cached and returned for requests.
       * You must enable a cache cluster on the stage to cache responses. For more information, see
       * [Enable API Gateway Caching in a Stage to Enhance API
       * Performance](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-caching.html)
       * in the *API Gateway Developer Guide* .
       */
      override fun cachingEnabled(cachingEnabled: IResolvable) {
        cdkBuilder.cachingEnabled(cachingEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param canarySetting Specifies settings for the canary deployment in this stage.
       */
      override fun canarySetting(canarySetting: IResolvable) {
        cdkBuilder.canarySetting(canarySetting.let(IResolvable::unwrap))
      }

      /**
       * @param canarySetting Specifies settings for the canary deployment in this stage.
       */
      override fun canarySetting(canarySetting: CanarySettingProperty) {
        cdkBuilder.canarySetting(canarySetting.let(CanarySettingProperty::unwrap))
      }

      /**
       * @param canarySetting Specifies settings for the canary deployment in this stage.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8948c21342fa6203010c93bd677f84e3fb2e90cc6c8fb095b4ad6010817b89f1")
      override fun canarySetting(canarySetting: CanarySettingProperty.Builder.() -> Unit): Unit =
          canarySetting(CanarySettingProperty(canarySetting))

      /**
       * @param clientCertificateId The identifier of the client certificate that API Gateway uses
       * to call your integration endpoints in the stage.
       */
      override fun clientCertificateId(clientCertificateId: String) {
        cdkBuilder.clientCertificateId(clientCertificateId)
      }

      /**
       * @param dataTraceEnabled Indicates whether data trace logging is enabled for methods in the
       * stage.
       * API Gateway pushes these logs to Amazon CloudWatch Logs.
       */
      override fun dataTraceEnabled(dataTraceEnabled: Boolean) {
        cdkBuilder.dataTraceEnabled(dataTraceEnabled)
      }

      /**
       * @param dataTraceEnabled Indicates whether data trace logging is enabled for methods in the
       * stage.
       * API Gateway pushes these logs to Amazon CloudWatch Logs.
       */
      override fun dataTraceEnabled(dataTraceEnabled: IResolvable) {
        cdkBuilder.dataTraceEnabled(dataTraceEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param description A description of the purpose of the stage.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param documentationVersion The version identifier of the API documentation snapshot.
       */
      override fun documentationVersion(documentationVersion: String) {
        cdkBuilder.documentationVersion(documentationVersion)
      }

      /**
       * @param loggingLevel The logging level for this method.
       * For valid values, see the `loggingLevel` property of the
       * [MethodSetting](https://docs.aws.amazon.com/apigateway/latest/api/API_MethodSetting.html)
       * resource in the *Amazon API Gateway API Reference* .
       */
      override fun loggingLevel(loggingLevel: String) {
        cdkBuilder.loggingLevel(loggingLevel)
      }

      /**
       * @param methodSettings Configures settings for all of the stage's methods.
       */
      override fun methodSettings(methodSettings: IResolvable) {
        cdkBuilder.methodSettings(methodSettings.let(IResolvable::unwrap))
      }

      /**
       * @param methodSettings Configures settings for all of the stage's methods.
       */
      override fun methodSettings(methodSettings: List<Any>) {
        cdkBuilder.methodSettings(methodSettings)
      }

      /**
       * @param methodSettings Configures settings for all of the stage's methods.
       */
      override fun methodSettings(vararg methodSettings: Any): Unit =
          methodSettings(methodSettings.toList())

      /**
       * @param metricsEnabled Indicates whether Amazon CloudWatch metrics are enabled for methods
       * in the stage.
       */
      override fun metricsEnabled(metricsEnabled: Boolean) {
        cdkBuilder.metricsEnabled(metricsEnabled)
      }

      /**
       * @param metricsEnabled Indicates whether Amazon CloudWatch metrics are enabled for methods
       * in the stage.
       */
      override fun metricsEnabled(metricsEnabled: IResolvable) {
        cdkBuilder.metricsEnabled(metricsEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param tags An array of arbitrary tags (key-value pairs) to associate with the stage.
       */
      override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      /**
       * @param tags An array of arbitrary tags (key-value pairs) to associate with the stage.
       */
      override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

      /**
       * @param throttlingBurstLimit The target request burst rate limit.
       * This allows more requests through for a period of time than the target rate limit. For more
       * information, see [Manage API Request
       * Throttling](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-request-throttling.html)
       * in the *API Gateway Developer Guide* .
       */
      override fun throttlingBurstLimit(throttlingBurstLimit: Number) {
        cdkBuilder.throttlingBurstLimit(throttlingBurstLimit)
      }

      /**
       * @param throttlingRateLimit The target request steady-state rate limit.
       * For more information, see [Manage API Request
       * Throttling](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-request-throttling.html)
       * in the *API Gateway Developer Guide* .
       */
      override fun throttlingRateLimit(throttlingRateLimit: Number) {
        cdkBuilder.throttlingRateLimit(throttlingRateLimit)
      }

      /**
       * @param tracingEnabled Specifies whether active tracing with X-ray is enabled for this
       * stage.
       * For more information, see [Trace API Gateway API Execution with AWS
       * X-Ray](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-xray.html) in
       * the *API Gateway Developer Guide* .
       */
      override fun tracingEnabled(tracingEnabled: Boolean) {
        cdkBuilder.tracingEnabled(tracingEnabled)
      }

      /**
       * @param tracingEnabled Specifies whether active tracing with X-ray is enabled for this
       * stage.
       * For more information, see [Trace API Gateway API Execution with AWS
       * X-Ray](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-xray.html) in
       * the *API Gateway Developer Guide* .
       */
      override fun tracingEnabled(tracingEnabled: IResolvable) {
        cdkBuilder.tracingEnabled(tracingEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param variables A map that defines the stage variables.
       * Variable names must consist of alphanumeric characters, and the values must match the
       * following regular expression: `[A-Za-z0-9-._~:/?#&amp;=,]+` .
       */
      override fun variables(variables: IResolvable) {
        cdkBuilder.variables(variables.let(IResolvable::unwrap))
      }

      /**
       * @param variables A map that defines the stage variables.
       * Variable names must consist of alphanumeric characters, and the values must match the
       * following regular expression: `[A-Za-z0-9-._~:/?#&amp;=,]+` .
       */
      override fun variables(variables: Map<String, String>) {
        cdkBuilder.variables(variables)
      }

      public fun build():
          software.amazon.awscdk.services.apigateway.CfnDeployment.StageDescriptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnDeployment.StageDescriptionProperty,
    ) : CdkObject(cdkObject), StageDescriptionProperty {
      /**
       * Specifies settings for logging access in this stage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-accesslogsetting)
       */
      override fun accessLogSetting(): Any? = unwrap(this).getAccessLogSetting()

      /**
       * Specifies whether a cache cluster is enabled for the stage.
       *
       * To activate a method-level cache, set `CachingEnabled` to `true` for a method.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cacheclusterenabled)
       */
      override fun cacheClusterEnabled(): Any? = unwrap(this).getCacheClusterEnabled()

      /**
       * The size of the stage's cache cluster.
       *
       * For more information, see
       * [cacheClusterSize](https://docs.aws.amazon.com/apigateway/latest/api/API_CreateStage.html#apigw-CreateStage-request-cacheClusterSize)
       * in the *API Gateway API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cacheclustersize)
       */
      override fun cacheClusterSize(): String? = unwrap(this).getCacheClusterSize()

      /**
       * Indicates whether the cached responses are encrypted.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachedataencrypted)
       */
      override fun cacheDataEncrypted(): Any? = unwrap(this).getCacheDataEncrypted()

      /**
       * The time-to-live (TTL) period, in seconds, that specifies how long API Gateway caches
       * responses.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachettlinseconds)
       */
      override fun cacheTtlInSeconds(): Number? = unwrap(this).getCacheTtlInSeconds()

      /**
       * Indicates whether responses are cached and returned for requests.
       *
       * You must enable a cache cluster on the stage to cache responses. For more information, see
       * [Enable API Gateway Caching in a Stage to Enhance API
       * Performance](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-caching.html)
       * in the *API Gateway Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-cachingenabled)
       */
      override fun cachingEnabled(): Any? = unwrap(this).getCachingEnabled()

      /**
       * Specifies settings for the canary deployment in this stage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-canarysetting)
       */
      override fun canarySetting(): Any? = unwrap(this).getCanarySetting()

      /**
       * The identifier of the client certificate that API Gateway uses to call your integration
       * endpoints in the stage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-clientcertificateid)
       */
      override fun clientCertificateId(): String? = unwrap(this).getClientCertificateId()

      /**
       * Indicates whether data trace logging is enabled for methods in the stage.
       *
       * API Gateway pushes these logs to Amazon CloudWatch Logs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-datatraceenabled)
       */
      override fun dataTraceEnabled(): Any? = unwrap(this).getDataTraceEnabled()

      /**
       * A description of the purpose of the stage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The version identifier of the API documentation snapshot.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-documentationversion)
       */
      override fun documentationVersion(): String? = unwrap(this).getDocumentationVersion()

      /**
       * The logging level for this method.
       *
       * For valid values, see the `loggingLevel` property of the
       * [MethodSetting](https://docs.aws.amazon.com/apigateway/latest/api/API_MethodSetting.html)
       * resource in the *Amazon API Gateway API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-logginglevel)
       */
      override fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

      /**
       * Configures settings for all of the stage's methods.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-methodsettings)
       */
      override fun methodSettings(): Any? = unwrap(this).getMethodSettings()

      /**
       * Indicates whether Amazon CloudWatch metrics are enabled for methods in the stage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-metricsenabled)
       */
      override fun metricsEnabled(): Any? = unwrap(this).getMetricsEnabled()

      /**
       * An array of arbitrary tags (key-value pairs) to associate with the stage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-tags)
       */
      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

      /**
       * The target request burst rate limit.
       *
       * This allows more requests through for a period of time than the target rate limit. For more
       * information, see [Manage API Request
       * Throttling](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-request-throttling.html)
       * in the *API Gateway Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-throttlingburstlimit)
       */
      override fun throttlingBurstLimit(): Number? = unwrap(this).getThrottlingBurstLimit()

      /**
       * The target request steady-state rate limit.
       *
       * For more information, see [Manage API Request
       * Throttling](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-request-throttling.html)
       * in the *API Gateway Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-throttlingratelimit)
       */
      override fun throttlingRateLimit(): Number? = unwrap(this).getThrottlingRateLimit()

      /**
       * Specifies whether active tracing with X-ray is enabled for this stage.
       *
       * For more information, see [Trace API Gateway API Execution with AWS
       * X-Ray](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-xray.html) in
       * the *API Gateway Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-tracingenabled)
       */
      override fun tracingEnabled(): Any? = unwrap(this).getTracingEnabled()

      /**
       * A map that defines the stage variables.
       *
       * Variable names must consist of alphanumeric characters, and the values must match the
       * following regular expression: `[A-Za-z0-9-._~:/?#&amp;=,]+` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html#cfn-apigateway-deployment-stagedescription-variables)
       */
      override fun variables(): Any? = unwrap(this).getVariables()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StageDescriptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDeployment.StageDescriptionProperty):
          StageDescriptionProperty = CdkObjectWrappers.wrap(cdkObject) as? StageDescriptionProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StageDescriptionProperty):
          software.amazon.awscdk.services.apigateway.CfnDeployment.StageDescriptionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigateway.CfnDeployment.StageDescriptionProperty
    }
  }

  /**
   * The `DeploymentCanarySettings` property type specifies settings for the canary deployment.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigateway.*;
   * DeploymentCanarySettingsProperty deploymentCanarySettingsProperty =
   * DeploymentCanarySettingsProperty.builder()
   * .percentTraffic(123)
   * .stageVariableOverrides(Map.of(
   * "stageVariableOverridesKey", "stageVariableOverrides"))
   * .useStageCache(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-deploymentcanarysettings.html)
   */
  public interface DeploymentCanarySettingsProperty {
    /**
     * The percentage (0.0-100.0) of traffic routed to the canary deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-deploymentcanarysettings.html#cfn-apigateway-deployment-deploymentcanarysettings-percenttraffic)
     */
    public fun percentTraffic(): Number? = unwrap(this).getPercentTraffic()

    /**
     * A stage variable overrides used for the canary release deployment.
     *
     * They can override existing stage variables or add new stage variables for the canary release
     * deployment. These stage variables are represented as a string-to-string map between stage
     * variable names and their values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-deploymentcanarysettings.html#cfn-apigateway-deployment-deploymentcanarysettings-stagevariableoverrides)
     */
    public fun stageVariableOverrides(): Any? = unwrap(this).getStageVariableOverrides()

    /**
     * A Boolean flag to indicate whether the canary release deployment uses the stage cache or not.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-deploymentcanarysettings.html#cfn-apigateway-deployment-deploymentcanarysettings-usestagecache)
     */
    public fun useStageCache(): Any? = unwrap(this).getUseStageCache()

    /**
     * A builder for [DeploymentCanarySettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param percentTraffic The percentage (0.0-100.0) of traffic routed to the canary
       * deployment.
       */
      public fun percentTraffic(percentTraffic: Number)

      /**
       * @param stageVariableOverrides A stage variable overrides used for the canary release
       * deployment.
       * They can override existing stage variables or add new stage variables for the canary
       * release deployment. These stage variables are represented as a string-to-string map between
       * stage variable names and their values.
       */
      public fun stageVariableOverrides(stageVariableOverrides: IResolvable)

      /**
       * @param stageVariableOverrides A stage variable overrides used for the canary release
       * deployment.
       * They can override existing stage variables or add new stage variables for the canary
       * release deployment. These stage variables are represented as a string-to-string map between
       * stage variable names and their values.
       */
      public fun stageVariableOverrides(stageVariableOverrides: Map<String, String>)

      /**
       * @param useStageCache A Boolean flag to indicate whether the canary release deployment uses
       * the stage cache or not.
       */
      public fun useStageCache(useStageCache: Boolean)

      /**
       * @param useStageCache A Boolean flag to indicate whether the canary release deployment uses
       * the stage cache or not.
       */
      public fun useStageCache(useStageCache: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnDeployment.DeploymentCanarySettingsProperty.Builder
          =
          software.amazon.awscdk.services.apigateway.CfnDeployment.DeploymentCanarySettingsProperty.builder()

      /**
       * @param percentTraffic The percentage (0.0-100.0) of traffic routed to the canary
       * deployment.
       */
      override fun percentTraffic(percentTraffic: Number) {
        cdkBuilder.percentTraffic(percentTraffic)
      }

      /**
       * @param stageVariableOverrides A stage variable overrides used for the canary release
       * deployment.
       * They can override existing stage variables or add new stage variables for the canary
       * release deployment. These stage variables are represented as a string-to-string map between
       * stage variable names and their values.
       */
      override fun stageVariableOverrides(stageVariableOverrides: IResolvable) {
        cdkBuilder.stageVariableOverrides(stageVariableOverrides.let(IResolvable::unwrap))
      }

      /**
       * @param stageVariableOverrides A stage variable overrides used for the canary release
       * deployment.
       * They can override existing stage variables or add new stage variables for the canary
       * release deployment. These stage variables are represented as a string-to-string map between
       * stage variable names and their values.
       */
      override fun stageVariableOverrides(stageVariableOverrides: Map<String, String>) {
        cdkBuilder.stageVariableOverrides(stageVariableOverrides)
      }

      /**
       * @param useStageCache A Boolean flag to indicate whether the canary release deployment uses
       * the stage cache or not.
       */
      override fun useStageCache(useStageCache: Boolean) {
        cdkBuilder.useStageCache(useStageCache)
      }

      /**
       * @param useStageCache A Boolean flag to indicate whether the canary release deployment uses
       * the stage cache or not.
       */
      override fun useStageCache(useStageCache: IResolvable) {
        cdkBuilder.useStageCache(useStageCache.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.apigateway.CfnDeployment.DeploymentCanarySettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnDeployment.DeploymentCanarySettingsProperty,
    ) : CdkObject(cdkObject), DeploymentCanarySettingsProperty {
      /**
       * The percentage (0.0-100.0) of traffic routed to the canary deployment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-deploymentcanarysettings.html#cfn-apigateway-deployment-deploymentcanarysettings-percenttraffic)
       */
      override fun percentTraffic(): Number? = unwrap(this).getPercentTraffic()

      /**
       * A stage variable overrides used for the canary release deployment.
       *
       * They can override existing stage variables or add new stage variables for the canary
       * release deployment. These stage variables are represented as a string-to-string map between
       * stage variable names and their values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-deploymentcanarysettings.html#cfn-apigateway-deployment-deploymentcanarysettings-stagevariableoverrides)
       */
      override fun stageVariableOverrides(): Any? = unwrap(this).getStageVariableOverrides()

      /**
       * A Boolean flag to indicate whether the canary release deployment uses the stage cache or
       * not.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-deploymentcanarysettings.html#cfn-apigateway-deployment-deploymentcanarysettings-usestagecache)
       */
      override fun useStageCache(): Any? = unwrap(this).getUseStageCache()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentCanarySettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDeployment.DeploymentCanarySettingsProperty):
          DeploymentCanarySettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DeploymentCanarySettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentCanarySettingsProperty):
          software.amazon.awscdk.services.apigateway.CfnDeployment.DeploymentCanarySettingsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigateway.CfnDeployment.DeploymentCanarySettingsProperty
    }
  }

  /**
   * The `AccessLogSetting` property type specifies settings for logging access in this stage.
   *
   * `AccessLogSetting` is a property of the
   * [StageDescription](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigateway.*;
   * AccessLogSettingProperty accessLogSettingProperty = AccessLogSettingProperty.builder()
   * .destinationArn("destinationArn")
   * .format("format")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-accesslogsetting.html)
   */
  public interface AccessLogSettingProperty {
    /**
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or Kinesis Data Firehose
     * delivery stream to receive access logs.
     *
     * If you specify a Kinesis Data Firehose delivery stream, the stream name must begin with
     * `amazon-apigateway-` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-accesslogsetting.html#cfn-apigateway-deployment-accesslogsetting-destinationarn)
     */
    public fun destinationArn(): String? = unwrap(this).getDestinationArn()

    /**
     * A single line format of the access logs of data, as specified by selected $context variables.
     *
     * The format must include at least `$context.requestId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-accesslogsetting.html#cfn-apigateway-deployment-accesslogsetting-format)
     */
    public fun format(): String? = unwrap(this).getFormat()

    /**
     * A builder for [AccessLogSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destinationArn The Amazon Resource Name (ARN) of the CloudWatch Logs log group or
       * Kinesis Data Firehose delivery stream to receive access logs.
       * If you specify a Kinesis Data Firehose delivery stream, the stream name must begin with
       * `amazon-apigateway-` .
       */
      public fun destinationArn(destinationArn: String)

      /**
       * @param format A single line format of the access logs of data, as specified by selected
       * $context variables.
       * The format must include at least `$context.requestId` .
       */
      public fun format(format: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnDeployment.AccessLogSettingProperty.Builder
          =
          software.amazon.awscdk.services.apigateway.CfnDeployment.AccessLogSettingProperty.builder()

      /**
       * @param destinationArn The Amazon Resource Name (ARN) of the CloudWatch Logs log group or
       * Kinesis Data Firehose delivery stream to receive access logs.
       * If you specify a Kinesis Data Firehose delivery stream, the stream name must begin with
       * `amazon-apigateway-` .
       */
      override fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
      }

      /**
       * @param format A single line format of the access logs of data, as specified by selected
       * $context variables.
       * The format must include at least `$context.requestId` .
       */
      override fun format(format: String) {
        cdkBuilder.format(format)
      }

      public fun build():
          software.amazon.awscdk.services.apigateway.CfnDeployment.AccessLogSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnDeployment.AccessLogSettingProperty,
    ) : CdkObject(cdkObject), AccessLogSettingProperty {
      /**
       * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or Kinesis Data Firehose
       * delivery stream to receive access logs.
       *
       * If you specify a Kinesis Data Firehose delivery stream, the stream name must begin with
       * `amazon-apigateway-` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-accesslogsetting.html#cfn-apigateway-deployment-accesslogsetting-destinationarn)
       */
      override fun destinationArn(): String? = unwrap(this).getDestinationArn()

      /**
       * A single line format of the access logs of data, as specified by selected $context
       * variables.
       *
       * The format must include at least `$context.requestId` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-accesslogsetting.html#cfn-apigateway-deployment-accesslogsetting-format)
       */
      override fun format(): String? = unwrap(this).getFormat()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccessLogSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDeployment.AccessLogSettingProperty):
          AccessLogSettingProperty = CdkObjectWrappers.wrap(cdkObject) as? AccessLogSettingProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessLogSettingProperty):
          software.amazon.awscdk.services.apigateway.CfnDeployment.AccessLogSettingProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigateway.CfnDeployment.AccessLogSettingProperty
    }
  }

  /**
   * The `MethodSetting` property type configures settings for all methods in a stage.
   *
   * The `MethodSettings` property of the [Amazon API Gateway Deployment
   * StageDescription](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html)
   * property type contains a list of `MethodSetting` property types.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigateway.*;
   * MethodSettingProperty methodSettingProperty = MethodSettingProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-methodsetting.html)
   */
  public interface MethodSettingProperty {
    /**
     * Specifies whether the cached responses are encrypted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-methodsetting.html#cfn-apigateway-deployment-methodsetting-cachedataencrypted)
     */
    public fun cacheDataEncrypted(): Any? = unwrap(this).getCacheDataEncrypted()

    /**
     * Specifies the time to live (TTL), in seconds, for cached responses.
     *
     * The higher the TTL, the longer the response will be cached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-methodsetting.html#cfn-apigateway-deployment-methodsetting-cachettlinseconds)
     */
    public fun cacheTtlInSeconds(): Number? = unwrap(this).getCacheTtlInSeconds()

    /**
     * Specifies whether responses should be cached and returned for requests.
     *
     * A cache cluster must be enabled on the stage for responses to be cached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-methodsetting.html#cfn-apigateway-deployment-methodsetting-cachingenabled)
     */
    public fun cachingEnabled(): Any? = unwrap(this).getCachingEnabled()

    /**
     * Specifies whether data trace logging is enabled for this method, which affects the log
     * entries pushed to Amazon CloudWatch Logs.
     *
     * This can be useful to troubleshoot APIs, but can result in logging sensitive data. We
     * recommend that you don't enable this option for production APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-methodsetting.html#cfn-apigateway-deployment-methodsetting-datatraceenabled)
     */
    public fun dataTraceEnabled(): Any? = unwrap(this).getDataTraceEnabled()

    /**
     * The HTTP method.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-methodsetting.html#cfn-apigateway-deployment-methodsetting-httpmethod)
     */
    public fun httpMethod(): String? = unwrap(this).getHttpMethod()

    /**
     * Specifies the logging level for this method, which affects the log entries pushed to Amazon
     * CloudWatch Logs.
     *
     * Valid values are `OFF` , `ERROR` , and `INFO` . Choose `ERROR` to write only error-level
     * entries to CloudWatch Logs, or choose `INFO` to include all `ERROR` events as well as extra
     * informational events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-methodsetting.html#cfn-apigateway-deployment-methodsetting-logginglevel)
     */
    public fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

    /**
     * Specifies whether Amazon CloudWatch metrics are enabled for this method.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-methodsetting.html#cfn-apigateway-deployment-methodsetting-metricsenabled)
     */
    public fun metricsEnabled(): Any? = unwrap(this).getMetricsEnabled()

    /**
     * The resource path for this method.
     *
     * Forward slashes ( `/` ) are encoded as `~1` and the initial slash must include a forward
     * slash. For example, the path value `/resource/subresource` must be encoded as
     * `/~1resource~1subresource` . To specify the root path, use only a slash ( `/` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-methodsetting.html#cfn-apigateway-deployment-methodsetting-resourcepath)
     */
    public fun resourcePath(): String? = unwrap(this).getResourcePath()

    /**
     * Specifies the throttling burst limit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-methodsetting.html#cfn-apigateway-deployment-methodsetting-throttlingburstlimit)
     */
    public fun throttlingBurstLimit(): Number? = unwrap(this).getThrottlingBurstLimit()

    /**
     * Specifies the throttling rate limit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-methodsetting.html#cfn-apigateway-deployment-methodsetting-throttlingratelimit)
     */
    public fun throttlingRateLimit(): Number? = unwrap(this).getThrottlingRateLimit()

    /**
     * A builder for [MethodSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cacheDataEncrypted Specifies whether the cached responses are encrypted.
       */
      public fun cacheDataEncrypted(cacheDataEncrypted: Boolean)

      /**
       * @param cacheDataEncrypted Specifies whether the cached responses are encrypted.
       */
      public fun cacheDataEncrypted(cacheDataEncrypted: IResolvable)

      /**
       * @param cacheTtlInSeconds Specifies the time to live (TTL), in seconds, for cached
       * responses.
       * The higher the TTL, the longer the response will be cached.
       */
      public fun cacheTtlInSeconds(cacheTtlInSeconds: Number)

      /**
       * @param cachingEnabled Specifies whether responses should be cached and returned for
       * requests.
       * A cache cluster must be enabled on the stage for responses to be cached.
       */
      public fun cachingEnabled(cachingEnabled: Boolean)

      /**
       * @param cachingEnabled Specifies whether responses should be cached and returned for
       * requests.
       * A cache cluster must be enabled on the stage for responses to be cached.
       */
      public fun cachingEnabled(cachingEnabled: IResolvable)

      /**
       * @param dataTraceEnabled Specifies whether data trace logging is enabled for this method,
       * which affects the log entries pushed to Amazon CloudWatch Logs.
       * This can be useful to troubleshoot APIs, but can result in logging sensitive data. We
       * recommend that you don't enable this option for production APIs.
       */
      public fun dataTraceEnabled(dataTraceEnabled: Boolean)

      /**
       * @param dataTraceEnabled Specifies whether data trace logging is enabled for this method,
       * which affects the log entries pushed to Amazon CloudWatch Logs.
       * This can be useful to troubleshoot APIs, but can result in logging sensitive data. We
       * recommend that you don't enable this option for production APIs.
       */
      public fun dataTraceEnabled(dataTraceEnabled: IResolvable)

      /**
       * @param httpMethod The HTTP method.
       */
      public fun httpMethod(httpMethod: String)

      /**
       * @param loggingLevel Specifies the logging level for this method, which affects the log
       * entries pushed to Amazon CloudWatch Logs.
       * Valid values are `OFF` , `ERROR` , and `INFO` . Choose `ERROR` to write only error-level
       * entries to CloudWatch Logs, or choose `INFO` to include all `ERROR` events as well as extra
       * informational events.
       */
      public fun loggingLevel(loggingLevel: String)

      /**
       * @param metricsEnabled Specifies whether Amazon CloudWatch metrics are enabled for this
       * method.
       */
      public fun metricsEnabled(metricsEnabled: Boolean)

      /**
       * @param metricsEnabled Specifies whether Amazon CloudWatch metrics are enabled for this
       * method.
       */
      public fun metricsEnabled(metricsEnabled: IResolvable)

      /**
       * @param resourcePath The resource path for this method.
       * Forward slashes ( `/` ) are encoded as `~1` and the initial slash must include a forward
       * slash. For example, the path value `/resource/subresource` must be encoded as
       * `/~1resource~1subresource` . To specify the root path, use only a slash ( `/` ).
       */
      public fun resourcePath(resourcePath: String)

      /**
       * @param throttlingBurstLimit Specifies the throttling burst limit.
       */
      public fun throttlingBurstLimit(throttlingBurstLimit: Number)

      /**
       * @param throttlingRateLimit Specifies the throttling rate limit.
       */
      public fun throttlingRateLimit(throttlingRateLimit: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnDeployment.MethodSettingProperty.Builder =
          software.amazon.awscdk.services.apigateway.CfnDeployment.MethodSettingProperty.builder()

      /**
       * @param cacheDataEncrypted Specifies whether the cached responses are encrypted.
       */
      override fun cacheDataEncrypted(cacheDataEncrypted: Boolean) {
        cdkBuilder.cacheDataEncrypted(cacheDataEncrypted)
      }

      /**
       * @param cacheDataEncrypted Specifies whether the cached responses are encrypted.
       */
      override fun cacheDataEncrypted(cacheDataEncrypted: IResolvable) {
        cdkBuilder.cacheDataEncrypted(cacheDataEncrypted.let(IResolvable::unwrap))
      }

      /**
       * @param cacheTtlInSeconds Specifies the time to live (TTL), in seconds, for cached
       * responses.
       * The higher the TTL, the longer the response will be cached.
       */
      override fun cacheTtlInSeconds(cacheTtlInSeconds: Number) {
        cdkBuilder.cacheTtlInSeconds(cacheTtlInSeconds)
      }

      /**
       * @param cachingEnabled Specifies whether responses should be cached and returned for
       * requests.
       * A cache cluster must be enabled on the stage for responses to be cached.
       */
      override fun cachingEnabled(cachingEnabled: Boolean) {
        cdkBuilder.cachingEnabled(cachingEnabled)
      }

      /**
       * @param cachingEnabled Specifies whether responses should be cached and returned for
       * requests.
       * A cache cluster must be enabled on the stage for responses to be cached.
       */
      override fun cachingEnabled(cachingEnabled: IResolvable) {
        cdkBuilder.cachingEnabled(cachingEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param dataTraceEnabled Specifies whether data trace logging is enabled for this method,
       * which affects the log entries pushed to Amazon CloudWatch Logs.
       * This can be useful to troubleshoot APIs, but can result in logging sensitive data. We
       * recommend that you don't enable this option for production APIs.
       */
      override fun dataTraceEnabled(dataTraceEnabled: Boolean) {
        cdkBuilder.dataTraceEnabled(dataTraceEnabled)
      }

      /**
       * @param dataTraceEnabled Specifies whether data trace logging is enabled for this method,
       * which affects the log entries pushed to Amazon CloudWatch Logs.
       * This can be useful to troubleshoot APIs, but can result in logging sensitive data. We
       * recommend that you don't enable this option for production APIs.
       */
      override fun dataTraceEnabled(dataTraceEnabled: IResolvable) {
        cdkBuilder.dataTraceEnabled(dataTraceEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param httpMethod The HTTP method.
       */
      override fun httpMethod(httpMethod: String) {
        cdkBuilder.httpMethod(httpMethod)
      }

      /**
       * @param loggingLevel Specifies the logging level for this method, which affects the log
       * entries pushed to Amazon CloudWatch Logs.
       * Valid values are `OFF` , `ERROR` , and `INFO` . Choose `ERROR` to write only error-level
       * entries to CloudWatch Logs, or choose `INFO` to include all `ERROR` events as well as extra
       * informational events.
       */
      override fun loggingLevel(loggingLevel: String) {
        cdkBuilder.loggingLevel(loggingLevel)
      }

      /**
       * @param metricsEnabled Specifies whether Amazon CloudWatch metrics are enabled for this
       * method.
       */
      override fun metricsEnabled(metricsEnabled: Boolean) {
        cdkBuilder.metricsEnabled(metricsEnabled)
      }

      /**
       * @param metricsEnabled Specifies whether Amazon CloudWatch metrics are enabled for this
       * method.
       */
      override fun metricsEnabled(metricsEnabled: IResolvable) {
        cdkBuilder.metricsEnabled(metricsEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param resourcePath The resource path for this method.
       * Forward slashes ( `/` ) are encoded as `~1` and the initial slash must include a forward
       * slash. For example, the path value `/resource/subresource` must be encoded as
       * `/~1resource~1subresource` . To specify the root path, use only a slash ( `/` ).
       */
      override fun resourcePath(resourcePath: String) {
        cdkBuilder.resourcePath(resourcePath)
      }

      /**
       * @param throttlingBurstLimit Specifies the throttling burst limit.
       */
      override fun throttlingBurstLimit(throttlingBurstLimit: Number) {
        cdkBuilder.throttlingBurstLimit(throttlingBurstLimit)
      }

      /**
       * @param throttlingRateLimit Specifies the throttling rate limit.
       */
      override fun throttlingRateLimit(throttlingRateLimit: Number) {
        cdkBuilder.throttlingRateLimit(throttlingRateLimit)
      }

      public fun build():
          software.amazon.awscdk.services.apigateway.CfnDeployment.MethodSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnDeployment.MethodSettingProperty,
    ) : CdkObject(cdkObject), MethodSettingProperty {
      /**
       * Specifies whether the cached responses are encrypted.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-methodsetting.html#cfn-apigateway-deployment-methodsetting-cachedataencrypted)
       */
      override fun cacheDataEncrypted(): Any? = unwrap(this).getCacheDataEncrypted()

      /**
       * Specifies the time to live (TTL), in seconds, for cached responses.
       *
       * The higher the TTL, the longer the response will be cached.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-methodsetting.html#cfn-apigateway-deployment-methodsetting-cachettlinseconds)
       */
      override fun cacheTtlInSeconds(): Number? = unwrap(this).getCacheTtlInSeconds()

      /**
       * Specifies whether responses should be cached and returned for requests.
       *
       * A cache cluster must be enabled on the stage for responses to be cached.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-methodsetting.html#cfn-apigateway-deployment-methodsetting-cachingenabled)
       */
      override fun cachingEnabled(): Any? = unwrap(this).getCachingEnabled()

      /**
       * Specifies whether data trace logging is enabled for this method, which affects the log
       * entries pushed to Amazon CloudWatch Logs.
       *
       * This can be useful to troubleshoot APIs, but can result in logging sensitive data. We
       * recommend that you don't enable this option for production APIs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-methodsetting.html#cfn-apigateway-deployment-methodsetting-datatraceenabled)
       */
      override fun dataTraceEnabled(): Any? = unwrap(this).getDataTraceEnabled()

      /**
       * The HTTP method.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-methodsetting.html#cfn-apigateway-deployment-methodsetting-httpmethod)
       */
      override fun httpMethod(): String? = unwrap(this).getHttpMethod()

      /**
       * Specifies the logging level for this method, which affects the log entries pushed to Amazon
       * CloudWatch Logs.
       *
       * Valid values are `OFF` , `ERROR` , and `INFO` . Choose `ERROR` to write only error-level
       * entries to CloudWatch Logs, or choose `INFO` to include all `ERROR` events as well as extra
       * informational events.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-methodsetting.html#cfn-apigateway-deployment-methodsetting-logginglevel)
       */
      override fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

      /**
       * Specifies whether Amazon CloudWatch metrics are enabled for this method.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-methodsetting.html#cfn-apigateway-deployment-methodsetting-metricsenabled)
       */
      override fun metricsEnabled(): Any? = unwrap(this).getMetricsEnabled()

      /**
       * The resource path for this method.
       *
       * Forward slashes ( `/` ) are encoded as `~1` and the initial slash must include a forward
       * slash. For example, the path value `/resource/subresource` must be encoded as
       * `/~1resource~1subresource` . To specify the root path, use only a slash ( `/` ).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-methodsetting.html#cfn-apigateway-deployment-methodsetting-resourcepath)
       */
      override fun resourcePath(): String? = unwrap(this).getResourcePath()

      /**
       * Specifies the throttling burst limit.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-methodsetting.html#cfn-apigateway-deployment-methodsetting-throttlingburstlimit)
       */
      override fun throttlingBurstLimit(): Number? = unwrap(this).getThrottlingBurstLimit()

      /**
       * Specifies the throttling rate limit.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-methodsetting.html#cfn-apigateway-deployment-methodsetting-throttlingratelimit)
       */
      override fun throttlingRateLimit(): Number? = unwrap(this).getThrottlingRateLimit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MethodSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDeployment.MethodSettingProperty):
          MethodSettingProperty = CdkObjectWrappers.wrap(cdkObject) as? MethodSettingProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MethodSettingProperty):
          software.amazon.awscdk.services.apigateway.CfnDeployment.MethodSettingProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigateway.CfnDeployment.MethodSettingProperty
    }
  }

  /**
   * The `CanarySetting` property type specifies settings for the canary deployment in this stage.
   *
   * `CanarySetting` is a property of the
   * [StageDescription](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigateway.*;
   * CanarySettingProperty canarySettingProperty = CanarySettingProperty.builder()
   * .percentTraffic(123)
   * .stageVariableOverrides(Map.of(
   * "stageVariableOverridesKey", "stageVariableOverrides"))
   * .useStageCache(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html)
   */
  public interface CanarySettingProperty {
    /**
     * The percent (0-100) of traffic diverted to a canary deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html#cfn-apigateway-deployment-canarysetting-percenttraffic)
     */
    public fun percentTraffic(): Number? = unwrap(this).getPercentTraffic()

    /**
     * Stage variables overridden for a canary release deployment, including new stage variables
     * introduced in the canary.
     *
     * These stage variables are represented as a string-to-string map between stage variable names
     * and their values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html#cfn-apigateway-deployment-canarysetting-stagevariableoverrides)
     */
    public fun stageVariableOverrides(): Any? = unwrap(this).getStageVariableOverrides()

    /**
     * A Boolean flag to indicate whether the canary deployment uses the stage cache or not.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html#cfn-apigateway-deployment-canarysetting-usestagecache)
     */
    public fun useStageCache(): Any? = unwrap(this).getUseStageCache()

    /**
     * A builder for [CanarySettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param percentTraffic The percent (0-100) of traffic diverted to a canary deployment.
       */
      public fun percentTraffic(percentTraffic: Number)

      /**
       * @param stageVariableOverrides Stage variables overridden for a canary release deployment,
       * including new stage variables introduced in the canary.
       * These stage variables are represented as a string-to-string map between stage variable
       * names and their values.
       */
      public fun stageVariableOverrides(stageVariableOverrides: IResolvable)

      /**
       * @param stageVariableOverrides Stage variables overridden for a canary release deployment,
       * including new stage variables introduced in the canary.
       * These stage variables are represented as a string-to-string map between stage variable
       * names and their values.
       */
      public fun stageVariableOverrides(stageVariableOverrides: Map<String, String>)

      /**
       * @param useStageCache A Boolean flag to indicate whether the canary deployment uses the
       * stage cache or not.
       */
      public fun useStageCache(useStageCache: Boolean)

      /**
       * @param useStageCache A Boolean flag to indicate whether the canary deployment uses the
       * stage cache or not.
       */
      public fun useStageCache(useStageCache: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnDeployment.CanarySettingProperty.Builder =
          software.amazon.awscdk.services.apigateway.CfnDeployment.CanarySettingProperty.builder()

      /**
       * @param percentTraffic The percent (0-100) of traffic diverted to a canary deployment.
       */
      override fun percentTraffic(percentTraffic: Number) {
        cdkBuilder.percentTraffic(percentTraffic)
      }

      /**
       * @param stageVariableOverrides Stage variables overridden for a canary release deployment,
       * including new stage variables introduced in the canary.
       * These stage variables are represented as a string-to-string map between stage variable
       * names and their values.
       */
      override fun stageVariableOverrides(stageVariableOverrides: IResolvable) {
        cdkBuilder.stageVariableOverrides(stageVariableOverrides.let(IResolvable::unwrap))
      }

      /**
       * @param stageVariableOverrides Stage variables overridden for a canary release deployment,
       * including new stage variables introduced in the canary.
       * These stage variables are represented as a string-to-string map between stage variable
       * names and their values.
       */
      override fun stageVariableOverrides(stageVariableOverrides: Map<String, String>) {
        cdkBuilder.stageVariableOverrides(stageVariableOverrides)
      }

      /**
       * @param useStageCache A Boolean flag to indicate whether the canary deployment uses the
       * stage cache or not.
       */
      override fun useStageCache(useStageCache: Boolean) {
        cdkBuilder.useStageCache(useStageCache)
      }

      /**
       * @param useStageCache A Boolean flag to indicate whether the canary deployment uses the
       * stage cache or not.
       */
      override fun useStageCache(useStageCache: IResolvable) {
        cdkBuilder.useStageCache(useStageCache.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.apigateway.CfnDeployment.CanarySettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnDeployment.CanarySettingProperty,
    ) : CdkObject(cdkObject), CanarySettingProperty {
      /**
       * The percent (0-100) of traffic diverted to a canary deployment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html#cfn-apigateway-deployment-canarysetting-percenttraffic)
       */
      override fun percentTraffic(): Number? = unwrap(this).getPercentTraffic()

      /**
       * Stage variables overridden for a canary release deployment, including new stage variables
       * introduced in the canary.
       *
       * These stage variables are represented as a string-to-string map between stage variable
       * names and their values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html#cfn-apigateway-deployment-canarysetting-stagevariableoverrides)
       */
      override fun stageVariableOverrides(): Any? = unwrap(this).getStageVariableOverrides()

      /**
       * A Boolean flag to indicate whether the canary deployment uses the stage cache or not.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-canarysetting.html#cfn-apigateway-deployment-canarysetting-usestagecache)
       */
      override fun useStageCache(): Any? = unwrap(this).getUseStageCache()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CanarySettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDeployment.CanarySettingProperty):
          CanarySettingProperty = CdkObjectWrappers.wrap(cdkObject) as? CanarySettingProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CanarySettingProperty):
          software.amazon.awscdk.services.apigateway.CfnDeployment.CanarySettingProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigateway.CfnDeployment.CanarySettingProperty
    }
  }
}
