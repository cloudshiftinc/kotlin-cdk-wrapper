@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

public interface ThrottleSettings {
  public fun burstLimit(): Number? = unwrap(this).getBurstLimit()

  public fun rateLimit(): Number? = unwrap(this).getRateLimit()

  @CdkDslMarker
  public interface Builder {
    public fun burstLimit(burstLimit: Number)

    public fun rateLimit(rateLimit: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.ThrottleSettings.Builder =
        software.amazon.awscdk.services.apigatewayv2.ThrottleSettings.builder()

    override fun burstLimit(burstLimit: Number) {
      cdkBuilder.burstLimit(burstLimit)
    }

    override fun rateLimit(rateLimit: Number) {
      cdkBuilder.rateLimit(rateLimit)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.ThrottleSettings =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.ThrottleSettings,
  ) : CdkObject(cdkObject), ThrottleSettings {
    override fun burstLimit(): Number? = unwrap(this).getBurstLimit()

    override fun rateLimit(): Number? = unwrap(this).getRateLimit()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ThrottleSettings {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.ThrottleSettings):
        ThrottleSettings = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ThrottleSettings):
        software.amazon.awscdk.services.apigatewayv2.ThrottleSettings = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.ThrottleSettings
  }
}
