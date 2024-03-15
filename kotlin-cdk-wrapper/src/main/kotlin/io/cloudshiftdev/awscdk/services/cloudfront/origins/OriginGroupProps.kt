@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront.origins

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cloudfront.IOrigin
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

public interface OriginGroupProps {
  public fun fallbackOrigin(): IOrigin

  public fun fallbackStatusCodes(): List<Number> = unwrap(this).getFallbackStatusCodes() ?:
      emptyList()

  public fun primaryOrigin(): IOrigin

  @CdkDslMarker
  public interface Builder {
    public fun fallbackOrigin(fallbackOrigin: IOrigin)

    public fun fallbackStatusCodes(fallbackStatusCodes: List<Number>)

    public fun fallbackStatusCodes(vararg fallbackStatusCodes: Number)

    public fun primaryOrigin(primaryOrigin: IOrigin)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.origins.OriginGroupProps.Builder =
        software.amazon.awscdk.services.cloudfront.origins.OriginGroupProps.builder()

    override fun fallbackOrigin(fallbackOrigin: IOrigin) {
      cdkBuilder.fallbackOrigin(fallbackOrigin.let(IOrigin::unwrap))
    }

    override fun fallbackStatusCodes(fallbackStatusCodes: List<Number>) {
      cdkBuilder.fallbackStatusCodes(fallbackStatusCodes)
    }

    override fun fallbackStatusCodes(vararg fallbackStatusCodes: Number): Unit =
        fallbackStatusCodes(fallbackStatusCodes.toList())

    override fun primaryOrigin(primaryOrigin: IOrigin) {
      cdkBuilder.primaryOrigin(primaryOrigin.let(IOrigin::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.origins.OriginGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.origins.OriginGroupProps,
  ) : CdkObject(cdkObject), OriginGroupProps {
    override fun fallbackOrigin(): IOrigin = unwrap(this).getFallbackOrigin().let(IOrigin::wrap)

    override fun fallbackStatusCodes(): List<Number> = unwrap(this).getFallbackStatusCodes() ?:
        emptyList()

    override fun primaryOrigin(): IOrigin = unwrap(this).getPrimaryOrigin().let(IOrigin::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OriginGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.origins.OriginGroupProps):
        OriginGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OriginGroupProps):
        software.amazon.awscdk.services.cloudfront.origins.OriginGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.origins.OriginGroupProps
  }
}
