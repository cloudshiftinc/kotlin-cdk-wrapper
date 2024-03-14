package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

public abstract class ConcreteWidget internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudwatch.ConcreteWidget,
) : CdkObject(cdkObject), IWidget {
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
   * Any warnings that are produced as a result of putting together this widget.
   */
  public override fun warnings(): List<String> = unwrap(this).getWarnings() ?: emptyList()

  /**
   * Any warnings that are produced as a result of putting together this widget.
   */
  public override fun warningsV2(): Map<String, String> = unwrap(this).getWarningsV2() ?: emptyMap()

  /**
   * The amount of horizontal grid units the widget will take up.
   */
  public override fun width(): Number = unwrap(this).getWidth()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.ConcreteWidget,
  ) : ConcreteWidget(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.ConcreteWidget):
        ConcreteWidget = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ConcreteWidget):
        software.amazon.awscdk.services.cloudwatch.ConcreteWidget = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cloudwatch.ConcreteWidget
  }
}
