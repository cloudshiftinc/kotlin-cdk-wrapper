@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.collections.List

/**
 * A widget that contains other widgets in a horizontal row.
 *
 * Widgets will be laid out next to each other
 *
 * Example:
 *
 * ```
 * IWidget widgetA;
 * IWidget widgetB;
 * new Row(widgetA, widgetB);
 * ```
 */
public open class Row(
  cdkObject: software.amazon.awscdk.services.cloudwatch.Row,
) : CdkObject(cdkObject), IWidget {
  public constructor(widgets: IWidget) :
      this(software.amazon.awscdk.services.cloudwatch.Row(widgets.let(IWidget::unwrap))
  )

  /**
   * Add the widget to this container.
   *
   * @param w 
   */
  public open fun addWidget(w: IWidget) {
    unwrap(this).addWidget(w.let(IWidget::unwrap))
  }

  /**
   * The amount of vertical grid units the widget will take up.
   */
  public override fun height(): Number = unwrap(this).getHeight()

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
   * List of contained widgets.
   */
  public open fun widgets(): List<IWidget> = unwrap(this).getWidgets().map(IWidget::wrap)

  /**
   * The amount of horizontal grid units the widget will take up.
   */
  public override fun width(): Number = unwrap(this).getWidth()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.Row): Row =
        Row(cdkObject)

    internal fun unwrap(wrapped: Row): software.amazon.awscdk.services.cloudwatch.Row =
        wrapped.cdkObject as software.amazon.awscdk.services.cloudwatch.Row
  }
}
