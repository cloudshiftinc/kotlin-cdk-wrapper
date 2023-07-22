@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.IResource
import software.amazon.awscdk.services.apigateway.Integration
import software.amazon.awscdk.services.apigateway.MethodOptions
import software.amazon.awscdk.services.apigateway.MethodProps

@CdkDslMarker
public class MethodPropsDsl {
  private val cdkBuilder: MethodProps.Builder = MethodProps.builder()

  /**
   * @param httpMethod The HTTP method ("GET", "POST", "PUT", ...) that clients use to call this
   * method. 
   */
  public fun httpMethod(httpMethod: String) {
    cdkBuilder.httpMethod(httpMethod)
  }

  /**
   * @param integration The backend system that the method calls when it receives a request.
   */
  public fun integration(integration: IntegrationDsl.() -> Unit = {}) {
    val builder = IntegrationDsl()
    builder.apply(integration)
    cdkBuilder.integration(builder.build())
  }

  /**
   * @param integration The backend system that the method calls when it receives a request.
   */
  public fun integration(integration: Integration) {
    cdkBuilder.integration(integration)
  }

  /**
   * @param options Method options.
   */
  public fun options(options: MethodOptionsDsl.() -> Unit = {}) {
    val builder = MethodOptionsDsl()
    builder.apply(options)
    cdkBuilder.options(builder.build())
  }

  /**
   * @param options Method options.
   */
  public fun options(options: MethodOptions) {
    cdkBuilder.options(options)
  }

  /**
   * @param resource The resource this method is associated with. 
   * For root resource methods,
   * specify the `RestApi` object.
   */
  public fun resource(resource: IResource) {
    cdkBuilder.resource(resource)
  }

  public fun build(): MethodProps = cdkBuilder.build()
}
