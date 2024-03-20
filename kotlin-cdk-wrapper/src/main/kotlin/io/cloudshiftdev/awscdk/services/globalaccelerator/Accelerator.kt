@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The Accelerator construct.
 *
 * Example:
 *
 * ```
 * // Create an Accelerator
 * Accelerator accelerator = new Accelerator(this, "Accelerator");
 * // Create a Listener
 * Listener listener = accelerator.addListener("Listener", ListenerOptions.builder()
 * .portRanges(List.of(PortRange.builder().fromPort(80).build(),
 * PortRange.builder().fromPort(443).build()))
 * .build());
 * // Import the Load Balancers
 * INetworkLoadBalancer nlb1 = NetworkLoadBalancer.fromNetworkLoadBalancerAttributes(this, "NLB1",
 * NetworkLoadBalancerAttributes.builder()
 * .loadBalancerArn("arn:aws:elasticloadbalancing:us-west-2:111111111111:loadbalancer/app/my-load-balancer1/e16bef66805b")
 * .build());
 * INetworkLoadBalancer nlb2 = NetworkLoadBalancer.fromNetworkLoadBalancerAttributes(this, "NLB2",
 * NetworkLoadBalancerAttributes.builder()
 * .loadBalancerArn("arn:aws:elasticloadbalancing:ap-south-1:111111111111:loadbalancer/app/my-load-balancer2/5513dc2ea8a1")
 * .build());
 * // Add one EndpointGroup for each Region we are targeting
 * listener.addEndpointGroup("Group1", EndpointGroupOptions.builder()
 * .endpoints(List.of(new NetworkLoadBalancerEndpoint(nlb1)))
 * .build());
 * listener.addEndpointGroup("Group2", EndpointGroupOptions.builder()
 * // Imported load balancers automatically calculate their Region from the ARN.
 * // If you are load balancing to other resources, you must also pass a `region`
 * // parameter here.
 * .endpoints(List.of(new NetworkLoadBalancerEndpoint(nlb2)))
 * .build());
 * ```
 */
