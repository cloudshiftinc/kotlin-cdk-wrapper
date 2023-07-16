@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigatewayv2.CfnIntegration
import software.amazon.awscdk.services.apigatewayv2.CfnIntegrationProps

@CdkDslMarker
public class CfnIntegrationPropsDsl {
  private val cdkBuilder: CfnIntegrationProps.Builder = CfnIntegrationProps.builder()

  public fun apiId(apiId: String) {
    cdkBuilder.apiId(apiId)
  }

  public fun connectionId(connectionId: String) {
    cdkBuilder.connectionId(connectionId)
  }

  public fun connectionType(connectionType: String) {
    cdkBuilder.connectionType(connectionType)
  }

  public fun contentHandlingStrategy(contentHandlingStrategy: String) {
    cdkBuilder.contentHandlingStrategy(contentHandlingStrategy)
  }

  public fun credentialsArn(credentialsArn: String) {
    cdkBuilder.credentialsArn(credentialsArn)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun integrationMethod(integrationMethod: String) {
    cdkBuilder.integrationMethod(integrationMethod)
  }

  public fun integrationSubtype(integrationSubtype: String) {
    cdkBuilder.integrationSubtype(integrationSubtype)
  }

  public fun integrationType(integrationType: String) {
    cdkBuilder.integrationType(integrationType)
  }

  public fun integrationUri(integrationUri: String) {
    cdkBuilder.integrationUri(integrationUri)
  }

  public fun passthroughBehavior(passthroughBehavior: String) {
    cdkBuilder.passthroughBehavior(passthroughBehavior)
  }

  public fun payloadFormatVersion(payloadFormatVersion: String) {
    cdkBuilder.payloadFormatVersion(payloadFormatVersion)
  }

  public fun requestParameters(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.requestParameters(builder.map)
  }

  public fun requestParameters(requestParameters: Any) {
    cdkBuilder.requestParameters(requestParameters)
  }

  public fun requestTemplates(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.requestTemplates(builder.map)
  }

  public fun requestTemplates(requestTemplates: Any) {
    cdkBuilder.requestTemplates(requestTemplates)
  }

  public fun responseParameters(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.responseParameters(builder.map)
  }

  public fun responseParameters(responseParameters: Any) {
    cdkBuilder.responseParameters(responseParameters)
  }

  public fun templateSelectionExpression(templateSelectionExpression: String) {
    cdkBuilder.templateSelectionExpression(templateSelectionExpression)
  }

  public fun timeoutInMillis(timeoutInMillis: Number) {
    cdkBuilder.timeoutInMillis(timeoutInMillis)
  }

  public fun tlsConfig(tlsConfig: IResolvable) {
    cdkBuilder.tlsConfig(tlsConfig)
  }

  public fun tlsConfig(tlsConfig: CfnIntegration.TlsConfigProperty) {
    cdkBuilder.tlsConfig(tlsConfig)
  }

  public fun build(): CfnIntegrationProps = cdkBuilder.build()
}
