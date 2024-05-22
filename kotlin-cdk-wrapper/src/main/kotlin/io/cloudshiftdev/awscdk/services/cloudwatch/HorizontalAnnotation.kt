@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Horizontal annotation to be added to a graph.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
 * HorizontalAnnotation horizontalAnnotation = HorizontalAnnotation.builder()
 * .value(123)
 * // the properties below are optional
 * .color("color")
 * .fill(Shading.NONE)
 * .label("label")
 * .visible(false)
 * .build();
 * ```
 */
public interface HorizontalAnnotation {
  /**
   * The hex color code, prefixed with '#' (e.g. '#00ff00'), to be used for the annotation. The
   * `Color` class has a set of standard colors that can be used here.
   *
   * Default: - Automatic color
   */
  public fun color(): String? = unwrap(this).getColor()

  /**
   * Add shading above or below the annotation.
   *
   * Default: No shading
   */
  public fun fill(): Shading? = unwrap(this).getFill()?.let(Shading::wrap)

  /**
   * Label for the annotation.
   *
   * Default: - No label
   */
  public fun label(): String? = unwrap(this).getLabel()

  /**
   * The value of the annotation.
   */
  public fun `value`(): Number

  /**
   * Whether the annotation is visible.
   *
   * Default: true
   */
  public fun visible(): Boolean? = unwrap(this).getVisible()

  /**
   * A builder for [HorizontalAnnotation]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param color The hex color code, prefixed with '#' (e.g. '#00ff00'), to be used for the
     * annotation. The `Color` class has a set of standard colors that can be used here.
     */
    public fun color(color: String)

    /**
     * @param fill Add shading above or below the annotation.
     */
    public fun fill(fill: Shading)

    /**
     * @param label Label for the annotation.
     */
    public fun label(label: String)

    /**
     * @param value The value of the annotation. 
     */
    public fun `value`(`value`: Number)

    /**
     * @param visible Whether the annotation is visible.
     */
    public fun visible(visible: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation.Builder
        = software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation.builder()

    /**
     * @param color The hex color code, prefixed with '#' (e.g. '#00ff00'), to be used for the
     * annotation. The `Color` class has a set of standard colors that can be used here.
     */
    override fun color(color: String) {
      cdkBuilder.color(color)
    }

    /**
     * @param fill Add shading above or below the annotation.
     */
    override fun fill(fill: Shading) {
      cdkBuilder.fill(fill.let(Shading.Companion::unwrap))
    }

    /**
     * @param label Label for the annotation.
     */
    override fun label(label: String) {
      cdkBuilder.label(label)
    }

    /**
     * @param value The value of the annotation. 
     */
    override fun `value`(`value`: Number) {
      cdkBuilder.`value`(`value`)
    }

    /**
     * @param visible Whether the annotation is visible.
     */
    override fun visible(visible: Boolean) {
      cdkBuilder.visible(visible)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation,
  ) : CdkObject(cdkObject), HorizontalAnnotation {
    /**
     * The hex color code, prefixed with '#' (e.g. '#00ff00'), to be used for the annotation. The
     * `Color` class has a set of standard colors that can be used here.
     *
     * Default: - Automatic color
     */
    override fun color(): String? = unwrap(this).getColor()

    /**
     * Add shading above or below the annotation.
     *
     * Default: No shading
     */
    override fun fill(): Shading? = unwrap(this).getFill()?.let(Shading::wrap)

    /**
     * Label for the annotation.
     *
     * Default: - No label
     */
    override fun label(): String? = unwrap(this).getLabel()

    /**
     * The value of the annotation.
     */
    override fun `value`(): Number = unwrap(this).getValue()

    /**
     * Whether the annotation is visible.
     *
     * Default: true
     */
    override fun visible(): Boolean? = unwrap(this).getVisible()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HorizontalAnnotation {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation):
        HorizontalAnnotation = CdkObjectWrappers.wrap(cdkObject) as? HorizontalAnnotation ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: HorizontalAnnotation):
        software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation
  }
}
