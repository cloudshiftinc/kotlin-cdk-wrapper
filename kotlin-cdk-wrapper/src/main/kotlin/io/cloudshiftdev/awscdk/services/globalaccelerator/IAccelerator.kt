@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.collections.List

/**
 * The interface of the Accelerator.
 */
public interface IAccelerator : IResource {
  /**
   * The ARN of the accelerator.
   */
  public fun acceleratorArn(): String

  /**
   * The Domain Name System (DNS) name that Global Accelerator creates that points to your
   * accelerator's static IP addresses.
   */
  public fun dnsName(): String

  /**
   * The DNS name that Global Accelerator creates that points to a dual-stack accelerator's four
   * static IP addresses: two IPv4 addresses and two IPv6 addresses.
   */
  public fun dualStackDnsName(): String? = unwrap(this).getDualStackDnsName()

  /**
   * The array of IPv4 addresses in the IP address set.
   *
   * An IP address set can have a maximum of two IP addresses.
   */
  public fun ipv4Addresses(): List<String> = unwrap(this).getIpv4Addresses() ?: emptyList()

  /**
   * The array of IPv6 addresses in the IP address set.
   *
   * An IP address set can have a maximum of two IP addresses.
   */
  public fun ipv6Addresses(): List<String> = unwrap(this).getIpv6Addresses() ?: emptyList()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.IAccelerator):
        IAccelerator = CdkObjectWrappers.wrap(cdkObject) as IAccelerator

    internal fun unwrap(wrapped: IAccelerator):
        software.amazon.awscdk.services.globalaccelerator.IAccelerator = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.globalaccelerator.IAccelerator
  }
}
