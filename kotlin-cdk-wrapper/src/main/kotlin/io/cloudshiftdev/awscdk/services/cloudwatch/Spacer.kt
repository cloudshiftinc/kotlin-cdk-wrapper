@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

/**
 * A widget that doesn't display anything but takes up space.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
 * Spacer spacer = Spacer.Builder.create()
 * .height(123)
 * .width(123)
 * .build();
 * ```
 */
public open class Spacer(
  cdkObject: software.amazon.awscdk.services.cloudwatch.Spacer,
) : CdkObject(cdkObject), IWidget {
  public constructor() : this(software.amazon.awscdk.services.cloudwatch.Spacer()
  )

  public constructor(props: SpacerProps) :
      this(software.amazon.awscdk.services.cloudwatch.Spacer(props.let(SpacerProps::unwrap))
  )

  public constructor(props: SpacerProps.Builder.() -> Unit) : this(SpacerProps(props)
  )

  /**
   * The amount of vertical grid units the widget will take up.
   */
  public override fun height(): Number = unwrap(this).getHeight()

  /**
   * Place the widget at a given position.
   *
   * @param _x 
   * @param _y 
   */
  public override fun position(x: Number, y: Number) {
    unwrap(this).position(x, y)
  }

  /**
   * Return the widget JSON for use in the dashboard.
   */
  public override fun toJson(): List<Any> = unwrap(this).toJson()

  /**
   * The amount of horizontal grid units the widget will take up.
   */
  public override fun width(): Number = unwrap(this).getWidth()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudwatch.Spacer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Height of the spacer.
     *
     * Default: : 1
     *
     * @param height Height of the spacer. 
     */
    public fun height(height: Number)

    /**
     * Width of the spacer.
     *
     * Default: 1
     *
     * @param width Width of the spacer. 
     */
    public fun width(width: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.Spacer.Builder =
        software.amazon.awscdk.services.cloudwatch.Spacer.Builder.create()

    /**
     * Height of the spacer.
     *
     * Default: : 1
     *
     * @param height Height of the spacer. 
     */
    override fun height(height: Number) {
      cdkBuilder.height(height)
    }

    /**
     * Width of the spacer.
     *
     * Default: 1
     *
     * @param width Width of the spacer. 
     */
    override fun width(width: Number) {
      cdkBuilder.width(width)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.Spacer = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Spacer {
      val builderImpl = BuilderImpl()
      return Spacer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.Spacer): Spacer =
        Spacer(cdkObject)

    internal fun unwrap(wrapped: Spacer): software.amazon.awscdk.services.cloudwatch.Spacer =
        wrapped.cdkObject as software.amazon.awscdk.services.cloudwatch.Spacer
  }
}
