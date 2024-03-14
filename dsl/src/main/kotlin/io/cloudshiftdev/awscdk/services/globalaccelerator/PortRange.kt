package io.cloudshiftdev.awscdk.services.globalaccelerator

import kotlin.Number
import kotlin.Unit

public interface PortRange {
  public fun fromPort(): Number

  public fun toPort(): Number? = unwrap(this).getToPort()

  public interface Builder {
    public fun fromPort(fromPort: Number)

    public fun toPort(toPort: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.globalaccelerator.PortRange.Builder =
        software.amazon.awscdk.services.globalaccelerator.PortRange.builder()

    override fun fromPort(fromPort: Number) {
      cdkBuilder.fromPort(fromPort)
    }

    override fun toPort(toPort: Number) {
      cdkBuilder.toPort(toPort)
    }

    public fun build(): software.amazon.awscdk.services.globalaccelerator.PortRange =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.globalaccelerator.PortRange,
  ) : PortRange {
    override fun fromPort(): Number = unwrap(this).getFromPort()

    override fun toPort(): Number? = unwrap(this).getToPort()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): PortRange {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.PortRange):
        PortRange = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PortRange):
        software.amazon.awscdk.services.globalaccelerator.PortRange = (wrapped as Wrapper).cdkObject
  }
}
