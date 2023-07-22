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
import software.amazon.awscdk.services.sam.CfnApiProps

@CdkDslMarker
public class CfnApiPropsDsl {
  private val cdkBuilder: CfnApiProps.Builder = CfnApiProps.builder()

  private val _binaryMediaTypes: MutableList<String> = mutableListOf()

  private val _methodSettings: MutableList<Any> = mutableListOf()

  /**
   * @param accessLogSetting the value to be set.
   */
  public fun accessLogSetting(accessLogSetting: IResolvable) {
    cdkBuilder.accessLogSetting(accessLogSetting)
  }

  /**
   * @param accessLogSetting the value to be set.
   */
  public fun accessLogSetting(accessLogSetting: CfnApi.AccessLogSettingProperty) {
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
  public fun auth(auth: CfnApi.AuthProperty) {
    cdkBuilder.auth(auth)
  }

  /**
   * @param binaryMediaTypes the value to be set.
   */
  public fun binaryMediaTypes(vararg binaryMediaTypes: String) {
    _binaryMediaTypes.addAll(listOf(*binaryMediaTypes))
  }

  /**
   * @param binaryMediaTypes the value to be set.
   */
  public fun binaryMediaTypes(binaryMediaTypes: Collection<String>) {
    _binaryMediaTypes.addAll(binaryMediaTypes)
  }

  /**
   * @param cacheClusterEnabled the value to be set.
   */
  public fun cacheClusterEnabled(cacheClusterEnabled: Boolean) {
    cdkBuilder.cacheClusterEnabled(cacheClusterEnabled)
  }

  /**
   * @param cacheClusterEnabled the value to be set.
   */
  public fun cacheClusterEnabled(cacheClusterEnabled: IResolvable) {
    cdkBuilder.cacheClusterEnabled(cacheClusterEnabled)
  }

  /**
   * @param cacheClusterSize the value to be set.
   */
  public fun cacheClusterSize(cacheClusterSize: String) {
    cdkBuilder.cacheClusterSize(cacheClusterSize)
  }

  /**
   * @param canarySetting the value to be set.
   */
  public fun canarySetting(canarySetting: IResolvable) {
    cdkBuilder.canarySetting(canarySetting)
  }

  /**
   * @param canarySetting the value to be set.
   */
  public fun canarySetting(canarySetting: CfnApi.CanarySettingProperty) {
    cdkBuilder.canarySetting(canarySetting)
  }

  /**
   * @param cors the value to be set.
   */
  public fun cors(cors: String) {
    cdkBuilder.cors(cors)
  }

  /**
   * @param cors the value to be set.
   */
  public fun cors(cors: IResolvable) {
    cdkBuilder.cors(cors)
  }

  /**
   * @param cors the value to be set.
   */
  public fun cors(cors: CfnApi.CorsConfigurationProperty) {
    cdkBuilder.cors(cors)
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
  public fun definitionUri(definitionUri: CfnApi.S3LocationProperty) {
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
  public fun domain(domain: CfnApi.DomainConfigurationProperty) {
    cdkBuilder.domain(domain)
  }

  /**
   * @param endpointConfiguration the value to be set.
   */
  public fun endpointConfiguration(endpointConfiguration: String) {
    cdkBuilder.endpointConfiguration(endpointConfiguration)
  }

  /**
   * @param endpointConfiguration the value to be set.
   */
  public fun endpointConfiguration(endpointConfiguration: IResolvable) {
    cdkBuilder.endpointConfiguration(endpointConfiguration)
  }

  /**
   * @param endpointConfiguration the value to be set.
   */
  public fun endpointConfiguration(endpointConfiguration: CfnApi.EndpointConfigurationProperty) {
    cdkBuilder.endpointConfiguration(endpointConfiguration)
  }

  /**
   * @param gatewayResponses the value to be set.
   */
  public fun gatewayResponses(gatewayResponses: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(gatewayResponses)
    cdkBuilder.gatewayResponses(builder.map)
  }

  /**
   * @param gatewayResponses the value to be set.
   */
  public fun gatewayResponses(gatewayResponses: Any) {
    cdkBuilder.gatewayResponses(gatewayResponses)
  }

  /**
   * @param methodSettings the value to be set.
   */
  public fun methodSettings(vararg methodSettings: Any) {
    _methodSettings.addAll(listOf(*methodSettings))
  }

  /**
   * @param methodSettings the value to be set.
   */
  public fun methodSettings(methodSettings: Collection<Any>) {
    _methodSettings.addAll(methodSettings)
  }

  /**
   * @param methodSettings the value to be set.
   */
  public fun methodSettings(methodSettings: IResolvable) {
    cdkBuilder.methodSettings(methodSettings)
  }

  /**
   * @param minimumCompressionSize the value to be set.
   */
  public fun minimumCompressionSize(minimumCompressionSize: Number) {
    cdkBuilder.minimumCompressionSize(minimumCompressionSize)
  }

  /**
   * @param models the value to be set.
   */
  public fun models(models: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(models)
    cdkBuilder.models(builder.map)
  }

  /**
   * @param models the value to be set.
   */
  public fun models(models: Any) {
    cdkBuilder.models(models)
  }

  /**
   * @param name the value to be set.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param openApiVersion the value to be set.
   */
  public fun openApiVersion(openApiVersion: String) {
    cdkBuilder.openApiVersion(openApiVersion)
  }

  /**
   * @param stageName the value to be set. 
   */
  public fun stageName(stageName: String) {
    cdkBuilder.stageName(stageName)
  }

  /**
   * @param tags the value to be set.
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  /**
   * @param tracingEnabled the value to be set.
   */
  public fun tracingEnabled(tracingEnabled: Boolean) {
    cdkBuilder.tracingEnabled(tracingEnabled)
  }

  /**
   * @param tracingEnabled the value to be set.
   */
  public fun tracingEnabled(tracingEnabled: IResolvable) {
    cdkBuilder.tracingEnabled(tracingEnabled)
  }

  /**
   * @param variables the value to be set.
   */
  public fun variables(variables: Map<String, String>) {
    cdkBuilder.variables(variables)
  }

  /**
   * @param variables the value to be set.
   */
  public fun variables(variables: IResolvable) {
    cdkBuilder.variables(variables)
  }

  public fun build(): CfnApiProps {
    if(_binaryMediaTypes.isNotEmpty()) cdkBuilder.binaryMediaTypes(_binaryMediaTypes)
    if(_methodSettings.isNotEmpty()) cdkBuilder.methodSettings(_methodSettings)
    return cdkBuilder.build()
  }
}