public open class Accelerator internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.globalaccelerator.Accelerator,
) : Resource(cdkObject), IAccelerator {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.globalaccelerator.Accelerator(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AcceleratorProps,
  ) :
      this(software.amazon.awscdk.services.globalaccelerator.Accelerator(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(AcceleratorProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AcceleratorProps.Builder.() -> Unit,
  ) : this(scope, id, AcceleratorProps(props)
  )

  /**
   * The ARN of the accelerator.
   */
  public override fun acceleratorArn(): String = unwrap(this).getAcceleratorArn()

  /**
   * Add a listener to the accelerator.
   *
   * @param id 
   * @param options 
   */
  public open fun addListener(id: String, options: ListenerOptions): Listener =
      unwrap(this).addListener(id, options.let(ListenerOptions::unwrap)).let(Listener::wrap)

  /**
   * Add a listener to the accelerator.
   *
   * @param id 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3a537d56cd609f4e030fbd8e6b8a3bdde515eef17250a02dd94781d6a97f6c33")
  public open fun addListener(id: String, options: ListenerOptions.Builder.() -> Unit): Listener =
      addListener(id, ListenerOptions(options))

  /**
   * The Domain Name System (DNS) name that Global Accelerator creates that points to your
   * accelerator's static IP addresses.
   */
  public override fun dnsName(): String = unwrap(this).getDnsName()

  /**
   * The DNS name that points to the dual-stack accelerator's four static IP addresses: two IPv4
   * addresses and two IPv6 addresses.
   */
  public override fun dualStackDnsName(): String? = unwrap(this).getDualStackDnsName()

  /**
   * The array of IPv4 addresses in the IP address set.
   */
  public override fun ipv4Addresses(): List<String> = unwrap(this).getIpv4Addresses() ?: emptyList()

  /**
   * The array of IPv6 addresses in the IP address set.
   */
  public override fun ipv6Addresses(): List<String> = unwrap(this).getIpv6Addresses() ?: emptyList()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.globalaccelerator.Accelerator].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the accelerator.
     *
     * Default: - resource ID
     *
     * @param acceleratorName The name of the accelerator. 
     */
    public fun acceleratorName(acceleratorName: String)

    /**
     * Indicates whether the accelerator is enabled.
     *
     * Default: true
     *
     * @param enabled Indicates whether the accelerator is enabled. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * The IP address type that an accelerator supports.
     *
     * For a standard accelerator, the value can be IPV4 or DUAL_STACK.
     *
     * Default: - "IPV4"
     *
     * @param ipAddressType The IP address type that an accelerator supports. 
     */
    public fun ipAddressType(ipAddressType: IpAddressType)

    /**
     * IP addresses associated with the accelerator.
     *
     * Optionally, if you've added your own IP address pool to Global Accelerator (BYOIP), you can
     * choose IP
     * addresses from your own pool to use for the accelerator's static IP addresses when you create
     * an accelerator.
     * You can specify one or two addresses, separated by a comma. Do not include the /32 suffix.
     *
     * Only one IP address from each of your IP address ranges can be used for each accelerator. If
     * you specify
     * only one IP address from your IP address range, Global Accelerator assigns a second static IP
     * address for
     * the accelerator from the AWS IP address pool.
     *
     * Note that you can't update IP addresses for an existing accelerator. To change them, you must
     * create a
     * new accelerator with the new addresses.
     *
     * Default: - undefined. IP addresses will be from Amazon's pool of IP addresses.
     *
     * @param ipAddresses IP addresses associated with the accelerator. 
     */
    public fun ipAddresses(ipAddresses: List<String>)

    /**
     * IP addresses associated with the accelerator.
     *
     * Optionally, if you've added your own IP address pool to Global Accelerator (BYOIP), you can
     * choose IP
     * addresses from your own pool to use for the accelerator's static IP addresses when you create
     * an accelerator.
     * You can specify one or two addresses, separated by a comma. Do not include the /32 suffix.
     *
     * Only one IP address from each of your IP address ranges can be used for each accelerator. If
     * you specify
     * only one IP address from your IP address range, Global Accelerator assigns a second static IP
     * address for
     * the accelerator from the AWS IP address pool.
     *
     * Note that you can't update IP addresses for an existing accelerator. To change them, you must
     * create a
     * new accelerator with the new addresses.
     *
     * Default: - undefined. IP addresses will be from Amazon's pool of IP addresses.
     *
     * @param ipAddresses IP addresses associated with the accelerator. 
     */
    public fun ipAddresses(vararg ipAddresses: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.globalaccelerator.Accelerator.Builder =
        software.amazon.awscdk.services.globalaccelerator.Accelerator.Builder.create(scope, id)

    /**
     * The name of the accelerator.
     *
     * Default: - resource ID
     *
     * @param acceleratorName The name of the accelerator. 
     */
    override fun acceleratorName(acceleratorName: String) {
      cdkBuilder.acceleratorName(acceleratorName)
    }

    /**
     * Indicates whether the accelerator is enabled.
     *
     * Default: true
     *
     * @param enabled Indicates whether the accelerator is enabled. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * The IP address type that an accelerator supports.
     *
     * For a standard accelerator, the value can be IPV4 or DUAL_STACK.
     *
     * Default: - "IPV4"
     *
     * @param ipAddressType The IP address type that an accelerator supports. 
     */
    override fun ipAddressType(ipAddressType: IpAddressType) {
      cdkBuilder.ipAddressType(ipAddressType.let(IpAddressType::unwrap))
    }

    /**
     * IP addresses associated with the accelerator.
     *
     * Optionally, if you've added your own IP address pool to Global Accelerator (BYOIP), you can
     * choose IP
     * addresses from your own pool to use for the accelerator's static IP addresses when you create
     * an accelerator.
     * You can specify one or two addresses, separated by a comma. Do not include the /32 suffix.
     *
     * Only one IP address from each of your IP address ranges can be used for each accelerator. If
     * you specify
     * only one IP address from your IP address range, Global Accelerator assigns a second static IP
     * address for
     * the accelerator from the AWS IP address pool.
     *
     * Note that you can't update IP addresses for an existing accelerator. To change them, you must
     * create a
     * new accelerator with the new addresses.
     *
     * Default: - undefined. IP addresses will be from Amazon's pool of IP addresses.
     *
     * @param ipAddresses IP addresses associated with the accelerator. 
     */
    override fun ipAddresses(ipAddresses: List<String>) {
      cdkBuilder.ipAddresses(ipAddresses)
    }

    /**
     * IP addresses associated with the accelerator.
     *
     * Optionally, if you've added your own IP address pool to Global Accelerator (BYOIP), you can
     * choose IP
     * addresses from your own pool to use for the accelerator's static IP addresses when you create
     * an accelerator.
     * You can specify one or two addresses, separated by a comma. Do not include the /32 suffix.
     *
     * Only one IP address from each of your IP address ranges can be used for each accelerator. If
     * you specify
     * only one IP address from your IP address range, Global Accelerator assigns a second static IP
     * address for
     * the accelerator from the AWS IP address pool.
     *
     * Note that you can't update IP addresses for an existing accelerator. To change them, you must
     * create a
     * new accelerator with the new addresses.
     *
     * Default: - undefined. IP addresses will be from Amazon's pool of IP addresses.
     *
     * @param ipAddresses IP addresses associated with the accelerator. 
     */
    override fun ipAddresses(vararg ipAddresses: String): Unit = ipAddresses(ipAddresses.toList())

    public fun build(): software.amazon.awscdk.services.globalaccelerator.Accelerator =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromAcceleratorAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: AcceleratorAttributes,
    ): IAccelerator =
        software.amazon.awscdk.services.globalaccelerator.Accelerator.fromAcceleratorAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(AcceleratorAttributes::unwrap)).let(IAccelerator::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8baed08c541ab0b2afcc742de4fe7296b53dea3fc9b6ce5fdfb9dc99c2a62385")
    public fun fromAcceleratorAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: AcceleratorAttributes.Builder.() -> Unit,
    ): IAccelerator = fromAcceleratorAttributes(scope, id, AcceleratorAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Accelerator {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Accelerator(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.Accelerator):
        Accelerator = Accelerator(cdkObject)

    internal fun unwrap(wrapped: Accelerator):
        software.amazon.awscdk.services.globalaccelerator.Accelerator = wrapped.cdkObject
  }
}
