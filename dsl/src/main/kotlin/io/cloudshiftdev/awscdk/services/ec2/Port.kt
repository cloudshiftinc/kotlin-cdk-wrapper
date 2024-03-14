package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public open class Port internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.Port,
) {
  public open fun canInlineRule(): Boolean = unwrap(this).getCanInlineRule()

  public open fun toRuleJson(): Any = unwrap(this).toRuleJson()

  public interface Builder {
    public fun fromPort(fromPort: Number)

    public fun protocol(protocol: Protocol)

    public fun stringRepresentation(stringRepresentation: String)

    public fun toPort(toPort: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.Port.Builder =
        software.amazon.awscdk.services.ec2.Port.Builder.create()

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

    public fun build(): software.amazon.awscdk.services.ec2.Port = cdkBuilder.build()
  }

  public companion object {
    public open fun ah(): Port = software.amazon.awscdk.services.ec2.Port.ah().let(Port::wrap)

    public open fun allIcmp(): Port =
        software.amazon.awscdk.services.ec2.Port.allIcmp().let(Port::wrap)

    public open fun allIcmpV6(): Port =
        software.amazon.awscdk.services.ec2.Port.allIcmpV6().let(Port::wrap)

    public open fun allTcp(): Port =
        software.amazon.awscdk.services.ec2.Port.allTcp().let(Port::wrap)

    public open fun allTraffic(): Port =
        software.amazon.awscdk.services.ec2.Port.allTraffic().let(Port::wrap)

    public open fun allUdp(): Port =
        software.amazon.awscdk.services.ec2.Port.allUdp().let(Port::wrap)

    public open fun esp(): Port = software.amazon.awscdk.services.ec2.Port.esp().let(Port::wrap)

    public open fun icmpPing(): Port =
        software.amazon.awscdk.services.ec2.Port.icmpPing().let(Port::wrap)

    public open fun icmpType(type: Number): Port =
        software.amazon.awscdk.services.ec2.Port.icmpType(type).let(Port::wrap)

    public open fun icmpTypeAndCode(type: Number, code: Number): Port =
        software.amazon.awscdk.services.ec2.Port.icmpTypeAndCode(type, code).let(Port::wrap)

    public open fun tcp(port: Number): Port =
        software.amazon.awscdk.services.ec2.Port.tcp(port).let(Port::wrap)

    public open fun tcpRange(startPort: Number, endPort: Number): Port =
        software.amazon.awscdk.services.ec2.Port.tcpRange(startPort, endPort).let(Port::wrap)

    public open fun udp(port: Number): Port =
        software.amazon.awscdk.services.ec2.Port.udp(port).let(Port::wrap)

    public open fun udpRange(startPort: Number, endPort: Number): Port =
        software.amazon.awscdk.services.ec2.Port.udpRange(startPort, endPort).let(Port::wrap)

    public operator fun invoke(block: Builder.() -> Unit = {}): Port {
      val builderImpl = BuilderImpl()
      return Port(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.Port): Port = Port(cdkObject)

    internal fun unwrap(wrapped: Port): software.amazon.awscdk.services.ec2.Port = wrapped.cdkObject
  }
}
