package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface AclPortRange {
  /**
   * The first port in the range.
   *
   * Required if you specify 6 (TCP) or 17 (UDP) for the protocol parameter.
   */
  public fun from(): Number? = unwrap(this).getFrom()

  /**
   * The last port in the range.
   *
   * Required if you specify 6 (TCP) or 17 (UDP) for the protocol parameter.
   */
  public fun to(): Number? = unwrap(this).getTo()

  /**
   * A builder for [AclPortRange]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param from The first port in the range.
     * Required if you specify 6 (TCP) or 17 (UDP) for the protocol parameter.
     */
    public fun from(from: Number)

    /**
     * @param to The last port in the range.
     * Required if you specify 6 (TCP) or 17 (UDP) for the protocol parameter.
     */
    public fun to(to: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.AclPortRange.Builder =
        software.amazon.awscdk.services.ec2.AclPortRange.builder()

    /**
     * @param from The first port in the range.
     * Required if you specify 6 (TCP) or 17 (UDP) for the protocol parameter.
     */
    override fun from(from: Number) {
      cdkBuilder.from(from)
    }

    /**
     * @param to The last port in the range.
     * Required if you specify 6 (TCP) or 17 (UDP) for the protocol parameter.
     */
    override fun to(to: Number) {
      cdkBuilder.to(to)
    }

    public fun build(): software.amazon.awscdk.services.ec2.AclPortRange = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.AclPortRange,
  ) : CdkObject(cdkObject), AclPortRange {
    /**
     * The first port in the range.
     *
     * Required if you specify 6 (TCP) or 17 (UDP) for the protocol parameter.
     */
    override fun from(): Number? = unwrap(this).getFrom()

    /**
     * The last port in the range.
     *
     * Required if you specify 6 (TCP) or 17 (UDP) for the protocol parameter.
     */
    override fun to(): Number? = unwrap(this).getTo()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AclPortRange {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AclPortRange): AclPortRange =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AclPortRange): software.amazon.awscdk.services.ec2.AclPortRange =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.AclPortRange
  }
}
