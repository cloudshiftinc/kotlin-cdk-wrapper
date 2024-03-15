@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

public interface QuotaSettings {
  public fun limit(): Number? = unwrap(this).getLimit()

  public fun offset(): Number? = unwrap(this).getOffset()

  public fun period(): Period? = unwrap(this).getPeriod()?.let(Period::wrap)

  @CdkDslMarker
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.QuotaSettings,
  ) : CdkObject(cdkObject), QuotaSettings {
    override fun limit(): Number? = unwrap(this).getLimit()

    override fun offset(): Number? = unwrap(this).getOffset()

    override fun period(): Period? = unwrap(this).getPeriod()?.let(Period::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): QuotaSettings {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.QuotaSettings):
        QuotaSettings = Wrapper(cdkObject)

    internal fun unwrap(wrapped: QuotaSettings):
        software.amazon.awscdk.services.apigateway.QuotaSettings = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigateway.QuotaSettings
  }
}
