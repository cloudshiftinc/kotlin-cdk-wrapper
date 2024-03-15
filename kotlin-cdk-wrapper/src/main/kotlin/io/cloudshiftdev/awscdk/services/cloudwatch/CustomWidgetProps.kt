@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CustomWidgetProps {
  public fun functionArn(): String

  public fun height(): Number? = unwrap(this).getHeight()

  public fun params(): Any? = unwrap(this).getParams()

  public fun title(): String

  public fun updateOnRefresh(): Boolean? = unwrap(this).getUpdateOnRefresh()

  public fun updateOnResize(): Boolean? = unwrap(this).getUpdateOnResize()

  public fun updateOnTimeRangeChange(): Boolean? = unwrap(this).getUpdateOnTimeRangeChange()

  public fun width(): Number? = unwrap(this).getWidth()

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
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.CustomWidgetProps.Builder =
        software.amazon.awscdk.services.cloudwatch.CustomWidgetProps.builder()

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

    public fun build(): software.amazon.awscdk.services.cloudwatch.CustomWidgetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.CustomWidgetProps,
  ) : CdkObject(cdkObject), CustomWidgetProps {
    override fun functionArn(): String = unwrap(this).getFunctionArn()

    override fun height(): Number? = unwrap(this).getHeight()

    override fun params(): Any? = unwrap(this).getParams()

    override fun title(): String = unwrap(this).getTitle()

    override fun updateOnRefresh(): Boolean? = unwrap(this).getUpdateOnRefresh()

    override fun updateOnResize(): Boolean? = unwrap(this).getUpdateOnResize()

    override fun updateOnTimeRangeChange(): Boolean? = unwrap(this).getUpdateOnTimeRangeChange()

    override fun width(): Number? = unwrap(this).getWidth()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomWidgetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CustomWidgetProps):
        CustomWidgetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomWidgetProps):
        software.amazon.awscdk.services.cloudwatch.CustomWidgetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.CustomWidgetProps
  }
}
