@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

public interface OriginFailoverConfig {
  public fun failoverOrigin(): IOrigin

  public fun statusCodes(): List<Number> = unwrap(this).getStatusCodes() ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun failoverOrigin(failoverOrigin: IOrigin)

    public fun statusCodes(statusCodes: List<Number>)

    public fun statusCodes(vararg statusCodes: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.OriginFailoverConfig.Builder
        = software.amazon.awscdk.services.cloudfront.OriginFailoverConfig.builder()

    override fun failoverOrigin(failoverOrigin: IOrigin) {
      cdkBuilder.failoverOrigin(failoverOrigin.let(IOrigin::unwrap))
    }

    override fun statusCodes(statusCodes: List<Number>) {
      cdkBuilder.statusCodes(statusCodes)
    }

    override fun statusCodes(vararg statusCodes: Number): Unit = statusCodes(statusCodes.toList())

    public fun build(): software.amazon.awscdk.services.cloudfront.OriginFailoverConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.OriginFailoverConfig,
  ) : CdkObject(cdkObject), OriginFailoverConfig {
    override fun failoverOrigin(): IOrigin = unwrap(this).getFailoverOrigin().let(IOrigin::wrap)

    override fun statusCodes(): List<Number> = unwrap(this).getStatusCodes() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OriginFailoverConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.OriginFailoverConfig):
        OriginFailoverConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OriginFailoverConfig):
        software.amazon.awscdk.services.cloudfront.OriginFailoverConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.OriginFailoverConfig
  }
}
