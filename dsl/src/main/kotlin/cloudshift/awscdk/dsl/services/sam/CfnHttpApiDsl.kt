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
import software.constructs.Construct

/**
 * Definition of AWS::Serverless::HttpApi.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
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
@CdkDslMarker
public class CfnHttpApiDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnHttpApi.Builder = CfnHttpApi.Builder.create(scope, id)

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-accesslogsetting)
   * @param accessLogSetting 
   */
  public fun accessLogSetting(accessLogSetting: IResolvable) {
    cdkBuilder.accessLogSetting(accessLogSetting)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-accesslogsetting)
   * @param accessLogSetting 
   */
  public fun accessLogSetting(accessLogSetting: CfnHttpApi.AccessLogSettingProperty) {
    cdkBuilder.accessLogSetting(accessLogSetting)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-auth)
   * @param auth 
   */
  public fun auth(auth: IResolvable) {
    cdkBuilder.auth(auth)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-auth)
   * @param auth 
   */
  public fun auth(auth: CfnHttpApi.HttpApiAuthProperty) {
    cdkBuilder.auth(auth)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-corsconfiguration)
   * @param corsConfiguration 
   */
  public fun corsConfiguration(corsConfiguration: Boolean) {
    cdkBuilder.corsConfiguration(corsConfiguration)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-corsconfiguration)
   * @param corsConfiguration 
   */
  public fun corsConfiguration(corsConfiguration: IResolvable) {
    cdkBuilder.corsConfiguration(corsConfiguration)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-corsconfiguration)
   * @param corsConfiguration 
   */
  public fun corsConfiguration(corsConfiguration: CfnHttpApi.CorsConfigurationObjectProperty) {
    cdkBuilder.corsConfiguration(corsConfiguration)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-defaultroutesettings)
   * @param defaultRouteSettings 
   */
  public fun defaultRouteSettings(defaultRouteSettings: IResolvable) {
    cdkBuilder.defaultRouteSettings(defaultRouteSettings)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-defaultroutesettings)
   * @param defaultRouteSettings 
   */
  public fun defaultRouteSettings(defaultRouteSettings: CfnHttpApi.RouteSettingsProperty) {
    cdkBuilder.defaultRouteSettings(defaultRouteSettings)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-definitionbody)
   * @param definitionBody 
   */
  public fun definitionBody(definitionBody: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(definitionBody)
    cdkBuilder.definitionBody(builder.map)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-definitionbody)
   * @param definitionBody 
   */
  public fun definitionBody(definitionBody: Any) {
    cdkBuilder.definitionBody(definitionBody)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-definitionuri)
   * @param definitionUri 
   */
  public fun definitionUri(definitionUri: String) {
    cdkBuilder.definitionUri(definitionUri)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-definitionuri)
   * @param definitionUri 
   */
  public fun definitionUri(definitionUri: IResolvable) {
    cdkBuilder.definitionUri(definitionUri)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-definitionuri)
   * @param definitionUri 
   */
  public fun definitionUri(definitionUri: CfnHttpApi.S3LocationProperty) {
    cdkBuilder.definitionUri(definitionUri)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-description)
   * @param description 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-disableexecuteapiendpoint)
   * @param disableExecuteApiEndpoint 
   */
  public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
    cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-disableexecuteapiendpoint)
   * @param disableExecuteApiEndpoint 
   */
  public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable) {
    cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-domain)
   * @param domain 
   */
  public fun domain(domain: IResolvable) {
    cdkBuilder.domain(domain)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-domain)
   * @param domain 
   */
  public fun domain(domain: CfnHttpApi.HttpApiDomainConfigurationProperty) {
    cdkBuilder.domain(domain)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-failonwarnings)
   * @param failOnWarnings 
   */
  public fun failOnWarnings(failOnWarnings: Boolean) {
    cdkBuilder.failOnWarnings(failOnWarnings)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-failonwarnings)
   * @param failOnWarnings 
   */
  public fun failOnWarnings(failOnWarnings: IResolvable) {
    cdkBuilder.failOnWarnings(failOnWarnings)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-routesettings)
   * @param routeSettings 
   */
  public fun routeSettings(routeSettings: IResolvable) {
    cdkBuilder.routeSettings(routeSettings)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-routesettings)
   * @param routeSettings 
   */
  public fun routeSettings(routeSettings: CfnHttpApi.RouteSettingsProperty) {
    cdkBuilder.routeSettings(routeSettings)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-stagename)
   * @param stageName 
   */
  public fun stageName(stageName: String) {
    cdkBuilder.stageName(stageName)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-stagevariables)
   * @param stageVariables 
   */
  public fun stageVariables(stageVariables: Map<String, String>) {
    cdkBuilder.stageVariables(stageVariables)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-stagevariables)
   * @param stageVariables 
   */
  public fun stageVariables(stageVariables: IResolvable) {
    cdkBuilder.stageVariables(stageVariables)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-httpapi.html#cfn-serverless-httpapi-tags)
   * @param tags 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnHttpApi = cdkBuilder.build()
}
