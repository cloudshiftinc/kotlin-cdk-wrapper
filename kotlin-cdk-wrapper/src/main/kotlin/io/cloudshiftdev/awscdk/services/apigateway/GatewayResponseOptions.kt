@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Options to add gateway response.
 *
 * Example:
 *
 * ```
 * RestApi api = new RestApi(this, "books-api");
 * api.addGatewayResponse("test-response", GatewayResponseOptions.builder()
 * .type(ResponseType.ACCESS_DENIED)
 * .statusCode("500")
 * .responseHeaders(Map.of(
 * // Note that values must be enclosed within a pair of single quotes
 * "Access-Control-Allow-Origin", "'test.com'",
 * "test-key", "'test-value'"))
 * .templates(Map.of(
 * "application/json", "{ \"message\": $context.error.messageString, \"statusCode\": \"488\",
 * \"type\": \"$context.error.responseType\" }"))
 * .build());
 * ```
 */
public interface GatewayResponseOptions {
  /**
   * Custom headers parameters for response.
   *
   * Default: - no headers
   */
  public fun responseHeaders(): Map<String, String> = unwrap(this).getResponseHeaders() ?:
      emptyMap()

  /**
   * Http status code for response.
   *
   * Default: - standard http status code for the response type.
   */
  public fun statusCode(): String? = unwrap(this).getStatusCode()

  /**
   * Custom templates to get mapped as response.
   *
   * Default: - Response from api will be returned without applying any transformation.
   */
  public fun templates(): Map<String, String> = unwrap(this).getTemplates() ?: emptyMap()

  /**
   * Response type to associate with gateway response.
   *
   * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/supported-gateway-response-types.html)
   */
  public fun type(): ResponseType

  /**
   * A builder for [GatewayResponseOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param responseHeaders Custom headers parameters for response.
     */
    public fun responseHeaders(responseHeaders: Map<String, String>)

    /**
     * @param statusCode Http status code for response.
     */
    public fun statusCode(statusCode: String)

    /**
     * @param templates Custom templates to get mapped as response.
     */
    public fun templates(templates: Map<String, String>)

    /**
     * @param type Response type to associate with gateway response. 
     */
    public fun type(type: ResponseType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.GatewayResponseOptions.Builder =
        software.amazon.awscdk.services.apigateway.GatewayResponseOptions.builder()

    /**
     * @param responseHeaders Custom headers parameters for response.
     */
    override fun responseHeaders(responseHeaders: Map<String, String>) {
      cdkBuilder.responseHeaders(responseHeaders)
    }

    /**
     * @param statusCode Http status code for response.
     */
    override fun statusCode(statusCode: String) {
      cdkBuilder.statusCode(statusCode)
    }

    /**
     * @param templates Custom templates to get mapped as response.
     */
    override fun templates(templates: Map<String, String>) {
      cdkBuilder.templates(templates)
    }

    /**
     * @param type Response type to associate with gateway response. 
     */
    override fun type(type: ResponseType) {
      cdkBuilder.type(type.let(ResponseType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.GatewayResponseOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.GatewayResponseOptions,
  ) : CdkObject(cdkObject), GatewayResponseOptions {
    /**
     * Custom headers parameters for response.
     *
     * Default: - no headers
     */
    override fun responseHeaders(): Map<String, String> = unwrap(this).getResponseHeaders() ?:
        emptyMap()

    /**
     * Http status code for response.
     *
     * Default: - standard http status code for the response type.
     */
    override fun statusCode(): String? = unwrap(this).getStatusCode()

    /**
     * Custom templates to get mapped as response.
     *
     * Default: - Response from api will be returned without applying any transformation.
     */
    override fun templates(): Map<String, String> = unwrap(this).getTemplates() ?: emptyMap()

    /**
     * Response type to associate with gateway response.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/supported-gateway-response-types.html)
     */
    override fun type(): ResponseType = unwrap(this).getType().let(ResponseType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GatewayResponseOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.GatewayResponseOptions):
        GatewayResponseOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GatewayResponseOptions):
        software.amazon.awscdk.services.apigateway.GatewayResponseOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.GatewayResponseOptions
  }
}
