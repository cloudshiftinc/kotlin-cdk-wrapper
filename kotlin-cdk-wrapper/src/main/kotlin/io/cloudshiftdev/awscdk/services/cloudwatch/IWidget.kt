@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

/**
 * A single dashboard widget.
 */
public interface IWidget {
  /**
   * The amount of vertical grid units the widget will take up.
   */
  public fun height(): Number

  /**
   * Place the widget at a given position.
   *
   * @param x 
   * @param y 
   */
  public fun position(x: Number, y: Number)

  /**
   * Return the widget JSON for use in the dashboard.
   */
  public fun toJson(): List<Any>

  /**
   * (deprecated) Any warnings that are produced as a result of putting together this widget.
   *
   * * use warningsV2
   */
  @Deprecated(message = "deprecated in CDK")
  public fun warnings(): List<String> = unwrap(this).getWarnings() ?: emptyList()

  /**
   * Any warnings that are produced as a result of putting together this widget.
   */
  public fun warningsV2(): Map<String, String> = unwrap(this).getWarningsV2() ?: emptyMap()

  /**
   * The amount of horizontal grid units the widget will take up.
   */
  public fun width(): Number

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudwatch.IWidget,
  ) : CdkObject(cdkObject),
      IWidget {
    /**
     * The amount of vertical grid units the widget will take up.
     */
    override fun height(): Number = unwrap(this).getHeight()

    /**
     * Place the widget at a given position.
     *
     * @param x 
     * @param y 
     */
    override fun position(x: Number, y: Number) {
      unwrap(this).position(x, y)
    }

    /**
     * Return the widget JSON for use in the dashboard.
     */
    override fun toJson(): List<Any> = unwrap(this).toJson()

    /**
     * (deprecated) Any warnings that are produced as a result of putting together this widget.
     *
     * * use warningsV2
     */
    @Deprecated(message = "deprecated in CDK")
    override fun warnings(): List<String> = unwrap(this).getWarnings() ?: emptyList()

    /**
     * Any warnings that are produced as a result of putting together this widget.
     */
    override fun warningsV2(): Map<String, String> = unwrap(this).getWarningsV2() ?: emptyMap()

    /**
     * The amount of horizontal grid units the widget will take up.
     */
    override fun width(): Number = unwrap(this).getWidth()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.IWidget): IWidget =
        CdkObjectWrappers.wrap(cdkObject) as? IWidget ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IWidget): software.amazon.awscdk.services.cloudwatch.IWidget =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.IWidget
  }
}
