package io.cloudshiftdev.awscdk.services.apigateway

import kotlin.String
import kotlin.Unit

public interface ResourceAttributes {
  public fun path(): String

  public fun resourceId(): String

  public fun restApi(): IRestApi

  public interface Builder {
    public fun path(path: String)

    public fun resourceId(resourceId: String)

    public fun restApi(restApi: IRestApi)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.ResourceAttributes.Builder =
        software.amazon.awscdk.services.apigateway.ResourceAttributes.builder()

    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    override fun restApi(restApi: IRestApi) {
      cdkBuilder.restApi(restApi.let(IRestApi::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.ResourceAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.ResourceAttributes,
  ) : ResourceAttributes {
    override fun path(): String = unwrap(this).getPath()

    override fun resourceId(): String = unwrap(this).getResourceId()

    override fun restApi(): IRestApi = unwrap(this).getRestApi().let(IRestApi::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ResourceAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.ResourceAttributes):
        ResourceAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResourceAttributes):
        software.amazon.awscdk.services.apigateway.ResourceAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
