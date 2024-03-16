@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
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

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.IService):
        IService = CdkObjectWrappers.wrap(cdkObject) as IService

    internal fun unwrap(wrapped: IService):
        software.amazon.awscdk.services.servicediscovery.IService = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.servicediscovery.IService
  }
}
