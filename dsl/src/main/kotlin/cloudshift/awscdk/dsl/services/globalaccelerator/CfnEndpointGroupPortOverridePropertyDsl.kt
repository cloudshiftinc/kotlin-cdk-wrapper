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
import kotlin.Number
import software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup

/**
 * Override specific listener ports used to route traffic to endpoints that are part of an endpoint
 * group.
 *
 * For example, you can create a port override in which the listener receives user traffic on ports
 * 80 and 443, but your accelerator routes that traffic to ports 1080 and 1443, respectively, on the
 * endpoints.
 *
 * For more information, see
 * [Port overrides](https://docs.aws.amazon.com/global-accelerator/latest/dg/about-endpoint-groups-port-override.html)
 * in the *AWS Global Accelerator Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.globalaccelerator.*;
 * PortOverrideProperty portOverrideProperty = PortOverrideProperty.builder()
 * .endpointPort(123)
 * .listenerPort(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-endpointgroup-portoverride.html)
 */
@CdkDslMarker
public class CfnEndpointGroupPortOverridePropertyDsl {
    private val cdkBuilder: CfnEndpointGroup.PortOverrideProperty.Builder =
        CfnEndpointGroup.PortOverrideProperty.builder()

    /**
     * @param endpointPort The endpoint port that you want a listener port to be mapped to. This is
     *   the port on the endpoint, such as the Application Load Balancer or Amazon EC2 instance.
     */
    public fun endpointPort(endpointPort: Number) {
        cdkBuilder.endpointPort(endpointPort)
    }

    /**
     * @param listenerPort The listener port that you want to map to a specific endpoint port. This
     *   is the port that user traffic arrives to the Global Accelerator on.
     */
    public fun listenerPort(listenerPort: Number) {
        cdkBuilder.listenerPort(listenerPort)
    }

    public fun build(): CfnEndpointGroup.PortOverrideProperty = cdkBuilder.build()
}
