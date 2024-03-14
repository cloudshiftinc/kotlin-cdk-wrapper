package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Resource
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class GatewayResponse internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.GatewayResponse,
) : Resource(cdkObject), IGatewayResponse {
  public interface Builder {
    public fun responseHeaders(responseHeaders: Map<String, String>) {
    }

    public fun restApi(restApi: IRestApi) {
    }

    public fun statusCode(statusCode: String) {
    }

    public fun templates(templates: Map<String, String>) {
    }

    public fun type(type: ResponseType) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.GatewayResponse.Builder =
        software.amazon.awscdk.services.apigateway.GatewayResponse.Builder.create(scope, id)

    public override fun responseHeaders(responseHeaders: Map<String, String>) {
      cdkBuilder.responseHeaders(responseHeaders)
    }

    public override fun restApi(restApi: IRestApi) {
      cdkBuilder.restApi(restApi.let(IRestApi::unwrap))
    }

    public override fun statusCode(statusCode: String) {
      cdkBuilder.statusCode(statusCode)
    }

    public override fun templates(templates: Map<String, String>) {
      cdkBuilder.templates(templates)
    }

    public override fun type(type: ResponseType) {
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
