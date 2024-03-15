@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * A dashboard widget that displays MarkDown.
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
public open class TextWidget internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudwatch.TextWidget,
) : ConcreteWidget(cdkObject) {
  /**
   * Place the widget at a given position.
   *
   * @param x 
   * @param y 
   */
  public override fun position(x: Number, y: Number) {
    unwrap(this).position(x, y)
  }

  /**
   * Return the widget JSON for use in the dashboard.
   */
  public override fun toJson(): List<Any> = unwrap(this).toJson()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudwatch.TextWidget].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Background for the widget.
     *
     * Default: solid
     *
     * @param background Background for the widget. 
     */
    public fun background(background: TextWidgetBackground)

    /**
     * Height of the widget.
     *
     * Default: 2
     *
     * @param height Height of the widget. 
     */
    public fun height(height: Number)

    /**
     * The text to display, in MarkDown format.
     *
     * @param markdown The text to display, in MarkDown format. 
     */
    public fun markdown(markdown: String)

    /**
     * Width of the widget, in a grid of 24 units wide.
     *
     * Default: 6
     *
     * @param width Width of the widget, in a grid of 24 units wide. 
     */
    public fun width(width: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.TextWidget.Builder =
        software.amazon.awscdk.services.cloudwatch.TextWidget.Builder.create()

    /**
     * Background for the widget.
     *
     * Default: solid
     *
     * @param background Background for the widget. 
     */
    override fun background(background: TextWidgetBackground) {
      cdkBuilder.background(background.let(TextWidgetBackground::unwrap))
    }

    /**
     * Height of the widget.
     *
     * Default: 2
     *
     * @param height Height of the widget. 
     */
    override fun height(height: Number) {
      cdkBuilder.height(height)
    }

    /**
     * The text to display, in MarkDown format.
     *
     * @param markdown The text to display, in MarkDown format. 
     */
    override fun markdown(markdown: String) {
      cdkBuilder.markdown(markdown)
    }

    /**
     * Width of the widget, in a grid of 24 units wide.
     *
     * Default: 6
     *
     * @param width Width of the widget, in a grid of 24 units wide. 
     */
    override fun width(width: Number) {
      cdkBuilder.width(width)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.TextWidget = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TextWidget {
      val builderImpl = BuilderImpl()
      return TextWidget(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.TextWidget): TextWidget
        = TextWidget(cdkObject)

    internal fun unwrap(wrapped: TextWidget): software.amazon.awscdk.services.cloudwatch.TextWidget
        = wrapped.cdkObject
  }
}
