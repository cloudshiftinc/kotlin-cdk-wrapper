@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnStage`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * CfnStageProps cfnStageProps = CfnStageProps.builder()
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
public interface CfnStageProps {
  /**
   * Access log settings, including the access log format and access log destination ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-accesslogsetting)
   */
  public fun accessLogSetting(): Any? = unwrap(this).getAccessLogSetting()

  /**
   * Specifies whether a cache cluster is enabled for the stage.
   *
   * To activate a method-level cache, set `CachingEnabled` to `true` for a method.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclusterenabled)
   */
  public fun cacheClusterEnabled(): Any? = unwrap(this).getCacheClusterEnabled()

  /**
   * The stage's cache capacity in GB.
   *
   * For more information about choosing a cache size, see [Enabling API caching to enhance
   * responsiveness](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-caching.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclustersize)
   */
  public fun cacheClusterSize(): String? = unwrap(this).getCacheClusterSize()

  /**
   * Settings for the canary deployment in this stage.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-canarysetting)
   */
  public fun canarySetting(): Any? = unwrap(this).getCanarySetting()

  /**
   * The identifier of a client certificate for an API stage.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-clientcertificateid)
   */
  public fun clientCertificateId(): String? = unwrap(this).getClientCertificateId()

  /**
   * The identifier of the Deployment that the stage points to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-deploymentid)
   */
  public fun deploymentId(): String? = unwrap(this).getDeploymentId()

  /**
   * The stage's description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The version of the associated API documentation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-documentationversion)
   */
  public fun documentationVersion(): String? = unwrap(this).getDocumentationVersion()

  /**
   * A map that defines the method settings for a Stage resource.
   *
   * Keys (designated as `/{method_setting_key` below) are method paths defined as
   * `{resource_path}/{http_method}` for an individual method override, or `/\* /\*` for overriding all
   * methods in the stage.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-methodsettings)
   */
  public fun methodSettings(): Any? = unwrap(this).getMethodSettings()

  /**
   * The string identifier of the associated RestApi.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-restapiid)
   */
  public fun restApiId(): String

  /**
   * The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a
   * call to API Gateway.
   *
   * Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum length
   * is 128 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-stagename)
   */
  public fun stageName(): String? = unwrap(this).getStageName()

  /**
   * The collection of tags.
   *
   * Each tag element is associated with a given resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Specifies whether active tracing with X-ray is enabled for the Stage.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-tracingenabled)
   */
  public fun tracingEnabled(): Any? = unwrap(this).getTracingEnabled()

  /**
   * A map (string-to-string map) that defines the stage variables, where the variable name is the
   * key and the variable value is the value.
   *
   * Variable names are limited to alphanumeric characters. Values must match the following regular
   * expression: `[A-Za-z0-9-._~:/?#&amp;=,]+` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-variables)
   */
  public fun variables(): Any? = unwrap(this).getVariables()

  /**
   * A builder for [CfnStageProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessLogSetting Access log settings, including the access log format and access log
     * destination ARN.
     */
    public fun accessLogSetting(accessLogSetting: IResolvable)

    /**
     * @param accessLogSetting Access log settings, including the access log format and access log
     * destination ARN.
     */
    public fun accessLogSetting(accessLogSetting: CfnStage.AccessLogSettingProperty)

    /**
     * @param accessLogSetting Access log settings, including the access log format and access log
     * destination ARN.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f0398b89c2b07d4fc6b40a840e89306ef6a3c4dd065f736178b207e44b48d8f5")
    public
        fun accessLogSetting(accessLogSetting: CfnStage.AccessLogSettingProperty.Builder.() -> Unit)

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
     * @param cacheClusterSize The stage's cache capacity in GB.
     * For more information about choosing a cache size, see [Enabling API caching to enhance
     * responsiveness](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-caching.html)
     * .
     */
    public fun cacheClusterSize(cacheClusterSize: String)

    /**
     * @param canarySetting Settings for the canary deployment in this stage.
     */
    public fun canarySetting(canarySetting: IResolvable)

    /**
     * @param canarySetting Settings for the canary deployment in this stage.
     */
    public fun canarySetting(canarySetting: CfnStage.CanarySettingProperty)

    /**
     * @param canarySetting Settings for the canary deployment in this stage.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e44ed68f587e9bf1e6cdee1aa0acd04eccf03f11f778231b4767638f817ddae2")
    public fun canarySetting(canarySetting: CfnStage.CanarySettingProperty.Builder.() -> Unit)

    /**
     * @param clientCertificateId The identifier of a client certificate for an API stage.
     */
    public fun clientCertificateId(clientCertificateId: String)

    /**
     * @param deploymentId The identifier of the Deployment that the stage points to.
     */
    public fun deploymentId(deploymentId: String)

    /**
     * @param description The stage's description.
     */
    public fun description(description: String)

    /**
     * @param documentationVersion The version of the associated API documentation.
     */
    public fun documentationVersion(documentationVersion: String)

    /**
     * @param methodSettings A map that defines the method settings for a Stage resource.
     * Keys (designated as `/{method_setting_key` below) are method paths defined as
     * `{resource_path}/{http_method}` for an individual method override, or `/\* /\*` for overriding
     * all methods in the stage.
     */
    public fun methodSettings(methodSettings: IResolvable)

    /**
     * @param methodSettings A map that defines the method settings for a Stage resource.
     * Keys (designated as `/{method_setting_key` below) are method paths defined as
     * `{resource_path}/{http_method}` for an individual method override, or `/\* /\*` for overriding
     * all methods in the stage.
     */
    public fun methodSettings(methodSettings: List<Any>)

    /**
     * @param methodSettings A map that defines the method settings for a Stage resource.
     * Keys (designated as `/{method_setting_key` below) are method paths defined as
     * `{resource_path}/{http_method}` for an individual method override, or `/\* /\*` for overriding
     * all methods in the stage.
     */
    public fun methodSettings(vararg methodSettings: Any)

    /**
     * @param restApiId The string identifier of the associated RestApi. 
     */
    public fun restApiId(restApiId: String)

    /**
     * @param stageName The name of the stage is the first path segment in the Uniform Resource
     * Identifier (URI) of a call to API Gateway.
     * Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum
     * length is 128 characters.
     */
    public fun stageName(stageName: String)

    /**
     * @param tags The collection of tags.
     * Each tag element is associated with a given resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The collection of tags.
     * Each tag element is associated with a given resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param tracingEnabled Specifies whether active tracing with X-ray is enabled for the Stage.
     */
    public fun tracingEnabled(tracingEnabled: Boolean)

    /**
     * @param tracingEnabled Specifies whether active tracing with X-ray is enabled for the Stage.
     */
    public fun tracingEnabled(tracingEnabled: IResolvable)

    /**
     * @param variables A map (string-to-string map) that defines the stage variables, where the
     * variable name is the key and the variable value is the value.
     * Variable names are limited to alphanumeric characters. Values must match the following
     * regular expression: `[A-Za-z0-9-._~:/?#&amp;=,]+` .
     */
    public fun variables(variables: Map<String, String>)

    /**
     * @param variables A map (string-to-string map) that defines the stage variables, where the
     * variable name is the key and the variable value is the value.
     * Variable names are limited to alphanumeric characters. Values must match the following
     * regular expression: `[A-Za-z0-9-._~:/?#&amp;=,]+` .
     */
    public fun variables(variables: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnStageProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnStageProps.builder()

    /**
     * @param accessLogSetting Access log settings, including the access log format and access log
     * destination ARN.
     */
    override fun accessLogSetting(accessLogSetting: IResolvable) {
      cdkBuilder.accessLogSetting(accessLogSetting.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param accessLogSetting Access log settings, including the access log format and access log
     * destination ARN.
     */
    override fun accessLogSetting(accessLogSetting: CfnStage.AccessLogSettingProperty) {
      cdkBuilder.accessLogSetting(accessLogSetting.let(CfnStage.AccessLogSettingProperty.Companion::unwrap))
    }

    /**
     * @param accessLogSetting Access log settings, including the access log format and access log
     * destination ARN.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f0398b89c2b07d4fc6b40a840e89306ef6a3c4dd065f736178b207e44b48d8f5")
    override
        fun accessLogSetting(accessLogSetting: CfnStage.AccessLogSettingProperty.Builder.() -> Unit):
        Unit = accessLogSetting(CfnStage.AccessLogSettingProperty(accessLogSetting))

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
      cdkBuilder.cacheClusterEnabled(cacheClusterEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param cacheClusterSize The stage's cache capacity in GB.
     * For more information about choosing a cache size, see [Enabling API caching to enhance
     * responsiveness](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-caching.html)
     * .
     */
    override fun cacheClusterSize(cacheClusterSize: String) {
      cdkBuilder.cacheClusterSize(cacheClusterSize)
    }

    /**
     * @param canarySetting Settings for the canary deployment in this stage.
     */
    override fun canarySetting(canarySetting: IResolvable) {
      cdkBuilder.canarySetting(canarySetting.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param canarySetting Settings for the canary deployment in this stage.
     */
    override fun canarySetting(canarySetting: CfnStage.CanarySettingProperty) {
      cdkBuilder.canarySetting(canarySetting.let(CfnStage.CanarySettingProperty.Companion::unwrap))
    }

    /**
     * @param canarySetting Settings for the canary deployment in this stage.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e44ed68f587e9bf1e6cdee1aa0acd04eccf03f11f778231b4767638f817ddae2")
    override fun canarySetting(canarySetting: CfnStage.CanarySettingProperty.Builder.() -> Unit):
        Unit = canarySetting(CfnStage.CanarySettingProperty(canarySetting))

    /**
     * @param clientCertificateId The identifier of a client certificate for an API stage.
     */
    override fun clientCertificateId(clientCertificateId: String) {
      cdkBuilder.clientCertificateId(clientCertificateId)
    }

    /**
     * @param deploymentId The identifier of the Deployment that the stage points to.
     */
    override fun deploymentId(deploymentId: String) {
      cdkBuilder.deploymentId(deploymentId)
    }

    /**
     * @param description The stage's description.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param documentationVersion The version of the associated API documentation.
     */
    override fun documentationVersion(documentationVersion: String) {
      cdkBuilder.documentationVersion(documentationVersion)
    }

    /**
     * @param methodSettings A map that defines the method settings for a Stage resource.
     * Keys (designated as `/{method_setting_key` below) are method paths defined as
     * `{resource_path}/{http_method}` for an individual method override, or `/\* /\*` for overriding
     * all methods in the stage.
     */
    override fun methodSettings(methodSettings: IResolvable) {
      cdkBuilder.methodSettings(methodSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param methodSettings A map that defines the method settings for a Stage resource.
     * Keys (designated as `/{method_setting_key` below) are method paths defined as
     * `{resource_path}/{http_method}` for an individual method override, or `/\* /\*` for overriding
     * all methods in the stage.
     */
    override fun methodSettings(methodSettings: List<Any>) {
      cdkBuilder.methodSettings(methodSettings.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param methodSettings A map that defines the method settings for a Stage resource.
     * Keys (designated as `/{method_setting_key` below) are method paths defined as
     * `{resource_path}/{http_method}` for an individual method override, or `/\* /\*` for overriding
     * all methods in the stage.
     */
    override fun methodSettings(vararg methodSettings: Any): Unit =
        methodSettings(methodSettings.toList())

    /**
     * @param restApiId The string identifier of the associated RestApi. 
     */
    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    /**
     * @param stageName The name of the stage is the first path segment in the Uniform Resource
     * Identifier (URI) of a call to API Gateway.
     * Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum
     * length is 128 characters.
     */
    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    /**
     * @param tags The collection of tags.
     * Each tag element is associated with a given resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The collection of tags.
     * Each tag element is associated with a given resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param tracingEnabled Specifies whether active tracing with X-ray is enabled for the Stage.
     */
    override fun tracingEnabled(tracingEnabled: Boolean) {
      cdkBuilder.tracingEnabled(tracingEnabled)
    }

    /**
     * @param tracingEnabled Specifies whether active tracing with X-ray is enabled for the Stage.
     */
    override fun tracingEnabled(tracingEnabled: IResolvable) {
      cdkBuilder.tracingEnabled(tracingEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param variables A map (string-to-string map) that defines the stage variables, where the
     * variable name is the key and the variable value is the value.
     * Variable names are limited to alphanumeric characters. Values must match the following
     * regular expression: `[A-Za-z0-9-._~:/?#&amp;=,]+` .
     */
    override fun variables(variables: Map<String, String>) {
      cdkBuilder.variables(variables)
    }

    /**
     * @param variables A map (string-to-string map) that defines the stage variables, where the
     * variable name is the key and the variable value is the value.
     * Variable names are limited to alphanumeric characters. Values must match the following
     * regular expression: `[A-Za-z0-9-._~:/?#&amp;=,]+` .
     */
    override fun variables(variables: IResolvable) {
      cdkBuilder.variables(variables.let(IResolvable.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnStageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.CfnStageProps,
  ) : CdkObject(cdkObject),
      CfnStageProps {
    /**
     * Access log settings, including the access log format and access log destination ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-accesslogsetting)
     */
    override fun accessLogSetting(): Any? = unwrap(this).getAccessLogSetting()

    /**
     * Specifies whether a cache cluster is enabled for the stage.
     *
     * To activate a method-level cache, set `CachingEnabled` to `true` for a method.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclusterenabled)
     */
    override fun cacheClusterEnabled(): Any? = unwrap(this).getCacheClusterEnabled()

    /**
     * The stage's cache capacity in GB.
     *
     * For more information about choosing a cache size, see [Enabling API caching to enhance
     * responsiveness](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-caching.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-cacheclustersize)
     */
    override fun cacheClusterSize(): String? = unwrap(this).getCacheClusterSize()

    /**
     * Settings for the canary deployment in this stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-canarysetting)
     */
    override fun canarySetting(): Any? = unwrap(this).getCanarySetting()

    /**
     * The identifier of a client certificate for an API stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-clientcertificateid)
     */
    override fun clientCertificateId(): String? = unwrap(this).getClientCertificateId()

    /**
     * The identifier of the Deployment that the stage points to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-deploymentid)
     */
    override fun deploymentId(): String? = unwrap(this).getDeploymentId()

    /**
     * The stage's description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The version of the associated API documentation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-documentationversion)
     */
    override fun documentationVersion(): String? = unwrap(this).getDocumentationVersion()

    /**
     * A map that defines the method settings for a Stage resource.
     *
     * Keys (designated as `/{method_setting_key` below) are method paths defined as
     * `{resource_path}/{http_method}` for an individual method override, or `/\* /\*` for overriding
     * all methods in the stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-methodsettings)
     */
    override fun methodSettings(): Any? = unwrap(this).getMethodSettings()

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-restapiid)
     */
    override fun restApiId(): String = unwrap(this).getRestApiId()

    /**
     * The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a
     * call to API Gateway.
     *
     * Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum
     * length is 128 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-stagename)
     */
    override fun stageName(): String? = unwrap(this).getStageName()

    /**
     * The collection of tags.
     *
     * Each tag element is associated with a given resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Specifies whether active tracing with X-ray is enabled for the Stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-tracingenabled)
     */
    override fun tracingEnabled(): Any? = unwrap(this).getTracingEnabled()

    /**
     * A map (string-to-string map) that defines the stage variables, where the variable name is the
     * key and the variable value is the value.
     *
     * Variable names are limited to alphanumeric characters. Values must match the following
     * regular expression: `[A-Za-z0-9-._~:/?#&amp;=,]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-stage.html#cfn-apigateway-stage-variables)
     */
    override fun variables(): Any? = unwrap(this).getVariables()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnStageProps):
        CfnStageProps = CdkObjectWrappers.wrap(cdkObject) as? CfnStageProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStageProps):
        software.amazon.awscdk.services.apigateway.CfnStageProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigateway.CfnStageProps
  }
}
