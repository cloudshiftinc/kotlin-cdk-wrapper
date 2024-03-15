@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

public interface SpacerProps {
  public fun height(): Number? = unwrap(this).getHeight()

  public fun width(): Number? = unwrap(this).getWidth()

  @CdkDslMarker
  public interface Builder {
    public fun height(height: Number)

    public fun width(width: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.SpacerProps.Builder =
        software.amazon.awscdk.services.cloudwatch.SpacerProps.builder()

    override fun height(height: Number) {
      cdkBuilder.height(height)
    }

    override fun width(width: Number) {
      cdkBuilder.width(width)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.SpacerProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.SpacerProps,
  ) : CdkObject(cdkObject), SpacerProps {
    override fun height(): Number? = unwrap(this).getHeight()

    override fun width(): Number? = unwrap(this).getWidth()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SpacerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.SpacerProps):
        SpacerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SpacerProps):
        software.amazon.awscdk.services.cloudwatch.SpacerProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudwatch.SpacerProps
  }
}
