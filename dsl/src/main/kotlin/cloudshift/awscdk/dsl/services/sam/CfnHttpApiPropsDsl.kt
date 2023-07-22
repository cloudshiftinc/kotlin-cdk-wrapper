@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnHttpApi
import software.amazon.awscdk.services.sam.CfnHttpApiProps

/**
 * Properties for defining a `CfnHttpApi`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
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
@CdkDslMarker
public class CfnHttpApiPropsDsl {
  private val cdkBuilder: CfnHttpApiProps.Builder = CfnHttpApiProps.builder()

  /**
   * @param accessLogSetting the value to be set.
   */
  public fun accessLogSetting(accessLogSetting: IResolvable) {
    cdkBuilder.accessLogSetting(accessLogSetting)
  }

  /**
   * @param accessLogSetting the value to be set.
   */
  public fun accessLogSetting(accessLogSetting: CfnHttpApi.AccessLogSettingProperty) {
    cdkBuilder.accessLogSetting(accessLogSetting)
  }

  /**
   * @param auth the value to be set.
   */
  public fun auth(auth: IResolvable) {
    cdkBuilder.auth(auth)
  }

  /**
   * @param auth the value to be set.
   */
  public fun auth(auth: CfnHttpApi.HttpApiAuthProperty) {
    cdkBuilder.auth(auth)
  }

  /**
   * @param corsConfiguration the value to be set.
   */
  public fun corsConfiguration(corsConfiguration: Boolean) {
    cdkBuilder.corsConfiguration(corsConfiguration)
  }

  /**
   * @param corsConfiguration the value to be set.
   */
  public fun corsConfiguration(corsConfiguration: IResolvable) {
    cdkBuilder.corsConfiguration(corsConfiguration)
  }

  /**
   * @param corsConfiguration the value to be set.
   */
  public fun corsConfiguration(corsConfiguration: CfnHttpApi.CorsConfigurationObjectProperty) {
    cdkBuilder.corsConfiguration(corsConfiguration)
  }

  /**
   * @param defaultRouteSettings the value to be set.
   */
  public fun defaultRouteSettings(defaultRouteSettings: IResolvable) {
    cdkBuilder.defaultRouteSettings(defaultRouteSettings)
  }

  /**
   * @param defaultRouteSettings the value to be set.
   */
  public fun defaultRouteSettings(defaultRouteSettings: CfnHttpApi.RouteSettingsProperty) {
    cdkBuilder.defaultRouteSettings(defaultRouteSettings)
  }

  /**
   * @param definitionBody the value to be set.
   */
  public fun definitionBody(definitionBody: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(definitionBody)
    cdkBuilder.definitionBody(builder.map)
  }

  /**
   * @param definitionBody the value to be set.
   */
  public fun definitionBody(definitionBody: Any) {
    cdkBuilder.definitionBody(definitionBody)
  }

  /**
   * @param definitionUri the value to be set.
   */
  public fun definitionUri(definitionUri: String) {
    cdkBuilder.definitionUri(definitionUri)
  }

  /**
   * @param definitionUri the value to be set.
   */
  public fun definitionUri(definitionUri: IResolvable) {
    cdkBuilder.definitionUri(definitionUri)
  }

  /**
   * @param definitionUri the value to be set.
   */
  public fun definitionUri(definitionUri: CfnHttpApi.S3LocationProperty) {
    cdkBuilder.definitionUri(definitionUri)
  }

  /**
   * @param description the value to be set.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param disableExecuteApiEndpoint the value to be set.
   */
  public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
    cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
  }

  /**
   * @param disableExecuteApiEndpoint the value to be set.
   */
  public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable) {
    cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
  }

  /**
   * @param domain the value to be set.
   */
  public fun domain(domain: IResolvable) {
    cdkBuilder.domain(domain)
  }

  /**
   * @param domain the value to be set.
   */
  public fun domain(domain: CfnHttpApi.HttpApiDomainConfigurationProperty) {
    cdkBuilder.domain(domain)
  }

  /**
   * @param failOnWarnings the value to be set.
   */
  public fun failOnWarnings(failOnWarnings: Boolean) {
    cdkBuilder.failOnWarnings(failOnWarnings)
  }

  /**
   * @param failOnWarnings the value to be set.
   */
  public fun failOnWarnings(failOnWarnings: IResolvable) {
    cdkBuilder.failOnWarnings(failOnWarnings)
  }

  /**
   * @param routeSettings the value to be set.
   */
  public fun routeSettings(routeSettings: IResolvable) {
    cdkBuilder.routeSettings(routeSettings)
  }

  /**
   * @param routeSettings the value to be set.
   */
  public fun routeSettings(routeSettings: CfnHttpApi.RouteSettingsProperty) {
    cdkBuilder.routeSettings(routeSettings)
  }

  /**
   * @param stageName the value to be set.
   */
  public fun stageName(stageName: String) {
    cdkBuilder.stageName(stageName)
  }

  /**
   * @param stageVariables the value to be set.
   */
  public fun stageVariables(stageVariables: Map<String, String>) {
    cdkBuilder.stageVariables(stageVariables)
  }

  /**
   * @param stageVariables the value to be set.
   */
  public fun stageVariables(stageVariables: IResolvable) {
    cdkBuilder.stageVariables(stageVariables)
  }

  /**
   * @param tags the value to be set.
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnHttpApiProps = cdkBuilder.build()
}
