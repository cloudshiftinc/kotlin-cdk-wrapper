@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.HttpIntegration
import software.amazon.awscdk.services.apigateway.IntegrationOptions

@CdkDslMarker
public class HttpIntegrationDsl(
  url: String,
) {
  private val cdkBuilder: HttpIntegration.Builder = HttpIntegration.Builder.create(url)

  /**
   * HTTP method to use when invoking the backend URL.
   *
   * Default: GET
   *
   * @param httpMethod HTTP method to use when invoking the backend URL. 
   */
  public fun httpMethod(httpMethod: String) {
    cdkBuilder.httpMethod(httpMethod)
  }

  /**
   * Integration options, such as request/resopnse mapping, content handling, etc.
   *
   * Default: defaults based on `IntegrationOptions` defaults
   *
   * @param options Integration options, such as request/resopnse mapping, content handling, etc. 
   */
  public fun options(options: IntegrationOptionsDsl.() -> Unit = {}) {
    val builder = IntegrationOptionsDsl()
    builder.apply(options)
    cdkBuilder.options(builder.build())
  }

  /**
   * Integration options, such as request/resopnse mapping, content handling, etc.
   *
   * Default: defaults based on `IntegrationOptions` defaults
   *
   * @param options Integration options, such as request/resopnse mapping, content handling, etc. 
   */
  public fun options(options: IntegrationOptions) {
    cdkBuilder.options(options)
  }

  /**
   * Determines whether to use proxy integration or custom integration.
   *
   * Default: true
   *
   * @param proxy Determines whether to use proxy integration or custom integration. 
   */
  public fun proxy(proxy: Boolean) {
    cdkBuilder.proxy(proxy)
  }

  public fun build(): HttpIntegration = cdkBuilder.build()
}
