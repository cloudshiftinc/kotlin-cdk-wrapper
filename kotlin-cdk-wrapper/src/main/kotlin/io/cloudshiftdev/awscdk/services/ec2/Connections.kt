@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public open class Connections internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.Connections,
) : CdkObject(cdkObject), IConnectable {
  public open fun addSecurityGroup(securityGroups: ISecurityGroup) {
    unwrap(this).addSecurityGroup(securityGroups.let(ISecurityGroup::unwrap))
  }

  public open fun allowDefaultPortFrom(other: IConnectable) {
    unwrap(this).allowDefaultPortFrom(other.let(IConnectable::unwrap))
  }

  public open fun allowDefaultPortFrom(other: IConnectable, description: String) {
    unwrap(this).allowDefaultPortFrom(other.let(IConnectable::unwrap), description)
  }

  public open fun allowDefaultPortFromAnyIpv4() {
    unwrap(this).allowDefaultPortFromAnyIpv4()
  }

  public open fun allowDefaultPortFromAnyIpv4(description: String) {
    unwrap(this).allowDefaultPortFromAnyIpv4(description)
  }

  public open fun allowDefaultPortInternally() {
    unwrap(this).allowDefaultPortInternally()
  }

  public open fun allowDefaultPortInternally(description: String) {
    unwrap(this).allowDefaultPortInternally(description)
  }

  public open fun allowDefaultPortTo(other: IConnectable) {
    unwrap(this).allowDefaultPortTo(other.let(IConnectable::unwrap))
  }

  public open fun allowDefaultPortTo(other: IConnectable, description: String) {
    unwrap(this).allowDefaultPortTo(other.let(IConnectable::unwrap), description)
  }

  public open fun allowFrom(other: IConnectable, portRange: Port) {
    unwrap(this).allowFrom(other.let(IConnectable::unwrap), portRange.let(Port::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("02238d1949edf07fd1277138ca4be646ffde5a8ba3fece922f1f3af0bd5ae079")
  public open fun allowFrom(other: IConnectable, portRange: Port.Builder.() -> Unit): Unit =
      allowFrom(other, Port(portRange))

  public open fun allowFrom(
    other: IConnectable,
    portRange: Port,
    description: String,
  ) {
    unwrap(this).allowFrom(other.let(IConnectable::unwrap), portRange.let(Port::unwrap),
        description)
  }

  public open fun allowFromAnyIpv4(portRange: Port) {
    unwrap(this).allowFromAnyIpv4(portRange.let(Port::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("748876ab598a9d355a790825c24fad35701b805e4817edf9b4cd022801d75834")
  public open fun allowFromAnyIpv4(portRange: Port.Builder.() -> Unit): Unit =
      allowFromAnyIpv4(Port(portRange))

  public open fun allowFromAnyIpv4(portRange: Port, description: String) {
    unwrap(this).allowFromAnyIpv4(portRange.let(Port::unwrap), description)
  }

  public open fun allowInternally(portRange: Port) {
    unwrap(this).allowInternally(portRange.let(Port::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("db68d975561bb0ad11cb8a24d32265af9627649287fe6fa10517d329bf2dedba")
  public open fun allowInternally(portRange: Port.Builder.() -> Unit): Unit =
      allowInternally(Port(portRange))

  public open fun allowInternally(portRange: Port, description: String) {
    unwrap(this).allowInternally(portRange.let(Port::unwrap), description)
  }

  public open fun allowTo(other: IConnectable, portRange: Port) {
    unwrap(this).allowTo(other.let(IConnectable::unwrap), portRange.let(Port::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f5b975caf22f1a32e319dc561aa3278d8b1f602c35043ae33b067c95ce78116b")
  public open fun allowTo(other: IConnectable, portRange: Port.Builder.() -> Unit): Unit =
      allowTo(other, Port(portRange))

  public open fun allowTo(
    other: IConnectable,
    portRange: Port,
    description: String,
  ) {
    unwrap(this).allowTo(other.let(IConnectable::unwrap), portRange.let(Port::unwrap), description)
  }

  public open fun allowToAnyIpv4(portRange: Port) {
    unwrap(this).allowToAnyIpv4(portRange.let(Port::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c2ca5bd260644cf192a782f9044fc8e280622310b6842746b63ee4e7b8a3ca78")
  public open fun allowToAnyIpv4(portRange: Port.Builder.() -> Unit): Unit =
      allowToAnyIpv4(Port(portRange))

  public open fun allowToAnyIpv4(portRange: Port, description: String) {
    unwrap(this).allowToAnyIpv4(portRange.let(Port::unwrap), description)
  }

  public open fun allowToDefaultPort(other: IConnectable) {
    unwrap(this).allowToDefaultPort(other.let(IConnectable::unwrap))
  }

  public open fun allowToDefaultPort(other: IConnectable, description: String) {
    unwrap(this).allowToDefaultPort(other.let(IConnectable::unwrap), description)
  }

  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public open fun defaultPort(): Port? = unwrap(this).getDefaultPort()?.let(Port::wrap)

  public open fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups().map(ISecurityGroup::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun defaultPort(defaultPort: Port)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("134875f63575344e60e9fde0e44020cbaaebbf3365cdf9a2e6c7d703571b0f2a")
    public fun defaultPort(defaultPort: Port.Builder.() -> Unit)

    public fun peer(peer: IPeer)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun securityGroups(vararg securityGroups: ISecurityGroup)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.Connections.Builder =
        software.amazon.awscdk.services.ec2.Connections.Builder.create()

    override fun defaultPort(defaultPort: Port) {
      cdkBuilder.defaultPort(defaultPort.let(Port::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("134875f63575344e60e9fde0e44020cbaaebbf3365cdf9a2e6c7d703571b0f2a")
    override fun defaultPort(defaultPort: Port.Builder.() -> Unit): Unit =
        defaultPort(Port(defaultPort))

    override fun peer(peer: IPeer) {
      cdkBuilder.peer(peer.let(IPeer::unwrap))
    }

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    public fun build(): software.amazon.awscdk.services.ec2.Connections = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Connections {
      val builderImpl = BuilderImpl()
      return Connections(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.Connections): Connections =
        Connections(cdkObject)

    internal fun unwrap(wrapped: Connections): software.amazon.awscdk.services.ec2.Connections =
        wrapped.cdkObject
  }
}
