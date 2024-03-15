@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface TextWidgetProps {
  public fun background(): TextWidgetBackground? =
      unwrap(this).getBackground()?.let(TextWidgetBackground::wrap)

  public fun height(): Number? = unwrap(this).getHeight()

  public fun markdown(): String

  public fun width(): Number? = unwrap(this).getWidth()

  @CdkDslMarker
  public interface Builder {
    public fun background(background: TextWidgetBackground)

    public fun height(height: Number)

    public fun markdown(markdown: String)

    public fun width(width: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.TextWidgetProps.Builder =
        software.amazon.awscdk.services.cloudwatch.TextWidgetProps.builder()

    override fun background(background: TextWidgetBackground) {
      cdkBuilder.background(background.let(TextWidgetBackground::unwrap))
    }

    override fun height(height: Number) {
      cdkBuilder.height(height)
    }

    override fun markdown(markdown: String) {
      cdkBuilder.markdown(markdown)
    }

    override fun width(width: Number) {
      cdkBuilder.width(width)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.TextWidgetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.TextWidgetProps,
  ) : CdkObject(cdkObject), TextWidgetProps {
    override fun background(): TextWidgetBackground? =
        unwrap(this).getBackground()?.let(TextWidgetBackground::wrap)

    override fun height(): Number? = unwrap(this).getHeight()

    override fun markdown(): String = unwrap(this).getMarkdown()

    override fun width(): Number? = unwrap(this).getWidth()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TextWidgetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.TextWidgetProps):
        TextWidgetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TextWidgetProps):
        software.amazon.awscdk.services.cloudwatch.TextWidgetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.TextWidgetProps
  }
}
