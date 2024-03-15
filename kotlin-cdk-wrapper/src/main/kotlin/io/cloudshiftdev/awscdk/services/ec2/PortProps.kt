@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface PortProps {
  public fun fromPort(): Number? = unwrap(this).getFromPort()

  public fun protocol(): Protocol

  public fun stringRepresentation(): String

  public fun toPort(): Number? = unwrap(this).getToPort()

  @CdkDslMarker
  public interface Builder {
    public fun fromPort(fromPort: Number)

    public fun protocol(protocol: Protocol)

    public fun stringRepresentation(stringRepresentation: String)

    public fun toPort(toPort: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.PortProps.Builder =
        software.amazon.awscdk.services.ec2.PortProps.builder()

    override fun fromPort(fromPort: Number) {
      cdkBuilder.fromPort(fromPort)
    }

    override fun protocol(protocol: Protocol) {
      cdkBuilder.protocol(protocol.let(Protocol::unwrap))
    }

    override fun stringRepresentation(stringRepresentation: String) {
      cdkBuilder.stringRepresentation(stringRepresentation)
    }

    override fun toPort(toPort: Number) {
      cdkBuilder.toPort(toPort)
    }

    public fun build(): software.amazon.awscdk.services.ec2.PortProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.PortProps,
  ) : CdkObject(cdkObject), PortProps {
    override fun fromPort(): Number? = unwrap(this).getFromPort()

    override fun protocol(): Protocol = unwrap(this).getProtocol().let(Protocol::wrap)

    override fun stringRepresentation(): String = unwrap(this).getStringRepresentation()

    override fun toPort(): Number? = unwrap(this).getToPort()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PortProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.PortProps): PortProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: PortProps): software.amazon.awscdk.services.ec2.PortProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.PortProps
  }
}
