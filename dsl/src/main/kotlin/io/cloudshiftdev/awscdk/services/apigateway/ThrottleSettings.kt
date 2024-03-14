package io.cloudshiftdev.awscdk.services.apigateway

import kotlin.Number
import kotlin.Unit

public interface ThrottleSettings {
  public fun burstLimit(): Number? = unwrap(this).getBurstLimit()

  public fun rateLimit(): Number? = unwrap(this).getRateLimit()

  public interface Builder {
    public fun burstLimit(burstLimit: Number) {
    }

    public fun rateLimit(rateLimit: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.ThrottleSettings.Builder =
        software.amazon.awscdk.services.apigateway.ThrottleSettings.builder()

    public override fun burstLimit(burstLimit: Number) {
      cdkBuilder.burstLimit(burstLimit)
    }

    public override fun rateLimit(rateLimit: Number) {
      cdkBuilder.rateLimit(rateLimit)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.ThrottleSettings =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.ThrottleSettings,
  ) : ThrottleSettings {
    public override fun burstLimit(): Number? = unwrap(this).getBurstLimit()

    public override fun rateLimit(): Number? = unwrap(this).getRateLimit()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ThrottleSettings {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.ThrottleSettings):
        ThrottleSettings = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ThrottleSettings):
        software.amazon.awscdk.services.apigateway.ThrottleSettings = (wrapped as Wrapper).cdkObject
  }
}
