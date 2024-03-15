@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface MetricWidgetProps {
  public fun height(): Number? = unwrap(this).getHeight()

  public fun region(): String? = unwrap(this).getRegion()

  public fun title(): String? = unwrap(this).getTitle()

  public fun width(): Number? = unwrap(this).getWidth()

  @CdkDslMarker
  public interface Builder {
    public fun height(height: Number)

    public fun region(region: String)

    public fun title(title: String)

    public fun width(width: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.MetricWidgetProps.Builder =
        software.amazon.awscdk.services.cloudwatch.MetricWidgetProps.builder()

    override fun height(height: Number) {
      cdkBuilder.height(height)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    override fun title(title: String) {
      cdkBuilder.title(title)
    }

    override fun width(width: Number) {
      cdkBuilder.width(width)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.MetricWidgetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.MetricWidgetProps,
  ) : CdkObject(cdkObject), MetricWidgetProps {
    override fun height(): Number? = unwrap(this).getHeight()

    override fun region(): String? = unwrap(this).getRegion()

    override fun title(): String? = unwrap(this).getTitle()

    override fun width(): Number? = unwrap(this).getWidth()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MetricWidgetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.MetricWidgetProps):
        MetricWidgetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MetricWidgetProps):
        software.amazon.awscdk.services.cloudwatch.MetricWidgetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.MetricWidgetProps
  }
}
