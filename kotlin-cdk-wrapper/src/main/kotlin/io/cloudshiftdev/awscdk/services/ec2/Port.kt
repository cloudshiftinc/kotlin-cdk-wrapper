@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public open class Port internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.Port,
) : CdkObject(cdkObject) {
  public open fun canInlineRule(): Boolean = unwrap(this).getCanInlineRule()

  public open fun toRuleJson(): Any = unwrap(this).toRuleJson()

  @CdkDslMarker
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
    public fun ah(): Port = software.amazon.awscdk.services.ec2.Port.ah().let(Port::wrap)

    public fun allIcmp(): Port = software.amazon.awscdk.services.ec2.Port.allIcmp().let(Port::wrap)

    public fun allIcmpV6(): Port =
        software.amazon.awscdk.services.ec2.Port.allIcmpV6().let(Port::wrap)

    public fun allTcp(): Port = software.amazon.awscdk.services.ec2.Port.allTcp().let(Port::wrap)

    public fun allTraffic(): Port =
        software.amazon.awscdk.services.ec2.Port.allTraffic().let(Port::wrap)

    public fun allUdp(): Port = software.amazon.awscdk.services.ec2.Port.allUdp().let(Port::wrap)

    public fun esp(): Port = software.amazon.awscdk.services.ec2.Port.esp().let(Port::wrap)

    public fun icmpPing(): Port =
        software.amazon.awscdk.services.ec2.Port.icmpPing().let(Port::wrap)

    public fun icmpType(type: Number): Port =
        software.amazon.awscdk.services.ec2.Port.icmpType(type).let(Port::wrap)

    public fun icmpTypeAndCode(type: Number, code: Number): Port =
        software.amazon.awscdk.services.ec2.Port.icmpTypeAndCode(type, code).let(Port::wrap)

    public fun tcp(port: Number): Port =
        software.amazon.awscdk.services.ec2.Port.tcp(port).let(Port::wrap)

    public fun tcpRange(startPort: Number, endPort: Number): Port =
        software.amazon.awscdk.services.ec2.Port.tcpRange(startPort, endPort).let(Port::wrap)

    public fun udp(port: Number): Port =
        software.amazon.awscdk.services.ec2.Port.udp(port).let(Port::wrap)

    public fun udpRange(startPort: Number, endPort: Number): Port =
        software.amazon.awscdk.services.ec2.Port.udpRange(startPort, endPort).let(Port::wrap)

    public operator fun invoke(block: Builder.() -> Unit = {}): Port {
      val builderImpl = BuilderImpl()
      return Port(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.Port): Port = Port(cdkObject)

    internal fun unwrap(wrapped: Port): software.amazon.awscdk.services.ec2.Port = wrapped.cdkObject
  }
}
