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

package cloudshift.awscdk.dsl.services.globalaccelerator

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.globalaccelerator.CfnListenerProps

/**
 * Properties for defining a `CfnListener`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.globalaccelerator.*;
 * CfnListenerProps cfnListenerProps = CfnListenerProps.builder()
 * .acceleratorArn("acceleratorArn")
 * .portRanges(List.of(PortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build()))
 * .protocol("protocol")
 * // the properties below are optional
 * .clientAffinity("clientAffinity")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-listener.html)
 */
@CdkDslMarker
public class CfnListenerPropsDsl {
    private val cdkBuilder: CfnListenerProps.Builder = CfnListenerProps.builder()

    private val _portRanges: MutableList<Any> = mutableListOf()

    /** @param acceleratorArn The Amazon Resource Name (ARN) of your accelerator. */
    public fun acceleratorArn(acceleratorArn: String) {
        cdkBuilder.acceleratorArn(acceleratorArn)
    }

    /**
     * @param clientAffinity Client affinity lets you direct all requests from a user to the same
     *   endpoint, if you have stateful applications, regardless of the port and protocol of the
     *   client request. Client affinity gives you control over whether to always route each client
     *   to the same specific endpoint.
     *
     * AWS Global Accelerator uses a consistent-flow hashing algorithm to choose the optimal
     * endpoint for a connection. If client affinity is `NONE` , Global Accelerator uses the
     * "five-tuple" (5-tuple) properties—source IP address, source port, destination IP address,
     * destination port, and protocol—to select the hash value, and then chooses the best endpoint.
     * However, with this setting, if someone uses different ports to connect to Global Accelerator,
     * their connections might not be always routed to the same endpoint because the hash value
     * changes.
     *
     * If you want a given client to always be routed to the same endpoint, set client affinity to
     * `SOURCE_IP` instead. When you use the `SOURCE_IP` setting, Global Accelerator uses the
     * "two-tuple" (2-tuple) properties— source (client) IP address and destination IP address—to
     * select the hash value.
     *
     * The default value is `NONE` .
     */
    public fun clientAffinity(clientAffinity: String) {
        cdkBuilder.clientAffinity(clientAffinity)
    }

    /**
     * @param portRanges The list of port ranges for the connections from clients to the
     *   accelerator.
     */
    public fun portRanges(vararg portRanges: Any) {
        _portRanges.addAll(listOf(*portRanges))
    }

    /**
     * @param portRanges The list of port ranges for the connections from clients to the
     *   accelerator.
     */
    public fun portRanges(portRanges: Collection<Any>) {
        _portRanges.addAll(portRanges)
    }

    /**
     * @param portRanges The list of port ranges for the connections from clients to the
     *   accelerator.
     */
    public fun portRanges(portRanges: IResolvable) {
        cdkBuilder.portRanges(portRanges)
    }

    /** @param protocol The protocol for the connections from clients to the accelerator. */
    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    public fun build(): CfnListenerProps {
        if (_portRanges.isNotEmpty()) cdkBuilder.portRanges(_portRanges)
        return cdkBuilder.build()
    }
}
