@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for a new gateway response.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * ResponseType responseType;
 * RestApi restApi;
 * GatewayResponseProps gatewayResponseProps = GatewayResponseProps.builder()
 * .restApi(restApi)
 * .type(responseType)
 * // the properties below are optional
 * .responseHeaders(Map.of(
 * "responseHeadersKey", "responseHeaders"))
 * .statusCode("statusCode")
 * .templates(Map.of(
 * "templatesKey", "templates"))
 * .build();
 * ```
 */
public interface GatewayResponseProps : GatewayResponseOptions {
  /**
   * Rest api resource to target.
   */
  public fun restApi(): IRestApi

  /**
   * A builder for [GatewayResponseProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param responseHeaders Custom headers parameters for response.
     */
    public fun responseHeaders(responseHeaders: Map<String, String>)

    /**
     * @param restApi Rest api resource to target. 
     */
    public fun restApi(restApi: IRestApi)

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
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.GatewayResponseProps.Builder
        = software.amazon.awscdk.services.apigateway.GatewayResponseProps.builder()

    /**
     * @param responseHeaders Custom headers parameters for response.
     */
    override fun responseHeaders(responseHeaders: Map<String, String>) {
      cdkBuilder.responseHeaders(responseHeaders)
    }

    /**
     * @param restApi Rest api resource to target. 
     */
    override fun restApi(restApi: IRestApi) {
      cdkBuilder.restApi(restApi.let(IRestApi.Companion::unwrap))
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
      cdkBuilder.type(type.let(ResponseType.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.GatewayResponseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.GatewayResponseProps,
  ) : CdkObject(cdkObject),
      GatewayResponseProps {
    /**
     * Custom headers parameters for response.
     *
     * Default: - no headers
     */
    override fun responseHeaders(): Map<String, String> = unwrap(this).getResponseHeaders() ?:
        emptyMap()

    /**
     * Rest api resource to target.
     */
    override fun restApi(): IRestApi = unwrap(this).getRestApi().let(IRestApi::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): GatewayResponseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.GatewayResponseProps):
        GatewayResponseProps = CdkObjectWrappers.wrap(cdkObject) as? GatewayResponseProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: GatewayResponseProps):
        software.amazon.awscdk.services.apigateway.GatewayResponseProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.GatewayResponseProps
  }
}
