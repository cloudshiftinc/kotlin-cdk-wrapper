@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Vertical annotation to be added to a graph.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
 * VerticalAnnotation verticalAnnotation = VerticalAnnotation.builder()
 * .date("date")
 * // the properties below are optional
 * .color("color")
 * .fill(VerticalShading.NONE)
 * .label("label")
 * .visible(false)
 * .build();
 * ```
 */
public interface VerticalAnnotation {
  /**
   * The hex color code, prefixed with '#' (e.g. '#00ff00'), to be used for the annotation. The
   * `Color` class has a set of standard colors that can be used here.
   *
   * Default: - Automatic color
   */
  public fun color(): String? = unwrap(this).getColor()

  /**
   * The date and time (in ISO 8601 format) in the graph where the vertical annotation line is to
   * appear.
   */
  public fun date(): String

  /**
   * Add shading before or after the annotation.
   *
   * Default: No shading
   */
  public fun fill(): VerticalShading? = unwrap(this).getFill()?.let(VerticalShading::wrap)

  /**
   * Label for the annotation.
   *
   * Default: - No label
   */
  public fun label(): String? = unwrap(this).getLabel()

  /**
   * Whether the annotation is visible.
   *
   * Default: true
   */
  public fun visible(): Boolean? = unwrap(this).getVisible()

  /**
   * A builder for [VerticalAnnotation]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param color The hex color code, prefixed with '#' (e.g. '#00ff00'), to be used for the
     * annotation. The `Color` class has a set of standard colors that can be used here.
     */
    public fun color(color: String)

    /**
     * @param date The date and time (in ISO 8601 format) in the graph where the vertical annotation
     * line is to appear. 
     */
    public fun date(date: String)

    /**
     * @param fill Add shading before or after the annotation.
     */
    public fun fill(fill: VerticalShading)

    /**
     * @param label Label for the annotation.
     */
    public fun label(label: String)

    /**
     * @param visible Whether the annotation is visible.
     */
    public fun visible(visible: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.VerticalAnnotation.Builder =
        software.amazon.awscdk.services.cloudwatch.VerticalAnnotation.builder()

    /**
     * @param color The hex color code, prefixed with '#' (e.g. '#00ff00'), to be used for the
     * annotation. The `Color` class has a set of standard colors that can be used here.
     */
    override fun color(color: String) {
      cdkBuilder.color(color)
    }

    /**
     * @param date The date and time (in ISO 8601 format) in the graph where the vertical annotation
     * line is to appear. 
     */
    override fun date(date: String) {
      cdkBuilder.date(date)
    }

    /**
     * @param fill Add shading before or after the annotation.
     */
    override fun fill(fill: VerticalShading) {
      cdkBuilder.fill(fill.let(VerticalShading.Companion::unwrap))
    }

    /**
     * @param label Label for the annotation.
     */
    override fun label(label: String) {
      cdkBuilder.label(label)
    }

    /**
     * @param visible Whether the annotation is visible.
     */
    override fun visible(visible: Boolean) {
      cdkBuilder.visible(visible)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.VerticalAnnotation =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudwatch.VerticalAnnotation,
  ) : CdkObject(cdkObject),
      VerticalAnnotation {
    /**
     * The hex color code, prefixed with '#' (e.g. '#00ff00'), to be used for the annotation. The
     * `Color` class has a set of standard colors that can be used here.
     *
     * Default: - Automatic color
     */
    override fun color(): String? = unwrap(this).getColor()

    /**
     * The date and time (in ISO 8601 format) in the graph where the vertical annotation line is to
     * appear.
     */
    override fun date(): String = unwrap(this).getDate()

    /**
     * Add shading before or after the annotation.
     *
     * Default: No shading
     */
    override fun fill(): VerticalShading? = unwrap(this).getFill()?.let(VerticalShading::wrap)

    /**
     * Label for the annotation.
     *
     * Default: - No label
     */
    override fun label(): String? = unwrap(this).getLabel()

    /**
     * Whether the annotation is visible.
     *
     * Default: true
     */
    override fun visible(): Boolean? = unwrap(this).getVisible()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VerticalAnnotation {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.VerticalAnnotation):
        VerticalAnnotation = CdkObjectWrappers.wrap(cdkObject) as? VerticalAnnotation ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: VerticalAnnotation):
        software.amazon.awscdk.services.cloudwatch.VerticalAnnotation = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.VerticalAnnotation
  }
}
