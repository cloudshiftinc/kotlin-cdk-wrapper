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

  /**
   * @param deploymentToken This value is included in computing the Deployment's fingerprint.
   * When the fingerprint
   * changes, a new deployment is triggered.
   * This property should contain values associated with the Integration that upon changing
   * should trigger a fresh the Deployment needs to be refreshed.
   */
  public fun deploymentToken(deploymentToken: String) {
    cdkBuilder.deploymentToken(deploymentToken)
  }

  /**
   * @param integrationHttpMethod The integration's HTTP method type.
   */
  public fun integrationHttpMethod(integrationHttpMethod: String) {
    cdkBuilder.integrationHttpMethod(integrationHttpMethod)
  }

  /**
   * @param options Integration options.
   */
  public fun options(options: IntegrationOptionsDsl.() -> Unit = {}) {
    val builder = IntegrationOptionsDsl()
    builder.apply(options)
    cdkBuilder.options(builder.build())
  }

  /**
   * @param options Integration options.
   */
  public fun options(options: IntegrationOptions) {
    cdkBuilder.options(options)
  }

  /**
   * @param type Specifies an API method integration type. 
   */
  public fun type(type: IntegrationType) {
    cdkBuilder.type(type)
  }

  /**
   * @param uri The Uniform Resource Identifier (URI) for the integration.
   */
  public fun uri(uri: String) {
    cdkBuilder.uri(uri)
  }

  public fun build(): IntegrationConfig = cdkBuilder.build()
}
