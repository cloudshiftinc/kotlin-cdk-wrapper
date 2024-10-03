@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sam

import io.cloudshiftdev.awscdk.IResolvable
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

/**
 * Properties for defining a `CfnApi`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sam.*;
 * Object authorizers;
 * Object definitionBody;
 * Object gatewayResponses;
 * Object methodSettings;
 * Object models;
 * CfnApiProps cfnApiProps = CfnApiProps.builder()
 * .stageName("stageName")
 * // the properties below are optional
 * .accessLogSetting(AccessLogSettingProperty.builder()
 * .destinationArn("destinationArn")
 * .format("format")
 * .build())
 * .alwaysDeploy(false)
 * .auth(AuthProperty.builder()
 * .addDefaultAuthorizerToCorsPreflight(false)
 * .authorizers(authorizers)
 * .defaultAuthorizer("defaultAuthorizer")
 * .build())
 * .binaryMediaTypes(List.of("binaryMediaTypes"))
 * .cacheClusterEnabled(false)
 * .cacheClusterSize("cacheClusterSize")
 * .canarySetting(CanarySettingProperty.builder()
 * .deploymentId("deploymentId")
 * .percentTraffic(123)
 * .stageVariableOverrides(Map.of(
 * "stageVariableOverridesKey", "stageVariableOverrides"))
 * .useStageCache(false)
 * .build())
 * .cors("cors")
 * .definitionBody(definitionBody)
 * .definitionUri("definitionUri")
 * .description("description")
 * .disableExecuteApiEndpoint(false)
 * .domain(DomainConfigurationProperty.builder()
 * .certificateArn("certificateArn")
 * .domainName("domainName")
 * // the properties below are optional
 * .basePath(List.of("basePath"))
 * .endpointConfiguration("endpointConfiguration")
 * .mutualTlsAuthentication(MutualTlsAuthenticationProperty.builder()
 * .truststoreUri("truststoreUri")
 * .truststoreVersion("truststoreVersion")
 * .build())
 * .ownershipVerificationCertificateArn("ownershipVerificationCertificateArn")
 * .route53(Route53ConfigurationProperty.builder()
 * .distributedDomainName("distributedDomainName")
 * .evaluateTargetHealth(false)
 * .hostedZoneId("hostedZoneId")
 * .hostedZoneName("hostedZoneName")
 * .ipV6(false)
 * .build())
 * .securityPolicy("securityPolicy")
 * .build())
 * .endpointConfiguration("endpointConfiguration")
 * .gatewayResponses(gatewayResponses)
 * .methodSettings(List.of(methodSettings))
 * .minimumCompressionSize(123)
 * .models(models)
 * .name("name")
 * .openApiVersion("openApiVersion")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .tracingEnabled(false)
 * .variables(Map.of(
 * "variablesKey", "variables"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html)
 */
