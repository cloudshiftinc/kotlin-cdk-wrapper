package io.cloudshiftdev.awscdk.services.apigateway

import kotlin.String
import kotlin.Unit

public interface AddApiKeyOptions {
  public fun overrideLogicalId(): String? = unwrap(this).getOverrideLogicalId()

  public interface Builder {
    public fun overrideLogicalId(overrideLogicalId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.AddApiKeyOptions.Builder =
        software.amazon.awscdk.services.apigateway.AddApiKeyOptions.builder()

    override fun overrideLogicalId(overrideLogicalId: String) {
      cdkBuilder.overrideLogicalId(overrideLogicalId)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.AddApiKeyOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.AddApiKeyOptions,
  ) : AddApiKeyOptions {
    override fun overrideLogicalId(): String? = unwrap(this).getOverrideLogicalId()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AddApiKeyOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.AddApiKeyOptions):
        AddApiKeyOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddApiKeyOptions):
        software.amazon.awscdk.services.apigateway.AddApiKeyOptions = (wrapped as Wrapper).cdkObject
  }
}
