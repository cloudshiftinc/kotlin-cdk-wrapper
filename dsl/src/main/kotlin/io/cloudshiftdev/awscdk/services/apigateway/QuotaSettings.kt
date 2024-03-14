package io.cloudshiftdev.awscdk.services.apigateway

import kotlin.Number
import kotlin.Unit

public interface QuotaSettings {
  public fun limit(): Number? = unwrap(this).getLimit()

  public fun offset(): Number? = unwrap(this).getOffset()

  public fun period(): Period? = unwrap(this).getPeriod()?.let(Period::wrap)

  public interface Builder {
    public fun limit(limit: Number)

    public fun offset(offset: Number)

    public fun period(period: Period)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.QuotaSettings.Builder =
        software.amazon.awscdk.services.apigateway.QuotaSettings.builder()

    override fun limit(limit: Number) {
      cdkBuilder.limit(limit)
    }

    override fun offset(offset: Number) {
      cdkBuilder.offset(offset)
    }

    override fun period(period: Period) {
      cdkBuilder.period(period.let(Period::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.QuotaSettings =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.QuotaSettings,
  ) : QuotaSettings {
    override fun limit(): Number? = unwrap(this).getLimit()

    override fun offset(): Number? = unwrap(this).getOffset()

    override fun period(): Period? = unwrap(this).getPeriod()?.let(Period::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): QuotaSettings {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.QuotaSettings):
        QuotaSettings = Wrapper(cdkObject)

    internal fun unwrap(wrapped: QuotaSettings):
        software.amazon.awscdk.services.apigateway.QuotaSettings = (wrapped as Wrapper).cdkObject
  }
}
