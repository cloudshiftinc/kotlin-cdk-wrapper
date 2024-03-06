@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.globalaccelerator

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.globalaccelerator.Accelerator
import software.amazon.awscdk.services.globalaccelerator.IpAddressType
import software.constructs.Construct

/**
 * The Accelerator construct.
 *
 * Example:
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
@CdkDslMarker
public class AcceleratorDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Accelerator.Builder = Accelerator.Builder.create(scope, id)

    private val _ipAddresses: MutableList<String> = mutableListOf()

    /**
     * The name of the accelerator.
     *
     * Default: - resource ID
     *
     * @param acceleratorName The name of the accelerator.
     */
    public fun acceleratorName(acceleratorName: String) {
        cdkBuilder.acceleratorName(acceleratorName)
    }

    /**
     * Indicates whether the accelerator is enabled.
     *
     * Default: true
     *
     * @param enabled Indicates whether the accelerator is enabled.
     */
    public fun enabled(enabled: Boolean) {
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
    public fun ipAddressType(ipAddressType: IpAddressType) {
        cdkBuilder.ipAddressType(ipAddressType)
    }

    /**
     * IP addresses associated with the accelerator.
     *
     * Optionally, if you've added your own IP address pool to Global Accelerator (BYOIP), you can
     * choose IP addresses from your own pool to use for the accelerator's static IP addresses when
     * you create an accelerator. You can specify one or two addresses, separated by a comma. Do not
     * include the /32 suffix.
     *
     * Only one IP address from each of your IP address ranges can be used for each accelerator. If
     * you specify only one IP address from your IP address range, Global Accelerator assigns a
     * second static IP address for the accelerator from the AWS IP address pool.
     *
     * Note that you can't update IP addresses for an existing accelerator. To change them, you must
     * create a new accelerator with the new addresses.
     *
     * Default: - undefined. IP addresses will be from Amazon's pool of IP addresses.
     *
     * @param ipAddresses IP addresses associated with the accelerator.
     */
    public fun ipAddresses(vararg ipAddresses: String) {
        _ipAddresses.addAll(listOf(*ipAddresses))
    }

    /**
     * IP addresses associated with the accelerator.
     *
     * Optionally, if you've added your own IP address pool to Global Accelerator (BYOIP), you can
     * choose IP addresses from your own pool to use for the accelerator's static IP addresses when
     * you create an accelerator. You can specify one or two addresses, separated by a comma. Do not
     * include the /32 suffix.
     *
     * Only one IP address from each of your IP address ranges can be used for each accelerator. If
     * you specify only one IP address from your IP address range, Global Accelerator assigns a
     * second static IP address for the accelerator from the AWS IP address pool.
     *
     * Note that you can't update IP addresses for an existing accelerator. To change them, you must
     * create a new accelerator with the new addresses.
     *
     * Default: - undefined. IP addresses will be from Amazon's pool of IP addresses.
     *
     * @param ipAddresses IP addresses associated with the accelerator.
     */
    public fun ipAddresses(ipAddresses: Collection<String>) {
        _ipAddresses.addAll(ipAddresses)
    }

    public fun build(): Accelerator {
        if (_ipAddresses.isNotEmpty()) cdkBuilder.ipAddresses(_ipAddresses)
        return cdkBuilder.build()
    }
}