public interface CfnApiProps {
  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-accesslogsetting)
   */
  public fun accessLogSetting(): Any? = unwrap(this).getAccessLogSetting()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-alwaysdeploy)
   */
  public fun alwaysDeploy(): Any? = unwrap(this).getAlwaysDeploy()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-auth)
   */
  public fun auth(): Any? = unwrap(this).getAuth()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-binarymediatypes)
   */
  public fun binaryMediaTypes(): List<String> = unwrap(this).getBinaryMediaTypes() ?: emptyList()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-cacheclusterenabled)
   */
  public fun cacheClusterEnabled(): Any? = unwrap(this).getCacheClusterEnabled()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-cacheclustersize)
   */
  public fun cacheClusterSize(): String? = unwrap(this).getCacheClusterSize()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-canarysetting)
   */
  public fun canarySetting(): Any? = unwrap(this).getCanarySetting()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-cors)
   */
  public fun cors(): Any? = unwrap(this).getCors()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-definitionbody)
   */
  public fun definitionBody(): Any? = unwrap(this).getDefinitionBody()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-definitionuri)
   */
  public fun definitionUri(): Any? = unwrap(this).getDefinitionUri()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-disableexecuteapiendpoint)
   */
  public fun disableExecuteApiEndpoint(): Any? = unwrap(this).getDisableExecuteApiEndpoint()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-domain)
   */
  public fun domain(): Any? = unwrap(this).getDomain()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-endpointconfiguration)
   */
  public fun endpointConfiguration(): Any? = unwrap(this).getEndpointConfiguration()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-gatewayresponses)
   */
  public fun gatewayResponses(): Any? = unwrap(this).getGatewayResponses()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-methodsettings)
   */
  public fun methodSettings(): Any? = unwrap(this).getMethodSettings()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-minimumcompressionsize)
   */
  public fun minimumCompressionSize(): Number? = unwrap(this).getMinimumCompressionSize()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-models)
   */
  public fun models(): Any? = unwrap(this).getModels()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-openapiversion)
   */
  public fun openApiVersion(): String? = unwrap(this).getOpenApiVersion()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-stagename)
   */
  public fun stageName(): String

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-tracingenabled)
   */
  public fun tracingEnabled(): Any? = unwrap(this).getTracingEnabled()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-variables)
   */
  public fun variables(): Any? = unwrap(this).getVariables()

  /**
   * A builder for [CfnApiProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessLogSetting the value to be set.
     */
    public fun accessLogSetting(accessLogSetting: IResolvable)

    /**
     * @param accessLogSetting the value to be set.
     */
    public fun accessLogSetting(accessLogSetting: CfnApi.AccessLogSettingProperty)

    /**
     * @param accessLogSetting the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e43d25bcfe6b2f3a3866420f9148242d547d7bfff85d45bba0ae70146fdf448f")
    public
        fun accessLogSetting(accessLogSetting: CfnApi.AccessLogSettingProperty.Builder.() -> Unit)

    /**
     * @param alwaysDeploy the value to be set.
     */
    public fun alwaysDeploy(alwaysDeploy: Boolean)

    /**
     * @param alwaysDeploy the value to be set.
     */
    public fun alwaysDeploy(alwaysDeploy: IResolvable)

    /**
     * @param auth the value to be set.
     */
    public fun auth(auth: IResolvable)

    /**
     * @param auth the value to be set.
     */
    public fun auth(auth: CfnApi.AuthProperty)

    /**
     * @param auth the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("791d343e71bb420f83580ab92461a383860b061751975cfdd263e066fac6010c")
    public fun auth(auth: CfnApi.AuthProperty.Builder.() -> Unit)

    /**
     * @param binaryMediaTypes the value to be set.
     */
    public fun binaryMediaTypes(binaryMediaTypes: List<String>)

    /**
     * @param binaryMediaTypes the value to be set.
     */
    public fun binaryMediaTypes(vararg binaryMediaTypes: String)

    /**
     * @param cacheClusterEnabled the value to be set.
     */
    public fun cacheClusterEnabled(cacheClusterEnabled: Boolean)

    /**
     * @param cacheClusterEnabled the value to be set.
     */
    public fun cacheClusterEnabled(cacheClusterEnabled: IResolvable)

    /**
     * @param cacheClusterSize the value to be set.
     */
    public fun cacheClusterSize(cacheClusterSize: String)

    /**
     * @param canarySetting the value to be set.
     */
    public fun canarySetting(canarySetting: IResolvable)

    /**
     * @param canarySetting the value to be set.
     */
    public fun canarySetting(canarySetting: CfnApi.CanarySettingProperty)

    /**
     * @param canarySetting the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("140a15ae764ccf3ff5638aae874cab11f551819b011286167f9d2b4113f5958b")
    public fun canarySetting(canarySetting: CfnApi.CanarySettingProperty.Builder.() -> Unit)

    /**
     * @param cors the value to be set.
     */
    public fun cors(cors: String)

    /**
     * @param cors the value to be set.
     */
    public fun cors(cors: IResolvable)

    /**
     * @param cors the value to be set.
     */
    public fun cors(cors: CfnApi.CorsConfigurationProperty)

    /**
     * @param cors the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4f93126d2f6e4efd7df536adcfc8911539c1235f6405d3fea8252d8a1ef395f2")
    public fun cors(cors: CfnApi.CorsConfigurationProperty.Builder.() -> Unit)

    /**
     * @param definitionBody the value to be set.
     */
    public fun definitionBody(definitionBody: Any)

    /**
     * @param definitionUri the value to be set.
     */
    public fun definitionUri(definitionUri: String)

    /**
     * @param definitionUri the value to be set.
     */
    public fun definitionUri(definitionUri: IResolvable)

    /**
     * @param definitionUri the value to be set.
     */
    public fun definitionUri(definitionUri: CfnApi.S3LocationProperty)

    /**
     * @param definitionUri the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("398ae8ce55de06d3970f0fe8259e43adead2be2be77c06eb6853deb91c6361c0")
    public fun definitionUri(definitionUri: CfnApi.S3LocationProperty.Builder.() -> Unit)

    /**
     * @param description the value to be set.
     */
    public fun description(description: String)

    /**
     * @param disableExecuteApiEndpoint the value to be set.
     */
    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean)

    /**
     * @param disableExecuteApiEndpoint the value to be set.
     */
    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable)

    /**
     * @param domain the value to be set.
     */
    public fun domain(domain: IResolvable)

    /**
     * @param domain the value to be set.
     */
    public fun domain(domain: CfnApi.DomainConfigurationProperty)

    /**
     * @param domain the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6757384fbdc509139e74ac773639aa517103f42d8100887199b01d3cdd286204")
    public fun domain(domain: CfnApi.DomainConfigurationProperty.Builder.() -> Unit)

    /**
     * @param endpointConfiguration the value to be set.
     */
    public fun endpointConfiguration(endpointConfiguration: String)

    /**
     * @param endpointConfiguration the value to be set.
     */
    public fun endpointConfiguration(endpointConfiguration: IResolvable)

    /**
     * @param endpointConfiguration the value to be set.
     */
    public fun endpointConfiguration(endpointConfiguration: CfnApi.EndpointConfigurationProperty)

    /**
     * @param endpointConfiguration the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("29732f167e6e444b3bfff11c2829d248c277df636ac1be77717fad6d10e9ad12")
    public
        fun endpointConfiguration(endpointConfiguration: CfnApi.EndpointConfigurationProperty.Builder.() -> Unit)

    /**
     * @param gatewayResponses the value to be set.
     */
    public fun gatewayResponses(gatewayResponses: Any)

    /**
     * @param methodSettings the value to be set.
     */
    public fun methodSettings(methodSettings: List<Any>)

    /**
     * @param methodSettings the value to be set.
     */
    public fun methodSettings(vararg methodSettings: Any)

    /**
     * @param methodSettings the value to be set.
     */
    public fun methodSettings(methodSettings: IResolvable)

    /**
     * @param minimumCompressionSize the value to be set.
     */
    public fun minimumCompressionSize(minimumCompressionSize: Number)

    /**
     * @param models the value to be set.
     */
    public fun models(models: Any)

    /**
     * @param name the value to be set.
     */
    public fun name(name: String)

    /**
     * @param openApiVersion the value to be set.
     */
    public fun openApiVersion(openApiVersion: String)

    /**
     * @param stageName the value to be set. 
     */
    public fun stageName(stageName: String)

    /**
     * @param tags the value to be set.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param tracingEnabled the value to be set.
     */
    public fun tracingEnabled(tracingEnabled: Boolean)

    /**
     * @param tracingEnabled the value to be set.
     */
    public fun tracingEnabled(tracingEnabled: IResolvable)

    /**
     * @param variables the value to be set.
     */
    public fun variables(variables: IResolvable)

    /**
     * @param variables the value to be set.
     */
    public fun variables(variables: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sam.CfnApiProps.Builder =
        software.amazon.awscdk.services.sam.CfnApiProps.builder()

    /**
     * @param accessLogSetting the value to be set.
     */
    override fun accessLogSetting(accessLogSetting: IResolvable) {
      cdkBuilder.accessLogSetting(accessLogSetting.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param accessLogSetting the value to be set.
     */
    override fun accessLogSetting(accessLogSetting: CfnApi.AccessLogSettingProperty) {
      cdkBuilder.accessLogSetting(accessLogSetting.let(CfnApi.AccessLogSettingProperty.Companion::unwrap))
    }

    /**
     * @param accessLogSetting the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e43d25bcfe6b2f3a3866420f9148242d547d7bfff85d45bba0ae70146fdf448f")
    override
        fun accessLogSetting(accessLogSetting: CfnApi.AccessLogSettingProperty.Builder.() -> Unit):
        Unit = accessLogSetting(CfnApi.AccessLogSettingProperty(accessLogSetting))

    /**
     * @param alwaysDeploy the value to be set.
     */
    override fun alwaysDeploy(alwaysDeploy: Boolean) {
      cdkBuilder.alwaysDeploy(alwaysDeploy)
    }

    /**
     * @param alwaysDeploy the value to be set.
     */
    override fun alwaysDeploy(alwaysDeploy: IResolvable) {
      cdkBuilder.alwaysDeploy(alwaysDeploy.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param auth the value to be set.
     */
    override fun auth(auth: IResolvable) {
      cdkBuilder.auth(auth.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param auth the value to be set.
     */
    override fun auth(auth: CfnApi.AuthProperty) {
      cdkBuilder.auth(auth.let(CfnApi.AuthProperty.Companion::unwrap))
    }

    /**
     * @param auth the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("791d343e71bb420f83580ab92461a383860b061751975cfdd263e066fac6010c")
    override fun auth(auth: CfnApi.AuthProperty.Builder.() -> Unit): Unit =
        auth(CfnApi.AuthProperty(auth))

    /**
     * @param binaryMediaTypes the value to be set.
     */
    override fun binaryMediaTypes(binaryMediaTypes: List<String>) {
      cdkBuilder.binaryMediaTypes(binaryMediaTypes)
    }

    /**
     * @param binaryMediaTypes the value to be set.
     */
    override fun binaryMediaTypes(vararg binaryMediaTypes: String): Unit =
        binaryMediaTypes(binaryMediaTypes.toList())

    /**
     * @param cacheClusterEnabled the value to be set.
     */
    override fun cacheClusterEnabled(cacheClusterEnabled: Boolean) {
      cdkBuilder.cacheClusterEnabled(cacheClusterEnabled)
    }

    /**
     * @param cacheClusterEnabled the value to be set.
     */
    override fun cacheClusterEnabled(cacheClusterEnabled: IResolvable) {
      cdkBuilder.cacheClusterEnabled(cacheClusterEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param cacheClusterSize the value to be set.
     */
    override fun cacheClusterSize(cacheClusterSize: String) {
      cdkBuilder.cacheClusterSize(cacheClusterSize)
    }

    /**
     * @param canarySetting the value to be set.
     */
    override fun canarySetting(canarySetting: IResolvable) {
      cdkBuilder.canarySetting(canarySetting.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param canarySetting the value to be set.
     */
    override fun canarySetting(canarySetting: CfnApi.CanarySettingProperty) {
      cdkBuilder.canarySetting(canarySetting.let(CfnApi.CanarySettingProperty.Companion::unwrap))
    }

    /**
     * @param canarySetting the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("140a15ae764ccf3ff5638aae874cab11f551819b011286167f9d2b4113f5958b")
    override fun canarySetting(canarySetting: CfnApi.CanarySettingProperty.Builder.() -> Unit): Unit
        = canarySetting(CfnApi.CanarySettingProperty(canarySetting))

    /**
     * @param cors the value to be set.
     */
    override fun cors(cors: String) {
      cdkBuilder.cors(cors)
    }

    /**
     * @param cors the value to be set.
     */
    override fun cors(cors: IResolvable) {
      cdkBuilder.cors(cors.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param cors the value to be set.
     */
    override fun cors(cors: CfnApi.CorsConfigurationProperty) {
      cdkBuilder.cors(cors.let(CfnApi.CorsConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param cors the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4f93126d2f6e4efd7df536adcfc8911539c1235f6405d3fea8252d8a1ef395f2")
    override fun cors(cors: CfnApi.CorsConfigurationProperty.Builder.() -> Unit): Unit =
        cors(CfnApi.CorsConfigurationProperty(cors))

    /**
     * @param definitionBody the value to be set.
     */
    override fun definitionBody(definitionBody: Any) {
      cdkBuilder.definitionBody(definitionBody)
    }

    /**
     * @param definitionUri the value to be set.
     */
    override fun definitionUri(definitionUri: String) {
      cdkBuilder.definitionUri(definitionUri)
    }

    /**
     * @param definitionUri the value to be set.
     */
    override fun definitionUri(definitionUri: IResolvable) {
      cdkBuilder.definitionUri(definitionUri.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param definitionUri the value to be set.
     */
    override fun definitionUri(definitionUri: CfnApi.S3LocationProperty) {
      cdkBuilder.definitionUri(definitionUri.let(CfnApi.S3LocationProperty.Companion::unwrap))
    }

    /**
     * @param definitionUri the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("398ae8ce55de06d3970f0fe8259e43adead2be2be77c06eb6853deb91c6361c0")
    override fun definitionUri(definitionUri: CfnApi.S3LocationProperty.Builder.() -> Unit): Unit =
        definitionUri(CfnApi.S3LocationProperty(definitionUri))

    /**
     * @param description the value to be set.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param disableExecuteApiEndpoint the value to be set.
     */
    override fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
      cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
    }

    /**
     * @param disableExecuteApiEndpoint the value to be set.
     */
    override fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable) {
      cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param domain the value to be set.
     */
    override fun domain(domain: IResolvable) {
      cdkBuilder.domain(domain.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param domain the value to be set.
     */
    override fun domain(domain: CfnApi.DomainConfigurationProperty) {
      cdkBuilder.domain(domain.let(CfnApi.DomainConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param domain the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6757384fbdc509139e74ac773639aa517103f42d8100887199b01d3cdd286204")
    override fun domain(domain: CfnApi.DomainConfigurationProperty.Builder.() -> Unit): Unit =
        domain(CfnApi.DomainConfigurationProperty(domain))

    /**
     * @param endpointConfiguration the value to be set.
     */
    override fun endpointConfiguration(endpointConfiguration: String) {
      cdkBuilder.endpointConfiguration(endpointConfiguration)
    }

    /**
     * @param endpointConfiguration the value to be set.
     */
    override fun endpointConfiguration(endpointConfiguration: IResolvable) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param endpointConfiguration the value to be set.
     */
    override
        fun endpointConfiguration(endpointConfiguration: CfnApi.EndpointConfigurationProperty) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(CfnApi.EndpointConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param endpointConfiguration the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("29732f167e6e444b3bfff11c2829d248c277df636ac1be77717fad6d10e9ad12")
    override
        fun endpointConfiguration(endpointConfiguration: CfnApi.EndpointConfigurationProperty.Builder.() -> Unit):
        Unit = endpointConfiguration(CfnApi.EndpointConfigurationProperty(endpointConfiguration))

    /**
     * @param gatewayResponses the value to be set.
     */
    override fun gatewayResponses(gatewayResponses: Any) {
      cdkBuilder.gatewayResponses(gatewayResponses)
    }

    /**
     * @param methodSettings the value to be set.
     */
    override fun methodSettings(methodSettings: List<Any>) {
      cdkBuilder.methodSettings(methodSettings.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param methodSettings the value to be set.
     */
    override fun methodSettings(vararg methodSettings: Any): Unit =
        methodSettings(methodSettings.toList())

    /**
     * @param methodSettings the value to be set.
     */
    override fun methodSettings(methodSettings: IResolvable) {
      cdkBuilder.methodSettings(methodSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param minimumCompressionSize the value to be set.
     */
    override fun minimumCompressionSize(minimumCompressionSize: Number) {
      cdkBuilder.minimumCompressionSize(minimumCompressionSize)
    }

    /**
     * @param models the value to be set.
     */
    override fun models(models: Any) {
      cdkBuilder.models(models)
    }

    /**
     * @param name the value to be set.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param openApiVersion the value to be set.
     */
    override fun openApiVersion(openApiVersion: String) {
      cdkBuilder.openApiVersion(openApiVersion)
    }

    /**
     * @param stageName the value to be set. 
     */
    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    /**
     * @param tags the value to be set.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param tracingEnabled the value to be set.
     */
    override fun tracingEnabled(tracingEnabled: Boolean) {
      cdkBuilder.tracingEnabled(tracingEnabled)
    }

    /**
     * @param tracingEnabled the value to be set.
     */
    override fun tracingEnabled(tracingEnabled: IResolvable) {
      cdkBuilder.tracingEnabled(tracingEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param variables the value to be set.
     */
    override fun variables(variables: IResolvable) {
      cdkBuilder.variables(variables.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param variables the value to be set.
     */
    override fun variables(variables: Map<String, String>) {
      cdkBuilder.variables(variables)
    }

    public fun build(): software.amazon.awscdk.services.sam.CfnApiProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sam.CfnApiProps,
  ) : CdkObject(cdkObject),
      CfnApiProps {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-accesslogsetting)
     */
    override fun accessLogSetting(): Any? = unwrap(this).getAccessLogSetting()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-alwaysdeploy)
     */
    override fun alwaysDeploy(): Any? = unwrap(this).getAlwaysDeploy()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-auth)
     */
    override fun auth(): Any? = unwrap(this).getAuth()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-binarymediatypes)
     */
    override fun binaryMediaTypes(): List<String> = unwrap(this).getBinaryMediaTypes() ?:
        emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-cacheclusterenabled)
     */
    override fun cacheClusterEnabled(): Any? = unwrap(this).getCacheClusterEnabled()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-cacheclustersize)
     */
    override fun cacheClusterSize(): String? = unwrap(this).getCacheClusterSize()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-canarysetting)
     */
    override fun canarySetting(): Any? = unwrap(this).getCanarySetting()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-cors)
     */
    override fun cors(): Any? = unwrap(this).getCors()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-definitionbody)
     */
    override fun definitionBody(): Any? = unwrap(this).getDefinitionBody()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-definitionuri)
     */
    override fun definitionUri(): Any? = unwrap(this).getDefinitionUri()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-disableexecuteapiendpoint)
     */
    override fun disableExecuteApiEndpoint(): Any? = unwrap(this).getDisableExecuteApiEndpoint()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-domain)
     */
    override fun domain(): Any? = unwrap(this).getDomain()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-endpointconfiguration)
     */
    override fun endpointConfiguration(): Any? = unwrap(this).getEndpointConfiguration()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-gatewayresponses)
     */
    override fun gatewayResponses(): Any? = unwrap(this).getGatewayResponses()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-methodsettings)
     */
    override fun methodSettings(): Any? = unwrap(this).getMethodSettings()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-minimumcompressionsize)
     */
    override fun minimumCompressionSize(): Number? = unwrap(this).getMinimumCompressionSize()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-models)
     */
    override fun models(): Any? = unwrap(this).getModels()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-openapiversion)
     */
    override fun openApiVersion(): String? = unwrap(this).getOpenApiVersion()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-stagename)
     */
    override fun stageName(): String = unwrap(this).getStageName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-tracingenabled)
     */
    override fun tracingEnabled(): Any? = unwrap(this).getTracingEnabled()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-variables)
     */
    override fun variables(): Any? = unwrap(this).getVariables()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApiProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnApiProps): CfnApiProps =
        CdkObjectWrappers.wrap(cdkObject) as? CfnApiProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApiProps): software.amazon.awscdk.services.sam.CfnApiProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.sam.CfnApiProps
  }
}
