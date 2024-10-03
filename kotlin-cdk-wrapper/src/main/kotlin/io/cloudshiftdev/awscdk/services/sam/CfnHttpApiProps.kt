@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sam

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnHttpApi`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sam.*;
 * Object authorizers;
 * Object definitionBody;
 * CfnHttpApiProps cfnHttpApiProps = CfnHttpApiProps.builder()
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
public interface CfnHttpApiProps {
  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-accesslogsetting)
   */
  public fun accessLogSetting(): Any? = unwrap(this).getAccessLogSetting()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-auth)
   */
  public fun auth(): Any? = unwrap(this).getAuth()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-corsconfiguration)
   */
  public fun corsConfiguration(): Any? = unwrap(this).getCorsConfiguration()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-defaultroutesettings)
   */
  public fun defaultRouteSettings(): Any? = unwrap(this).getDefaultRouteSettings()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-definitionbody)
   */
  public fun definitionBody(): Any? = unwrap(this).getDefinitionBody()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-definitionuri)
   */
  public fun definitionUri(): Any? = unwrap(this).getDefinitionUri()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-disableexecuteapiendpoint)
   */
  public fun disableExecuteApiEndpoint(): Any? = unwrap(this).getDisableExecuteApiEndpoint()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-domain)
   */
  public fun domain(): Any? = unwrap(this).getDomain()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-failonwarnings)
   */
  public fun failOnWarnings(): Any? = unwrap(this).getFailOnWarnings()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-routesettings)
   */
  public fun routeSettings(): Any? = unwrap(this).getRouteSettings()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-stagename)
   */
  public fun stageName(): String? = unwrap(this).getStageName()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-stagevariables)
   */
  public fun stageVariables(): Any? = unwrap(this).getStageVariables()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnHttpApiProps]
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
    public fun accessLogSetting(accessLogSetting: CfnHttpApi.AccessLogSettingProperty)

    /**
     * @param accessLogSetting the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09068efdb9c2683f0c465bcd333d9cb540f38d182ef8e6f1fd06d3c0020f9f08")
    public
        fun accessLogSetting(accessLogSetting: CfnHttpApi.AccessLogSettingProperty.Builder.() -> Unit)

    /**
     * @param auth the value to be set.
     */
    public fun auth(auth: IResolvable)

    /**
     * @param auth the value to be set.
     */
    public fun auth(auth: CfnHttpApi.HttpApiAuthProperty)

    /**
     * @param auth the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f63580763c1c4f282e993a4d241c9dfdf6ff645322ec977550b70a843ff388b1")
    public fun auth(auth: CfnHttpApi.HttpApiAuthProperty.Builder.() -> Unit)

    /**
     * @param corsConfiguration the value to be set.
     */
    public fun corsConfiguration(corsConfiguration: Boolean)

    /**
     * @param corsConfiguration the value to be set.
     */
    public fun corsConfiguration(corsConfiguration: IResolvable)

    /**
     * @param corsConfiguration the value to be set.
     */
    public fun corsConfiguration(corsConfiguration: CfnHttpApi.CorsConfigurationObjectProperty)

    /**
     * @param corsConfiguration the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04c7c724eb84c5fdfd2634890a94e5551f9bc279a59f57e0f0e5c233a7154872")
    public
        fun corsConfiguration(corsConfiguration: CfnHttpApi.CorsConfigurationObjectProperty.Builder.() -> Unit)

    /**
     * @param defaultRouteSettings the value to be set.
     */
    public fun defaultRouteSettings(defaultRouteSettings: IResolvable)

    /**
     * @param defaultRouteSettings the value to be set.
     */
    public fun defaultRouteSettings(defaultRouteSettings: CfnHttpApi.RouteSettingsProperty)

    /**
     * @param defaultRouteSettings the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("65f4ec663cd5480f7e8233e73433e961a964e7014b4d040ecea147f0c8b95003")
    public
        fun defaultRouteSettings(defaultRouteSettings: CfnHttpApi.RouteSettingsProperty.Builder.() -> Unit)

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
    public fun definitionUri(definitionUri: CfnHttpApi.S3LocationProperty)

    /**
     * @param definitionUri the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99c215c313f32e6960f1c476d76c3307143942b6baf77187dfc3b22aafbe959f")
    public fun definitionUri(definitionUri: CfnHttpApi.S3LocationProperty.Builder.() -> Unit)

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
    public fun domain(domain: CfnHttpApi.HttpApiDomainConfigurationProperty)

    /**
     * @param domain the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4b1d044c1c3abeb9be9a10633c951afe09ea79f29f365a611869222784109060")
    public fun domain(domain: CfnHttpApi.HttpApiDomainConfigurationProperty.Builder.() -> Unit)

    /**
     * @param failOnWarnings the value to be set.
     */
    public fun failOnWarnings(failOnWarnings: Boolean)

    /**
     * @param failOnWarnings the value to be set.
     */
    public fun failOnWarnings(failOnWarnings: IResolvable)

    /**
     * @param routeSettings the value to be set.
     */
    public fun routeSettings(routeSettings: IResolvable)

    /**
     * @param routeSettings the value to be set.
     */
    public fun routeSettings(routeSettings: CfnHttpApi.RouteSettingsProperty)

    /**
     * @param routeSettings the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4f6ecd638f87106f3f69085fbadbb9a571e27b70bf22fb2996c5968efb64ba40")
    public fun routeSettings(routeSettings: CfnHttpApi.RouteSettingsProperty.Builder.() -> Unit)

    /**
     * @param stageName the value to be set.
     */
    public fun stageName(stageName: String)

    /**
     * @param stageVariables the value to be set.
     */
    public fun stageVariables(stageVariables: IResolvable)

    /**
     * @param stageVariables the value to be set.
     */
    public fun stageVariables(stageVariables: Map<String, String>)

    /**
     * @param tags the value to be set.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sam.CfnHttpApiProps.Builder =
        software.amazon.awscdk.services.sam.CfnHttpApiProps.builder()

    /**
     * @param accessLogSetting the value to be set.
     */
    override fun accessLogSetting(accessLogSetting: IResolvable) {
      cdkBuilder.accessLogSetting(accessLogSetting.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param accessLogSetting the value to be set.
     */
    override fun accessLogSetting(accessLogSetting: CfnHttpApi.AccessLogSettingProperty) {
      cdkBuilder.accessLogSetting(accessLogSetting.let(CfnHttpApi.AccessLogSettingProperty.Companion::unwrap))
    }

    /**
     * @param accessLogSetting the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09068efdb9c2683f0c465bcd333d9cb540f38d182ef8e6f1fd06d3c0020f9f08")
    override
        fun accessLogSetting(accessLogSetting: CfnHttpApi.AccessLogSettingProperty.Builder.() -> Unit):
        Unit = accessLogSetting(CfnHttpApi.AccessLogSettingProperty(accessLogSetting))

    /**
     * @param auth the value to be set.
     */
    override fun auth(auth: IResolvable) {
      cdkBuilder.auth(auth.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param auth the value to be set.
     */
    override fun auth(auth: CfnHttpApi.HttpApiAuthProperty) {
      cdkBuilder.auth(auth.let(CfnHttpApi.HttpApiAuthProperty.Companion::unwrap))
    }

    /**
     * @param auth the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f63580763c1c4f282e993a4d241c9dfdf6ff645322ec977550b70a843ff388b1")
    override fun auth(auth: CfnHttpApi.HttpApiAuthProperty.Builder.() -> Unit): Unit =
        auth(CfnHttpApi.HttpApiAuthProperty(auth))

    /**
     * @param corsConfiguration the value to be set.
     */
    override fun corsConfiguration(corsConfiguration: Boolean) {
      cdkBuilder.corsConfiguration(corsConfiguration)
    }

    /**
     * @param corsConfiguration the value to be set.
     */
    override fun corsConfiguration(corsConfiguration: IResolvable) {
      cdkBuilder.corsConfiguration(corsConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param corsConfiguration the value to be set.
     */
    override fun corsConfiguration(corsConfiguration: CfnHttpApi.CorsConfigurationObjectProperty) {
      cdkBuilder.corsConfiguration(corsConfiguration.let(CfnHttpApi.CorsConfigurationObjectProperty.Companion::unwrap))
    }

    /**
     * @param corsConfiguration the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04c7c724eb84c5fdfd2634890a94e5551f9bc279a59f57e0f0e5c233a7154872")
    override
        fun corsConfiguration(corsConfiguration: CfnHttpApi.CorsConfigurationObjectProperty.Builder.() -> Unit):
        Unit = corsConfiguration(CfnHttpApi.CorsConfigurationObjectProperty(corsConfiguration))

    /**
     * @param defaultRouteSettings the value to be set.
     */
    override fun defaultRouteSettings(defaultRouteSettings: IResolvable) {
      cdkBuilder.defaultRouteSettings(defaultRouteSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param defaultRouteSettings the value to be set.
     */
    override fun defaultRouteSettings(defaultRouteSettings: CfnHttpApi.RouteSettingsProperty) {
      cdkBuilder.defaultRouteSettings(defaultRouteSettings.let(CfnHttpApi.RouteSettingsProperty.Companion::unwrap))
    }

    /**
     * @param defaultRouteSettings the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("65f4ec663cd5480f7e8233e73433e961a964e7014b4d040ecea147f0c8b95003")
    override
        fun defaultRouteSettings(defaultRouteSettings: CfnHttpApi.RouteSettingsProperty.Builder.() -> Unit):
        Unit = defaultRouteSettings(CfnHttpApi.RouteSettingsProperty(defaultRouteSettings))

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
    override fun definitionUri(definitionUri: CfnHttpApi.S3LocationProperty) {
      cdkBuilder.definitionUri(definitionUri.let(CfnHttpApi.S3LocationProperty.Companion::unwrap))
    }

    /**
     * @param definitionUri the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99c215c313f32e6960f1c476d76c3307143942b6baf77187dfc3b22aafbe959f")
    override fun definitionUri(definitionUri: CfnHttpApi.S3LocationProperty.Builder.() -> Unit):
        Unit = definitionUri(CfnHttpApi.S3LocationProperty(definitionUri))

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
    override fun domain(domain: CfnHttpApi.HttpApiDomainConfigurationProperty) {
      cdkBuilder.domain(domain.let(CfnHttpApi.HttpApiDomainConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param domain the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4b1d044c1c3abeb9be9a10633c951afe09ea79f29f365a611869222784109060")
    override fun domain(domain: CfnHttpApi.HttpApiDomainConfigurationProperty.Builder.() -> Unit):
        Unit = domain(CfnHttpApi.HttpApiDomainConfigurationProperty(domain))

    /**
     * @param failOnWarnings the value to be set.
     */
    override fun failOnWarnings(failOnWarnings: Boolean) {
      cdkBuilder.failOnWarnings(failOnWarnings)
    }

    /**
     * @param failOnWarnings the value to be set.
     */
    override fun failOnWarnings(failOnWarnings: IResolvable) {
      cdkBuilder.failOnWarnings(failOnWarnings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param routeSettings the value to be set.
     */
    override fun routeSettings(routeSettings: IResolvable) {
      cdkBuilder.routeSettings(routeSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param routeSettings the value to be set.
     */
    override fun routeSettings(routeSettings: CfnHttpApi.RouteSettingsProperty) {
      cdkBuilder.routeSettings(routeSettings.let(CfnHttpApi.RouteSettingsProperty.Companion::unwrap))
    }

    /**
     * @param routeSettings the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4f6ecd638f87106f3f69085fbadbb9a571e27b70bf22fb2996c5968efb64ba40")
    override fun routeSettings(routeSettings: CfnHttpApi.RouteSettingsProperty.Builder.() -> Unit):
        Unit = routeSettings(CfnHttpApi.RouteSettingsProperty(routeSettings))

    /**
     * @param stageName the value to be set.
     */
    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    /**
     * @param stageVariables the value to be set.
     */
    override fun stageVariables(stageVariables: IResolvable) {
      cdkBuilder.stageVariables(stageVariables.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param stageVariables the value to be set.
     */
    override fun stageVariables(stageVariables: Map<String, String>) {
      cdkBuilder.stageVariables(stageVariables)
    }

    /**
     * @param tags the value to be set.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.sam.CfnHttpApiProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sam.CfnHttpApiProps,
  ) : CdkObject(cdkObject),
      CfnHttpApiProps {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-accesslogsetting)
     */
    override fun accessLogSetting(): Any? = unwrap(this).getAccessLogSetting()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-auth)
     */
    override fun auth(): Any? = unwrap(this).getAuth()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-corsconfiguration)
     */
    override fun corsConfiguration(): Any? = unwrap(this).getCorsConfiguration()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-defaultroutesettings)
     */
    override fun defaultRouteSettings(): Any? = unwrap(this).getDefaultRouteSettings()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-definitionbody)
     */
    override fun definitionBody(): Any? = unwrap(this).getDefinitionBody()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-definitionuri)
     */
    override fun definitionUri(): Any? = unwrap(this).getDefinitionUri()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-disableexecuteapiendpoint)
     */
    override fun disableExecuteApiEndpoint(): Any? = unwrap(this).getDisableExecuteApiEndpoint()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-domain)
     */
    override fun domain(): Any? = unwrap(this).getDomain()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-failonwarnings)
     */
    override fun failOnWarnings(): Any? = unwrap(this).getFailOnWarnings()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-routesettings)
     */
    override fun routeSettings(): Any? = unwrap(this).getRouteSettings()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-stagename)
     */
    override fun stageName(): String? = unwrap(this).getStageName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-stagevariables)
     */
    override fun stageVariables(): Any? = unwrap(this).getStageVariables()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnHttpApiProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnHttpApiProps):
        CfnHttpApiProps = CdkObjectWrappers.wrap(cdkObject) as? CfnHttpApiProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnHttpApiProps):
        software.amazon.awscdk.services.sam.CfnHttpApiProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.sam.CfnHttpApiProps
  }
}
