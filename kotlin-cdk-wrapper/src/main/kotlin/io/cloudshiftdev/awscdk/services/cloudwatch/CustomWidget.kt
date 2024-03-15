@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public open class CustomWidget internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudwatch.CustomWidget,
) : ConcreteWidget(cdkObject) {
  public override fun toJson(): List<Any> = unwrap(this).toJson()

  @CdkDslMarker
  public interface Builder {
    public fun functionArn(functionArn: String)

    public fun height(height: Number)

    public fun params(params: Any)

    public fun title(title: String)

    public fun updateOnRefresh(updateOnRefresh: Boolean)

    public fun updateOnResize(updateOnResize: Boolean)

    public fun updateOnTimeRangeChange(updateOnTimeRangeChange: Boolean)

    public fun width(width: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.CustomWidget.Builder =
        software.amazon.awscdk.services.cloudwatch.CustomWidget.Builder.create()

    override fun functionArn(functionArn: String) {
      cdkBuilder.functionArn(functionArn)
    }

    override fun height(height: Number) {
      cdkBuilder.height(height)
    }

    override fun params(params: Any) {
      cdkBuilder.params(params)
    }

    override fun title(title: String) {
      cdkBuilder.title(title)
    }

    override fun updateOnRefresh(updateOnRefresh: Boolean) {
      cdkBuilder.updateOnRefresh(updateOnRefresh)
    }

    override fun updateOnResize(updateOnResize: Boolean) {
      cdkBuilder.updateOnResize(updateOnResize)
    }

    override fun updateOnTimeRangeChange(updateOnTimeRangeChange: Boolean) {
      cdkBuilder.updateOnTimeRangeChange(updateOnTimeRangeChange)
    }

    override fun width(width: Number) {
      cdkBuilder.width(width)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.CustomWidget = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomWidget {
      val builderImpl = BuilderImpl()
      return CustomWidget(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CustomWidget):
        CustomWidget = CustomWidget(cdkObject)

    internal fun unwrap(wrapped: CustomWidget):
        software.amazon.awscdk.services.cloudwatch.CustomWidget = wrapped.cdkObject
  }
}
