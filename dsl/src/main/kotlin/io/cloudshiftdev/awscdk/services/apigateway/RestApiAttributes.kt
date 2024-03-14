package io.cloudshiftdev.awscdk.services.apigateway

import kotlin.String
import kotlin.Unit

public interface RestApiAttributes {
  public fun restApiId(): String

  public fun restApiName(): String? = unwrap(this).getRestApiName()

  public fun rootResourceId(): String

  public interface Builder {
    public fun restApiId(restApiId: String) {
    }

    public fun restApiName(restApiName: String) {
    }

    public fun rootResourceId(rootResourceId: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.RestApiAttributes.Builder =
        software.amazon.awscdk.services.apigateway.RestApiAttributes.builder()

    public override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    public override fun restApiName(restApiName: String) {
      cdkBuilder.restApiName(restApiName)
    }

    public override fun rootResourceId(rootResourceId: String) {
      cdkBuilder.rootResourceId(rootResourceId)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.RestApiAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.RestApiAttributes,
  ) : RestApiAttributes {
    public override fun restApiId(): String = unwrap(this).getRestApiId()

    public override fun restApiName(): String? = unwrap(this).getRestApiName()

    public override fun rootResourceId(): String = unwrap(this).getRootResourceId()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): RestApiAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.RestApiAttributes):
        RestApiAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RestApiAttributes):
        software.amazon.awscdk.services.apigateway.RestApiAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
