@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnApi
import software.constructs.Construct

/**
 * Definition of AWS::Serverless::Api.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
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
@CdkDslMarker
public class CfnApiDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnApi.Builder = CfnApi.Builder.create(scope, id)

  private val _binaryMediaTypes: MutableList<String> = mutableListOf()

  private val _methodSettings: MutableList<Any> = mutableListOf()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-accesslogsetting)
   * @param accessLogSetting 
   */
  public fun accessLogSetting(accessLogSetting: IResolvable) {
    cdkBuilder.accessLogSetting(accessLogSetting)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-accesslogsetting)
   * @param accessLogSetting 
   */
  public fun accessLogSetting(accessLogSetting: CfnApi.AccessLogSettingProperty) {
    cdkBuilder.accessLogSetting(accessLogSetting)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-auth)
   * @param auth 
   */
  public fun auth(auth: IResolvable) {
    cdkBuilder.auth(auth)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-auth)
   * @param auth 
   */
  public fun auth(auth: CfnApi.AuthProperty) {
    cdkBuilder.auth(auth)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-binarymediatypes)
   * @param binaryMediaTypes 
   */
  public fun binaryMediaTypes(vararg binaryMediaTypes: String) {
    _binaryMediaTypes.addAll(listOf(*binaryMediaTypes))
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-binarymediatypes)
   * @param binaryMediaTypes 
   */
  public fun binaryMediaTypes(binaryMediaTypes: Collection<String>) {
    _binaryMediaTypes.addAll(binaryMediaTypes)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-cacheclusterenabled)
   * @param cacheClusterEnabled 
   */
  public fun cacheClusterEnabled(cacheClusterEnabled: Boolean) {
    cdkBuilder.cacheClusterEnabled(cacheClusterEnabled)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-cacheclusterenabled)
   * @param cacheClusterEnabled 
   */
  public fun cacheClusterEnabled(cacheClusterEnabled: IResolvable) {
    cdkBuilder.cacheClusterEnabled(cacheClusterEnabled)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-cacheclustersize)
   * @param cacheClusterSize 
   */
  public fun cacheClusterSize(cacheClusterSize: String) {
    cdkBuilder.cacheClusterSize(cacheClusterSize)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-canarysetting)
   * @param canarySetting 
   */
  public fun canarySetting(canarySetting: IResolvable) {
    cdkBuilder.canarySetting(canarySetting)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-canarysetting)
   * @param canarySetting 
   */
  public fun canarySetting(canarySetting: CfnApi.CanarySettingProperty) {
    cdkBuilder.canarySetting(canarySetting)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-cors)
   * @param cors 
   */
  public fun cors(cors: String) {
    cdkBuilder.cors(cors)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-cors)
   * @param cors 
   */
  public fun cors(cors: IResolvable) {
    cdkBuilder.cors(cors)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-cors)
   * @param cors 
   */
  public fun cors(cors: CfnApi.CorsConfigurationProperty) {
    cdkBuilder.cors(cors)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-definitionbody)
   * @param definitionBody 
   */
  public fun definitionBody(definitionBody: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(definitionBody)
    cdkBuilder.definitionBody(builder.map)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-definitionbody)
   * @param definitionBody 
   */
  public fun definitionBody(definitionBody: Any) {
    cdkBuilder.definitionBody(definitionBody)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-definitionuri)
   * @param definitionUri 
   */
  public fun definitionUri(definitionUri: String) {
    cdkBuilder.definitionUri(definitionUri)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-definitionuri)
   * @param definitionUri 
   */
  public fun definitionUri(definitionUri: IResolvable) {
    cdkBuilder.definitionUri(definitionUri)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-definitionuri)
   * @param definitionUri 
   */
  public fun definitionUri(definitionUri: CfnApi.S3LocationProperty) {
    cdkBuilder.definitionUri(definitionUri)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-description)
   * @param description 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-disableexecuteapiendpoint)
   * @param disableExecuteApiEndpoint 
   */
  public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
    cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-disableexecuteapiendpoint)
   * @param disableExecuteApiEndpoint 
   */
  public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable) {
    cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-domain)
   * @param domain 
   */
  public fun domain(domain: IResolvable) {
    cdkBuilder.domain(domain)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-domain)
   * @param domain 
   */
  public fun domain(domain: CfnApi.DomainConfigurationProperty) {
    cdkBuilder.domain(domain)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-endpointconfiguration)
   * @param endpointConfiguration 
   */
  public fun endpointConfiguration(endpointConfiguration: String) {
    cdkBuilder.endpointConfiguration(endpointConfiguration)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-endpointconfiguration)
   * @param endpointConfiguration 
   */
  public fun endpointConfiguration(endpointConfiguration: IResolvable) {
    cdkBuilder.endpointConfiguration(endpointConfiguration)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-endpointconfiguration)
   * @param endpointConfiguration 
   */
  public fun endpointConfiguration(endpointConfiguration: CfnApi.EndpointConfigurationProperty) {
    cdkBuilder.endpointConfiguration(endpointConfiguration)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-gatewayresponses)
   * @param gatewayResponses 
   */
  public fun gatewayResponses(gatewayResponses: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(gatewayResponses)
    cdkBuilder.gatewayResponses(builder.map)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-gatewayresponses)
   * @param gatewayResponses 
   */
  public fun gatewayResponses(gatewayResponses: Any) {
    cdkBuilder.gatewayResponses(gatewayResponses)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-methodsettings)
   * @param methodSettings 
   */
  public fun methodSettings(vararg methodSettings: Any) {
    _methodSettings.addAll(listOf(*methodSettings))
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-methodsettings)
   * @param methodSettings 
   */
  public fun methodSettings(methodSettings: Collection<Any>) {
    _methodSettings.addAll(methodSettings)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-methodsettings)
   * @param methodSettings 
   */
  public fun methodSettings(methodSettings: IResolvable) {
    cdkBuilder.methodSettings(methodSettings)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-minimumcompressionsize)
   * @param minimumCompressionSize 
   */
  public fun minimumCompressionSize(minimumCompressionSize: Number) {
    cdkBuilder.minimumCompressionSize(minimumCompressionSize)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-models)
   * @param models 
   */
  public fun models(models: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(models)
    cdkBuilder.models(builder.map)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-models)
   * @param models 
   */
  public fun models(models: Any) {
    cdkBuilder.models(models)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-name)
   * @param name 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-openapiversion)
   * @param openApiVersion 
   */
  public fun openApiVersion(openApiVersion: String) {
    cdkBuilder.openApiVersion(openApiVersion)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-stagename)
   * @param stageName 
   */
  public fun stageName(stageName: String) {
    cdkBuilder.stageName(stageName)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-tags)
   * @param tags 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-tracingenabled)
   * @param tracingEnabled 
   */
  public fun tracingEnabled(tracingEnabled: Boolean) {
    cdkBuilder.tracingEnabled(tracingEnabled)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-tracingenabled)
   * @param tracingEnabled 
   */
  public fun tracingEnabled(tracingEnabled: IResolvable) {
    cdkBuilder.tracingEnabled(tracingEnabled)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-variables)
   * @param variables 
   */
  public fun variables(variables: Map<String, String>) {
    cdkBuilder.variables(variables)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-api.html#cfn-serverless-api-variables)
   * @param variables 
   */
  public fun variables(variables: IResolvable) {
    cdkBuilder.variables(variables)
  }

  public fun build(): CfnApi {
    if(_binaryMediaTypes.isNotEmpty()) cdkBuilder.binaryMediaTypes(_binaryMediaTypes)
    if(_methodSettings.isNotEmpty()) cdkBuilder.methodSettings(_methodSettings)
    return cdkBuilder.build()
  }
}
