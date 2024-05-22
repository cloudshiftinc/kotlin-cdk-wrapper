@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for a Text widget.
 *
 * Example:
 *
 * ```
 * Dashboard dashboard;
 * dashboard.addWidgets(TextWidget.Builder.create()
 * .markdown("# Key Performance Indicators")
 * .build());
 * ```
 */
public interface TextWidgetProps {
  /**
   * Background for the widget.
   *
   * Default: solid
   */
  public fun background(): TextWidgetBackground? =
      unwrap(this).getBackground()?.let(TextWidgetBackground::wrap)

  /**
   * Height of the widget.
   *
   * Default: 2
   */
  public fun height(): Number? = unwrap(this).getHeight()

  /**
   * The text to display, in MarkDown format.
   */
  public fun markdown(): String

  /**
   * Width of the widget, in a grid of 24 units wide.
   *
   * Default: 6
   */
  public fun width(): Number? = unwrap(this).getWidth()

  /**
   * A builder for [TextWidgetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param background Background for the widget.
     */
    public fun background(background: TextWidgetBackground)

    /**
     * @param height Height of the widget.
     */
    public fun height(height: Number)

    /**
     * @param markdown The text to display, in MarkDown format. 
     */
    public fun markdown(markdown: String)

    /**
     * @param width Width of the widget, in a grid of 24 units wide.
     */
    public fun width(width: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.TextWidgetProps.Builder =
        software.amazon.awscdk.services.cloudwatch.TextWidgetProps.builder()

    /**
     * @param background Background for the widget.
     */
    override fun background(background: TextWidgetBackground) {
      cdkBuilder.background(background.let(TextWidgetBackground.Companion::unwrap))
    }

    /**
     * @param height Height of the widget.
     */
    override fun height(height: Number) {
      cdkBuilder.height(height)
    }

    /**
     * @param markdown The text to display, in MarkDown format. 
     */
    override fun markdown(markdown: String) {
      cdkBuilder.markdown(markdown)
    }

    /**
     * @param width Width of the widget, in a grid of 24 units wide.
     */
    override fun width(width: Number) {
      cdkBuilder.width(width)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.TextWidgetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudwatch.TextWidgetProps,
  ) : CdkObject(cdkObject), TextWidgetProps {
    /**
     * Background for the widget.
     *
     * Default: solid
     */
    override fun background(): TextWidgetBackground? =
        unwrap(this).getBackground()?.let(TextWidgetBackground::wrap)

    /**
     * Height of the widget.
     *
     * Default: 2
     */
    override fun height(): Number? = unwrap(this).getHeight()

    /**
     * The text to display, in MarkDown format.
     */
    override fun markdown(): String = unwrap(this).getMarkdown()

    /**
     * Width of the widget, in a grid of 24 units wide.
     *
     * Default: 6
     */
    override fun width(): Number? = unwrap(this).getWidth()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TextWidgetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.TextWidgetProps):
        TextWidgetProps = CdkObjectWrappers.wrap(cdkObject) as? TextWidgetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TextWidgetProps):
        software.amazon.awscdk.services.cloudwatch.TextWidgetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.TextWidgetProps
  }
}
