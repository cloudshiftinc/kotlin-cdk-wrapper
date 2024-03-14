package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface ApiMappingAttributes {
  /**
   * The API mapping ID.
   */
  public fun apiMappingId(): String

  /**
   * A builder for [ApiMappingAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiMappingId The API mapping ID. 
     */
    public fun apiMappingId(apiMappingId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.ApiMappingAttributes.Builder =
        software.amazon.awscdk.services.apigatewayv2.ApiMappingAttributes.builder()

    /**
     * @param apiMappingId The API mapping ID. 
     */
    override fun apiMappingId(apiMappingId: String) {
      cdkBuilder.apiMappingId(apiMappingId)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.ApiMappingAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.ApiMappingAttributes,
  ) : ApiMappingAttributes {
    /**
     * The API mapping ID.
     */
    override fun apiMappingId(): String = unwrap(this).getApiMappingId()
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
