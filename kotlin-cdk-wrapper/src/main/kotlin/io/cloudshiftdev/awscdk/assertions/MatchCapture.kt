@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.assertions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit

/**
 * Information about a value captured during match.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.assertions.*;
 * Capture capture;
 * Object value;
 * MatchCapture matchCapture = MatchCapture.builder()
 * .capture(capture)
 * .value(value)
 * .build();
 * ```
 */
public interface MatchCapture {
  /**
   * The instance of Capture class to which this capture is associated with.
   */
  public fun capture(): Capture

  /**
   * The value that was captured.
   */
  public fun `value`(): Any

  /**
   * A builder for [MatchCapture]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param capture The instance of Capture class to which this capture is associated with. 
     */
    public fun capture(capture: Capture)

    /**
     * @param value The value that was captured. 
     */
    public fun `value`(`value`: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.assertions.MatchCapture.Builder =
        software.amazon.awscdk.assertions.MatchCapture.builder()

    /**
     * @param capture The instance of Capture class to which this capture is associated with. 
     */
    override fun capture(capture: Capture) {
      cdkBuilder.capture(capture.let(Capture::unwrap))
    }

    /**
     * @param value The value that was captured. 
     */
    override fun `value`(`value`: Any) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.assertions.MatchCapture = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.assertions.MatchCapture,
  ) : CdkObject(cdkObject), MatchCapture {
    /**
     * The instance of Capture class to which this capture is associated with.
     */
    override fun capture(): Capture = unwrap(this).getCapture().let(Capture::wrap)

    /**
     * The value that was captured.
     */
    override fun `value`(): Any = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MatchCapture {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.assertions.MatchCapture): MatchCapture =
        CdkObjectWrappers.wrap(cdkObject) as? MatchCapture ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: MatchCapture): software.amazon.awscdk.assertions.MatchCapture =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.assertions.MatchCapture
  }
}
