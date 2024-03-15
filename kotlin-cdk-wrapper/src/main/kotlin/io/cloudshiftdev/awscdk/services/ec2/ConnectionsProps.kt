@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface ConnectionsProps {
  public fun defaultPort(): Port? = unwrap(this).getDefaultPort()?.let(Port::wrap)

  public fun peer(): IPeer? = unwrap(this).getPeer()?.let(IPeer::wrap)

  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun defaultPort(defaultPort: Port)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c78bfbd5ed63b14520ebccba252fc83bc95d1023453ee6b9c92a2384462faa71")
    public fun defaultPort(defaultPort: Port.Builder.() -> Unit)

    public fun peer(peer: IPeer)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun securityGroups(vararg securityGroups: ISecurityGroup)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.ConnectionsProps.Builder =
        software.amazon.awscdk.services.ec2.ConnectionsProps.builder()

    override fun defaultPort(defaultPort: Port) {
      cdkBuilder.defaultPort(defaultPort.let(Port::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c78bfbd5ed63b14520ebccba252fc83bc95d1023453ee6b9c92a2384462faa71")
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

    public fun build(): software.amazon.awscdk.services.ec2.ConnectionsProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.ConnectionsProps,
  ) : CdkObject(cdkObject), ConnectionsProps {
    override fun defaultPort(): Port? = unwrap(this).getDefaultPort()?.let(Port::wrap)

    override fun peer(): IPeer? = unwrap(this).getPeer()?.let(IPeer::wrap)

    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ConnectionsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ConnectionsProps):
        ConnectionsProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ConnectionsProps):
        software.amazon.awscdk.services.ec2.ConnectionsProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.ConnectionsProps
  }
}
