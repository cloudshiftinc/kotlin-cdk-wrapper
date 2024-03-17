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
 * https://github.com/aws/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlesshttpapi.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sam.*;
 * Object authorizers;
 * Object definitionBody;
 * CfnHttpApi cfnHttpApi = CfnHttpApi.Builder.create(this, "MyCfnHttpApi")
 * .accessLogSetting(AccessLogSettingProperty.builder()
 * .destinationArn("destinationArn")
 * .format("format")
 * .build())
 * .auth(HttpApiAuthProperty.builder()
 * .authorizers(authorizers)
 * .defaultAuthorizer("defaultAuthorizer")
 * .build())
 * .corsConfiguration(false)
 * .defaultRouteSettings(RouteSettingsProperty.builder()
 * .dataTraceEnabled(false)
 * .detailedMetricsEnabled(false)
 * .loggingLevel("loggingLevel")
 * .throttlingBurstLimit(123)
 * .throttlingRateLimit(123)
 * .build())
 * .definitionBody(definitionBody)
 * .definitionUri("definitionUri")
 * .description("description")
 * .disableExecuteApiEndpoint(false)
 * .domain(HttpApiDomainConfigurationProperty.builder()
 * .certificateArn("certificateArn")
 * .domainName("domainName")
 * // the properties below are optional
 * .basePath("basePath")
 * .endpointConfiguration("endpointConfiguration")
 * .mutualTlsAuthentication(MutualTlsAuthenticationProperty.builder()
 * .truststoreUri("truststoreUri")
 * .truststoreVersion(false)
 * .build())
 * .route53(Route53ConfigurationProperty.builder()
 * .distributedDomainName("distributedDomainName")
 * .evaluateTargetHealth(false)
 * .hostedZoneId("hostedZoneId")
 * .hostedZoneName("hostedZoneName")
 * .ipV6(false)
 * .build())
 * .securityPolicy("securityPolicy")
 * .build())
 * .failOnWarnings(false)
 * .routeSettings(RouteSettingsProperty.builder()
 * .dataTraceEnabled(false)
 * .detailedMetricsEnabled(false)
 * .loggingLevel("loggingLevel")
 * .throttlingBurstLimit(123)
 * .throttlingRateLimit(123)
 * .build())
 * .stageName("stageName")
 * .stageVariables(Map.of(
 * "stageVariablesKey", "stageVariables"))
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html)
 */
