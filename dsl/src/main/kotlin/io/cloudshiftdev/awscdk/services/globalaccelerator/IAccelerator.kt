package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.collections.List

public interface IAccelerator : IResource {
  public fun acceleratorArn(): String

  public fun dnsName(): String

  public fun dualStackDnsName(): String? = unwrap(this).getDualStackDnsName()

  public fun ipv4Addresses(): List<String> = unwrap(this).getIpv4Addresses() ?: emptyList()

  public fun ipv6Addresses(): List<String> = unwrap(this).getIpv6Addresses() ?: emptyList()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.globalaccelerator.IAccelerator,
  ) : IAccelerator {
    override fun acceleratorArn(): String = unwrap(this).getAcceleratorArn()

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun dnsName(): String = unwrap(this).getDnsName()

    override fun dualStackDnsName(): String? = unwrap(this).getDualStackDnsName()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun ipv4Addresses(): List<String> = unwrap(this).getIpv4Addresses() ?: emptyList()

    override fun ipv6Addresses(): List<String> = unwrap(this).getIpv6Addresses() ?: emptyList()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.IAccelerator):
        IAccelerator = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAccelerator):
        software.amazon.awscdk.services.globalaccelerator.IAccelerator = (wrapped as
        Wrapper).cdkObject
  }
}
