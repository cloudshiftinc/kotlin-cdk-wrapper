@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

/**
 * Props of the spacer.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
 * SpacerProps spacerProps = SpacerProps.builder()
 * .height(123)
 * .width(123)
 * .build();
 * ```
 */
public interface SpacerProps {
  /**
   * Height of the spacer.
   *
   * Default: : 1
   */
  public fun height(): Number? = unwrap(this).getHeight()

  /**
   * Width of the spacer.
   *
   * Default: 1
   */
  public fun width(): Number? = unwrap(this).getWidth()

  /**
   * A builder for [SpacerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param height Height of the spacer.
     */
    public fun height(height: Number)

    /**
     * @param width Width of the spacer.
     */
    public fun width(width: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.SpacerProps.Builder =
        software.amazon.awscdk.services.cloudwatch.SpacerProps.builder()

    /**
     * @param height Height of the spacer.
     */
    override fun height(height: Number) {
      cdkBuilder.height(height)
    }

    /**
     * @param width Width of the spacer.
     */
    override fun width(width: Number) {
      cdkBuilder.width(width)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.SpacerProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.SpacerProps,
  ) : CdkObject(cdkObject), SpacerProps {
    /**
     * Height of the spacer.
     *
     * Default: : 1
     */
    override fun height(): Number? = unwrap(this).getHeight()

    /**
     * Width of the spacer.
     *
     * Default: 1
     */
    override fun width(): Number? = unwrap(this).getWidth()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SpacerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.SpacerProps):
        SpacerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SpacerProps):
        software.amazon.awscdk.services.cloudwatch.SpacerProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudwatch.SpacerProps
  }
}
