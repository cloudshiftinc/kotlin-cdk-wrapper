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

  public fun accessLogSetting(accessLogSetting: IResolvable) {
    cdkBuilder.accessLogSetting(accessLogSetting)
  }

  public fun accessLogSetting(accessLogSetting: CfnApi.AccessLogSettingProperty) {
    cdkBuilder.accessLogSetting(accessLogSetting)
  }

  public fun auth(auth: IResolvable) {
    cdkBuilder.auth(auth)
  }

  public fun auth(auth: CfnApi.AuthProperty) {
    cdkBuilder.auth(auth)
  }

  public fun binaryMediaTypes(vararg binaryMediaTypes: String) {
    _binaryMediaTypes.addAll(listOf(*binaryMediaTypes))
  }

  public fun binaryMediaTypes(binaryMediaTypes: Collection<String>) {
    _binaryMediaTypes.addAll(binaryMediaTypes)
  }

  public fun cacheClusterEnabled(cacheClusterEnabled: Boolean) {
    cdkBuilder.cacheClusterEnabled(cacheClusterEnabled)
  }

  public fun cacheClusterEnabled(cacheClusterEnabled: IResolvable) {
    cdkBuilder.cacheClusterEnabled(cacheClusterEnabled)
  }

  public fun cacheClusterSize(cacheClusterSize: String) {
    cdkBuilder.cacheClusterSize(cacheClusterSize)
  }

  public fun canarySetting(canarySetting: IResolvable) {
    cdkBuilder.canarySetting(canarySetting)
  }

  public fun canarySetting(canarySetting: CfnApi.CanarySettingProperty) {
    cdkBuilder.canarySetting(canarySetting)
  }

  public fun cors(cors: String) {
    cdkBuilder.cors(cors)
  }

  public fun cors(cors: IResolvable) {
    cdkBuilder.cors(cors)
  }

  public fun cors(cors: CfnApi.CorsConfigurationProperty) {
    cdkBuilder.cors(cors)
  }

  public fun definitionBody(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.definitionBody(builder.map)
  }

  public fun definitionBody(definitionBody: Any) {
    cdkBuilder.definitionBody(definitionBody)
  }

  public fun definitionUri(definitionUri: String) {
    cdkBuilder.definitionUri(definitionUri)
  }

  public fun definitionUri(definitionUri: IResolvable) {
    cdkBuilder.definitionUri(definitionUri)
  }

  public fun definitionUri(definitionUri: CfnApi.S3LocationProperty) {
    cdkBuilder.definitionUri(definitionUri)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
    cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
  }

  public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable) {
    cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
  }

  public fun domain(domain: IResolvable) {
    cdkBuilder.domain(domain)
  }

  public fun domain(domain: CfnApi.DomainConfigurationProperty) {
    cdkBuilder.domain(domain)
  }

  public fun endpointConfiguration(endpointConfiguration: String) {
    cdkBuilder.endpointConfiguration(endpointConfiguration)
  }

  public fun endpointConfiguration(endpointConfiguration: IResolvable) {
    cdkBuilder.endpointConfiguration(endpointConfiguration)
  }

  public fun endpointConfiguration(endpointConfiguration: CfnApi.EndpointConfigurationProperty) {
    cdkBuilder.endpointConfiguration(endpointConfiguration)
  }

  public fun gatewayResponses(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.gatewayResponses(builder.map)
  }

  public fun gatewayResponses(gatewayResponses: Any) {
    cdkBuilder.gatewayResponses(gatewayResponses)
  }

  public fun methodSettings(vararg methodSettings: Any) {
    _methodSettings.addAll(listOf(*methodSettings))
  }

  public fun methodSettings(methodSettings: Collection<Any>) {
    _methodSettings.addAll(methodSettings)
  }

  public fun methodSettings(methodSettings: IResolvable) {
    cdkBuilder.methodSettings(methodSettings)
  }

  public fun minimumCompressionSize(minimumCompressionSize: Number) {
    cdkBuilder.minimumCompressionSize(minimumCompressionSize)
  }

  public fun models(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.models(builder.map)
  }

  public fun models(models: Any) {
    cdkBuilder.models(models)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun openApiVersion(openApiVersion: String) {
    cdkBuilder.openApiVersion(openApiVersion)
  }

  public fun stageName(stageName: String) {
    cdkBuilder.stageName(stageName)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun tracingEnabled(tracingEnabled: Boolean) {
    cdkBuilder.tracingEnabled(tracingEnabled)
  }

  public fun tracingEnabled(tracingEnabled: IResolvable) {
    cdkBuilder.tracingEnabled(tracingEnabled)
  }

  public fun variables(variables: Map<String, String>) {
    cdkBuilder.variables(variables)
  }

  public fun variables(variables: IResolvable) {
    cdkBuilder.variables(variables)
  }

  public fun build(): CfnApiProps {
    if(_binaryMediaTypes.isNotEmpty()) cdkBuilder.binaryMediaTypes(_binaryMediaTypes)
    if(_methodSettings.isNotEmpty()) cdkBuilder.methodSettings(_methodSettings)
    return cdkBuilder.build()
  }
}
