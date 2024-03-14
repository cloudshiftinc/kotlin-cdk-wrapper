package io.cloudshiftdev.awscdk.services.apigateway

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface GatewayResponseOptions {
  public fun responseHeaders(): Map<String, String> = unwrap(this).getResponseHeaders() ?:
      emptyMap()

  public fun statusCode(): String? = unwrap(this).getStatusCode()

  public fun templates(): Map<String, String> = unwrap(this).getTemplates() ?: emptyMap()

  public fun type(): ResponseType

  public interface Builder {
    public fun responseHeaders(responseHeaders: Map<String, String>) {
    }

    public fun statusCode(statusCode: String) {
    }

    public fun templates(templates: Map<String, String>) {
    }

    public fun type(type: ResponseType) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.GatewayResponseOptions.Builder =
        software.amazon.awscdk.services.apigateway.GatewayResponseOptions.builder()

    public override fun responseHeaders(responseHeaders: Map<String, String>) {
      cdkBuilder.responseHeaders(responseHeaders)
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

    public fun build(): software.amazon.awscdk.services.apigateway.GatewayResponseOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.GatewayResponseOptions,
  ) : GatewayResponseOptions {
    public override fun responseHeaders(): Map<String, String> = unwrap(this).getResponseHeaders()
        ?: emptyMap()

    public override fun statusCode(): String? = unwrap(this).getStatusCode()

    public override fun templates(): Map<String, String> = unwrap(this).getTemplates() ?: emptyMap()

    public override fun type(): ResponseType = unwrap(this).getType().let(ResponseType::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): GatewayResponseOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.GatewayResponseOptions):
        GatewayResponseOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GatewayResponseOptions):
        software.amazon.awscdk.services.apigateway.GatewayResponseOptions = (wrapped as
        Wrapper).cdkObject
  }
}
