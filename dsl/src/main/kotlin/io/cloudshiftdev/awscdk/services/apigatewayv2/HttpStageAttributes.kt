package io.cloudshiftdev.awscdk.services.apigatewayv2

import kotlin.String
import kotlin.Unit

public interface HttpStageAttributes : StageAttributes {
  public fun api(): IHttpApi

  public interface Builder {
    public fun api(api: IHttpApi)

    public fun stageName(stageName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.HttpStageAttributes.Builder
        = software.amazon.awscdk.services.apigatewayv2.HttpStageAttributes.builder()

    override fun api(api: IHttpApi) {
      cdkBuilder.api(api.let(IHttpApi::unwrap))
    }

    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpStageAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpStageAttributes,
  ) : HttpStageAttributes {
    override fun api(): IHttpApi = unwrap(this).getApi().let(IHttpApi::wrap)

    override fun stageName(): String = unwrap(this).getStageName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): HttpStageAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpStageAttributes):
        HttpStageAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpStageAttributes):
        software.amazon.awscdk.services.apigatewayv2.HttpStageAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
