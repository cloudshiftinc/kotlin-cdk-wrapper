@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Attributes required to import an existing accelerator to the stack.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.globalaccelerator.*;
 * AcceleratorAttributes acceleratorAttributes = AcceleratorAttributes.builder()
 * .acceleratorArn("acceleratorArn")
 * .dnsName("dnsName")
 * // the properties below are optional
 * .dualStackDnsName("dualStackDnsName")
 * .ipv4Addresses(List.of("ipv4Addresses"))
 * .ipv6Addresses(List.of("ipv6Addresses"))
 * .build();
 * ```
 */
public interface AcceleratorAttributes {
  /**
   * The ARN of the accelerator.
   */
  public fun acceleratorArn(): String

  /**
   * The DNS name of the accelerator.
   */
  public fun dnsName(): String

  /**
   * The DNS name that points to the dual-stack accelerator's four static IP addresses: two IPv4
   * addresses and two IPv6 addresses.
   *
   * Default: - undefined
   */
  public fun dualStackDnsName(): String? = unwrap(this).getDualStackDnsName()

  /**
   * The array of IPv4 addresses in the IP address set.
   *
   * Default: - undefined
   */
  public fun ipv4Addresses(): List<String> = unwrap(this).getIpv4Addresses() ?: emptyList()

  /**
   * The array of IPv6 addresses in the IP address set.
   *
   * Default: - undefined
   */
  public fun ipv6Addresses(): List<String> = unwrap(this).getIpv6Addresses() ?: emptyList()

  /**
   * A builder for [AcceleratorAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param acceleratorArn The ARN of the accelerator. 
     */
    public fun acceleratorArn(acceleratorArn: String)

    /**
     * @param dnsName The DNS name of the accelerator. 
     */
    public fun dnsName(dnsName: String)

    /**
     * @param dualStackDnsName The DNS name that points to the dual-stack accelerator's four static
     * IP addresses: two IPv4 addresses and two IPv6 addresses.
     */
    public fun dualStackDnsName(dualStackDnsName: String)

    /**
     * @param ipv4Addresses The array of IPv4 addresses in the IP address set.
     */
    public fun ipv4Addresses(ipv4Addresses: List<String>)

    /**
     * @param ipv4Addresses The array of IPv4 addresses in the IP address set.
     */
    public fun ipv4Addresses(vararg ipv4Addresses: String)

    /**
     * @param ipv6Addresses The array of IPv6 addresses in the IP address set.
     */
    public fun ipv6Addresses(ipv6Addresses: List<String>)

    /**
     * @param ipv6Addresses The array of IPv6 addresses in the IP address set.
     */
    public fun ipv6Addresses(vararg ipv6Addresses: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.globalaccelerator.AcceleratorAttributes.Builder =
        software.amazon.awscdk.services.globalaccelerator.AcceleratorAttributes.builder()

    /**
     * @param acceleratorArn The ARN of the accelerator. 
     */
    override fun acceleratorArn(acceleratorArn: String) {
      cdkBuilder.acceleratorArn(acceleratorArn)
    }

    /**
     * @param dnsName The DNS name of the accelerator. 
     */
    override fun dnsName(dnsName: String) {
      cdkBuilder.dnsName(dnsName)
    }

    /**
     * @param dualStackDnsName The DNS name that points to the dual-stack accelerator's four static
     * IP addresses: two IPv4 addresses and two IPv6 addresses.
     */
    override fun dualStackDnsName(dualStackDnsName: String) {
      cdkBuilder.dualStackDnsName(dualStackDnsName)
    }

    /**
     * @param ipv4Addresses The array of IPv4 addresses in the IP address set.
     */
    override fun ipv4Addresses(ipv4Addresses: List<String>) {
      cdkBuilder.ipv4Addresses(ipv4Addresses)
    }

    /**
     * @param ipv4Addresses The array of IPv4 addresses in the IP address set.
     */
    override fun ipv4Addresses(vararg ipv4Addresses: String): Unit =
        ipv4Addresses(ipv4Addresses.toList())

    /**
     * @param ipv6Addresses The array of IPv6 addresses in the IP address set.
     */
    override fun ipv6Addresses(ipv6Addresses: List<String>) {
      cdkBuilder.ipv6Addresses(ipv6Addresses)
    }

    /**
     * @param ipv6Addresses The array of IPv6 addresses in the IP address set.
     */
    override fun ipv6Addresses(vararg ipv6Addresses: String): Unit =
        ipv6Addresses(ipv6Addresses.toList())

    public fun build(): software.amazon.awscdk.services.globalaccelerator.AcceleratorAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.globalaccelerator.AcceleratorAttributes,
  ) : CdkObject(cdkObject),
      AcceleratorAttributes {
    /**
     * The ARN of the accelerator.
     */
    override fun acceleratorArn(): String = unwrap(this).getAcceleratorArn()

    /**
     * The DNS name of the accelerator.
     */
    override fun dnsName(): String = unwrap(this).getDnsName()

    /**
     * The DNS name that points to the dual-stack accelerator's four static IP addresses: two IPv4
     * addresses and two IPv6 addresses.
     *
     * Default: - undefined
     */
    override fun dualStackDnsName(): String? = unwrap(this).getDualStackDnsName()

    /**
     * The array of IPv4 addresses in the IP address set.
     *
     * Default: - undefined
     */
    override fun ipv4Addresses(): List<String> = unwrap(this).getIpv4Addresses() ?: emptyList()

    /**
     * The array of IPv6 addresses in the IP address set.
     *
     * Default: - undefined
     */
    override fun ipv6Addresses(): List<String> = unwrap(this).getIpv6Addresses() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AcceleratorAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.AcceleratorAttributes):
        AcceleratorAttributes = CdkObjectWrappers.wrap(cdkObject) as? AcceleratorAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AcceleratorAttributes):
        software.amazon.awscdk.services.globalaccelerator.AcceleratorAttributes = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.globalaccelerator.AcceleratorAttributes
  }
}
