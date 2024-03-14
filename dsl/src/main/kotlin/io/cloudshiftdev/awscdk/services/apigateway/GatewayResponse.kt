package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class GatewayResponse internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.GatewayResponse,
) : Resource(cdkObject), IGatewayResponse {
  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.GatewayResponse].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Custom headers parameters for response.
     *
     * Default: - no headers
     *
     * @param responseHeaders Custom headers parameters for response. 
     */
    public fun responseHeaders(responseHeaders: Map<String, String>)

    /**
     * Rest api resource to target.
     *
     * @param restApi Rest api resource to target. 
     */
    public fun restApi(restApi: IRestApi)

    /**
     * Http status code for response.
     *
     * Default: - standard http status code for the response type.
     *
     * @param statusCode Http status code for response. 
     */
    public fun statusCode(statusCode: String)

    /**
     * Custom templates to get mapped as response.
     *
     * Default: - Response from api will be returned without applying any transformation.
     *
     * @param templates Custom templates to get mapped as response. 
     */
    public fun templates(templates: Map<String, String>)

    /**
     * Response type to associate with gateway response.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/supported-gateway-response-types.html)
     * @param type Response type to associate with gateway response. 
     */
    public fun type(type: ResponseType)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.GatewayResponse.Builder =
        software.amazon.awscdk.services.apigateway.GatewayResponse.Builder.create(scope, id)

    /**
     * Custom headers parameters for response.
     *
     * Default: - no headers
     *
     * @param responseHeaders Custom headers parameters for response. 
     */
    override fun responseHeaders(responseHeaders: Map<String, String>) {
      cdkBuilder.responseHeaders(responseHeaders)
    }

    /**
     * Rest api resource to target.
     *
     * @param restApi Rest api resource to target. 
     */
    override fun restApi(restApi: IRestApi) {
      cdkBuilder.restApi(restApi.let(IRestApi::unwrap))
    }

    /**
     * Http status code for response.
     *
     * Default: - standard http status code for the response type.
     *
     * @param statusCode Http status code for response. 
     */
    override fun statusCode(statusCode: String) {
      cdkBuilder.statusCode(statusCode)
    }

    /**
     * Custom templates to get mapped as response.
     *
     * Default: - Response from api will be returned without applying any transformation.
     *
     * @param templates Custom templates to get mapped as response. 
     */
    override fun templates(templates: Map<String, String>) {
      cdkBuilder.templates(templates)
    }

    /**
     * Response type to associate with gateway response.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/supported-gateway-response-types.html)
     * @param type Response type to associate with gateway response. 
     */
    override fun type(type: ResponseType) {
      cdkBuilder.type(type.let(ResponseType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.GatewayResponse =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): GatewayResponse {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return GatewayResponse(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.GatewayResponse):
        GatewayResponse = GatewayResponse(cdkObject)

    internal fun unwrap(wrapped: GatewayResponse):
        software.amazon.awscdk.services.apigateway.GatewayResponse = wrapped.cdkObject
  }
}
