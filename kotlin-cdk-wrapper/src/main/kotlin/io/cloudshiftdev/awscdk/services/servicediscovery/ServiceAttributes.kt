@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.servicediscovery.*;
 * INamespace namespace;
 * ServiceAttributes serviceAttributes = ServiceAttributes.builder()
 * .dnsRecordType(DnsRecordType.A)
 * .namespace(namespace)
 * .routingPolicy(RoutingPolicy.WEIGHTED)
 * .serviceArn("serviceArn")
 * .serviceId("serviceId")
 * .serviceName("serviceName")
 * // the properties below are optional
 * .discoveryType(DiscoveryType.API)
 * .build();
 * ```
 */
public interface ServiceAttributes {
  /**
   *
   */
  public fun discoveryType(): DiscoveryType? =
      unwrap(this).getDiscoveryType()?.let(DiscoveryType::wrap)

  /**
   *
   */
  public fun dnsRecordType(): DnsRecordType

  /**
   *
   */
  public fun namespace(): INamespace

  /**
   *
   */
  public fun routingPolicy(): RoutingPolicy

  /**
   *
   */
  public fun serviceArn(): String

  /**
   *
   */
  public fun serviceId(): String

  /**
   *
   */
  public fun serviceName(): String

  /**
   * A builder for [ServiceAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param discoveryType the value to be set.
     */
    public fun discoveryType(discoveryType: DiscoveryType)

    /**
     * @param dnsRecordType the value to be set. 
     */
    public fun dnsRecordType(dnsRecordType: DnsRecordType)

    /**
     * @param namespace the value to be set. 
     */
    public fun namespace(namespace: INamespace)

    /**
     * @param routingPolicy the value to be set. 
     */
    public fun routingPolicy(routingPolicy: RoutingPolicy)

    /**
     * @param serviceArn the value to be set. 
     */
    public fun serviceArn(serviceArn: String)

    /**
     * @param serviceId the value to be set. 
     */
    public fun serviceId(serviceId: String)

    /**
     * @param serviceName the value to be set. 
     */
    public fun serviceName(serviceName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.ServiceAttributes.Builder =
        software.amazon.awscdk.services.servicediscovery.ServiceAttributes.builder()

    /**
     * @param discoveryType the value to be set.
     */
    override fun discoveryType(discoveryType: DiscoveryType) {
      cdkBuilder.discoveryType(discoveryType.let(DiscoveryType::unwrap))
    }

    /**
     * @param dnsRecordType the value to be set. 
     */
    override fun dnsRecordType(dnsRecordType: DnsRecordType) {
      cdkBuilder.dnsRecordType(dnsRecordType.let(DnsRecordType::unwrap))
    }

    /**
     * @param namespace the value to be set. 
     */
    override fun namespace(namespace: INamespace) {
      cdkBuilder.namespace(namespace.let(INamespace::unwrap))
    }

    /**
     * @param routingPolicy the value to be set. 
     */
    override fun routingPolicy(routingPolicy: RoutingPolicy) {
      cdkBuilder.routingPolicy(routingPolicy.let(RoutingPolicy::unwrap))
    }

    /**
     * @param serviceArn the value to be set. 
     */
    override fun serviceArn(serviceArn: String) {
      cdkBuilder.serviceArn(serviceArn)
    }

    /**
     * @param serviceId the value to be set. 
     */
    override fun serviceId(serviceId: String) {
      cdkBuilder.serviceId(serviceId)
    }

    /**
     * @param serviceName the value to be set. 
     */
    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.ServiceAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicediscovery.ServiceAttributes,
  ) : CdkObject(cdkObject), ServiceAttributes {
    /**
     *
     */
    override fun discoveryType(): DiscoveryType? =
        unwrap(this).getDiscoveryType()?.let(DiscoveryType::wrap)

    /**
     *
     */
    override fun dnsRecordType(): DnsRecordType =
        unwrap(this).getDnsRecordType().let(DnsRecordType::wrap)

    /**
     *
     */
    override fun namespace(): INamespace = unwrap(this).getNamespace().let(INamespace::wrap)

    /**
     *
     */
    override fun routingPolicy(): RoutingPolicy =
        unwrap(this).getRoutingPolicy().let(RoutingPolicy::wrap)

    /**
     *
     */
    override fun serviceArn(): String = unwrap(this).getServiceArn()

    /**
     *
     */
    override fun serviceId(): String = unwrap(this).getServiceId()

    /**
     *
     */
    override fun serviceName(): String = unwrap(this).getServiceName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ServiceAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.ServiceAttributes):
        ServiceAttributes = CdkObjectWrappers.wrap(cdkObject) as? ServiceAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServiceAttributes):
        software.amazon.awscdk.services.servicediscovery.ServiceAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicediscovery.ServiceAttributes
  }
}
