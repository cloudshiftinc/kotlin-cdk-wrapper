@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
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
 * https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessapi.
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
 * CfnApi cfnApi = CfnApi.Builder.create(this, "MyCfnApi")
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
public open class CfnApi(
  cdkObject: software.amazon.awscdk.services.sam.CfnApi,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApiProps,
  ) :
      this(software.amazon.awscdk.services.sam.CfnApi(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnApiProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApiProps.Builder.() -> Unit,
  ) : this(scope, id, CfnApiProps(props)
  )

  /**
   *
   */
  public open fun accessLogSetting(): Any? = unwrap(this).getAccessLogSetting()

  /**
   *
   */
  public open fun accessLogSetting(`value`: IResolvable) {
    unwrap(this).setAccessLogSetting(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun accessLogSetting(`value`: AccessLogSettingProperty) {
    unwrap(this).setAccessLogSetting(`value`.let(AccessLogSettingProperty.Companion::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("393ac7ed605f5b0adcf1325abafdd4d5af2be3009a8999b8cc1982a1f4f3d2e3")
  public open fun accessLogSetting(`value`: AccessLogSettingProperty.Builder.() -> Unit): Unit =
      accessLogSetting(AccessLogSettingProperty(`value`))

  /**
   *
   */
  public open fun alwaysDeploy(): Any? = unwrap(this).getAlwaysDeploy()

  /**
   *
   */
  public open fun alwaysDeploy(`value`: Boolean) {
    unwrap(this).setAlwaysDeploy(`value`)
  }

  /**
   *
   */
  public open fun alwaysDeploy(`value`: IResolvable) {
    unwrap(this).setAlwaysDeploy(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun auth(): Any? = unwrap(this).getAuth()

  /**
   *
   */
  public open fun auth(`value`: IResolvable) {
    unwrap(this).setAuth(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun auth(`value`: AuthProperty) {
    unwrap(this).setAuth(`value`.let(AuthProperty.Companion::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1dc420ab76676290edde7e6b024b33cf581b9a78c14bf721ff0ffa5e12fa34a6")
  public open fun auth(`value`: AuthProperty.Builder.() -> Unit): Unit = auth(AuthProperty(`value`))

  /**
   *
   */
  public open fun binaryMediaTypes(): List<String> = unwrap(this).getBinaryMediaTypes() ?:
      emptyList()

  /**
   *
   */
  public open fun binaryMediaTypes(`value`: List<String>) {
    unwrap(this).setBinaryMediaTypes(`value`)
  }

  /**
   *
   */
  public open fun binaryMediaTypes(vararg `value`: String): Unit =
      binaryMediaTypes(`value`.toList())

  /**
   *
   */
  public open fun cacheClusterEnabled(): Any? = unwrap(this).getCacheClusterEnabled()

  /**
   *
   */
  public open fun cacheClusterEnabled(`value`: Boolean) {
    unwrap(this).setCacheClusterEnabled(`value`)
  }

  /**
   *
   */
  public open fun cacheClusterEnabled(`value`: IResolvable) {
    unwrap(this).setCacheClusterEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun cacheClusterSize(): String? = unwrap(this).getCacheClusterSize()

  /**
   *
   */
  public open fun cacheClusterSize(`value`: String) {
    unwrap(this).setCacheClusterSize(`value`)
  }

  /**
   *
   */
  public open fun canarySetting(): Any? = unwrap(this).getCanarySetting()

  /**
   *
   */
  public open fun canarySetting(`value`: IResolvable) {
    unwrap(this).setCanarySetting(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun canarySetting(`value`: CanarySettingProperty) {
    unwrap(this).setCanarySetting(`value`.let(CanarySettingProperty.Companion::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dcc89d226972d19e6b2820534716ef8854b7108a624d9c32dd9e5889a076af01")
  public open fun canarySetting(`value`: CanarySettingProperty.Builder.() -> Unit): Unit =
      canarySetting(CanarySettingProperty(`value`))

  /**
   *
   */
  public open fun cors(): Any? = unwrap(this).getCors()

  /**
   *
   */
  public open fun cors(`value`: String) {
    unwrap(this).setCors(`value`)
  }

  /**
   *
   */
  public open fun cors(`value`: IResolvable) {
    unwrap(this).setCors(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun cors(`value`: CorsConfigurationProperty) {
    unwrap(this).setCors(`value`.let(CorsConfigurationProperty.Companion::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a72f8858bced5e6f72696c4f4b9aa7ca0401f4bff1636487eb9c0f1e922f14bf")
  public open fun cors(`value`: CorsConfigurationProperty.Builder.() -> Unit): Unit =
      cors(CorsConfigurationProperty(`value`))

  /**
   *
   */
  public open fun definitionBody(): Any? = unwrap(this).getDefinitionBody()

  /**
   *
   */
  public open fun definitionBody(`value`: Any) {
    unwrap(this).setDefinitionBody(`value`)
  }

  /**
   *
   */
  public open fun definitionUri(): Any? = unwrap(this).getDefinitionUri()

  /**
   *
   */
  public open fun definitionUri(`value`: String) {
    unwrap(this).setDefinitionUri(`value`)
  }

  /**
   *
   */
  public open fun definitionUri(`value`: IResolvable) {
    unwrap(this).setDefinitionUri(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun definitionUri(`value`: S3LocationProperty) {
    unwrap(this).setDefinitionUri(`value`.let(S3LocationProperty.Companion::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6d859ebe21ecc4a00edb60e88a3b9504d6fd13c60939b66b7b4a6d08afda1499")
  public open fun definitionUri(`value`: S3LocationProperty.Builder.() -> Unit): Unit =
      definitionUri(S3LocationProperty(`value`))

  /**
   *
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   *
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   *
   */
  public open fun disableExecuteApiEndpoint(): Any? = unwrap(this).getDisableExecuteApiEndpoint()

  /**
   *
   */
  public open fun disableExecuteApiEndpoint(`value`: Boolean) {
    unwrap(this).setDisableExecuteApiEndpoint(`value`)
  }

  /**
   *
   */
  public open fun disableExecuteApiEndpoint(`value`: IResolvable) {
    unwrap(this).setDisableExecuteApiEndpoint(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun domain(): Any? = unwrap(this).getDomain()

  /**
   *
   */
  public open fun domain(`value`: IResolvable) {
    unwrap(this).setDomain(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun domain(`value`: DomainConfigurationProperty) {
    unwrap(this).setDomain(`value`.let(DomainConfigurationProperty.Companion::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ff802c8511228905f18f6659c460de0209f4bd3e53750312a5d4ed9bcd2c84be")
  public open fun domain(`value`: DomainConfigurationProperty.Builder.() -> Unit): Unit =
      domain(DomainConfigurationProperty(`value`))

  /**
   *
   */
  public open fun endpointConfiguration(): Any? = unwrap(this).getEndpointConfiguration()

  /**
   *
   */
  public open fun endpointConfiguration(`value`: String) {
    unwrap(this).setEndpointConfiguration(`value`)
  }

  /**
   *
   */
  public open fun endpointConfiguration(`value`: IResolvable) {
    unwrap(this).setEndpointConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun endpointConfiguration(`value`: EndpointConfigurationProperty) {
    unwrap(this).setEndpointConfiguration(`value`.let(EndpointConfigurationProperty.Companion::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d179a75be1c67ae8fdf071f7912a5a1e0f6eaf53593ed2c991ae331c588cdb1f")
  public open fun endpointConfiguration(`value`: EndpointConfigurationProperty.Builder.() -> Unit):
      Unit = endpointConfiguration(EndpointConfigurationProperty(`value`))

  /**
   *
   */
  public open fun gatewayResponses(): Any? = unwrap(this).getGatewayResponses()

  /**
   *
   */
  public open fun gatewayResponses(`value`: Any) {
    unwrap(this).setGatewayResponses(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   *
   */
  public open fun methodSettings(): Any? = unwrap(this).getMethodSettings()

  /**
   *
   */
  public open fun methodSettings(`value`: List<Any>) {
    unwrap(this).setMethodSettings(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   *
   */
  public open fun methodSettings(vararg `value`: Any): Unit = methodSettings(`value`.toList())

  /**
   *
   */
  public open fun methodSettings(`value`: IResolvable) {
    unwrap(this).setMethodSettings(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun minimumCompressionSize(): Number? = unwrap(this).getMinimumCompressionSize()

  /**
   *
   */
  public open fun minimumCompressionSize(`value`: Number) {
    unwrap(this).setMinimumCompressionSize(`value`)
  }

  /**
   *
   */
  public open fun models(): Any? = unwrap(this).getModels()

  /**
   *
   */
  public open fun models(`value`: Any) {
    unwrap(this).setModels(`value`)
  }

  /**
   *
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   *
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   *
   */
  public open fun openApiVersion(): String? = unwrap(this).getOpenApiVersion()

  /**
   *
   */
  public open fun openApiVersion(`value`: String) {
    unwrap(this).setOpenApiVersion(`value`)
  }

  /**
   *
   */
  public open fun stageName(): String = unwrap(this).getStageName()

  /**
   *
   */
  public open fun stageName(`value`: String) {
    unwrap(this).setStageName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   *
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   *
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   *
   */
  public open fun tracingEnabled(): Any? = unwrap(this).getTracingEnabled()

  /**
   *
   */
  public open fun tracingEnabled(`value`: Boolean) {
    unwrap(this).setTracingEnabled(`value`)
  }

  /**
   *
   */
  public open fun tracingEnabled(`value`: IResolvable) {
    unwrap(this).setTracingEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun variables(): Any? = unwrap(this).getVariables()

  /**
   *
   */
  public open fun variables(`value`: IResolvable) {
    unwrap(this).setVariables(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun variables(`value`: Map<String, String>) {
    unwrap(this).setVariables(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sam.CfnApi].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-accesslogsetting)
     * @param accessLogSetting 
     */
    public fun accessLogSetting(accessLogSetting: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-accesslogsetting)
     * @param accessLogSetting 
     */
    public fun accessLogSetting(accessLogSetting: AccessLogSettingProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-accesslogsetting)
     * @param accessLogSetting 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52612223022ccec38c43ac9351255974902491f312d6918c11a9d290055c901b")
    public fun accessLogSetting(accessLogSetting: AccessLogSettingProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-alwaysdeploy)
     * @param alwaysDeploy 
     */
    public fun alwaysDeploy(alwaysDeploy: Boolean)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-alwaysdeploy)
     * @param alwaysDeploy 
     */
    public fun alwaysDeploy(alwaysDeploy: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-auth)
     * @param auth 
     */
    public fun auth(auth: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-auth)
     * @param auth 
     */
    public fun auth(auth: AuthProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-auth)
     * @param auth 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eef102474deb1afafa7bee8b60a1d1ad656642b6349a1841fb68f20c5918da3e")
    public fun auth(auth: AuthProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-binarymediatypes)
     * @param binaryMediaTypes 
     */
    public fun binaryMediaTypes(binaryMediaTypes: List<String>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-binarymediatypes)
     * @param binaryMediaTypes 
     */
    public fun binaryMediaTypes(vararg binaryMediaTypes: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-cacheclusterenabled)
     * @param cacheClusterEnabled 
     */
    public fun cacheClusterEnabled(cacheClusterEnabled: Boolean)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-cacheclusterenabled)
     * @param cacheClusterEnabled 
     */
    public fun cacheClusterEnabled(cacheClusterEnabled: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-cacheclustersize)
     * @param cacheClusterSize 
     */
    public fun cacheClusterSize(cacheClusterSize: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-canarysetting)
     * @param canarySetting 
     */
    public fun canarySetting(canarySetting: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-canarysetting)
     * @param canarySetting 
     */
    public fun canarySetting(canarySetting: CanarySettingProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-canarysetting)
     * @param canarySetting 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ea7c193c37e4b13a08f908abfe2bc585e2a53618931c5217f48e1f86e4d2ce0")
    public fun canarySetting(canarySetting: CanarySettingProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-cors)
     * @param cors 
     */
    public fun cors(cors: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-cors)
     * @param cors 
     */
    public fun cors(cors: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-cors)
     * @param cors 
     */
    public fun cors(cors: CorsConfigurationProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-cors)
     * @param cors 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("adfa41b475eaeb69fcd439a3668ae3587644aa8146e89bc4c2a5edc5337a9d56")
    public fun cors(cors: CorsConfigurationProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-definitionbody)
     * @param definitionBody 
     */
    public fun definitionBody(definitionBody: Any)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-definitionuri)
     * @param definitionUri 
     */
    public fun definitionUri(definitionUri: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-definitionuri)
     * @param definitionUri 
     */
    public fun definitionUri(definitionUri: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-definitionuri)
     * @param definitionUri 
     */
    public fun definitionUri(definitionUri: S3LocationProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-definitionuri)
     * @param definitionUri 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d135ac60277de4e793e9bef2b07c66a1b1ccf161cbff05385a2407b8313fe1c0")
    public fun definitionUri(definitionUri: S3LocationProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-description)
     * @param description 
     */
    public fun description(description: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-disableexecuteapiendpoint)
     * @param disableExecuteApiEndpoint 
     */
    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-disableexecuteapiendpoint)
     * @param disableExecuteApiEndpoint 
     */
    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-domain)
     * @param domain 
     */
    public fun domain(domain: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-domain)
     * @param domain 
     */
    public fun domain(domain: DomainConfigurationProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-domain)
     * @param domain 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6bbb0fd7a23bff928152920158240788d0ff1c57ea6e8ff72e277dc17f16d9ea")
    public fun domain(domain: DomainConfigurationProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-endpointconfiguration)
     * @param endpointConfiguration 
     */
    public fun endpointConfiguration(endpointConfiguration: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-endpointconfiguration)
     * @param endpointConfiguration 
     */
    public fun endpointConfiguration(endpointConfiguration: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-endpointconfiguration)
     * @param endpointConfiguration 
     */
    public fun endpointConfiguration(endpointConfiguration: EndpointConfigurationProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-endpointconfiguration)
     * @param endpointConfiguration 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12dcc1a5089b655c37ec371ca5d7f786183e6a392afbf6c16de09b90f15afdb6")
    public
        fun endpointConfiguration(endpointConfiguration: EndpointConfigurationProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-gatewayresponses)
     * @param gatewayResponses 
     */
    public fun gatewayResponses(gatewayResponses: Any)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-methodsettings)
     * @param methodSettings 
     */
    public fun methodSettings(methodSettings: List<Any>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-methodsettings)
     * @param methodSettings 
     */
    public fun methodSettings(vararg methodSettings: Any)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-methodsettings)
     * @param methodSettings 
     */
    public fun methodSettings(methodSettings: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-minimumcompressionsize)
     * @param minimumCompressionSize 
     */
    public fun minimumCompressionSize(minimumCompressionSize: Number)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-models)
     * @param models 
     */
    public fun models(models: Any)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-name)
     * @param name 
     */
    public fun name(name: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-openapiversion)
     * @param openApiVersion 
     */
    public fun openApiVersion(openApiVersion: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-stagename)
     * @param stageName 
     */
    public fun stageName(stageName: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-tags)
     * @param tags 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-tracingenabled)
     * @param tracingEnabled 
     */
    public fun tracingEnabled(tracingEnabled: Boolean)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-tracingenabled)
     * @param tracingEnabled 
     */
    public fun tracingEnabled(tracingEnabled: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-variables)
     * @param variables 
     */
    public fun variables(variables: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-variables)
     * @param variables 
     */
    public fun variables(variables: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sam.CfnApi.Builder =
        software.amazon.awscdk.services.sam.CfnApi.Builder.create(scope, id)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-accesslogsetting)
     * @param accessLogSetting 
     */
    override fun accessLogSetting(accessLogSetting: IResolvable) {
      cdkBuilder.accessLogSetting(accessLogSetting.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-accesslogsetting)
     * @param accessLogSetting 
     */
    override fun accessLogSetting(accessLogSetting: AccessLogSettingProperty) {
      cdkBuilder.accessLogSetting(accessLogSetting.let(AccessLogSettingProperty.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-accesslogsetting)
     * @param accessLogSetting 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52612223022ccec38c43ac9351255974902491f312d6918c11a9d290055c901b")
    override fun accessLogSetting(accessLogSetting: AccessLogSettingProperty.Builder.() -> Unit):
        Unit = accessLogSetting(AccessLogSettingProperty(accessLogSetting))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-alwaysdeploy)
     * @param alwaysDeploy 
     */
    override fun alwaysDeploy(alwaysDeploy: Boolean) {
      cdkBuilder.alwaysDeploy(alwaysDeploy)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-alwaysdeploy)
     * @param alwaysDeploy 
     */
    override fun alwaysDeploy(alwaysDeploy: IResolvable) {
      cdkBuilder.alwaysDeploy(alwaysDeploy.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-auth)
     * @param auth 
     */
    override fun auth(auth: IResolvable) {
      cdkBuilder.auth(auth.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-auth)
     * @param auth 
     */
    override fun auth(auth: AuthProperty) {
      cdkBuilder.auth(auth.let(AuthProperty.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-auth)
     * @param auth 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eef102474deb1afafa7bee8b60a1d1ad656642b6349a1841fb68f20c5918da3e")
    override fun auth(auth: AuthProperty.Builder.() -> Unit): Unit = auth(AuthProperty(auth))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-binarymediatypes)
     * @param binaryMediaTypes 
     */
    override fun binaryMediaTypes(binaryMediaTypes: List<String>) {
      cdkBuilder.binaryMediaTypes(binaryMediaTypes)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-binarymediatypes)
     * @param binaryMediaTypes 
     */
    override fun binaryMediaTypes(vararg binaryMediaTypes: String): Unit =
        binaryMediaTypes(binaryMediaTypes.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-cacheclusterenabled)
     * @param cacheClusterEnabled 
     */
    override fun cacheClusterEnabled(cacheClusterEnabled: Boolean) {
      cdkBuilder.cacheClusterEnabled(cacheClusterEnabled)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-cacheclusterenabled)
     * @param cacheClusterEnabled 
     */
    override fun cacheClusterEnabled(cacheClusterEnabled: IResolvable) {
      cdkBuilder.cacheClusterEnabled(cacheClusterEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-cacheclustersize)
     * @param cacheClusterSize 
     */
    override fun cacheClusterSize(cacheClusterSize: String) {
      cdkBuilder.cacheClusterSize(cacheClusterSize)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-canarysetting)
     * @param canarySetting 
     */
    override fun canarySetting(canarySetting: IResolvable) {
      cdkBuilder.canarySetting(canarySetting.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-canarysetting)
     * @param canarySetting 
     */
    override fun canarySetting(canarySetting: CanarySettingProperty) {
      cdkBuilder.canarySetting(canarySetting.let(CanarySettingProperty.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-canarysetting)
     * @param canarySetting 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ea7c193c37e4b13a08f908abfe2bc585e2a53618931c5217f48e1f86e4d2ce0")
    override fun canarySetting(canarySetting: CanarySettingProperty.Builder.() -> Unit): Unit =
        canarySetting(CanarySettingProperty(canarySetting))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-cors)
     * @param cors 
     */
    override fun cors(cors: String) {
      cdkBuilder.cors(cors)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-cors)
     * @param cors 
     */
    override fun cors(cors: IResolvable) {
      cdkBuilder.cors(cors.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-cors)
     * @param cors 
     */
    override fun cors(cors: CorsConfigurationProperty) {
      cdkBuilder.cors(cors.let(CorsConfigurationProperty.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-cors)
     * @param cors 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("adfa41b475eaeb69fcd439a3668ae3587644aa8146e89bc4c2a5edc5337a9d56")
    override fun cors(cors: CorsConfigurationProperty.Builder.() -> Unit): Unit =
        cors(CorsConfigurationProperty(cors))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-definitionbody)
     * @param definitionBody 
     */
    override fun definitionBody(definitionBody: Any) {
      cdkBuilder.definitionBody(definitionBody)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-definitionuri)
     * @param definitionUri 
     */
    override fun definitionUri(definitionUri: String) {
      cdkBuilder.definitionUri(definitionUri)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-definitionuri)
     * @param definitionUri 
     */
    override fun definitionUri(definitionUri: IResolvable) {
      cdkBuilder.definitionUri(definitionUri.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-definitionuri)
     * @param definitionUri 
     */
    override fun definitionUri(definitionUri: S3LocationProperty) {
      cdkBuilder.definitionUri(definitionUri.let(S3LocationProperty.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-definitionuri)
     * @param definitionUri 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d135ac60277de4e793e9bef2b07c66a1b1ccf161cbff05385a2407b8313fe1c0")
    override fun definitionUri(definitionUri: S3LocationProperty.Builder.() -> Unit): Unit =
        definitionUri(S3LocationProperty(definitionUri))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-description)
     * @param description 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-disableexecuteapiendpoint)
     * @param disableExecuteApiEndpoint 
     */
    override fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
      cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-disableexecuteapiendpoint)
     * @param disableExecuteApiEndpoint 
     */
    override fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable) {
      cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-domain)
     * @param domain 
     */
    override fun domain(domain: IResolvable) {
      cdkBuilder.domain(domain.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-domain)
     * @param domain 
     */
    override fun domain(domain: DomainConfigurationProperty) {
      cdkBuilder.domain(domain.let(DomainConfigurationProperty.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-domain)
     * @param domain 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6bbb0fd7a23bff928152920158240788d0ff1c57ea6e8ff72e277dc17f16d9ea")
    override fun domain(domain: DomainConfigurationProperty.Builder.() -> Unit): Unit =
        domain(DomainConfigurationProperty(domain))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-endpointconfiguration)
     * @param endpointConfiguration 
     */
    override fun endpointConfiguration(endpointConfiguration: String) {
      cdkBuilder.endpointConfiguration(endpointConfiguration)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-endpointconfiguration)
     * @param endpointConfiguration 
     */
    override fun endpointConfiguration(endpointConfiguration: IResolvable) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-endpointconfiguration)
     * @param endpointConfiguration 
     */
    override fun endpointConfiguration(endpointConfiguration: EndpointConfigurationProperty) {
      cdkBuilder.endpointConfiguration(endpointConfiguration.let(EndpointConfigurationProperty.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-endpointconfiguration)
     * @param endpointConfiguration 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12dcc1a5089b655c37ec371ca5d7f786183e6a392afbf6c16de09b90f15afdb6")
    override
        fun endpointConfiguration(endpointConfiguration: EndpointConfigurationProperty.Builder.() -> Unit):
        Unit = endpointConfiguration(EndpointConfigurationProperty(endpointConfiguration))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-gatewayresponses)
     * @param gatewayResponses 
     */
    override fun gatewayResponses(gatewayResponses: Any) {
      cdkBuilder.gatewayResponses(gatewayResponses)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-methodsettings)
     * @param methodSettings 
     */
    override fun methodSettings(methodSettings: List<Any>) {
      cdkBuilder.methodSettings(methodSettings.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-methodsettings)
     * @param methodSettings 
     */
    override fun methodSettings(vararg methodSettings: Any): Unit =
        methodSettings(methodSettings.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-methodsettings)
     * @param methodSettings 
     */
    override fun methodSettings(methodSettings: IResolvable) {
      cdkBuilder.methodSettings(methodSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-minimumcompressionsize)
     * @param minimumCompressionSize 
     */
    override fun minimumCompressionSize(minimumCompressionSize: Number) {
      cdkBuilder.minimumCompressionSize(minimumCompressionSize)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-models)
     * @param models 
     */
    override fun models(models: Any) {
      cdkBuilder.models(models)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-name)
     * @param name 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-openapiversion)
     * @param openApiVersion 
     */
    override fun openApiVersion(openApiVersion: String) {
      cdkBuilder.openApiVersion(openApiVersion)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-stagename)
     * @param stageName 
     */
    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-tags)
     * @param tags 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-tracingenabled)
     * @param tracingEnabled 
     */
    override fun tracingEnabled(tracingEnabled: Boolean) {
      cdkBuilder.tracingEnabled(tracingEnabled)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-tracingenabled)
     * @param tracingEnabled 
     */
    override fun tracingEnabled(tracingEnabled: IResolvable) {
      cdkBuilder.tracingEnabled(tracingEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-variables)
     * @param variables 
     */
    override fun variables(variables: IResolvable) {
      cdkBuilder.variables(variables.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-variables)
     * @param variables 
     */
    override fun variables(variables: Map<String, String>) {
      cdkBuilder.variables(variables)
    }

    public fun build(): software.amazon.awscdk.services.sam.CfnApi = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sam.CfnApi.CFN_RESOURCE_TYPE_NAME

    public val REQUIRED_TRANSFORM: String =
        software.amazon.awscdk.services.sam.CfnApi.REQUIRED_TRANSFORM

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApi {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApi(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnApi): CfnApi =
        CfnApi(cdkObject)

    internal fun unwrap(wrapped: CfnApi): software.amazon.awscdk.services.sam.CfnApi =
        wrapped.cdkObject as software.amazon.awscdk.services.sam.CfnApi
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * AccessLogSettingProperty accessLogSettingProperty = AccessLogSettingProperty.builder()
   * .destinationArn("destinationArn")
   * .format("format")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-accesslogsetting.html)
   */
  public interface AccessLogSettingProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-accesslogsetting.html#cfn-serverless-api-accesslogsetting-destinationarn)
     */
    public fun destinationArn(): String? = unwrap(this).getDestinationArn()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-accesslogsetting.html#cfn-serverless-api-accesslogsetting-format)
     */
    public fun format(): String? = unwrap(this).getFormat()

    /**
     * A builder for [AccessLogSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destinationArn the value to be set.
       */
      public fun destinationArn(destinationArn: String)

      /**
       * @param format the value to be set.
       */
      public fun format(format: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnApi.AccessLogSettingProperty.Builder =
          software.amazon.awscdk.services.sam.CfnApi.AccessLogSettingProperty.builder()

      /**
       * @param destinationArn the value to be set.
       */
      override fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
      }

      /**
       * @param format the value to be set.
       */
      override fun format(format: String) {
        cdkBuilder.format(format)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnApi.AccessLogSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sam.CfnApi.AccessLogSettingProperty,
    ) : CdkObject(cdkObject), AccessLogSettingProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-accesslogsetting.html#cfn-serverless-api-accesslogsetting-destinationarn)
       */
      override fun destinationArn(): String? = unwrap(this).getDestinationArn()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-accesslogsetting.html#cfn-serverless-api-accesslogsetting-format)
       */
      override fun format(): String? = unwrap(this).getFormat()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccessLogSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnApi.AccessLogSettingProperty):
          AccessLogSettingProperty = CdkObjectWrappers.wrap(cdkObject) as? AccessLogSettingProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessLogSettingProperty):
          software.amazon.awscdk.services.sam.CfnApi.AccessLogSettingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnApi.AccessLogSettingProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * Object authorizers;
   * AuthProperty authProperty = AuthProperty.builder()
   * .addDefaultAuthorizerToCorsPreflight(false)
   * .authorizers(authorizers)
   * .defaultAuthorizer("defaultAuthorizer")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-auth.html)
   */
  public interface AuthProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-auth.html#cfn-serverless-api-auth-adddefaultauthorizertocorspreflight)
     */
    public fun addDefaultAuthorizerToCorsPreflight(): Any? =
        unwrap(this).getAddDefaultAuthorizerToCorsPreflight()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-auth.html#cfn-serverless-api-auth-authorizers)
     */
    public fun authorizers(): Any? = unwrap(this).getAuthorizers()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-auth.html#cfn-serverless-api-auth-defaultauthorizer)
     */
    public fun defaultAuthorizer(): String? = unwrap(this).getDefaultAuthorizer()

    /**
     * A builder for [AuthProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param addDefaultAuthorizerToCorsPreflight the value to be set.
       */
      public fun addDefaultAuthorizerToCorsPreflight(addDefaultAuthorizerToCorsPreflight: Boolean)

      /**
       * @param addDefaultAuthorizerToCorsPreflight the value to be set.
       */
      public
          fun addDefaultAuthorizerToCorsPreflight(addDefaultAuthorizerToCorsPreflight: IResolvable)

      /**
       * @param authorizers the value to be set.
       */
      public fun authorizers(authorizers: Any)

      /**
       * @param defaultAuthorizer the value to be set.
       */
      public fun defaultAuthorizer(defaultAuthorizer: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.sam.CfnApi.AuthProperty.Builder =
          software.amazon.awscdk.services.sam.CfnApi.AuthProperty.builder()

      /**
       * @param addDefaultAuthorizerToCorsPreflight the value to be set.
       */
      override
          fun addDefaultAuthorizerToCorsPreflight(addDefaultAuthorizerToCorsPreflight: Boolean) {
        cdkBuilder.addDefaultAuthorizerToCorsPreflight(addDefaultAuthorizerToCorsPreflight)
      }

      /**
       * @param addDefaultAuthorizerToCorsPreflight the value to be set.
       */
      override
          fun addDefaultAuthorizerToCorsPreflight(addDefaultAuthorizerToCorsPreflight: IResolvable) {
        cdkBuilder.addDefaultAuthorizerToCorsPreflight(addDefaultAuthorizerToCorsPreflight.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param authorizers the value to be set.
       */
      override fun authorizers(authorizers: Any) {
        cdkBuilder.authorizers(authorizers)
      }

      /**
       * @param defaultAuthorizer the value to be set.
       */
      override fun defaultAuthorizer(defaultAuthorizer: String) {
        cdkBuilder.defaultAuthorizer(defaultAuthorizer)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnApi.AuthProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sam.CfnApi.AuthProperty,
    ) : CdkObject(cdkObject), AuthProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-auth.html#cfn-serverless-api-auth-adddefaultauthorizertocorspreflight)
       */
      override fun addDefaultAuthorizerToCorsPreflight(): Any? =
          unwrap(this).getAddDefaultAuthorizerToCorsPreflight()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-auth.html#cfn-serverless-api-auth-authorizers)
       */
      override fun authorizers(): Any? = unwrap(this).getAuthorizers()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-auth.html#cfn-serverless-api-auth-defaultauthorizer)
       */
      override fun defaultAuthorizer(): String? = unwrap(this).getDefaultAuthorizer()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AuthProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnApi.AuthProperty):
          AuthProperty = CdkObjectWrappers.wrap(cdkObject) as? AuthProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthProperty):
          software.amazon.awscdk.services.sam.CfnApi.AuthProperty = (wrapped as CdkObject).cdkObject
          as software.amazon.awscdk.services.sam.CfnApi.AuthProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * CanarySettingProperty canarySettingProperty = CanarySettingProperty.builder()
   * .deploymentId("deploymentId")
   * .percentTraffic(123)
   * .stageVariableOverrides(Map.of(
   * "stageVariableOverridesKey", "stageVariableOverrides"))
   * .useStageCache(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-canarysetting.html)
   */
  public interface CanarySettingProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-canarysetting.html#cfn-serverless-api-canarysetting-deploymentid)
     */
    public fun deploymentId(): String? = unwrap(this).getDeploymentId()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-canarysetting.html#cfn-serverless-api-canarysetting-percenttraffic)
     */
    public fun percentTraffic(): Number? = unwrap(this).getPercentTraffic()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-canarysetting.html#cfn-serverless-api-canarysetting-stagevariableoverrides)
     */
    public fun stageVariableOverrides(): Any? = unwrap(this).getStageVariableOverrides()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-canarysetting.html#cfn-serverless-api-canarysetting-usestagecache)
     */
    public fun useStageCache(): Any? = unwrap(this).getUseStageCache()

    /**
     * A builder for [CanarySettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deploymentId the value to be set.
       */
      public fun deploymentId(deploymentId: String)

      /**
       * @param percentTraffic the value to be set.
       */
      public fun percentTraffic(percentTraffic: Number)

      /**
       * @param stageVariableOverrides the value to be set.
       */
      public fun stageVariableOverrides(stageVariableOverrides: IResolvable)

      /**
       * @param stageVariableOverrides the value to be set.
       */
      public fun stageVariableOverrides(stageVariableOverrides: Map<String, String>)

      /**
       * @param useStageCache the value to be set.
       */
      public fun useStageCache(useStageCache: Boolean)

      /**
       * @param useStageCache the value to be set.
       */
      public fun useStageCache(useStageCache: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnApi.CanarySettingProperty.Builder =
          software.amazon.awscdk.services.sam.CfnApi.CanarySettingProperty.builder()

      /**
       * @param deploymentId the value to be set.
       */
      override fun deploymentId(deploymentId: String) {
        cdkBuilder.deploymentId(deploymentId)
      }

      /**
       * @param percentTraffic the value to be set.
       */
      override fun percentTraffic(percentTraffic: Number) {
        cdkBuilder.percentTraffic(percentTraffic)
      }

      /**
       * @param stageVariableOverrides the value to be set.
       */
      override fun stageVariableOverrides(stageVariableOverrides: IResolvable) {
        cdkBuilder.stageVariableOverrides(stageVariableOverrides.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param stageVariableOverrides the value to be set.
       */
      override fun stageVariableOverrides(stageVariableOverrides: Map<String, String>) {
        cdkBuilder.stageVariableOverrides(stageVariableOverrides)
      }

      /**
       * @param useStageCache the value to be set.
       */
      override fun useStageCache(useStageCache: Boolean) {
        cdkBuilder.useStageCache(useStageCache)
      }

      /**
       * @param useStageCache the value to be set.
       */
      override fun useStageCache(useStageCache: IResolvable) {
        cdkBuilder.useStageCache(useStageCache.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnApi.CanarySettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sam.CfnApi.CanarySettingProperty,
    ) : CdkObject(cdkObject), CanarySettingProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-canarysetting.html#cfn-serverless-api-canarysetting-deploymentid)
       */
      override fun deploymentId(): String? = unwrap(this).getDeploymentId()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-canarysetting.html#cfn-serverless-api-canarysetting-percenttraffic)
       */
      override fun percentTraffic(): Number? = unwrap(this).getPercentTraffic()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-canarysetting.html#cfn-serverless-api-canarysetting-stagevariableoverrides)
       */
      override fun stageVariableOverrides(): Any? = unwrap(this).getStageVariableOverrides()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-canarysetting.html#cfn-serverless-api-canarysetting-usestagecache)
       */
      override fun useStageCache(): Any? = unwrap(this).getUseStageCache()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CanarySettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnApi.CanarySettingProperty):
          CanarySettingProperty = CdkObjectWrappers.wrap(cdkObject) as? CanarySettingProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CanarySettingProperty):
          software.amazon.awscdk.services.sam.CfnApi.CanarySettingProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.sam.CfnApi.CanarySettingProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * CorsConfigurationProperty corsConfigurationProperty = CorsConfigurationProperty.builder()
   * .allowOrigin("allowOrigin")
   * // the properties below are optional
   * .allowCredentials(false)
   * .allowHeaders("allowHeaders")
   * .allowMethods("allowMethods")
   * .maxAge("maxAge")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-corsconfiguration.html)
   */
  public interface CorsConfigurationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-corsconfiguration.html#cfn-serverless-api-corsconfiguration-allowcredentials)
     */
    public fun allowCredentials(): Any? = unwrap(this).getAllowCredentials()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-corsconfiguration.html#cfn-serverless-api-corsconfiguration-allowheaders)
     */
    public fun allowHeaders(): String? = unwrap(this).getAllowHeaders()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-corsconfiguration.html#cfn-serverless-api-corsconfiguration-allowmethods)
     */
    public fun allowMethods(): String? = unwrap(this).getAllowMethods()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-corsconfiguration.html#cfn-serverless-api-corsconfiguration-alloworigin)
     */
    public fun allowOrigin(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-corsconfiguration.html#cfn-serverless-api-corsconfiguration-maxage)
     */
    public fun maxAge(): String? = unwrap(this).getMaxAge()

    /**
     * A builder for [CorsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowCredentials the value to be set.
       */
      public fun allowCredentials(allowCredentials: Boolean)

      /**
       * @param allowCredentials the value to be set.
       */
      public fun allowCredentials(allowCredentials: IResolvable)

      /**
       * @param allowHeaders the value to be set.
       */
      public fun allowHeaders(allowHeaders: String)

      /**
       * @param allowMethods the value to be set.
       */
      public fun allowMethods(allowMethods: String)

      /**
       * @param allowOrigin the value to be set. 
       */
      public fun allowOrigin(allowOrigin: String)

      /**
       * @param maxAge the value to be set.
       */
      public fun maxAge(maxAge: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnApi.CorsConfigurationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnApi.CorsConfigurationProperty.builder()

      /**
       * @param allowCredentials the value to be set.
       */
      override fun allowCredentials(allowCredentials: Boolean) {
        cdkBuilder.allowCredentials(allowCredentials)
      }

      /**
       * @param allowCredentials the value to be set.
       */
      override fun allowCredentials(allowCredentials: IResolvable) {
        cdkBuilder.allowCredentials(allowCredentials.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param allowHeaders the value to be set.
       */
      override fun allowHeaders(allowHeaders: String) {
        cdkBuilder.allowHeaders(allowHeaders)
      }

      /**
       * @param allowMethods the value to be set.
       */
      override fun allowMethods(allowMethods: String) {
        cdkBuilder.allowMethods(allowMethods)
      }

      /**
       * @param allowOrigin the value to be set. 
       */
      override fun allowOrigin(allowOrigin: String) {
        cdkBuilder.allowOrigin(allowOrigin)
      }

      /**
       * @param maxAge the value to be set.
       */
      override fun maxAge(maxAge: String) {
        cdkBuilder.maxAge(maxAge)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnApi.CorsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sam.CfnApi.CorsConfigurationProperty,
    ) : CdkObject(cdkObject), CorsConfigurationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-corsconfiguration.html#cfn-serverless-api-corsconfiguration-allowcredentials)
       */
      override fun allowCredentials(): Any? = unwrap(this).getAllowCredentials()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-corsconfiguration.html#cfn-serverless-api-corsconfiguration-allowheaders)
       */
      override fun allowHeaders(): String? = unwrap(this).getAllowHeaders()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-corsconfiguration.html#cfn-serverless-api-corsconfiguration-allowmethods)
       */
      override fun allowMethods(): String? = unwrap(this).getAllowMethods()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-corsconfiguration.html#cfn-serverless-api-corsconfiguration-alloworigin)
       */
      override fun allowOrigin(): String = unwrap(this).getAllowOrigin()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-corsconfiguration.html#cfn-serverless-api-corsconfiguration-maxage)
       */
      override fun maxAge(): String? = unwrap(this).getMaxAge()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CorsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnApi.CorsConfigurationProperty):
          CorsConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CorsConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CorsConfigurationProperty):
          software.amazon.awscdk.services.sam.CfnApi.CorsConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnApi.CorsConfigurationProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * DomainConfigurationProperty domainConfigurationProperty = DomainConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-domainconfiguration.html)
   */
  public interface DomainConfigurationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-domainconfiguration.html#cfn-serverless-api-domainconfiguration-basepath)
     */
    public fun basePath(): List<String> = unwrap(this).getBasePath() ?: emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-domainconfiguration.html#cfn-serverless-api-domainconfiguration-certificatearn)
     */
    public fun certificateArn(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-domainconfiguration.html#cfn-serverless-api-domainconfiguration-domainname)
     */
    public fun domainName(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-domainconfiguration.html#cfn-serverless-api-domainconfiguration-endpointconfiguration)
     */
    public fun endpointConfiguration(): String? = unwrap(this).getEndpointConfiguration()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-domainconfiguration.html#cfn-serverless-api-domainconfiguration-mutualtlsauthentication)
     */
    public fun mutualTlsAuthentication(): Any? = unwrap(this).getMutualTlsAuthentication()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-domainconfiguration.html#cfn-serverless-api-domainconfiguration-ownershipverificationcertificatearn)
     */
    public fun ownershipVerificationCertificateArn(): String? =
        unwrap(this).getOwnershipVerificationCertificateArn()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-domainconfiguration.html#cfn-serverless-api-domainconfiguration-route53)
     */
    public fun route53(): Any? = unwrap(this).getRoute53()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-domainconfiguration.html#cfn-serverless-api-domainconfiguration-securitypolicy)
     */
    public fun securityPolicy(): String? = unwrap(this).getSecurityPolicy()

    /**
     * A builder for [DomainConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param basePath the value to be set.
       */
      public fun basePath(basePath: List<String>)

      /**
       * @param basePath the value to be set.
       */
      public fun basePath(vararg basePath: String)

      /**
       * @param certificateArn the value to be set. 
       */
      public fun certificateArn(certificateArn: String)

      /**
       * @param domainName the value to be set. 
       */
      public fun domainName(domainName: String)

      /**
       * @param endpointConfiguration the value to be set.
       */
      public fun endpointConfiguration(endpointConfiguration: String)

      /**
       * @param mutualTlsAuthentication the value to be set.
       */
      public fun mutualTlsAuthentication(mutualTlsAuthentication: IResolvable)

      /**
       * @param mutualTlsAuthentication the value to be set.
       */
      public fun mutualTlsAuthentication(mutualTlsAuthentication: MutualTlsAuthenticationProperty)

      /**
       * @param mutualTlsAuthentication the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e98b91cdf6bf8e8932ae29581c539462801dd64c0b8669126f2ce3a0bec6ab56")
      public
          fun mutualTlsAuthentication(mutualTlsAuthentication: MutualTlsAuthenticationProperty.Builder.() -> Unit)

      /**
       * @param ownershipVerificationCertificateArn the value to be set.
       */
      public fun ownershipVerificationCertificateArn(ownershipVerificationCertificateArn: String)

      /**
       * @param route53 the value to be set.
       */
      public fun route53(route53: IResolvable)

      /**
       * @param route53 the value to be set.
       */
      public fun route53(route53: Route53ConfigurationProperty)

      /**
       * @param route53 the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bdc6e2cd94fa58960127282245e89433069839b2a24d3a6fdcbea9fb73d6295f")
      public fun route53(route53: Route53ConfigurationProperty.Builder.() -> Unit)

      /**
       * @param securityPolicy the value to be set.
       */
      public fun securityPolicy(securityPolicy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnApi.DomainConfigurationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnApi.DomainConfigurationProperty.builder()

      /**
       * @param basePath the value to be set.
       */
      override fun basePath(basePath: List<String>) {
        cdkBuilder.basePath(basePath)
      }

      /**
       * @param basePath the value to be set.
       */
      override fun basePath(vararg basePath: String): Unit = basePath(basePath.toList())

      /**
       * @param certificateArn the value to be set. 
       */
      override fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
      }

      /**
       * @param domainName the value to be set. 
       */
      override fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
      }

      /**
       * @param endpointConfiguration the value to be set.
       */
      override fun endpointConfiguration(endpointConfiguration: String) {
        cdkBuilder.endpointConfiguration(endpointConfiguration)
      }

      /**
       * @param mutualTlsAuthentication the value to be set.
       */
      override fun mutualTlsAuthentication(mutualTlsAuthentication: IResolvable) {
        cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param mutualTlsAuthentication the value to be set.
       */
      override
          fun mutualTlsAuthentication(mutualTlsAuthentication: MutualTlsAuthenticationProperty) {
        cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication.let(MutualTlsAuthenticationProperty.Companion::unwrap))
      }

      /**
       * @param mutualTlsAuthentication the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e98b91cdf6bf8e8932ae29581c539462801dd64c0b8669126f2ce3a0bec6ab56")
      override
          fun mutualTlsAuthentication(mutualTlsAuthentication: MutualTlsAuthenticationProperty.Builder.() -> Unit):
          Unit = mutualTlsAuthentication(MutualTlsAuthenticationProperty(mutualTlsAuthentication))

      /**
       * @param ownershipVerificationCertificateArn the value to be set.
       */
      override
          fun ownershipVerificationCertificateArn(ownershipVerificationCertificateArn: String) {
        cdkBuilder.ownershipVerificationCertificateArn(ownershipVerificationCertificateArn)
      }

      /**
       * @param route53 the value to be set.
       */
      override fun route53(route53: IResolvable) {
        cdkBuilder.route53(route53.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param route53 the value to be set.
       */
      override fun route53(route53: Route53ConfigurationProperty) {
        cdkBuilder.route53(route53.let(Route53ConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param route53 the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bdc6e2cd94fa58960127282245e89433069839b2a24d3a6fdcbea9fb73d6295f")
      override fun route53(route53: Route53ConfigurationProperty.Builder.() -> Unit): Unit =
          route53(Route53ConfigurationProperty(route53))

      /**
       * @param securityPolicy the value to be set.
       */
      override fun securityPolicy(securityPolicy: String) {
        cdkBuilder.securityPolicy(securityPolicy)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnApi.DomainConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sam.CfnApi.DomainConfigurationProperty,
    ) : CdkObject(cdkObject), DomainConfigurationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-domainconfiguration.html#cfn-serverless-api-domainconfiguration-basepath)
       */
      override fun basePath(): List<String> = unwrap(this).getBasePath() ?: emptyList()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-domainconfiguration.html#cfn-serverless-api-domainconfiguration-certificatearn)
       */
      override fun certificateArn(): String = unwrap(this).getCertificateArn()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-domainconfiguration.html#cfn-serverless-api-domainconfiguration-domainname)
       */
      override fun domainName(): String = unwrap(this).getDomainName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-domainconfiguration.html#cfn-serverless-api-domainconfiguration-endpointconfiguration)
       */
      override fun endpointConfiguration(): String? = unwrap(this).getEndpointConfiguration()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-domainconfiguration.html#cfn-serverless-api-domainconfiguration-mutualtlsauthentication)
       */
      override fun mutualTlsAuthentication(): Any? = unwrap(this).getMutualTlsAuthentication()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-domainconfiguration.html#cfn-serverless-api-domainconfiguration-ownershipverificationcertificatearn)
       */
      override fun ownershipVerificationCertificateArn(): String? =
          unwrap(this).getOwnershipVerificationCertificateArn()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-domainconfiguration.html#cfn-serverless-api-domainconfiguration-route53)
       */
      override fun route53(): Any? = unwrap(this).getRoute53()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-domainconfiguration.html#cfn-serverless-api-domainconfiguration-securitypolicy)
       */
      override fun securityPolicy(): String? = unwrap(this).getSecurityPolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DomainConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnApi.DomainConfigurationProperty):
          DomainConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DomainConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DomainConfigurationProperty):
          software.amazon.awscdk.services.sam.CfnApi.DomainConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnApi.DomainConfigurationProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * EndpointConfigurationProperty endpointConfigurationProperty =
   * EndpointConfigurationProperty.builder()
   * .type("type")
   * .vpcEndpointIds(List.of("vpcEndpointIds"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-endpointconfiguration.html)
   */
  public interface EndpointConfigurationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-endpointconfiguration.html#cfn-serverless-api-endpointconfiguration-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-endpointconfiguration.html#cfn-serverless-api-endpointconfiguration-vpcendpointids)
     */
    public fun vpcEndpointIds(): List<String> = unwrap(this).getVpcEndpointIds() ?: emptyList()

    /**
     * A builder for [EndpointConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type the value to be set.
       */
      public fun type(type: String)

      /**
       * @param vpcEndpointIds the value to be set.
       */
      public fun vpcEndpointIds(vpcEndpointIds: List<String>)

      /**
       * @param vpcEndpointIds the value to be set.
       */
      public fun vpcEndpointIds(vararg vpcEndpointIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnApi.EndpointConfigurationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnApi.EndpointConfigurationProperty.builder()

      /**
       * @param type the value to be set.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param vpcEndpointIds the value to be set.
       */
      override fun vpcEndpointIds(vpcEndpointIds: List<String>) {
        cdkBuilder.vpcEndpointIds(vpcEndpointIds)
      }

      /**
       * @param vpcEndpointIds the value to be set.
       */
      override fun vpcEndpointIds(vararg vpcEndpointIds: String): Unit =
          vpcEndpointIds(vpcEndpointIds.toList())

      public fun build(): software.amazon.awscdk.services.sam.CfnApi.EndpointConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sam.CfnApi.EndpointConfigurationProperty,
    ) : CdkObject(cdkObject), EndpointConfigurationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-endpointconfiguration.html#cfn-serverless-api-endpointconfiguration-type)
       */
      override fun type(): String? = unwrap(this).getType()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-endpointconfiguration.html#cfn-serverless-api-endpointconfiguration-vpcendpointids)
       */
      override fun vpcEndpointIds(): List<String> = unwrap(this).getVpcEndpointIds() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnApi.EndpointConfigurationProperty):
          EndpointConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EndpointConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointConfigurationProperty):
          software.amazon.awscdk.services.sam.CfnApi.EndpointConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnApi.EndpointConfigurationProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * MutualTlsAuthenticationProperty mutualTlsAuthenticationProperty =
   * MutualTlsAuthenticationProperty.builder()
   * .truststoreUri("truststoreUri")
   * .truststoreVersion("truststoreVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-mutualtlsauthentication.html)
   */
  public interface MutualTlsAuthenticationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-mutualtlsauthentication.html#cfn-serverless-api-mutualtlsauthentication-truststoreuri)
     */
    public fun truststoreUri(): String? = unwrap(this).getTruststoreUri()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-mutualtlsauthentication.html#cfn-serverless-api-mutualtlsauthentication-truststoreversion)
     */
    public fun truststoreVersion(): String? = unwrap(this).getTruststoreVersion()

    /**
     * A builder for [MutualTlsAuthenticationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param truststoreUri the value to be set.
       */
      public fun truststoreUri(truststoreUri: String)

      /**
       * @param truststoreVersion the value to be set.
       */
      public fun truststoreVersion(truststoreVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnApi.MutualTlsAuthenticationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnApi.MutualTlsAuthenticationProperty.builder()

      /**
       * @param truststoreUri the value to be set.
       */
      override fun truststoreUri(truststoreUri: String) {
        cdkBuilder.truststoreUri(truststoreUri)
      }

      /**
       * @param truststoreVersion the value to be set.
       */
      override fun truststoreVersion(truststoreVersion: String) {
        cdkBuilder.truststoreVersion(truststoreVersion)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnApi.MutualTlsAuthenticationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sam.CfnApi.MutualTlsAuthenticationProperty,
    ) : CdkObject(cdkObject), MutualTlsAuthenticationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-mutualtlsauthentication.html#cfn-serverless-api-mutualtlsauthentication-truststoreuri)
       */
      override fun truststoreUri(): String? = unwrap(this).getTruststoreUri()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-mutualtlsauthentication.html#cfn-serverless-api-mutualtlsauthentication-truststoreversion)
       */
      override fun truststoreVersion(): String? = unwrap(this).getTruststoreVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MutualTlsAuthenticationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnApi.MutualTlsAuthenticationProperty):
          MutualTlsAuthenticationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MutualTlsAuthenticationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MutualTlsAuthenticationProperty):
          software.amazon.awscdk.services.sam.CfnApi.MutualTlsAuthenticationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnApi.MutualTlsAuthenticationProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * Route53ConfigurationProperty route53ConfigurationProperty =
   * Route53ConfigurationProperty.builder()
   * .distributedDomainName("distributedDomainName")
   * .evaluateTargetHealth(false)
   * .hostedZoneId("hostedZoneId")
   * .hostedZoneName("hostedZoneName")
   * .ipV6(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-route53configuration.html)
   */
  public interface Route53ConfigurationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-route53configuration.html#cfn-serverless-api-route53configuration-distributeddomainname)
     */
    public fun distributedDomainName(): String? = unwrap(this).getDistributedDomainName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-route53configuration.html#cfn-serverless-api-route53configuration-evaluatetargethealth)
     */
    public fun evaluateTargetHealth(): Any? = unwrap(this).getEvaluateTargetHealth()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-route53configuration.html#cfn-serverless-api-route53configuration-hostedzoneid)
     */
    public fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-route53configuration.html#cfn-serverless-api-route53configuration-hostedzonename)
     */
    public fun hostedZoneName(): String? = unwrap(this).getHostedZoneName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-route53configuration.html#cfn-serverless-api-route53configuration-ipv6)
     */
    public fun ipV6(): Any? = unwrap(this).getIpV6()

    /**
     * A builder for [Route53ConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param distributedDomainName the value to be set.
       */
      public fun distributedDomainName(distributedDomainName: String)

      /**
       * @param evaluateTargetHealth the value to be set.
       */
      public fun evaluateTargetHealth(evaluateTargetHealth: Boolean)

      /**
       * @param evaluateTargetHealth the value to be set.
       */
      public fun evaluateTargetHealth(evaluateTargetHealth: IResolvable)

      /**
       * @param hostedZoneId the value to be set.
       */
      public fun hostedZoneId(hostedZoneId: String)

      /**
       * @param hostedZoneName the value to be set.
       */
      public fun hostedZoneName(hostedZoneName: String)

      /**
       * @param ipV6 the value to be set.
       */
      public fun ipV6(ipV6: Boolean)

      /**
       * @param ipV6 the value to be set.
       */
      public fun ipV6(ipV6: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnApi.Route53ConfigurationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnApi.Route53ConfigurationProperty.builder()

      /**
       * @param distributedDomainName the value to be set.
       */
      override fun distributedDomainName(distributedDomainName: String) {
        cdkBuilder.distributedDomainName(distributedDomainName)
      }

      /**
       * @param evaluateTargetHealth the value to be set.
       */
      override fun evaluateTargetHealth(evaluateTargetHealth: Boolean) {
        cdkBuilder.evaluateTargetHealth(evaluateTargetHealth)
      }

      /**
       * @param evaluateTargetHealth the value to be set.
       */
      override fun evaluateTargetHealth(evaluateTargetHealth: IResolvable) {
        cdkBuilder.evaluateTargetHealth(evaluateTargetHealth.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param hostedZoneId the value to be set.
       */
      override fun hostedZoneId(hostedZoneId: String) {
        cdkBuilder.hostedZoneId(hostedZoneId)
      }

      /**
       * @param hostedZoneName the value to be set.
       */
      override fun hostedZoneName(hostedZoneName: String) {
        cdkBuilder.hostedZoneName(hostedZoneName)
      }

      /**
       * @param ipV6 the value to be set.
       */
      override fun ipV6(ipV6: Boolean) {
        cdkBuilder.ipV6(ipV6)
      }

      /**
       * @param ipV6 the value to be set.
       */
      override fun ipV6(ipV6: IResolvable) {
        cdkBuilder.ipV6(ipV6.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnApi.Route53ConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sam.CfnApi.Route53ConfigurationProperty,
    ) : CdkObject(cdkObject), Route53ConfigurationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-route53configuration.html#cfn-serverless-api-route53configuration-distributeddomainname)
       */
      override fun distributedDomainName(): String? = unwrap(this).getDistributedDomainName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-route53configuration.html#cfn-serverless-api-route53configuration-evaluatetargethealth)
       */
      override fun evaluateTargetHealth(): Any? = unwrap(this).getEvaluateTargetHealth()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-route53configuration.html#cfn-serverless-api-route53configuration-hostedzoneid)
       */
      override fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-route53configuration.html#cfn-serverless-api-route53configuration-hostedzonename)
       */
      override fun hostedZoneName(): String? = unwrap(this).getHostedZoneName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-route53configuration.html#cfn-serverless-api-route53configuration-ipv6)
       */
      override fun ipV6(): Any? = unwrap(this).getIpV6()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): Route53ConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnApi.Route53ConfigurationProperty):
          Route53ConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          Route53ConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: Route53ConfigurationProperty):
          software.amazon.awscdk.services.sam.CfnApi.Route53ConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnApi.Route53ConfigurationProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * .version(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-s3location.html)
   */
  public interface S3LocationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-s3location.html#cfn-serverless-api-s3location-bucket)
     */
    public fun bucket(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-s3location.html#cfn-serverless-api-s3location-key)
     */
    public fun key(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-s3location.html#cfn-serverless-api-s3location-version)
     */
    public fun version(): Number

    /**
     * A builder for [S3LocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket the value to be set. 
       */
      public fun bucket(bucket: String)

      /**
       * @param key the value to be set. 
       */
      public fun key(key: String)

      /**
       * @param version the value to be set. 
       */
      public fun version(version: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.sam.CfnApi.S3LocationProperty.Builder
          = software.amazon.awscdk.services.sam.CfnApi.S3LocationProperty.builder()

      /**
       * @param bucket the value to be set. 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param key the value to be set. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param version the value to be set. 
       */
      override fun version(version: Number) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnApi.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sam.CfnApi.S3LocationProperty,
    ) : CdkObject(cdkObject), S3LocationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-s3location.html#cfn-serverless-api-s3location-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-s3location.html#cfn-serverless-api-s3location-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-s3location.html#cfn-serverless-api-s3location-version)
       */
      override fun version(): Number = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnApi.S3LocationProperty):
          S3LocationProperty = CdkObjectWrappers.wrap(cdkObject) as? S3LocationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.sam.CfnApi.S3LocationProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.sam.CfnApi.S3LocationProperty
    }
  }
}
