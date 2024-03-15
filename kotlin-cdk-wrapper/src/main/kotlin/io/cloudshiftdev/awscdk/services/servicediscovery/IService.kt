@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicediscovery.IService,
  ) : CdkObject(cdkObject), IService {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun discoveryType(): DiscoveryType =
        unwrap(this).getDiscoveryType().let(DiscoveryType::wrap)

    override fun dnsRecordType(): DnsRecordType =
        unwrap(this).getDnsRecordType().let(DnsRecordType::wrap)

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun namespace(): INamespace = unwrap(this).getNamespace().let(INamespace::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun routingPolicy(): RoutingPolicy =
        unwrap(this).getRoutingPolicy().let(RoutingPolicy::wrap)

    override fun serviceArn(): String = unwrap(this).getServiceArn()

    override fun serviceId(): String = unwrap(this).getServiceId()

    override fun serviceName(): String = unwrap(this).getServiceName()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.IService):
        IService = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IService):
        software.amazon.awscdk.services.servicediscovery.IService = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.servicediscovery.IService
  }
}
