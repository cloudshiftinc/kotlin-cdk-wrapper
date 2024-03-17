@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties to create a port range.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * PortProps portProps = PortProps.builder()
 * .protocol(Protocol.ALL)
 * .stringRepresentation("stringRepresentation")
 * // the properties below are optional
 * .fromPort(123)
 * .toPort(123)
 * .build();
 * ```
 */
public interface PortProps {
  /**
   * The starting port for the range.
   *
   * Default: - Not included in the rule
   */
  public fun fromPort(): Number? = unwrap(this).getFromPort()

  /**
   * The protocol for the range.
   */
  public fun protocol(): Protocol

  /**
   * String representation for this object.
   */
  public fun stringRepresentation(): String

  /**
   * The ending port for the range.
   *
   * Default: - Not included in the rule
   */
  public fun toPort(): Number? = unwrap(this).getToPort()

  /**
   * A builder for [PortProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param fromPort The starting port for the range.
     */
    public fun fromPort(fromPort: Number)

    /**
     * @param protocol The protocol for the range. 
     */
    public fun protocol(protocol: Protocol)

    /**
     * @param stringRepresentation String representation for this object. 
     */
    public fun stringRepresentation(stringRepresentation: String)

    /**
     * @param toPort The ending port for the range.
     */
    public fun toPort(toPort: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.PortProps.Builder =
        software.amazon.awscdk.services.ec2.PortProps.builder()

    /**
     * @param fromPort The starting port for the range.
     */
    override fun fromPort(fromPort: Number) {
      cdkBuilder.fromPort(fromPort)
    }

    /**
     * @param protocol The protocol for the range. 
     */
    override fun protocol(protocol: Protocol) {
      cdkBuilder.protocol(protocol.let(Protocol::unwrap))
    }

    /**
     * @param stringRepresentation String representation for this object. 
     */
    override fun stringRepresentation(stringRepresentation: String) {
      cdkBuilder.stringRepresentation(stringRepresentation)
    }

    /**
     * @param toPort The ending port for the range.
     */
    override fun toPort(toPort: Number) {
      cdkBuilder.toPort(toPort)
    }

    public fun build(): software.amazon.awscdk.services.ec2.PortProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.PortProps,
  ) : CdkObject(cdkObject), PortProps {
    /**
     * The starting port for the range.
     *
     * Default: - Not included in the rule
     */
    override fun fromPort(): Number? = unwrap(this).getFromPort()

    /**
     * The protocol for the range.
     */
    override fun protocol(): Protocol = unwrap(this).getProtocol().let(Protocol::wrap)

    /**
     * String representation for this object.
     */
    override fun stringRepresentation(): String = unwrap(this).getStringRepresentation()

    /**
     * The ending port for the range.
     *
     * Default: - Not included in the rule
     */
    override fun toPort(): Number? = unwrap(this).getToPort()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PortProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.PortProps): PortProps =
        CdkObjectWrappers.wrap(cdkObject) as? PortProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: PortProps): software.amazon.awscdk.services.ec2.PortProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.PortProps
  }
}
