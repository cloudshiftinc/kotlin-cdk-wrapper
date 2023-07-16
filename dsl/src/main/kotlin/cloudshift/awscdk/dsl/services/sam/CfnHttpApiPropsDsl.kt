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

@CdkDslMarker
public class CfnHttpApiPropsDsl {
  private val cdkBuilder: CfnHttpApiProps.Builder = CfnHttpApiProps.builder()

  public fun accessLogSetting(accessLogSetting: IResolvable) {
    cdkBuilder.accessLogSetting(accessLogSetting)
  }

  public fun accessLogSetting(accessLogSetting: CfnHttpApi.AccessLogSettingProperty) {
    cdkBuilder.accessLogSetting(accessLogSetting)
  }

  public fun auth(auth: IResolvable) {
    cdkBuilder.auth(auth)
  }

  public fun auth(auth: CfnHttpApi.HttpApiAuthProperty) {
    cdkBuilder.auth(auth)
  }

  public fun corsConfiguration(corsConfiguration: Boolean) {
    cdkBuilder.corsConfiguration(corsConfiguration)
  }

  public fun corsConfiguration(corsConfiguration: IResolvable) {
    cdkBuilder.corsConfiguration(corsConfiguration)
  }

  public fun corsConfiguration(corsConfiguration: CfnHttpApi.CorsConfigurationObjectProperty) {
    cdkBuilder.corsConfiguration(corsConfiguration)
  }

  public fun defaultRouteSettings(defaultRouteSettings: IResolvable) {
    cdkBuilder.defaultRouteSettings(defaultRouteSettings)
  }

  public fun defaultRouteSettings(defaultRouteSettings: CfnHttpApi.RouteSettingsProperty) {
    cdkBuilder.defaultRouteSettings(defaultRouteSettings)
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

  public fun definitionUri(definitionUri: CfnHttpApi.S3LocationProperty) {
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

  public fun domain(domain: CfnHttpApi.HttpApiDomainConfigurationProperty) {
    cdkBuilder.domain(domain)
  }

  public fun failOnWarnings(failOnWarnings: Boolean) {
    cdkBuilder.failOnWarnings(failOnWarnings)
  }

  public fun failOnWarnings(failOnWarnings: IResolvable) {
    cdkBuilder.failOnWarnings(failOnWarnings)
  }

  public fun routeSettings(routeSettings: IResolvable) {
    cdkBuilder.routeSettings(routeSettings)
  }

  public fun routeSettings(routeSettings: CfnHttpApi.RouteSettingsProperty) {
    cdkBuilder.routeSettings(routeSettings)
  }

  public fun stageName(stageName: String) {
    cdkBuilder.stageName(stageName)
  }

  public fun stageVariables(stageVariables: Map<String, String>) {
    cdkBuilder.stageVariables(stageVariables)
  }

  public fun stageVariables(stageVariables: IResolvable) {
    cdkBuilder.stageVariables(stageVariables)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnHttpApiProps = cdkBuilder.build()
}
