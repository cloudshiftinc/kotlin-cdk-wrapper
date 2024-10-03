@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * The list of port ranges for the connections from clients to the accelerator.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.globalaccelerator.*;
 * PortRange portRange = PortRange.builder()
 * .fromPort(123)
 * // the properties below are optional
 * .toPort(123)
 * .build();
 * ```
 */
public interface PortRange {
  /**
   * The first port in the range of ports, inclusive.
   */
  public fun fromPort(): Number

  /**
   * The last port in the range of ports, inclusive.
   *
   * Default: - same as `fromPort`
   */
  public fun toPort(): Number? = unwrap(this).getToPort()

  /**
   * A builder for [PortRange]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param fromPort The first port in the range of ports, inclusive. 
     */
    public fun fromPort(fromPort: Number)

    /**
     * @param toPort The last port in the range of ports, inclusive.
     */
    public fun toPort(toPort: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.globalaccelerator.PortRange.Builder =
        software.amazon.awscdk.services.globalaccelerator.PortRange.builder()

    /**
     * @param fromPort The first port in the range of ports, inclusive. 
     */
    override fun fromPort(fromPort: Number) {
      cdkBuilder.fromPort(fromPort)
    }

    /**
     * @param toPort The last port in the range of ports, inclusive.
     */
    override fun toPort(toPort: Number) {
      cdkBuilder.toPort(toPort)
    }

    public fun build(): software.amazon.awscdk.services.globalaccelerator.PortRange =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.globalaccelerator.PortRange,
  ) : CdkObject(cdkObject),
      PortRange {
    /**
     * The first port in the range of ports, inclusive.
     */
    override fun fromPort(): Number = unwrap(this).getFromPort()

    /**
     * The last port in the range of ports, inclusive.
     *
     * Default: - same as `fromPort`
     */
    override fun toPort(): Number? = unwrap(this).getToPort()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PortRange {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.PortRange):
        PortRange = CdkObjectWrappers.wrap(cdkObject) as? PortRange ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: PortRange):
        software.amazon.awscdk.services.globalaccelerator.PortRange = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.globalaccelerator.PortRange
  }
}
