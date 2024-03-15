@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface GatewayResponseOptions {
  public fun responseHeaders(): Map<String, String> = unwrap(this).getResponseHeaders() ?:
      emptyMap()

  public fun statusCode(): String? = unwrap(this).getStatusCode()

  public fun templates(): Map<String, String> = unwrap(this).getTemplates() ?: emptyMap()

  public fun type(): ResponseType

  @CdkDslMarker
  public interface Builder {
    public fun responseHeaders(responseHeaders: Map<String, String>)

    public fun statusCode(statusCode: String)

    public fun templates(templates: Map<String, String>)

    public fun type(type: ResponseType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.GatewayResponseOptions.Builder =
        software.amazon.awscdk.services.apigateway.GatewayResponseOptions.builder()

    override fun responseHeaders(responseHeaders: Map<String, String>) {
      cdkBuilder.responseHeaders(responseHeaders)
    }

    override fun statusCode(statusCode: String) {
      cdkBuilder.statusCode(statusCode)
    }

    override fun templates(templates: Map<String, String>) {
      cdkBuilder.templates(templates)
    }

    override fun type(type: ResponseType) {
      cdkBuilder.type(type.let(ResponseType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.GatewayResponseOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.GatewayResponseOptions,
  ) : CdkObject(cdkObject), GatewayResponseOptions {
    override fun responseHeaders(): Map<String, String> = unwrap(this).getResponseHeaders() ?:
        emptyMap()

    override fun statusCode(): String? = unwrap(this).getStatusCode()

    override fun templates(): Map<String, String> = unwrap(this).getTemplates() ?: emptyMap()

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
