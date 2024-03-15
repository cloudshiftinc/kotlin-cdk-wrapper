@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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
 * The `AWS::ApiGateway::Stage` resource creates a stage for a deployment.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * CfnStage cfnStage = CfnStage.Builder.create(this, "MyCfnStage")
 * .restApiId("restApiId")
 * // the properties below are optional
 * .accessLogSetting(AccessLogSettingProperty.builder()
 * .destinationArn("destinationArn")
 * .format("format")
 * .build())
 * .cacheClusterEnabled(false)
 * .cacheClusterSize("cacheClusterSize")
 * .canarySetting(CanarySettingProperty.builder()
 * .deploymentId("deploymentId")
 * .percentTraffic(123)
 * .stageVariableOverrides(Map.of(
 * "stageVariableOverridesKey", "stageVariableOverrides"))
 * .useStageCache(false)
 * .build())
 * .clientCertificateId("clientCertificateId")
 * .deploymentId("deploymentId")
 * .description("description")
 * .documentationVersion("documentationVersion")
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
 * .stageName("stageName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .tracingEnabled(false)
 * .variables(Map.of(
 * "variablesKey", "variables"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html)
 */
public open class CfnStage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.CfnStage,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Access log settings, including the access log format and access log destination ARN.
   */
  public open fun accessLogSetting(): Any? = unwrap(this).getAccessLogSetting()

  /**
   * Access log settings, including the access log format and access log destination ARN.
   */
  public open fun accessLogSetting(`value`: IResolvable) {
    unwrap(this).setAccessLogSetting(`value`.let(IResolvable::unwrap))
  }

  /**
   * Access log settings, including the access log format and access log destination ARN.
   */
  public open fun accessLogSetting(`value`: AccessLogSettingProperty) {
    unwrap(this).setAccessLogSetting(`value`.let(AccessLogSettingProperty::unwrap))
  }

  /**
   * Access log settings, including the access log format and access log destination ARN.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ce1037cb26f0e51a3df786c5fb2204f60c7fc0afdbf60508353b227787d06463")
  public open fun accessLogSetting(`value`: AccessLogSettingProperty.Builder.() -> Unit): Unit =
      accessLogSetting(AccessLogSettingProperty(`value`))

  /**
   * Specifies whether a cache cluster is enabled for the stage.
   */
  public open fun cacheClusterEnabled(): Any? = unwrap(this).getCacheClusterEnabled()

  /**
   * Specifies whether a cache cluster is enabled for the stage.
   */
  public open fun cacheClusterEnabled(`value`: Boolean) {
    unwrap(this).setCacheClusterEnabled(`value`)
  }

  /**
   * Specifies whether a cache cluster is enabled for the stage.
   */
  public open fun cacheClusterEnabled(`value`: IResolvable) {
    unwrap(this).setCacheClusterEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * The stage's cache capacity in GB.
   */
  public open fun cacheClusterSize(): String? = unwrap(this).getCacheClusterSize()

  /**
   * The stage's cache capacity in GB.
   */
  public open fun cacheClusterSize(`value`: String) {
    unwrap(this).setCacheClusterSize(`value`)
  }

  /**
   * Settings for the canary deployment in this stage.
   */
  public open fun canarySetting(): Any? = unwrap(this).getCanarySetting()

  /**
   * Settings for the canary deployment in this stage.
   */
  public open fun canarySetting(`value`: IResolvable) {
    unwrap(this).setCanarySetting(`value`.let(IResolvable::unwrap))
  }

  /**
   * Settings for the canary deployment in this stage.
   */
  public open fun canarySetting(`value`: CanarySettingProperty) {
    unwrap(this).setCanarySetting(`value`.let(CanarySettingProperty::unwrap))
  }

  /**
   * Settings for the canary deployment in this stage.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f48e2f580c488dba0542c33ecdc280e4ae29d39f5bc48d3b11576d7d0c24333f")
  public open fun canarySetting(`value`: CanarySettingProperty.Builder.() -> Unit): Unit =
      canarySetting(CanarySettingProperty(`value`))

  /**
   * The identifier of a client certificate for an API stage.
   */
  public open fun clientCertificateId(): String? = unwrap(this).getClientCertificateId()

  /**
   * The identifier of a client certificate for an API stage.
   */
  public open fun clientCertificateId(`value`: String) {
    unwrap(this).setClientCertificateId(`value`)
  }

  /**
   * The identifier of the Deployment that the stage points to.
   */
  public open fun deploymentId(): String? = unwrap(this).getDeploymentId()

  /**
   * The identifier of the Deployment that the stage points to.
   */
  public open fun deploymentId(`value`: String) {
    unwrap(this).setDeploymentId(`value`)
  }

  /**
   * The stage's description.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The stage's description.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The version of the associated API documentation.
   */
  public open fun documentationVersion(): String? = unwrap(this).getDocumentationVersion()

  /**
   * The version of the associated API documentation.
   */
  public open fun documentationVersion(`value`: String) {
    unwrap(this).setDocumentationVersion(`value`)
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
   * A map that defines the method settings for a Stage resource.
   */
  public open fun methodSettings(): Any? = unwrap(this).getMethodSettings()

  /**
   * A map that defines the method settings for a Stage resource.
   */
  public open fun methodSettings(`value`: IResolvable) {
    unwrap(this).setMethodSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * A map that defines the method settings for a Stage resource.
   */
  public open fun methodSettings(`value`: List<Any>) {
    unwrap(this).setMethodSettings(`value`)
  }

  /**
   * A map that defines the method settings for a Stage resource.
   */
  public open fun methodSettings(vararg `value`: Any): Unit = methodSettings(`value`.toList())

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
   * The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a
   * call to API Gateway.
   */
  public open fun stageName(): String? = unwrap(this).getStageName()

  /**
   * The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a
   * call to API Gateway.
   */
  public open fun stageName(`value`: String) {
    unwrap(this).setStageName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The collection of tags.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The collection of tags.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The collection of tags.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Specifies whether active tracing with X-ray is enabled for the Stage.
   */
  public open fun tracingEnabled(): Any? = unwrap(this).getTracingEnabled()

  /**
   * Specifies whether active tracing with X-ray is enabled for the Stage.
   */
  public open fun tracingEnabled(`value`: Boolean) {
    unwrap(this).setTracingEnabled(`value`)
  }

  /**
   * Specifies whether active tracing with X-ray is enabled for the Stage.
   */
  public open fun tracingEnabled(`value`: IResolvable) {
    unwrap(this).setTracingEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * A map (string-to-string map) that defines the stage variables, where the variable name is the
   * key and the variable value is the value.
   */
  public open fun variables(): Any? = unwrap(this).getVariables()

  /**
   * A map (string-to-string map) that defines the stage variables, where the variable name is the
   * key and the variable value is the value.
   */
  public open fun variables(`value`: IResolvable) {
    unwrap(this).setVariables(`value`.let(IResolvable::unwrap))
  }

  /**
   * A map (string-to-string map) that defines the stage variables, where the variable name is the
   * key and the variable value is the value.
   */
  public open fun variables(`value`: Map<String, String>) {
    unwrap(this).setVariables(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.CfnStage].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Access log settings, including the access log format and access log destination ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-accesslogsetting)
     * @param accessLogSetting Access log settings, including the access log format and access log
     * destination ARN. 
     */
    public fun accessLogSetting(accessLogSetting: IResolvable)

    /**
     * Access log settings, including the access log format and access log destination ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-accesslogsetting)
     * @param accessLogSetting Access log settings, including the access log format and access log
     * destination ARN. 
     */
    public fun accessLogSetting(accessLogSetting: AccessLogSettingProperty)

    /**
     * Access log settings, including the access log format and access log destination ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-accesslogsetting)
     * @param accessLogSetting Access log settings, including the access log format and access log
     * destination ARN. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c182d978b7dedff90250af9aee40214a2b3d278d82215d67287cc7f5e7af711")
    public fun accessLogSetting(accessLogSetting: AccessLogSettingProperty.Builder.() -> Unit)

    /**
     * Specifies whether a cache cluster is enabled for the stage.
     *
     * To activate a method-level cache, set `CachingEnabled` to `true` for a method.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclusterenabled)
     * @param cacheClusterEnabled Specifies whether a cache cluster is enabled for the stage. 
     */
    public fun cacheClusterEnabled(cacheClusterEnabled: Boolean)

    /**
     * Specifies whether a cache cluster is enabled for the stage.
     *
     * To activate a method-level cache, set `CachingEnabled` to `true` for a method.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclusterenabled)
     * @param cacheClusterEnabled Specifies whether a cache cluster is enabled for the stage. 
     */
    public fun cacheClusterEnabled(cacheClusterEnabled: IResolvable)

    /**
     * The stage's cache capacity in GB.
     *
     * For more information about choosing a cache size, see [Enabling API caching to enhance
     * responsiveness](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-caching.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclustersize)
     * @param cacheClusterSize The stage's cache capacity in GB. 
     */
    public fun cacheClusterSize(cacheClusterSize: String)

    /**
     * Settings for the canary deployment in this stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-canarysetting)
     * @param canarySetting Settings for the canary deployment in this stage. 
     */
    public fun canarySetting(canarySetting: IResolvable)

    /**
     * Settings for the canary deployment in this stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-canarysetting)
     * @param canarySetting Settings for the canary deployment in this stage. 
     */
    public fun canarySetting(canarySetting: CanarySettingProperty)

    /**
     * Settings for the canary deployment in this stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-canarysetting)
     * @param canarySetting Settings for the canary deployment in this stage. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b9415e9637474bf6490ccdf6676e055c9226e8ac346c5ac03361e54c4398ab16")
    public fun canarySetting(canarySetting: CanarySettingProperty.Builder.() -> Unit)

    /**
     * The identifier of a client certificate for an API stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-clientcertificateid)
     * @param clientCertificateId The identifier of a client certificate for an API stage. 
     */
    public fun clientCertificateId(clientCertificateId: String)

    /**
     * The identifier of the Deployment that the stage points to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-deploymentid)
     * @param deploymentId The identifier of the Deployment that the stage points to. 
     */
    public fun deploymentId(deploymentId: String)

    /**
     * The stage's description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-description)
     * @param description The stage's description. 
     */
    public fun description(description: String)

    /**
     * The version of the associated API documentation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-documentationversion)
     * @param documentationVersion The version of the associated API documentation. 
     */
    public fun documentationVersion(documentationVersion: String)

    /**
     * A map that defines the method settings for a Stage resource.
     *
     * Keys (designated as `/{method_setting_key` below) are method paths defined as
     * `{resource_path}/{http_method}` for an individual method override, or `/\* /\*` for overriding
     * all methods in the stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-methodsettings)
     * @param methodSettings A map that defines the method settings for a Stage resource. 
     */
    public fun methodSettings(methodSettings: IResolvable)

    /**
     * A map that defines the method settings for a Stage resource.
     *
     * Keys (designated as `/{method_setting_key` below) are method paths defined as
     * `{resource_path}/{http_method}` for an individual method override, or `/\* /\*` for overriding
     * all methods in the stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-methodsettings)
     * @param methodSettings A map that defines the method settings for a Stage resource. 
     */
    public fun methodSettings(methodSettings: List<Any>)

    /**
     * A map that defines the method settings for a Stage resource.
     *
     * Keys (designated as `/{method_setting_key` below) are method paths defined as
     * `{resource_path}/{http_method}` for an individual method override, or `/\* /\*` for overriding
     * all methods in the stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-methodsettings)
     * @param methodSettings A map that defines the method settings for a Stage resource. 
     */
    public fun methodSettings(vararg methodSettings: Any)

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-restapiid)
     * @param restApiId The string identifier of the associated RestApi. 
     */
    public fun restApiId(restApiId: String)

    /**
     * The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a
     * call to API Gateway.
     *
     * Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum
     * length is 128 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-stagename)
     * @param stageName The name of the stage is the first path segment in the Uniform Resource
     * Identifier (URI) of a call to API Gateway. 
     */
    public fun stageName(stageName: String)

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-tags)
     * @param tags The collection of tags. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-tags)
     * @param tags The collection of tags. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Specifies whether active tracing with X-ray is enabled for the Stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-tracingenabled)
     * @param tracingEnabled Specifies whether active tracing with X-ray is enabled for the Stage. 
     */
    public fun tracingEnabled(tracingEnabled: Boolean)

    /**
     * Specifies whether active tracing with X-ray is enabled for the Stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-tracingenabled)
     * @param tracingEnabled Specifies whether active tracing with X-ray is enabled for the Stage. 
     */
    public fun tracingEnabled(tracingEnabled: IResolvable)

    /**
     * A map (string-to-string map) that defines the stage variables, where the variable name is the
     * key and the variable value is the value.
     *
     * Variable names are limited to alphanumeric characters. Values must match the following
     * regular expression: `[A-Za-z0-9-._~:/?#&amp;=,]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-variables)
     * @param variables A map (string-to-string map) that defines the stage variables, where the
     * variable name is the key and the variable value is the value. 
     */
    public fun variables(variables: IResolvable)

    /**
     * A map (string-to-string map) that defines the stage variables, where the variable name is the
     * key and the variable value is the value.
     *
     * Variable names are limited to alphanumeric characters. Values must match the following
     * regular expression: `[A-Za-z0-9-._~:/?#&amp;=,]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-variables)
     * @param variables A map (string-to-string map) that defines the stage variables, where the
     * variable name is the key and the variable value is the value. 
     */
    public fun variables(variables: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnStage.Builder =
        software.amazon.awscdk.services.apigateway.CfnStage.Builder.create(scope, id)

    /**
     * Access log settings, including the access log format and access log destination ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-accesslogsetting)
     * @param accessLogSetting Access log settings, including the access log format and access log
     * destination ARN. 
     */
    override fun accessLogSetting(accessLogSetting: IResolvable) {
      cdkBuilder.accessLogSetting(accessLogSetting.let(IResolvable::unwrap))
    }

    /**
     * Access log settings, including the access log format and access log destination ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-accesslogsetting)
     * @param accessLogSetting Access log settings, including the access log format and access log
     * destination ARN. 
     */
    override fun accessLogSetting(accessLogSetting: AccessLogSettingProperty) {
      cdkBuilder.accessLogSetting(accessLogSetting.let(AccessLogSettingProperty::unwrap))
    }

    /**
     * Access log settings, including the access log format and access log destination ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-accesslogsetting)
     * @param accessLogSetting Access log settings, including the access log format and access log
     * destination ARN. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c182d978b7dedff90250af9aee40214a2b3d278d82215d67287cc7f5e7af711")
    override fun accessLogSetting(accessLogSetting: AccessLogSettingProperty.Builder.() -> Unit):
        Unit = accessLogSetting(AccessLogSettingProperty(accessLogSetting))

    /**
     * Specifies whether a cache cluster is enabled for the stage.
     *
     * To activate a method-level cache, set `CachingEnabled` to `true` for a method.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclusterenabled)
     * @param cacheClusterEnabled Specifies whether a cache cluster is enabled for the stage. 
     */
    override fun cacheClusterEnabled(cacheClusterEnabled: Boolean) {
      cdkBuilder.cacheClusterEnabled(cacheClusterEnabled)
    }

    /**
     * Specifies whether a cache cluster is enabled for the stage.
     *
     * To activate a method-level cache, set `CachingEnabled` to `true` for a method.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclusterenabled)
     * @param cacheClusterEnabled Specifies whether a cache cluster is enabled for the stage. 
     */
    override fun cacheClusterEnabled(cacheClusterEnabled: IResolvable) {
      cdkBuilder.cacheClusterEnabled(cacheClusterEnabled.let(IResolvable::unwrap))
    }

    /**
     * The stage's cache capacity in GB.
     *
     * For more information about choosing a cache size, see [Enabling API caching to enhance
     * responsiveness](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-caching.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclustersize)
     * @param cacheClusterSize The stage's cache capacity in GB. 
     */
    override fun cacheClusterSize(cacheClusterSize: String) {
      cdkBuilder.cacheClusterSize(cacheClusterSize)
    }

    /**
     * Settings for the canary deployment in this stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-canarysetting)
     * @param canarySetting Settings for the canary deployment in this stage. 
     */
    override fun canarySetting(canarySetting: IResolvable) {
      cdkBuilder.canarySetting(canarySetting.let(IResolvable::unwrap))
    }

    /**
     * Settings for the canary deployment in this stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-canarysetting)
     * @param canarySetting Settings for the canary deployment in this stage. 
     */
    override fun canarySetting(canarySetting: CanarySettingProperty) {
      cdkBuilder.canarySetting(canarySetting.let(CanarySettingProperty::unwrap))
    }

    /**
     * Settings for the canary deployment in this stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-canarysetting)
     * @param canarySetting Settings for the canary deployment in this stage. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b9415e9637474bf6490ccdf6676e055c9226e8ac346c5ac03361e54c4398ab16")
    override fun canarySetting(canarySetting: CanarySettingProperty.Builder.() -> Unit): Unit =
        canarySetting(CanarySettingProperty(canarySetting))

    /**
     * The identifier of a client certificate for an API stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-clientcertificateid)
     * @param clientCertificateId The identifier of a client certificate for an API stage. 
     */
    override fun clientCertificateId(clientCertificateId: String) {
      cdkBuilder.clientCertificateId(clientCertificateId)
    }

    /**
     * The identifier of the Deployment that the stage points to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-deploymentid)
     * @param deploymentId The identifier of the Deployment that the stage points to. 
     */
    override fun deploymentId(deploymentId: String) {
      cdkBuilder.deploymentId(deploymentId)
    }

    /**
     * The stage's description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-description)
     * @param description The stage's description. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The version of the associated API documentation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-documentationversion)
     * @param documentationVersion The version of the associated API documentation. 
     */
    override fun documentationVersion(documentationVersion: String) {
      cdkBuilder.documentationVersion(documentationVersion)
    }

    /**
     * A map that defines the method settings for a Stage resource.
     *
     * Keys (designated as `/{method_setting_key` below) are method paths defined as
     * `{resource_path}/{http_method}` for an individual method override, or `/\* /\*` for overriding
     * all methods in the stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-methodsettings)
     * @param methodSettings A map that defines the method settings for a Stage resource. 
     */
    override fun methodSettings(methodSettings: IResolvable) {
      cdkBuilder.methodSettings(methodSettings.let(IResolvable::unwrap))
    }

    /**
     * A map that defines the method settings for a Stage resource.
     *
     * Keys (designated as `/{method_setting_key` below) are method paths defined as
     * `{resource_path}/{http_method}` for an individual method override, or `/\* /\*` for overriding
     * all methods in the stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-methodsettings)
     * @param methodSettings A map that defines the method settings for a Stage resource. 
     */
    override fun methodSettings(methodSettings: List<Any>) {
      cdkBuilder.methodSettings(methodSettings)
    }

    /**
     * A map that defines the method settings for a Stage resource.
     *
     * Keys (designated as `/{method_setting_key` below) are method paths defined as
     * `{resource_path}/{http_method}` for an individual method override, or `/\* /\*` for overriding
     * all methods in the stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-methodsettings)
     * @param methodSettings A map that defines the method settings for a Stage resource. 
     */
    override fun methodSettings(vararg methodSettings: Any): Unit =
        methodSettings(methodSettings.toList())

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-restapiid)
     * @param restApiId The string identifier of the associated RestApi. 
     */
    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    /**
     * The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a
     * call to API Gateway.
     *
     * Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum
     * length is 128 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-stagename)
     * @param stageName The name of the stage is the first path segment in the Uniform Resource
     * Identifier (URI) of a call to API Gateway. 
     */
    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-tags)
     * @param tags The collection of tags. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-tags)
     * @param tags The collection of tags. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Specifies whether active tracing with X-ray is enabled for the Stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-tracingenabled)
     * @param tracingEnabled Specifies whether active tracing with X-ray is enabled for the Stage. 
     */
    override fun tracingEnabled(tracingEnabled: Boolean) {
      cdkBuilder.tracingEnabled(tracingEnabled)
    }

    /**
     * Specifies whether active tracing with X-ray is enabled for the Stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-tracingenabled)
     * @param tracingEnabled Specifies whether active tracing with X-ray is enabled for the Stage. 
     */
    override fun tracingEnabled(tracingEnabled: IResolvable) {
      cdkBuilder.tracingEnabled(tracingEnabled.let(IResolvable::unwrap))
    }

    /**
     * A map (string-to-string map) that defines the stage variables, where the variable name is the
     * key and the variable value is the value.
     *
     * Variable names are limited to alphanumeric characters. Values must match the following
     * regular expression: `[A-Za-z0-9-._~:/?#&amp;=,]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-variables)
     * @param variables A map (string-to-string map) that defines the stage variables, where the
     * variable name is the key and the variable value is the value. 
     */
    override fun variables(variables: IResolvable) {
      cdkBuilder.variables(variables.let(IResolvable::unwrap))
    }

    /**
     * A map (string-to-string map) that defines the stage variables, where the variable name is the
     * key and the variable value is the value.
     *
     * Variable names are limited to alphanumeric characters. Values must match the following
     * regular expression: `[A-Za-z0-9-._~:/?#&amp;=,]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-variables)
     * @param variables A map (string-to-string map) that defines the stage variables, where the
     * variable name is the key and the variable value is the value. 
     */
    override fun variables(variables: Map<String, String>) {
      cdkBuilder.variables(variables)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnStage = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apigateway.CfnStage.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStage {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnStage): CfnStage =
        CfnStage(cdkObject)

    internal fun unwrap(wrapped: CfnStage): software.amazon.awscdk.services.apigateway.CfnStage =
        wrapped.cdkObject
  }

  /**
   * The `AccessLogSetting` property type specifies settings for logging access in this stage.
   *
   * `AccessLogSetting` is a property of the
   * [AWS::ApiGateway::Stage](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html)
   * resource.
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-accesslogsetting.html)
   */
  public interface AccessLogSettingProperty {
    /**
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or Kinesis Data Firehose
     * delivery stream to receive access logs.
     *
     * If you specify a Kinesis Data Firehose delivery stream, the stream name must begin with
     * `amazon-apigateway-` . This parameter is required to enable access logging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-accesslogsetting.html#cfn-apigateway-stage-accesslogsetting-destinationarn)
     */
    public fun destinationArn(): String? = unwrap(this).getDestinationArn()

    /**
     * A single line format of the access logs of data, as specified by selected [$context
     * variables](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-mapping-template-reference.html#context-variable-reference)
     * . The format must include at least `$context.requestId` . This parameter is required to enable
     * access logging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-accesslogsetting.html#cfn-apigateway-stage-accesslogsetting-format)
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
       * `amazon-apigateway-` . This parameter is required to enable access logging.
       */
      public fun destinationArn(destinationArn: String)

      /**
       * @param format A single line format of the access logs of data, as specified by selected
       * [$context
       * variables](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-mapping-template-reference.html#context-variable-reference)
       * . The format must include at least `$context.requestId` . This parameter is required to enable
       * access logging.
       */
      public fun format(format: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnStage.AccessLogSettingProperty.Builder =
          software.amazon.awscdk.services.apigateway.CfnStage.AccessLogSettingProperty.builder()

      /**
       * @param destinationArn The Amazon Resource Name (ARN) of the CloudWatch Logs log group or
       * Kinesis Data Firehose delivery stream to receive access logs.
       * If you specify a Kinesis Data Firehose delivery stream, the stream name must begin with
       * `amazon-apigateway-` . This parameter is required to enable access logging.
       */
      override fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
      }

      /**
       * @param format A single line format of the access logs of data, as specified by selected
       * [$context
       * variables](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-mapping-template-reference.html#context-variable-reference)
       * . The format must include at least `$context.requestId` . This parameter is required to enable
       * access logging.
       */
      override fun format(format: String) {
        cdkBuilder.format(format)
      }

      public fun build():
          software.amazon.awscdk.services.apigateway.CfnStage.AccessLogSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnStage.AccessLogSettingProperty,
    ) : CdkObject(cdkObject), AccessLogSettingProperty {
      /**
       * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or Kinesis Data Firehose
       * delivery stream to receive access logs.
       *
       * If you specify a Kinesis Data Firehose delivery stream, the stream name must begin with
       * `amazon-apigateway-` . This parameter is required to enable access logging.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-accesslogsetting.html#cfn-apigateway-stage-accesslogsetting-destinationarn)
       */
      override fun destinationArn(): String? = unwrap(this).getDestinationArn()

      /**
       * A single line format of the access logs of data, as specified by selected [$context
       * variables](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-mapping-template-reference.html#context-variable-reference)
       * . The format must include at least `$context.requestId` . This parameter is required to enable
       * access logging.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-accesslogsetting.html#cfn-apigateway-stage-accesslogsetting-format)
       */
      override fun format(): String? = unwrap(this).getFormat()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccessLogSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnStage.AccessLogSettingProperty):
          AccessLogSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessLogSettingProperty):
          software.amazon.awscdk.services.apigateway.CfnStage.AccessLogSettingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.apigateway.CfnStage.AccessLogSettingProperty
    }
  }

  /**
   * Configuration settings of a canary deployment.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigateway.*;
   * CanarySettingProperty canarySettingProperty = CanarySettingProperty.builder()
   * .deploymentId("deploymentId")
   * .percentTraffic(123)
   * .stageVariableOverrides(Map.of(
   * "stageVariableOverridesKey", "stageVariableOverrides"))
   * .useStageCache(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html)
   */
  public interface CanarySettingProperty {
    /**
     * The ID of the canary deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-deploymentid)
     */
    public fun deploymentId(): String? = unwrap(this).getDeploymentId()

    /**
     * The percent (0-100) of traffic diverted to a canary deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-percenttraffic)
     */
    public fun percentTraffic(): Number? = unwrap(this).getPercentTraffic()

    /**
     * Stage variables overridden for a canary release deployment, including new stage variables
     * introduced in the canary.
     *
     * These stage variables are represented as a string-to-string map between stage variable names
     * and their values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-stagevariableoverrides)
     */
    public fun stageVariableOverrides(): Any? = unwrap(this).getStageVariableOverrides()

    /**
     * A Boolean flag to indicate whether the canary deployment uses the stage cache or not.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-usestagecache)
     */
    public fun useStageCache(): Any? = unwrap(this).getUseStageCache()

    /**
     * A builder for [CanarySettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deploymentId The ID of the canary deployment.
       */
      public fun deploymentId(deploymentId: String)

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
          software.amazon.awscdk.services.apigateway.CfnStage.CanarySettingProperty.Builder =
          software.amazon.awscdk.services.apigateway.CfnStage.CanarySettingProperty.builder()

      /**
       * @param deploymentId The ID of the canary deployment.
       */
      override fun deploymentId(deploymentId: String) {
        cdkBuilder.deploymentId(deploymentId)
      }

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

      public fun build(): software.amazon.awscdk.services.apigateway.CfnStage.CanarySettingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnStage.CanarySettingProperty,
    ) : CdkObject(cdkObject), CanarySettingProperty {
      /**
       * The ID of the canary deployment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-deploymentid)
       */
      override fun deploymentId(): String? = unwrap(this).getDeploymentId()

      /**
       * The percent (0-100) of traffic diverted to a canary deployment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-percenttraffic)
       */
      override fun percentTraffic(): Number? = unwrap(this).getPercentTraffic()

      /**
       * Stage variables overridden for a canary release deployment, including new stage variables
       * introduced in the canary.
       *
       * These stage variables are represented as a string-to-string map between stage variable
       * names and their values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-stagevariableoverrides)
       */
      override fun stageVariableOverrides(): Any? = unwrap(this).getStageVariableOverrides()

      /**
       * A Boolean flag to indicate whether the canary deployment uses the stage cache or not.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-canarysetting.html#cfn-apigateway-stage-canarysetting-usestagecache)
       */
      override fun useStageCache(): Any? = unwrap(this).getUseStageCache()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CanarySettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnStage.CanarySettingProperty):
          CanarySettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CanarySettingProperty):
          software.amazon.awscdk.services.apigateway.CfnStage.CanarySettingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.apigateway.CfnStage.CanarySettingProperty
    }
  }

  /**
   * The `MethodSetting` property type configures settings for all methods in a stage.
   *
   * The `MethodSettings` property of the `AWS::ApiGateway::Stage` resource contains a list of
   * `MethodSetting` property types.
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-methodsetting.html)
   */
  public interface MethodSettingProperty {
    /**
     * Specifies whether the cached responses are encrypted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-cachedataencrypted)
     */
    public fun cacheDataEncrypted(): Any? = unwrap(this).getCacheDataEncrypted()

    /**
     * Specifies the time to live (TTL), in seconds, for cached responses.
     *
     * The higher the TTL, the longer the response will be cached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-cachettlinseconds)
     */
    public fun cacheTtlInSeconds(): Number? = unwrap(this).getCacheTtlInSeconds()

    /**
     * Specifies whether responses should be cached and returned for requests.
     *
     * A cache cluster must be enabled on the stage for responses to be cached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-cachingenabled)
     */
    public fun cachingEnabled(): Any? = unwrap(this).getCachingEnabled()

    /**
     * Specifies whether data trace logging is enabled for this method, which affects the log
     * entries pushed to Amazon CloudWatch Logs.
     *
     * This can be useful to troubleshoot APIs, but can result in logging sensitive data. We
     * recommend that you don't enable this option for production APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-datatraceenabled)
     */
    public fun dataTraceEnabled(): Any? = unwrap(this).getDataTraceEnabled()

    /**
     * The HTTP method.
     *
     * To apply settings to multiple resources and methods, specify an asterisk ( `*` ) for the
     * `HttpMethod` and `/ *` for the `ResourcePath` . This parameter is required when you specify a
     * `MethodSetting` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-httpmethod)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-logginglevel)
     */
    public fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

    /**
     * Specifies whether Amazon CloudWatch metrics are enabled for this method.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-metricsenabled)
     */
    public fun metricsEnabled(): Any? = unwrap(this).getMetricsEnabled()

    /**
     * The resource path for this method.
     *
     * Forward slashes ( `/` ) are encoded as `~1` and the initial slash must include a forward
     * slash. For example, the path value `/resource/subresource` must be encoded as
     * `/~1resource~1subresource` . To specify the root path, use only a slash ( `/` ). To apply
     * settings to multiple resources and methods, specify an asterisk ( `*` ) for the `HttpMethod` and
     * `/ *` for the `ResourcePath` . This parameter is required when you specify a `MethodSetting` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-resourcepath)
     */
    public fun resourcePath(): String? = unwrap(this).getResourcePath()

    /**
     * Specifies the throttling burst limit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-throttlingburstlimit)
     */
    public fun throttlingBurstLimit(): Number? = unwrap(this).getThrottlingBurstLimit()

    /**
     * Specifies the throttling rate limit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-throttlingratelimit)
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
       * To apply settings to multiple resources and methods, specify an asterisk ( `*` ) for the
       * `HttpMethod` and `/ *` for the `ResourcePath` . This parameter is required when you specify a
       * `MethodSetting` .
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
       * `/~1resource~1subresource` . To specify the root path, use only a slash ( `/` ). To apply
       * settings to multiple resources and methods, specify an asterisk ( `*` ) for the `HttpMethod`
       * and `/ *` for the `ResourcePath` . This parameter is required when you specify a
       * `MethodSetting` .
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
          software.amazon.awscdk.services.apigateway.CfnStage.MethodSettingProperty.Builder =
          software.amazon.awscdk.services.apigateway.CfnStage.MethodSettingProperty.builder()

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
       * To apply settings to multiple resources and methods, specify an asterisk ( `*` ) for the
       * `HttpMethod` and `/ *` for the `ResourcePath` . This parameter is required when you specify a
       * `MethodSetting` .
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
       * `/~1resource~1subresource` . To specify the root path, use only a slash ( `/` ). To apply
       * settings to multiple resources and methods, specify an asterisk ( `*` ) for the `HttpMethod`
       * and `/ *` for the `ResourcePath` . This parameter is required when you specify a
       * `MethodSetting` .
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

      public fun build(): software.amazon.awscdk.services.apigateway.CfnStage.MethodSettingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnStage.MethodSettingProperty,
    ) : CdkObject(cdkObject), MethodSettingProperty {
      /**
       * Specifies whether the cached responses are encrypted.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-cachedataencrypted)
       */
      override fun cacheDataEncrypted(): Any? = unwrap(this).getCacheDataEncrypted()

      /**
       * Specifies the time to live (TTL), in seconds, for cached responses.
       *
       * The higher the TTL, the longer the response will be cached.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-cachettlinseconds)
       */
      override fun cacheTtlInSeconds(): Number? = unwrap(this).getCacheTtlInSeconds()

      /**
       * Specifies whether responses should be cached and returned for requests.
       *
       * A cache cluster must be enabled on the stage for responses to be cached.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-cachingenabled)
       */
      override fun cachingEnabled(): Any? = unwrap(this).getCachingEnabled()

      /**
       * Specifies whether data trace logging is enabled for this method, which affects the log
       * entries pushed to Amazon CloudWatch Logs.
       *
       * This can be useful to troubleshoot APIs, but can result in logging sensitive data. We
       * recommend that you don't enable this option for production APIs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-datatraceenabled)
       */
      override fun dataTraceEnabled(): Any? = unwrap(this).getDataTraceEnabled()

      /**
       * The HTTP method.
       *
       * To apply settings to multiple resources and methods, specify an asterisk ( `*` ) for the
       * `HttpMethod` and `/ *` for the `ResourcePath` . This parameter is required when you specify a
       * `MethodSetting` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-httpmethod)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-logginglevel)
       */
      override fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

      /**
       * Specifies whether Amazon CloudWatch metrics are enabled for this method.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-metricsenabled)
       */
      override fun metricsEnabled(): Any? = unwrap(this).getMetricsEnabled()

      /**
       * The resource path for this method.
       *
       * Forward slashes ( `/` ) are encoded as `~1` and the initial slash must include a forward
       * slash. For example, the path value `/resource/subresource` must be encoded as
       * `/~1resource~1subresource` . To specify the root path, use only a slash ( `/` ). To apply
       * settings to multiple resources and methods, specify an asterisk ( `*` ) for the `HttpMethod`
       * and `/ *` for the `ResourcePath` . This parameter is required when you specify a
       * `MethodSetting` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-resourcepath)
       */
      override fun resourcePath(): String? = unwrap(this).getResourcePath()

      /**
       * Specifies the throttling burst limit.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-throttlingburstlimit)
       */
      override fun throttlingBurstLimit(): Number? = unwrap(this).getThrottlingBurstLimit()

      /**
       * Specifies the throttling rate limit.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-stage-methodsetting.html#cfn-apigateway-stage-methodsetting-throttlingratelimit)
       */
      override fun throttlingRateLimit(): Number? = unwrap(this).getThrottlingRateLimit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MethodSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnStage.MethodSettingProperty):
          MethodSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MethodSettingProperty):
          software.amazon.awscdk.services.apigateway.CfnStage.MethodSettingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.apigateway.CfnStage.MethodSettingProperty
    }
  }
}
