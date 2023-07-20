@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigatewayv2.CfnApi
import software.constructs.Construct

@CdkDslMarker
public class CfnApiDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnApi.Builder = CfnApi.Builder.create(scope, id)

  public fun apiKeySelectionExpression(apiKeySelectionExpression: String) {
    cdkBuilder.apiKeySelectionExpression(apiKeySelectionExpression)
  }

  public fun basePath(basePath: String) {
    cdkBuilder.basePath(basePath)
  }

  public fun body(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.body(builder.map)
  }

  public fun body(body: Any) {
    cdkBuilder.body(body)
  }

  public fun bodyS3Location(bodyS3Location: IResolvable) {
    cdkBuilder.bodyS3Location(bodyS3Location)
  }

  public fun bodyS3Location(bodyS3Location: CfnApi.BodyS3LocationProperty) {
    cdkBuilder.bodyS3Location(bodyS3Location)
  }

  public fun corsConfiguration(corsConfiguration: IResolvable) {
    cdkBuilder.corsConfiguration(corsConfiguration)
  }

  public fun corsConfiguration(corsConfiguration: CfnApi.CorsProperty) {
    cdkBuilder.corsConfiguration(corsConfiguration)
  }

  public fun credentialsArn(credentialsArn: String) {
    cdkBuilder.credentialsArn(credentialsArn)
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

  public fun disableSchemaValidation(disableSchemaValidation: Boolean) {
    cdkBuilder.disableSchemaValidation(disableSchemaValidation)
  }

  public fun disableSchemaValidation(disableSchemaValidation: IResolvable) {
    cdkBuilder.disableSchemaValidation(disableSchemaValidation)
  }

  public fun failOnWarnings(failOnWarnings: Boolean) {
    cdkBuilder.failOnWarnings(failOnWarnings)
  }

  public fun failOnWarnings(failOnWarnings: IResolvable) {
    cdkBuilder.failOnWarnings(failOnWarnings)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun protocolType(protocolType: String) {
    cdkBuilder.protocolType(protocolType)
  }

  public fun routeKey(routeKey: String) {
    cdkBuilder.routeKey(routeKey)
  }

  public fun routeSelectionExpression(routeSelectionExpression: String) {
    cdkBuilder.routeSelectionExpression(routeSelectionExpression)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun target(target: String) {
    cdkBuilder.target(target)
  }

  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnApi = cdkBuilder.build()
}
