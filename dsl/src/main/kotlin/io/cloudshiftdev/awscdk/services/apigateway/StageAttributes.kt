package io.cloudshiftdev.awscdk.services.apigateway

import kotlin.String
import kotlin.Unit

public interface StageAttributes {
  public fun restApi(): IRestApi

  public fun stageName(): String

  public interface Builder {
    public fun restApi(restApi: IRestApi)

    public fun stageName(stageName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.StageAttributes.Builder =
        software.amazon.awscdk.services.apigateway.StageAttributes.builder()

    override fun restApi(restApi: IRestApi) {
      cdkBuilder.restApi(restApi.let(IRestApi::unwrap))
    }

    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.StageAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.StageAttributes,
  ) : StageAttributes {
    override fun restApi(): IRestApi = unwrap(this).getRestApi().let(IRestApi::wrap)

    override fun stageName(): String = unwrap(this).getStageName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): StageAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.StageAttributes):
        StageAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StageAttributes):
        software.amazon.awscdk.services.apigateway.StageAttributes = (wrapped as Wrapper).cdkObject
  }
}
