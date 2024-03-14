package io.cloudshiftdev.awscdk.services.apigatewayv2

import kotlin.String
import kotlin.Unit

public interface ApiMappingAttributes {
  public fun apiMappingId(): String

  public interface Builder {
    public fun apiMappingId(apiMappingId: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.ApiMappingAttributes.Builder =
        software.amazon.awscdk.services.apigatewayv2.ApiMappingAttributes.builder()

    public override fun apiMappingId(apiMappingId: String) {
      cdkBuilder.apiMappingId(apiMappingId)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.ApiMappingAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.ApiMappingAttributes,
  ) : ApiMappingAttributes {
    public override fun apiMappingId(): String = unwrap(this).getApiMappingId()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ApiMappingAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.ApiMappingAttributes):
        ApiMappingAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApiMappingAttributes):
        software.amazon.awscdk.services.apigatewayv2.ApiMappingAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
