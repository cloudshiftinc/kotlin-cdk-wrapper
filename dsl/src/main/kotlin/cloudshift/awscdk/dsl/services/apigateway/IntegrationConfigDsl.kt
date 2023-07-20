@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.IntegrationConfig
import software.amazon.awscdk.services.apigateway.IntegrationOptions
import software.amazon.awscdk.services.apigateway.IntegrationType

@CdkDslMarker
public class IntegrationConfigDsl {
  private val cdkBuilder: IntegrationConfig.Builder = IntegrationConfig.builder()

  public fun deploymentToken(deploymentToken: String) {
    cdkBuilder.deploymentToken(deploymentToken)
  }

  public fun integrationHttpMethod(integrationHttpMethod: String) {
    cdkBuilder.integrationHttpMethod(integrationHttpMethod)
  }

  public fun options(block: IntegrationOptionsDsl.() -> Unit = {}) {
    val builder = IntegrationOptionsDsl()
    builder.apply(block)
    cdkBuilder.options(builder.build())
  }

  public fun options(options: IntegrationOptions) {
    cdkBuilder.options(options)
  }

  public fun type(type: IntegrationType) {
    cdkBuilder.type(type)
  }

  public fun uri(uri: String) {
    cdkBuilder.uri(uri)
  }

  public fun build(): IntegrationConfig = cdkBuilder.build()
}
