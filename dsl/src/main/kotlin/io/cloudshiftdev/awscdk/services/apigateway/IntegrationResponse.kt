package io.cloudshiftdev.awscdk.services.apigateway

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface IntegrationResponse {
  public fun contentHandling(): ContentHandling? =
      unwrap(this).getContentHandling()?.let(ContentHandling::wrap)

  public fun responseParameters(): Map<String, String> = unwrap(this).getResponseParameters() ?:
      emptyMap()

  public fun responseTemplates(): Map<String, String> = unwrap(this).getResponseTemplates() ?:
      emptyMap()

  public fun selectionPattern(): String? = unwrap(this).getSelectionPattern()

  public fun statusCode(): String

  public interface Builder {
    public fun contentHandling(contentHandling: ContentHandling) {
    }

    public fun responseParameters(responseParameters: Map<String, String>) {
    }

    public fun responseTemplates(responseTemplates: Map<String, String>) {
    }

    public fun selectionPattern(selectionPattern: String) {
    }

    public fun statusCode(statusCode: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.IntegrationResponse.Builder =
        software.amazon.awscdk.services.apigateway.IntegrationResponse.builder()

    public override fun contentHandling(contentHandling: ContentHandling) {
      cdkBuilder.contentHandling(contentHandling.let(ContentHandling::unwrap))
    }

    public override fun responseParameters(responseParameters: Map<String, String>) {
      cdkBuilder.responseParameters(responseParameters)
    }

    public override fun responseTemplates(responseTemplates: Map<String, String>) {
      cdkBuilder.responseTemplates(responseTemplates)
    }

    public override fun selectionPattern(selectionPattern: String) {
      cdkBuilder.selectionPattern(selectionPattern)
    }

    public override fun statusCode(statusCode: String) {
      cdkBuilder.statusCode(statusCode)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.IntegrationResponse =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.IntegrationResponse,
  ) : IntegrationResponse {
    public override fun contentHandling(): ContentHandling? =
        unwrap(this).getContentHandling()?.let(ContentHandling::wrap)

    public override fun responseParameters(): Map<String, String> =
        unwrap(this).getResponseParameters() ?: emptyMap()

    public override fun responseTemplates(): Map<String, String> =
        unwrap(this).getResponseTemplates() ?: emptyMap()

    public override fun selectionPattern(): String? = unwrap(this).getSelectionPattern()

    public override fun statusCode(): String = unwrap(this).getStatusCode()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): IntegrationResponse {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IntegrationResponse):
        IntegrationResponse = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IntegrationResponse):
        software.amazon.awscdk.services.apigateway.IntegrationResponse = (wrapped as
        Wrapper).cdkObject
  }
}
