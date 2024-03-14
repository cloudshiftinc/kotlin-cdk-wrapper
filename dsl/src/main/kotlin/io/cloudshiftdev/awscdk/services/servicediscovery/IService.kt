package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IService : IResource {
  public fun discoveryType(): DiscoveryType

  public fun dnsRecordType(): DnsRecordType

  public fun namespace(): INamespace

  public fun routingPolicy(): RoutingPolicy

  public fun serviceArn(): String

  public fun serviceId(): String

  public fun serviceName(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.servicediscovery.IService,
  ) : IService {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun discoveryType(): DiscoveryType =
        unwrap(this).getDiscoveryType().let(DiscoveryType::wrap)

    public override fun dnsRecordType(): DnsRecordType =
        unwrap(this).getDnsRecordType().let(DnsRecordType::wrap)

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun namespace(): INamespace = unwrap(this).getNamespace().let(INamespace::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun routingPolicy(): RoutingPolicy =
        unwrap(this).getRoutingPolicy().let(RoutingPolicy::wrap)

    public override fun serviceArn(): String = unwrap(this).getServiceArn()

    public override fun serviceId(): String = unwrap(this).getServiceId()

    public override fun serviceName(): String = unwrap(this).getServiceName()

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.IService):
        IService = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IService):
        software.amazon.awscdk.services.servicediscovery.IService = (wrapped as Wrapper).cdkObject
  }
}