public open class CfnHttpApi internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sam.CfnHttpApi,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   *
   */
  public open fun accessLogSetting(): Any? = unwrap(this).getAccessLogSetting()

  /**
   *
   */
  public open fun accessLogSetting(`value`: IResolvable) {
    unwrap(this).setAccessLogSetting(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun accessLogSetting(`value`: AccessLogSettingProperty) {
    unwrap(this).setAccessLogSetting(`value`.let(AccessLogSettingProperty::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ce708fc1fe5bf19c828d53af99612ccd2101227d2fe37d49aa28eb147d43bce9")
  public open fun accessLogSetting(`value`: AccessLogSettingProperty.Builder.() -> Unit): Unit =
      accessLogSetting(AccessLogSettingProperty(`value`))

  /**
   *
   */
  public open fun auth(): Any? = unwrap(this).getAuth()

  /**
   *
   */
  public open fun auth(`value`: IResolvable) {
    unwrap(this).setAuth(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun auth(`value`: HttpApiAuthProperty) {
    unwrap(this).setAuth(`value`.let(HttpApiAuthProperty::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7c140977d6b47eb6b761dc4354f7e3fbd2add8bee67eb227a7d089df170d80b8")
  public open fun auth(`value`: HttpApiAuthProperty.Builder.() -> Unit): Unit =
      auth(HttpApiAuthProperty(`value`))

  /**
   *
   */
  public open fun corsConfiguration(): Any? = unwrap(this).getCorsConfiguration()

  /**
   *
   */
  public open fun corsConfiguration(`value`: Boolean) {
    unwrap(this).setCorsConfiguration(`value`)
  }

  /**
   *
   */
  public open fun corsConfiguration(`value`: IResolvable) {
    unwrap(this).setCorsConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun corsConfiguration(`value`: CorsConfigurationObjectProperty) {
    unwrap(this).setCorsConfiguration(`value`.let(CorsConfigurationObjectProperty::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9301c7e41885df338be2950f469d009888b23401909b126267c245670dd13cb5")
  public open fun corsConfiguration(`value`: CorsConfigurationObjectProperty.Builder.() -> Unit):
      Unit = corsConfiguration(CorsConfigurationObjectProperty(`value`))

  /**
   *
   */
  public open fun defaultRouteSettings(): Any? = unwrap(this).getDefaultRouteSettings()

  /**
   *
   */
  public open fun defaultRouteSettings(`value`: IResolvable) {
    unwrap(this).setDefaultRouteSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun defaultRouteSettings(`value`: RouteSettingsProperty) {
    unwrap(this).setDefaultRouteSettings(`value`.let(RouteSettingsProperty::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e23c44addc95584779f8a58ec56681801dffde3ab12b1ba7e6e5ffa4070f464b")
  public open fun defaultRouteSettings(`value`: RouteSettingsProperty.Builder.() -> Unit): Unit =
      defaultRouteSettings(RouteSettingsProperty(`value`))

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
    unwrap(this).setDefinitionUri(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun definitionUri(`value`: S3LocationProperty) {
    unwrap(this).setDefinitionUri(`value`.let(S3LocationProperty::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9ab18e80f66bf974d61b6f815ea904fca29e52883e66f9156be72dacf0bcdb0a")
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
    unwrap(this).setDisableExecuteApiEndpoint(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun domain(): Any? = unwrap(this).getDomain()

  /**
   *
   */
  public open fun domain(`value`: IResolvable) {
    unwrap(this).setDomain(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun domain(`value`: HttpApiDomainConfigurationProperty) {
    unwrap(this).setDomain(`value`.let(HttpApiDomainConfigurationProperty::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8e6e0606e7edc5e4f6d0fa3af0827294bbdcbb3c54ecd00c73c936e95940e0b7")
  public open fun domain(`value`: HttpApiDomainConfigurationProperty.Builder.() -> Unit): Unit =
      domain(HttpApiDomainConfigurationProperty(`value`))

  /**
   *
   */
  public open fun failOnWarnings(): Any? = unwrap(this).getFailOnWarnings()

  /**
   *
   */
  public open fun failOnWarnings(`value`: Boolean) {
    unwrap(this).setFailOnWarnings(`value`)
  }

  /**
   *
   */
  public open fun failOnWarnings(`value`: IResolvable) {
    unwrap(this).setFailOnWarnings(`value`.let(IResolvable::unwrap))
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
   *
   */
  public open fun routeSettings(): Any? = unwrap(this).getRouteSettings()

  /**
   *
   */
  public open fun routeSettings(`value`: IResolvable) {
    unwrap(this).setRouteSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun routeSettings(`value`: RouteSettingsProperty) {
    unwrap(this).setRouteSettings(`value`.let(RouteSettingsProperty::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("122db4170fc5e96f6e66ba4c6d164aa7afd1ce71d37854a0a74feed912945a13")
  public open fun routeSettings(`value`: RouteSettingsProperty.Builder.() -> Unit): Unit =
      routeSettings(RouteSettingsProperty(`value`))

  /**
   *
   */
  public open fun stageName(): String? = unwrap(this).getStageName()

  /**
   *
   */
  public open fun stageName(`value`: String) {
    unwrap(this).setStageName(`value`)
  }

  /**
   *
   */
  public open fun stageVariables(): Any? = unwrap(this).getStageVariables()

  /**
   *
   */
  public open fun stageVariables(`value`: IResolvable) {
    unwrap(this).setStageVariables(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun stageVariables(`value`: Map<String, String>) {
    unwrap(this).setStageVariables(`value`)
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sam.CfnHttpApi].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-accesslogsetting)
     * @param accessLogSetting 
     */
    public fun accessLogSetting(accessLogSetting: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-accesslogsetting)
     * @param accessLogSetting 
     */
    public fun accessLogSetting(accessLogSetting: AccessLogSettingProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-accesslogsetting)
     * @param accessLogSetting 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("27fc057401a5d7a5d013ac2bb6d28842a5ff241951767bce13ec3850d1f787ad")
    public fun accessLogSetting(accessLogSetting: AccessLogSettingProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-auth)
     * @param auth 
     */
    public fun auth(auth: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-auth)
     * @param auth 
     */
    public fun auth(auth: HttpApiAuthProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-auth)
     * @param auth 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a779237a63b2c50dcc942019ee720af6ff6a169c8ee8100e54f5fbdbe7495cd9")
    public fun auth(auth: HttpApiAuthProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-corsconfiguration)
     * @param corsConfiguration 
     */
    public fun corsConfiguration(corsConfiguration: Boolean)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-corsconfiguration)
     * @param corsConfiguration 
     */
    public fun corsConfiguration(corsConfiguration: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-corsconfiguration)
     * @param corsConfiguration 
     */
    public fun corsConfiguration(corsConfiguration: CorsConfigurationObjectProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-corsconfiguration)
     * @param corsConfiguration 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c4352e90c50a24ba2c5ab20731e2d41f0d2cdd3c4b1c8c36a20b7145bd68ca5")
    public
        fun corsConfiguration(corsConfiguration: CorsConfigurationObjectProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-defaultroutesettings)
     * @param defaultRouteSettings 
     */
    public fun defaultRouteSettings(defaultRouteSettings: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-defaultroutesettings)
     * @param defaultRouteSettings 
     */
    public fun defaultRouteSettings(defaultRouteSettings: RouteSettingsProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-defaultroutesettings)
     * @param defaultRouteSettings 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d02f4ebd0b0030589ef3027f71a159ddd8df4faf6defa9c9b36f4f96faf2ded")
    public fun defaultRouteSettings(defaultRouteSettings: RouteSettingsProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-definitionbody)
     * @param definitionBody 
     */
    public fun definitionBody(definitionBody: Any)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-definitionuri)
     * @param definitionUri 
     */
    public fun definitionUri(definitionUri: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-definitionuri)
     * @param definitionUri 
     */
    public fun definitionUri(definitionUri: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-definitionuri)
     * @param definitionUri 
     */
    public fun definitionUri(definitionUri: S3LocationProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-definitionuri)
     * @param definitionUri 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ccd2a4751970c416ab43589ee56d5f47ba4322661d82c438df9fc9c7b171174")
    public fun definitionUri(definitionUri: S3LocationProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-description)
     * @param description 
     */
    public fun description(description: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-disableexecuteapiendpoint)
     * @param disableExecuteApiEndpoint 
     */
    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-disableexecuteapiendpoint)
     * @param disableExecuteApiEndpoint 
     */
    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-domain)
     * @param domain 
     */
    public fun domain(domain: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-domain)
     * @param domain 
     */
    public fun domain(domain: HttpApiDomainConfigurationProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-domain)
     * @param domain 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("055db83241c767b60ce00b8122ea0426e3797afdd652679e11aa097044dae30c")
    public fun domain(domain: HttpApiDomainConfigurationProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-failonwarnings)
     * @param failOnWarnings 
     */
    public fun failOnWarnings(failOnWarnings: Boolean)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-failonwarnings)
     * @param failOnWarnings 
     */
    public fun failOnWarnings(failOnWarnings: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-routesettings)
     * @param routeSettings 
     */
    public fun routeSettings(routeSettings: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-routesettings)
     * @param routeSettings 
     */
    public fun routeSettings(routeSettings: RouteSettingsProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-routesettings)
     * @param routeSettings 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("93572e5fb6b2eb215ed7e170356249b7724ef9b63ed9dc5385838c39ee82aa8c")
    public fun routeSettings(routeSettings: RouteSettingsProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-stagename)
     * @param stageName 
     */
    public fun stageName(stageName: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-stagevariables)
     * @param stageVariables 
     */
    public fun stageVariables(stageVariables: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-stagevariables)
     * @param stageVariables 
     */
    public fun stageVariables(stageVariables: Map<String, String>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-tags)
     * @param tags 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sam.CfnHttpApi.Builder =
        software.amazon.awscdk.services.sam.CfnHttpApi.Builder.create(scope, id)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-accesslogsetting)
     * @param accessLogSetting 
     */
    override fun accessLogSetting(accessLogSetting: IResolvable) {
      cdkBuilder.accessLogSetting(accessLogSetting.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-accesslogsetting)
     * @param accessLogSetting 
     */
    override fun accessLogSetting(accessLogSetting: AccessLogSettingProperty) {
      cdkBuilder.accessLogSetting(accessLogSetting.let(AccessLogSettingProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-accesslogsetting)
     * @param accessLogSetting 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("27fc057401a5d7a5d013ac2bb6d28842a5ff241951767bce13ec3850d1f787ad")
    override fun accessLogSetting(accessLogSetting: AccessLogSettingProperty.Builder.() -> Unit):
        Unit = accessLogSetting(AccessLogSettingProperty(accessLogSetting))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-auth)
     * @param auth 
     */
    override fun auth(auth: IResolvable) {
      cdkBuilder.auth(auth.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-auth)
     * @param auth 
     */
    override fun auth(auth: HttpApiAuthProperty) {
      cdkBuilder.auth(auth.let(HttpApiAuthProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-auth)
     * @param auth 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a779237a63b2c50dcc942019ee720af6ff6a169c8ee8100e54f5fbdbe7495cd9")
    override fun auth(auth: HttpApiAuthProperty.Builder.() -> Unit): Unit =
        auth(HttpApiAuthProperty(auth))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-corsconfiguration)
     * @param corsConfiguration 
     */
    override fun corsConfiguration(corsConfiguration: Boolean) {
      cdkBuilder.corsConfiguration(corsConfiguration)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-corsconfiguration)
     * @param corsConfiguration 
     */
    override fun corsConfiguration(corsConfiguration: IResolvable) {
      cdkBuilder.corsConfiguration(corsConfiguration.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-corsconfiguration)
     * @param corsConfiguration 
     */
    override fun corsConfiguration(corsConfiguration: CorsConfigurationObjectProperty) {
      cdkBuilder.corsConfiguration(corsConfiguration.let(CorsConfigurationObjectProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-corsconfiguration)
     * @param corsConfiguration 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c4352e90c50a24ba2c5ab20731e2d41f0d2cdd3c4b1c8c36a20b7145bd68ca5")
    override
        fun corsConfiguration(corsConfiguration: CorsConfigurationObjectProperty.Builder.() -> Unit):
        Unit = corsConfiguration(CorsConfigurationObjectProperty(corsConfiguration))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-defaultroutesettings)
     * @param defaultRouteSettings 
     */
    override fun defaultRouteSettings(defaultRouteSettings: IResolvable) {
      cdkBuilder.defaultRouteSettings(defaultRouteSettings.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-defaultroutesettings)
     * @param defaultRouteSettings 
     */
    override fun defaultRouteSettings(defaultRouteSettings: RouteSettingsProperty) {
      cdkBuilder.defaultRouteSettings(defaultRouteSettings.let(RouteSettingsProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-defaultroutesettings)
     * @param defaultRouteSettings 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d02f4ebd0b0030589ef3027f71a159ddd8df4faf6defa9c9b36f4f96faf2ded")
    override
        fun defaultRouteSettings(defaultRouteSettings: RouteSettingsProperty.Builder.() -> Unit):
        Unit = defaultRouteSettings(RouteSettingsProperty(defaultRouteSettings))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-definitionbody)
     * @param definitionBody 
     */
    override fun definitionBody(definitionBody: Any) {
      cdkBuilder.definitionBody(definitionBody)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-definitionuri)
     * @param definitionUri 
     */
    override fun definitionUri(definitionUri: String) {
      cdkBuilder.definitionUri(definitionUri)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-definitionuri)
     * @param definitionUri 
     */
    override fun definitionUri(definitionUri: IResolvable) {
      cdkBuilder.definitionUri(definitionUri.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-definitionuri)
     * @param definitionUri 
     */
    override fun definitionUri(definitionUri: S3LocationProperty) {
      cdkBuilder.definitionUri(definitionUri.let(S3LocationProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-definitionuri)
     * @param definitionUri 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ccd2a4751970c416ab43589ee56d5f47ba4322661d82c438df9fc9c7b171174")
    override fun definitionUri(definitionUri: S3LocationProperty.Builder.() -> Unit): Unit =
        definitionUri(S3LocationProperty(definitionUri))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-description)
     * @param description 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-disableexecuteapiendpoint)
     * @param disableExecuteApiEndpoint 
     */
    override fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
      cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-disableexecuteapiendpoint)
     * @param disableExecuteApiEndpoint 
     */
    override fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable) {
      cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-domain)
     * @param domain 
     */
    override fun domain(domain: IResolvable) {
      cdkBuilder.domain(domain.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-domain)
     * @param domain 
     */
    override fun domain(domain: HttpApiDomainConfigurationProperty) {
      cdkBuilder.domain(domain.let(HttpApiDomainConfigurationProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-domain)
     * @param domain 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("055db83241c767b60ce00b8122ea0426e3797afdd652679e11aa097044dae30c")
    override fun domain(domain: HttpApiDomainConfigurationProperty.Builder.() -> Unit): Unit =
        domain(HttpApiDomainConfigurationProperty(domain))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-failonwarnings)
     * @param failOnWarnings 
     */
    override fun failOnWarnings(failOnWarnings: Boolean) {
      cdkBuilder.failOnWarnings(failOnWarnings)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-failonwarnings)
     * @param failOnWarnings 
     */
    override fun failOnWarnings(failOnWarnings: IResolvable) {
      cdkBuilder.failOnWarnings(failOnWarnings.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-routesettings)
     * @param routeSettings 
     */
    override fun routeSettings(routeSettings: IResolvable) {
      cdkBuilder.routeSettings(routeSettings.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-routesettings)
     * @param routeSettings 
     */
    override fun routeSettings(routeSettings: RouteSettingsProperty) {
      cdkBuilder.routeSettings(routeSettings.let(RouteSettingsProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-routesettings)
     * @param routeSettings 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("93572e5fb6b2eb215ed7e170356249b7724ef9b63ed9dc5385838c39ee82aa8c")
    override fun routeSettings(routeSettings: RouteSettingsProperty.Builder.() -> Unit): Unit =
        routeSettings(RouteSettingsProperty(routeSettings))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-stagename)
     * @param stageName 
     */
    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-stagevariables)
     * @param stageVariables 
     */
    override fun stageVariables(stageVariables: IResolvable) {
      cdkBuilder.stageVariables(stageVariables.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-stagevariables)
     * @param stageVariables 
     */
    override fun stageVariables(stageVariables: Map<String, String>) {
      cdkBuilder.stageVariables(stageVariables)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-tags)
     * @param tags 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.sam.CfnHttpApi = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sam.CfnHttpApi.CFN_RESOURCE_TYPE_NAME

    public val REQUIRED_TRANSFORM: String =
        software.amazon.awscdk.services.sam.CfnHttpApi.REQUIRED_TRANSFORM

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnHttpApi {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnHttpApi(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnHttpApi): CfnHttpApi =
        CfnHttpApi(cdkObject)

    internal fun unwrap(wrapped: CfnHttpApi): software.amazon.awscdk.services.sam.CfnHttpApi =
        wrapped.cdkObject
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-accesslogsetting.html)
   */
  public interface AccessLogSettingProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-accesslogsetting.html#cfn-serverless-httpapi-accesslogsetting-destinationarn)
     */
    public fun destinationArn(): String? = unwrap(this).getDestinationArn()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-accesslogsetting.html#cfn-serverless-httpapi-accesslogsetting-format)
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
          software.amazon.awscdk.services.sam.CfnHttpApi.AccessLogSettingProperty.Builder =
          software.amazon.awscdk.services.sam.CfnHttpApi.AccessLogSettingProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.sam.CfnHttpApi.AccessLogSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnHttpApi.AccessLogSettingProperty,
    ) : CdkObject(cdkObject), AccessLogSettingProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-accesslogsetting.html#cfn-serverless-httpapi-accesslogsetting-destinationarn)
       */
      override fun destinationArn(): String? = unwrap(this).getDestinationArn()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-accesslogsetting.html#cfn-serverless-httpapi-accesslogsetting-format)
       */
      override fun format(): String? = unwrap(this).getFormat()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccessLogSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnHttpApi.AccessLogSettingProperty):
          AccessLogSettingProperty = CdkObjectWrappers.wrap(cdkObject) as? AccessLogSettingProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessLogSettingProperty):
          software.amazon.awscdk.services.sam.CfnHttpApi.AccessLogSettingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnHttpApi.AccessLogSettingProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-route53configuration.html)
   */
  public interface Route53ConfigurationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-route53configuration.html#cfn-serverless-httpapi-route53configuration-distributeddomainname)
     */
    public fun distributedDomainName(): String? = unwrap(this).getDistributedDomainName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-route53configuration.html#cfn-serverless-httpapi-route53configuration-evaluatetargethealth)
     */
    public fun evaluateTargetHealth(): Any? = unwrap(this).getEvaluateTargetHealth()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-route53configuration.html#cfn-serverless-httpapi-route53configuration-hostedzoneid)
     */
    public fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-route53configuration.html#cfn-serverless-httpapi-route53configuration-hostedzonename)
     */
    public fun hostedZoneName(): String? = unwrap(this).getHostedZoneName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-route53configuration.html#cfn-serverless-httpapi-route53configuration-ipv6)
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
          software.amazon.awscdk.services.sam.CfnHttpApi.Route53ConfigurationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnHttpApi.Route53ConfigurationProperty.builder()

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
        cdkBuilder.evaluateTargetHealth(evaluateTargetHealth.let(IResolvable::unwrap))
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
        cdkBuilder.ipV6(ipV6.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnHttpApi.Route53ConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnHttpApi.Route53ConfigurationProperty,
    ) : CdkObject(cdkObject), Route53ConfigurationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-route53configuration.html#cfn-serverless-httpapi-route53configuration-distributeddomainname)
       */
      override fun distributedDomainName(): String? = unwrap(this).getDistributedDomainName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-route53configuration.html#cfn-serverless-httpapi-route53configuration-evaluatetargethealth)
       */
      override fun evaluateTargetHealth(): Any? = unwrap(this).getEvaluateTargetHealth()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-route53configuration.html#cfn-serverless-httpapi-route53configuration-hostedzoneid)
       */
      override fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-route53configuration.html#cfn-serverless-httpapi-route53configuration-hostedzonename)
       */
      override fun hostedZoneName(): String? = unwrap(this).getHostedZoneName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-route53configuration.html#cfn-serverless-httpapi-route53configuration-ipv6)
       */
      override fun ipV6(): Any? = unwrap(this).getIpV6()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): Route53ConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnHttpApi.Route53ConfigurationProperty):
          Route53ConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          Route53ConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: Route53ConfigurationProperty):
          software.amazon.awscdk.services.sam.CfnHttpApi.Route53ConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnHttpApi.Route53ConfigurationProperty
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
   * HttpApiAuthProperty httpApiAuthProperty = HttpApiAuthProperty.builder()
   * .authorizers(authorizers)
   * .defaultAuthorizer("defaultAuthorizer")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-httpapiauth.html)
   */
  public interface HttpApiAuthProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-httpapiauth.html#cfn-serverless-httpapi-httpapiauth-authorizers)
     */
    public fun authorizers(): Any? = unwrap(this).getAuthorizers()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-httpapiauth.html#cfn-serverless-httpapi-httpapiauth-defaultauthorizer)
     */
    public fun defaultAuthorizer(): String? = unwrap(this).getDefaultAuthorizer()

    /**
     * A builder for [HttpApiAuthProperty]
     */
    @CdkDslMarker
    public interface Builder {
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
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiAuthProperty.Builder =
          software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiAuthProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiAuthProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiAuthProperty,
    ) : CdkObject(cdkObject), HttpApiAuthProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-httpapiauth.html#cfn-serverless-httpapi-httpapiauth-authorizers)
       */
      override fun authorizers(): Any? = unwrap(this).getAuthorizers()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-httpapiauth.html#cfn-serverless-httpapi-httpapiauth-defaultauthorizer)
       */
      override fun defaultAuthorizer(): String? = unwrap(this).getDefaultAuthorizer()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpApiAuthProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiAuthProperty):
          HttpApiAuthProperty = CdkObjectWrappers.wrap(cdkObject) as? HttpApiAuthProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpApiAuthProperty):
          software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiAuthProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiAuthProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-s3location.html)
   */
  public interface S3LocationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-s3location.html#cfn-serverless-httpapi-s3location-bucket)
     */
    public fun bucket(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-s3location.html#cfn-serverless-httpapi-s3location-key)
     */
    public fun key(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-s3location.html#cfn-serverless-httpapi-s3location-version)
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
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnHttpApi.S3LocationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnHttpApi.S3LocationProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.sam.CfnHttpApi.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnHttpApi.S3LocationProperty,
    ) : CdkObject(cdkObject), S3LocationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-s3location.html#cfn-serverless-httpapi-s3location-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-s3location.html#cfn-serverless-httpapi-s3location-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-s3location.html#cfn-serverless-httpapi-s3location-version)
       */
      override fun version(): Number = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnHttpApi.S3LocationProperty):
          S3LocationProperty = CdkObjectWrappers.wrap(cdkObject) as? S3LocationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.sam.CfnHttpApi.S3LocationProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.sam.CfnHttpApi.S3LocationProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * CorsConfigurationObjectProperty corsConfigurationObjectProperty =
   * CorsConfigurationObjectProperty.builder()
   * .allowCredentials(false)
   * .allowHeaders(List.of("allowHeaders"))
   * .allowMethods(List.of("allowMethods"))
   * .allowOrigins(List.of("allowOrigins"))
   * .exposeHeaders(List.of("exposeHeaders"))
   * .maxAge(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-corsconfigurationobject.html)
   */
  public interface CorsConfigurationObjectProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-corsconfigurationobject.html#cfn-serverless-httpapi-corsconfigurationobject-allowcredentials)
     */
    public fun allowCredentials(): Any? = unwrap(this).getAllowCredentials()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-corsconfigurationobject.html#cfn-serverless-httpapi-corsconfigurationobject-allowheaders)
     */
    public fun allowHeaders(): List<String> = unwrap(this).getAllowHeaders() ?: emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-corsconfigurationobject.html#cfn-serverless-httpapi-corsconfigurationobject-allowmethods)
     */
    public fun allowMethods(): List<String> = unwrap(this).getAllowMethods() ?: emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-corsconfigurationobject.html#cfn-serverless-httpapi-corsconfigurationobject-alloworigins)
     */
    public fun allowOrigins(): List<String> = unwrap(this).getAllowOrigins() ?: emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-corsconfigurationobject.html#cfn-serverless-httpapi-corsconfigurationobject-exposeheaders)
     */
    public fun exposeHeaders(): List<String> = unwrap(this).getExposeHeaders() ?: emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-corsconfigurationobject.html#cfn-serverless-httpapi-corsconfigurationobject-maxage)
     */
    public fun maxAge(): Number? = unwrap(this).getMaxAge()

    /**
     * A builder for [CorsConfigurationObjectProperty]
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
      public fun allowHeaders(allowHeaders: List<String>)

      /**
       * @param allowHeaders the value to be set.
       */
      public fun allowHeaders(vararg allowHeaders: String)

      /**
       * @param allowMethods the value to be set.
       */
      public fun allowMethods(allowMethods: List<String>)

      /**
       * @param allowMethods the value to be set.
       */
      public fun allowMethods(vararg allowMethods: String)

      /**
       * @param allowOrigins the value to be set.
       */
      public fun allowOrigins(allowOrigins: List<String>)

      /**
       * @param allowOrigins the value to be set.
       */
      public fun allowOrigins(vararg allowOrigins: String)

      /**
       * @param exposeHeaders the value to be set.
       */
      public fun exposeHeaders(exposeHeaders: List<String>)

      /**
       * @param exposeHeaders the value to be set.
       */
      public fun exposeHeaders(vararg exposeHeaders: String)

      /**
       * @param maxAge the value to be set.
       */
      public fun maxAge(maxAge: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnHttpApi.CorsConfigurationObjectProperty.Builder =
          software.amazon.awscdk.services.sam.CfnHttpApi.CorsConfigurationObjectProperty.builder()

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
        cdkBuilder.allowCredentials(allowCredentials.let(IResolvable::unwrap))
      }

      /**
       * @param allowHeaders the value to be set.
       */
      override fun allowHeaders(allowHeaders: List<String>) {
        cdkBuilder.allowHeaders(allowHeaders)
      }

      /**
       * @param allowHeaders the value to be set.
       */
      override fun allowHeaders(vararg allowHeaders: String): Unit =
          allowHeaders(allowHeaders.toList())

      /**
       * @param allowMethods the value to be set.
       */
      override fun allowMethods(allowMethods: List<String>) {
        cdkBuilder.allowMethods(allowMethods)
      }

      /**
       * @param allowMethods the value to be set.
       */
      override fun allowMethods(vararg allowMethods: String): Unit =
          allowMethods(allowMethods.toList())

      /**
       * @param allowOrigins the value to be set.
       */
      override fun allowOrigins(allowOrigins: List<String>) {
        cdkBuilder.allowOrigins(allowOrigins)
      }

      /**
       * @param allowOrigins the value to be set.
       */
      override fun allowOrigins(vararg allowOrigins: String): Unit =
          allowOrigins(allowOrigins.toList())

      /**
       * @param exposeHeaders the value to be set.
       */
      override fun exposeHeaders(exposeHeaders: List<String>) {
        cdkBuilder.exposeHeaders(exposeHeaders)
      }

      /**
       * @param exposeHeaders the value to be set.
       */
      override fun exposeHeaders(vararg exposeHeaders: String): Unit =
          exposeHeaders(exposeHeaders.toList())

      /**
       * @param maxAge the value to be set.
       */
      override fun maxAge(maxAge: Number) {
        cdkBuilder.maxAge(maxAge)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnHttpApi.CorsConfigurationObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnHttpApi.CorsConfigurationObjectProperty,
    ) : CdkObject(cdkObject), CorsConfigurationObjectProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-corsconfigurationobject.html#cfn-serverless-httpapi-corsconfigurationobject-allowcredentials)
       */
      override fun allowCredentials(): Any? = unwrap(this).getAllowCredentials()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-corsconfigurationobject.html#cfn-serverless-httpapi-corsconfigurationobject-allowheaders)
       */
      override fun allowHeaders(): List<String> = unwrap(this).getAllowHeaders() ?: emptyList()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-corsconfigurationobject.html#cfn-serverless-httpapi-corsconfigurationobject-allowmethods)
       */
      override fun allowMethods(): List<String> = unwrap(this).getAllowMethods() ?: emptyList()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-corsconfigurationobject.html#cfn-serverless-httpapi-corsconfigurationobject-alloworigins)
       */
      override fun allowOrigins(): List<String> = unwrap(this).getAllowOrigins() ?: emptyList()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-corsconfigurationobject.html#cfn-serverless-httpapi-corsconfigurationobject-exposeheaders)
       */
      override fun exposeHeaders(): List<String> = unwrap(this).getExposeHeaders() ?: emptyList()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-corsconfigurationobject.html#cfn-serverless-httpapi-corsconfigurationobject-maxage)
       */
      override fun maxAge(): Number? = unwrap(this).getMaxAge()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CorsConfigurationObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnHttpApi.CorsConfigurationObjectProperty):
          CorsConfigurationObjectProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CorsConfigurationObjectProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CorsConfigurationObjectProperty):
          software.amazon.awscdk.services.sam.CfnHttpApi.CorsConfigurationObjectProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnHttpApi.CorsConfigurationObjectProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * RouteSettingsProperty routeSettingsProperty = RouteSettingsProperty.builder()
   * .dataTraceEnabled(false)
   * .detailedMetricsEnabled(false)
   * .loggingLevel("loggingLevel")
   * .throttlingBurstLimit(123)
   * .throttlingRateLimit(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-routesettings.html)
   */
  public interface RouteSettingsProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-routesettings.html#cfn-serverless-httpapi-routesettings-datatraceenabled)
     */
    public fun dataTraceEnabled(): Any? = unwrap(this).getDataTraceEnabled()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-routesettings.html#cfn-serverless-httpapi-routesettings-detailedmetricsenabled)
     */
    public fun detailedMetricsEnabled(): Any? = unwrap(this).getDetailedMetricsEnabled()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-routesettings.html#cfn-serverless-httpapi-routesettings-logginglevel)
     */
    public fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-routesettings.html#cfn-serverless-httpapi-routesettings-throttlingburstlimit)
     */
    public fun throttlingBurstLimit(): Number? = unwrap(this).getThrottlingBurstLimit()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-routesettings.html#cfn-serverless-httpapi-routesettings-throttlingratelimit)
     */
    public fun throttlingRateLimit(): Number? = unwrap(this).getThrottlingRateLimit()

    /**
     * A builder for [RouteSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataTraceEnabled the value to be set.
       */
      public fun dataTraceEnabled(dataTraceEnabled: Boolean)

      /**
       * @param dataTraceEnabled the value to be set.
       */
      public fun dataTraceEnabled(dataTraceEnabled: IResolvable)

      /**
       * @param detailedMetricsEnabled the value to be set.
       */
      public fun detailedMetricsEnabled(detailedMetricsEnabled: Boolean)

      /**
       * @param detailedMetricsEnabled the value to be set.
       */
      public fun detailedMetricsEnabled(detailedMetricsEnabled: IResolvable)

      /**
       * @param loggingLevel the value to be set.
       */
      public fun loggingLevel(loggingLevel: String)

      /**
       * @param throttlingBurstLimit the value to be set.
       */
      public fun throttlingBurstLimit(throttlingBurstLimit: Number)

      /**
       * @param throttlingRateLimit the value to be set.
       */
      public fun throttlingRateLimit(throttlingRateLimit: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnHttpApi.RouteSettingsProperty.Builder =
          software.amazon.awscdk.services.sam.CfnHttpApi.RouteSettingsProperty.builder()

      /**
       * @param dataTraceEnabled the value to be set.
       */
      override fun dataTraceEnabled(dataTraceEnabled: Boolean) {
        cdkBuilder.dataTraceEnabled(dataTraceEnabled)
      }

      /**
       * @param dataTraceEnabled the value to be set.
       */
      override fun dataTraceEnabled(dataTraceEnabled: IResolvable) {
        cdkBuilder.dataTraceEnabled(dataTraceEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param detailedMetricsEnabled the value to be set.
       */
      override fun detailedMetricsEnabled(detailedMetricsEnabled: Boolean) {
        cdkBuilder.detailedMetricsEnabled(detailedMetricsEnabled)
      }

      /**
       * @param detailedMetricsEnabled the value to be set.
       */
      override fun detailedMetricsEnabled(detailedMetricsEnabled: IResolvable) {
        cdkBuilder.detailedMetricsEnabled(detailedMetricsEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param loggingLevel the value to be set.
       */
      override fun loggingLevel(loggingLevel: String) {
        cdkBuilder.loggingLevel(loggingLevel)
      }

      /**
       * @param throttlingBurstLimit the value to be set.
       */
      override fun throttlingBurstLimit(throttlingBurstLimit: Number) {
        cdkBuilder.throttlingBurstLimit(throttlingBurstLimit)
      }

      /**
       * @param throttlingRateLimit the value to be set.
       */
      override fun throttlingRateLimit(throttlingRateLimit: Number) {
        cdkBuilder.throttlingRateLimit(throttlingRateLimit)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnHttpApi.RouteSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sam.CfnHttpApi.RouteSettingsProperty,
    ) : CdkObject(cdkObject), RouteSettingsProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-routesettings.html#cfn-serverless-httpapi-routesettings-datatraceenabled)
       */
      override fun dataTraceEnabled(): Any? = unwrap(this).getDataTraceEnabled()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-routesettings.html#cfn-serverless-httpapi-routesettings-detailedmetricsenabled)
       */
      override fun detailedMetricsEnabled(): Any? = unwrap(this).getDetailedMetricsEnabled()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-routesettings.html#cfn-serverless-httpapi-routesettings-logginglevel)
       */
      override fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-routesettings.html#cfn-serverless-httpapi-routesettings-throttlingburstlimit)
       */
      override fun throttlingBurstLimit(): Number? = unwrap(this).getThrottlingBurstLimit()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-routesettings.html#cfn-serverless-httpapi-routesettings-throttlingratelimit)
       */
      override fun throttlingRateLimit(): Number? = unwrap(this).getThrottlingRateLimit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RouteSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnHttpApi.RouteSettingsProperty):
          RouteSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as? RouteSettingsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RouteSettingsProperty):
          software.amazon.awscdk.services.sam.CfnHttpApi.RouteSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnHttpApi.RouteSettingsProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * HttpApiDomainConfigurationProperty httpApiDomainConfigurationProperty =
   * HttpApiDomainConfigurationProperty.builder()
   * .certificateArn("certificateArn")
   * .domainName("domainName")
   * // the properties below are optional
   * .basePath("basePath")
   * .endpointConfiguration("endpointConfiguration")
   * .mutualTlsAuthentication(MutualTlsAuthenticationProperty.builder()
   * .truststoreUri("truststoreUri")
   * .truststoreVersion(false)
   * .build())
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-httpapidomainconfiguration.html)
   */
  public interface HttpApiDomainConfigurationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-httpapidomainconfiguration.html#cfn-serverless-httpapi-httpapidomainconfiguration-basepath)
     */
    public fun basePath(): String? = unwrap(this).getBasePath()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-httpapidomainconfiguration.html#cfn-serverless-httpapi-httpapidomainconfiguration-certificatearn)
     */
    public fun certificateArn(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-httpapidomainconfiguration.html#cfn-serverless-httpapi-httpapidomainconfiguration-domainname)
     */
    public fun domainName(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-httpapidomainconfiguration.html#cfn-serverless-httpapi-httpapidomainconfiguration-endpointconfiguration)
     */
    public fun endpointConfiguration(): String? = unwrap(this).getEndpointConfiguration()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-httpapidomainconfiguration.html#cfn-serverless-httpapi-httpapidomainconfiguration-mutualtlsauthentication)
     */
    public fun mutualTlsAuthentication(): Any? = unwrap(this).getMutualTlsAuthentication()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-httpapidomainconfiguration.html#cfn-serverless-httpapi-httpapidomainconfiguration-route53)
     */
    public fun route53(): Any? = unwrap(this).getRoute53()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-httpapidomainconfiguration.html#cfn-serverless-httpapi-httpapidomainconfiguration-securitypolicy)
     */
    public fun securityPolicy(): String? = unwrap(this).getSecurityPolicy()

    /**
     * A builder for [HttpApiDomainConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param basePath the value to be set.
       */
      public fun basePath(basePath: String)

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
      @JvmName("5ebbd369bbb40ad9e4f1179ca1cc8feae7276cbb795324b2f8da2fccf02b0b79")
      public
          fun mutualTlsAuthentication(mutualTlsAuthentication: MutualTlsAuthenticationProperty.Builder.() -> Unit)

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
      @JvmName("b6331a04a6ef8ba36f6b2651865c2f144da7d8b7b382edf672071be6f227a254")
      public fun route53(route53: Route53ConfigurationProperty.Builder.() -> Unit)

      /**
       * @param securityPolicy the value to be set.
       */
      public fun securityPolicy(securityPolicy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiDomainConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiDomainConfigurationProperty.builder()

      /**
       * @param basePath the value to be set.
       */
      override fun basePath(basePath: String) {
        cdkBuilder.basePath(basePath)
      }

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
        cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication.let(IResolvable::unwrap))
      }

      /**
       * @param mutualTlsAuthentication the value to be set.
       */
      override
          fun mutualTlsAuthentication(mutualTlsAuthentication: MutualTlsAuthenticationProperty) {
        cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication.let(MutualTlsAuthenticationProperty::unwrap))
      }

      /**
       * @param mutualTlsAuthentication the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5ebbd369bbb40ad9e4f1179ca1cc8feae7276cbb795324b2f8da2fccf02b0b79")
      override
          fun mutualTlsAuthentication(mutualTlsAuthentication: MutualTlsAuthenticationProperty.Builder.() -> Unit):
          Unit = mutualTlsAuthentication(MutualTlsAuthenticationProperty(mutualTlsAuthentication))

      /**
       * @param route53 the value to be set.
       */
      override fun route53(route53: IResolvable) {
        cdkBuilder.route53(route53.let(IResolvable::unwrap))
      }

      /**
       * @param route53 the value to be set.
       */
      override fun route53(route53: Route53ConfigurationProperty) {
        cdkBuilder.route53(route53.let(Route53ConfigurationProperty::unwrap))
      }

      /**
       * @param route53 the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b6331a04a6ef8ba36f6b2651865c2f144da7d8b7b382edf672071be6f227a254")
      override fun route53(route53: Route53ConfigurationProperty.Builder.() -> Unit): Unit =
          route53(Route53ConfigurationProperty(route53))

      /**
       * @param securityPolicy the value to be set.
       */
      override fun securityPolicy(securityPolicy: String) {
        cdkBuilder.securityPolicy(securityPolicy)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiDomainConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiDomainConfigurationProperty,
    ) : CdkObject(cdkObject), HttpApiDomainConfigurationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-httpapidomainconfiguration.html#cfn-serverless-httpapi-httpapidomainconfiguration-basepath)
       */
      override fun basePath(): String? = unwrap(this).getBasePath()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-httpapidomainconfiguration.html#cfn-serverless-httpapi-httpapidomainconfiguration-certificatearn)
       */
      override fun certificateArn(): String = unwrap(this).getCertificateArn()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-httpapidomainconfiguration.html#cfn-serverless-httpapi-httpapidomainconfiguration-domainname)
       */
      override fun domainName(): String = unwrap(this).getDomainName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-httpapidomainconfiguration.html#cfn-serverless-httpapi-httpapidomainconfiguration-endpointconfiguration)
       */
      override fun endpointConfiguration(): String? = unwrap(this).getEndpointConfiguration()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-httpapidomainconfiguration.html#cfn-serverless-httpapi-httpapidomainconfiguration-mutualtlsauthentication)
       */
      override fun mutualTlsAuthentication(): Any? = unwrap(this).getMutualTlsAuthentication()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-httpapidomainconfiguration.html#cfn-serverless-httpapi-httpapidomainconfiguration-route53)
       */
      override fun route53(): Any? = unwrap(this).getRoute53()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-httpapidomainconfiguration.html#cfn-serverless-httpapi-httpapidomainconfiguration-securitypolicy)
       */
      override fun securityPolicy(): String? = unwrap(this).getSecurityPolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          HttpApiDomainConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiDomainConfigurationProperty):
          HttpApiDomainConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HttpApiDomainConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpApiDomainConfigurationProperty):
          software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiDomainConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiDomainConfigurationProperty
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
   * .truststoreVersion(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-mutualtlsauthentication.html)
   */
  public interface MutualTlsAuthenticationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-mutualtlsauthentication.html#cfn-serverless-httpapi-mutualtlsauthentication-truststoreuri)
     */
    public fun truststoreUri(): String? = unwrap(this).getTruststoreUri()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-mutualtlsauthentication.html#cfn-serverless-httpapi-mutualtlsauthentication-truststoreversion)
     */
    public fun truststoreVersion(): Any? = unwrap(this).getTruststoreVersion()

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
      public fun truststoreVersion(truststoreVersion: Boolean)

      /**
       * @param truststoreVersion the value to be set.
       */
      public fun truststoreVersion(truststoreVersion: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnHttpApi.MutualTlsAuthenticationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnHttpApi.MutualTlsAuthenticationProperty.builder()

      /**
       * @param truststoreUri the value to be set.
       */
      override fun truststoreUri(truststoreUri: String) {
        cdkBuilder.truststoreUri(truststoreUri)
      }

      /**
       * @param truststoreVersion the value to be set.
       */
      override fun truststoreVersion(truststoreVersion: Boolean) {
        cdkBuilder.truststoreVersion(truststoreVersion)
      }

      /**
       * @param truststoreVersion the value to be set.
       */
      override fun truststoreVersion(truststoreVersion: IResolvable) {
        cdkBuilder.truststoreVersion(truststoreVersion.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnHttpApi.MutualTlsAuthenticationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnHttpApi.MutualTlsAuthenticationProperty,
    ) : CdkObject(cdkObject), MutualTlsAuthenticationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-mutualtlsauthentication.html#cfn-serverless-httpapi-mutualtlsauthentication-truststoreuri)
       */
      override fun truststoreUri(): String? = unwrap(this).getTruststoreUri()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-mutualtlsauthentication.html#cfn-serverless-httpapi-mutualtlsauthentication-truststoreversion)
       */
      override fun truststoreVersion(): Any? = unwrap(this).getTruststoreVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MutualTlsAuthenticationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnHttpApi.MutualTlsAuthenticationProperty):
          MutualTlsAuthenticationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MutualTlsAuthenticationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MutualTlsAuthenticationProperty):
          software.amazon.awscdk.services.sam.CfnHttpApi.MutualTlsAuthenticationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnHttpApi.MutualTlsAuthenticationProperty
    }
  }
}
