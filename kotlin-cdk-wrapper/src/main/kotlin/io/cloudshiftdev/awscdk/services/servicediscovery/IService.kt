@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

/**
 *
 */
public interface IService : IResource {
  /**
   * The discovery type used by the service.
   */
  public fun discoveryType(): DiscoveryType

  /**
   * The DnsRecordType used by the service.
   */
  public fun dnsRecordType(): DnsRecordType

  /**
   * The namespace for the Cloudmap Service.
   */
  public fun namespace(): INamespace

  /**
   * The Routing Policy used by the service.
   */
  public fun routingPolicy(): RoutingPolicy

  /**
   * The Arn of the namespace that you want to use for DNS configuration.
   */
  public fun serviceArn(): String

  /**
   * The ID of the namespace that you want to use for DNS configuration.
   */
  public fun serviceId(): String

  /**
   * A name for the Cloudmap Service.
   */
  public fun serviceName(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicediscovery.IService,
  ) : CdkObject(cdkObject), IService {
    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
    }

    /**
     * The discovery type used by the service.
     */
    override fun discoveryType(): DiscoveryType =
        unwrap(this).getDiscoveryType().let(DiscoveryType::wrap)

    /**
     * The DnsRecordType used by the service.
     */
    override fun dnsRecordType(): DnsRecordType =
        unwrap(this).getDnsRecordType().let(DnsRecordType::wrap)

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    /**
     * The namespace for the Cloudmap Service.
     */
    override fun namespace(): INamespace = unwrap(this).getNamespace().let(INamespace::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The Routing Policy used by the service.
     */
    override fun routingPolicy(): RoutingPolicy =
        unwrap(this).getRoutingPolicy().let(RoutingPolicy::wrap)

    /**
     * The Arn of the namespace that you want to use for DNS configuration.
     */
    override fun serviceArn(): String = unwrap(this).getServiceArn()

    /**
     * The ID of the namespace that you want to use for DNS configuration.
     */
    override fun serviceId(): String = unwrap(this).getServiceId()

    /**
     * A name for the Cloudmap Service.
     */
    override fun serviceName(): String = unwrap(this).getServiceName()

    /**
     * The stack in which this resource is defined.
     */
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
