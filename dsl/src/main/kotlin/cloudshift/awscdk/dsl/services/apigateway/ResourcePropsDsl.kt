@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CorsOptions
import software.amazon.awscdk.services.apigateway.IResource
import software.amazon.awscdk.services.apigateway.Integration
import software.amazon.awscdk.services.apigateway.MethodOptions
import software.amazon.awscdk.services.apigateway.ResourceProps

@CdkDslMarker
public class ResourcePropsDsl {
  private val cdkBuilder: ResourceProps.Builder = ResourceProps.builder()

  /**
   * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
   * all child resources.
   * You can add CORS at the resource-level using `addCorsPreflight`.
   */
  public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptionsDsl.() -> Unit =
      {}) {
    val builder = CorsOptionsDsl()
    builder.apply(defaultCorsPreflightOptions)
    cdkBuilder.defaultCorsPreflightOptions(builder.build())
  }

  /**
   * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
   * all child resources.
   * You can add CORS at the resource-level using `addCorsPreflight`.
   */
  public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
    cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions)
  }

  /**
   * @param defaultIntegration An integration to use as a default for all methods created within
   * this API unless an integration is specified.
   */
  public fun defaultIntegration(defaultIntegration: IntegrationDsl.() -> Unit = {}) {
    val builder = IntegrationDsl()
    builder.apply(defaultIntegration)
    cdkBuilder.defaultIntegration(builder.build())
  }

  /**
   * @param defaultIntegration An integration to use as a default for all methods created within
   * this API unless an integration is specified.
   */
  public fun defaultIntegration(defaultIntegration: Integration) {
    cdkBuilder.defaultIntegration(defaultIntegration)
  }

  /**
   * @param defaultMethodOptions Method options to use as a default for all methods created within
   * this API unless custom options are specified.
   */
  public fun defaultMethodOptions(defaultMethodOptions: MethodOptionsDsl.() -> Unit = {}) {
    val builder = MethodOptionsDsl()
    builder.apply(defaultMethodOptions)
    cdkBuilder.defaultMethodOptions(builder.build())
  }

  /**
   * @param defaultMethodOptions Method options to use as a default for all methods created within
   * this API unless custom options are specified.
   */
  public fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
    cdkBuilder.defaultMethodOptions(defaultMethodOptions)
  }

  /**
   * @param parent The parent resource of this resource. 
   * You can either pass another
   * `Resource` object or a `RestApi` object here.
   */
  public fun parent(parent: IResource) {
    cdkBuilder.parent(parent)
  }

  /**
   * @param pathPart A path name for the resource. 
   */
  public fun pathPart(pathPart: String) {
    cdkBuilder.pathPart(pathPart)
  }

  public fun build(): ResourceProps = cdkBuilder.build()
}
