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
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroupProps

/**
 * Properties for defining a `CfnEndpointGroup`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.globalaccelerator.*;
 * CfnEndpointGroupProps cfnEndpointGroupProps = CfnEndpointGroupProps.builder()
 * .endpointGroupRegion("endpointGroupRegion")
 * .listenerArn("listenerArn")
 * // the properties below are optional
 * .endpointConfigurations(List.of(EndpointConfigurationProperty.builder()
 * .endpointId("endpointId")
 * // the properties below are optional
 * .attachmentArn("attachmentArn")
 * .clientIpPreservationEnabled(false)
 * .weight(123)
 * .build()))
 * .healthCheckIntervalSeconds(123)
 * .healthCheckPath("healthCheckPath")
 * .healthCheckPort(123)
 * .healthCheckProtocol("healthCheckProtocol")
 * .portOverrides(List.of(PortOverrideProperty.builder()
 * .endpointPort(123)
 * .listenerPort(123)
 * .build()))
 * .thresholdCount(123)
 * .trafficDialPercentage(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html)
 */
@CdkDslMarker
public class CfnEndpointGroupPropsDsl {
    private val cdkBuilder: CfnEndpointGroupProps.Builder = CfnEndpointGroupProps.builder()

    private val _endpointConfigurations: MutableList<Any> = mutableListOf()

    private val _portOverrides: MutableList<Any> = mutableListOf()

    /** @param endpointConfigurations The list of endpoint objects. */
    public fun endpointConfigurations(vararg endpointConfigurations: Any) {
        _endpointConfigurations.addAll(listOf(*endpointConfigurations))
    }

    /** @param endpointConfigurations The list of endpoint objects. */
    public fun endpointConfigurations(endpointConfigurations: Collection<Any>) {
        _endpointConfigurations.addAll(endpointConfigurations)
    }

    /** @param endpointConfigurations The list of endpoint objects. */
    public fun endpointConfigurations(endpointConfigurations: IResolvable) {
        cdkBuilder.endpointConfigurations(endpointConfigurations)
    }

    /** @param endpointGroupRegion The AWS Regions where the endpoint group is located. */
    public fun endpointGroupRegion(endpointGroupRegion: String) {
        cdkBuilder.endpointGroupRegion(endpointGroupRegion)
    }

    /**
     * @param healthCheckIntervalSeconds The time—10 seconds or 30 seconds—between health checks for
     *   each endpoint. The default value is 30.
     */
    public fun healthCheckIntervalSeconds(healthCheckIntervalSeconds: Number) {
        cdkBuilder.healthCheckIntervalSeconds(healthCheckIntervalSeconds)
    }

    /**
     * @param healthCheckPath If the protocol is HTTP/S, then this value provides the ping path that
     *   Global Accelerator uses for the destination on the endpoints for health checks. The default
     *   is slash (/).
     */
    public fun healthCheckPath(healthCheckPath: String) {
        cdkBuilder.healthCheckPath(healthCheckPath)
    }

    /**
     * @param healthCheckPort The port that Global Accelerator uses to perform health checks on
     *   endpoints that are part of this endpoint group. The default port is the port for the
     *   listener that this endpoint group is associated with. If the listener port is a list,
     *   Global Accelerator uses the first specified port in the list of ports.
     */
    public fun healthCheckPort(healthCheckPort: Number) {
        cdkBuilder.healthCheckPort(healthCheckPort)
    }

    /**
     * @param healthCheckProtocol The protocol that Global Accelerator uses to perform health checks
     *   on endpoints that are part of this endpoint group. The default value is TCP.
     */
    public fun healthCheckProtocol(healthCheckProtocol: String) {
        cdkBuilder.healthCheckProtocol(healthCheckProtocol)
    }

    /** @param listenerArn The Amazon Resource Name (ARN) of the listener. */
    public fun listenerArn(listenerArn: String) {
        cdkBuilder.listenerArn(listenerArn)
    }

    /**
     * @param portOverrides Allows you to override the destination ports used to route traffic to an
     *   endpoint. Using a port override lets you map a list of external destination ports (that
     *   your users send traffic to) to a list of internal destination ports that you want an
     *   application endpoint to receive traffic on.
     */
    public fun portOverrides(vararg portOverrides: Any) {
        _portOverrides.addAll(listOf(*portOverrides))
    }

    /**
     * @param portOverrides Allows you to override the destination ports used to route traffic to an
     *   endpoint. Using a port override lets you map a list of external destination ports (that
     *   your users send traffic to) to a list of internal destination ports that you want an
     *   application endpoint to receive traffic on.
     */
    public fun portOverrides(portOverrides: Collection<Any>) {
        _portOverrides.addAll(portOverrides)
    }

    /**
     * @param portOverrides Allows you to override the destination ports used to route traffic to an
     *   endpoint. Using a port override lets you map a list of external destination ports (that
     *   your users send traffic to) to a list of internal destination ports that you want an
     *   application endpoint to receive traffic on.
     */
    public fun portOverrides(portOverrides: IResolvable) {
        cdkBuilder.portOverrides(portOverrides)
    }

    /**
     * @param thresholdCount The number of consecutive health checks required to set the state of a
     *   healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. The default
     *   value is 3.
     */
    public fun thresholdCount(thresholdCount: Number) {
        cdkBuilder.thresholdCount(thresholdCount)
    }

    /**
     * @param trafficDialPercentage The percentage of traffic to send to an AWS Regions . Additional
     *   traffic is distributed to other endpoint groups for this listener.
     *
     * Use this action to increase (dial up) or decrease (dial down) traffic to a specific Region.
     * The percentage is applied to the traffic that would otherwise have been routed to the Region
     * based on optimal routing.
     *
     * The default value is 100.
     */
    public fun trafficDialPercentage(trafficDialPercentage: Number) {
        cdkBuilder.trafficDialPercentage(trafficDialPercentage)
    }

    public fun build(): CfnEndpointGroupProps {
        if (_endpointConfigurations.isNotEmpty())
            cdkBuilder.endpointConfigurations(_endpointConfigurations)
        if (_portOverrides.isNotEmpty()) cdkBuilder.portOverrides(_portOverrides)
        return cdkBuilder.build()
    }
}
