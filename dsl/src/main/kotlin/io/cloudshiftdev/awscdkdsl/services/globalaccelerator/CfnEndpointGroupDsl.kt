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
import software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup
import software.constructs.Construct

/**
 * The `AWS::GlobalAccelerator::EndpointGroup` resource is a Global Accelerator resource type that
 * contains information about how you create an endpoint group for the specified listener.
 *
 * An endpoint group is a collection of endpoints in one AWS Region .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.globalaccelerator.*;
 * CfnEndpointGroup cfnEndpointGroup = CfnEndpointGroup.Builder.create(this, "MyCfnEndpointGroup")
 * .endpointGroupRegion("endpointGroupRegion")
 * .listenerArn("listenerArn")
 * // the properties below are optional
 * .endpointConfigurations(List.of(EndpointConfigurationProperty.builder()
 * .endpointId("endpointId")
 * // the properties below are optional
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
public class CfnEndpointGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEndpointGroup.Builder = CfnEndpointGroup.Builder.create(scope, id)

    private val _endpointConfigurations: MutableList<Any> = mutableListOf()

    private val _portOverrides: MutableList<Any> = mutableListOf()

    /**
     * The list of endpoint objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-endpointconfigurations)
     *
     * @param endpointConfigurations The list of endpoint objects.
     */
    public fun endpointConfigurations(vararg endpointConfigurations: Any) {
        _endpointConfigurations.addAll(listOf(*endpointConfigurations))
    }

    /**
     * The list of endpoint objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-endpointconfigurations)
     *
     * @param endpointConfigurations The list of endpoint objects.
     */
    public fun endpointConfigurations(endpointConfigurations: Collection<Any>) {
        _endpointConfigurations.addAll(endpointConfigurations)
    }

    /**
     * The list of endpoint objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-endpointconfigurations)
     *
     * @param endpointConfigurations The list of endpoint objects.
     */
    public fun endpointConfigurations(endpointConfigurations: IResolvable) {
        cdkBuilder.endpointConfigurations(endpointConfigurations)
    }

    /**
     * The AWS Regions where the endpoint group is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-endpointgroupregion)
     *
     * @param endpointGroupRegion The AWS Regions where the endpoint group is located.
     */
    public fun endpointGroupRegion(endpointGroupRegion: String) {
        cdkBuilder.endpointGroupRegion(endpointGroupRegion)
    }

    /**
     * The time—10 seconds or 30 seconds—between health checks for each endpoint.
     *
     * The default value is 30.
     *
     * Default: - 30
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckintervalseconds)
     *
     * @param healthCheckIntervalSeconds The time—10 seconds or 30 seconds—between health checks for
     *   each endpoint.
     */
    public fun healthCheckIntervalSeconds(healthCheckIntervalSeconds: Number) {
        cdkBuilder.healthCheckIntervalSeconds(healthCheckIntervalSeconds)
    }

    /**
     * If the protocol is HTTP/S, then this value provides the ping path that Global Accelerator
     * uses for the destination on the endpoints for health checks.
     *
     * The default is slash (/).
     *
     * Default: - "/"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckpath)
     *
     * @param healthCheckPath If the protocol is HTTP/S, then this value provides the ping path that
     *   Global Accelerator uses for the destination on the endpoints for health checks.
     */
    public fun healthCheckPath(healthCheckPath: String) {
        cdkBuilder.healthCheckPath(healthCheckPath)
    }

    /**
     * The port that Global Accelerator uses to perform health checks on endpoints that are part of
     * this endpoint group.
     *
     * The default port is the port for the listener that this endpoint group is associated with. If
     * the listener port is a list, Global Accelerator uses the first specified port in the list of
     * ports.
     *
     * Default: - -1
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckport)
     *
     * @param healthCheckPort The port that Global Accelerator uses to perform health checks on
     *   endpoints that are part of this endpoint group.
     */
    public fun healthCheckPort(healthCheckPort: Number) {
        cdkBuilder.healthCheckPort(healthCheckPort)
    }

    /**
     * The protocol that Global Accelerator uses to perform health checks on endpoints that are part
     * of this endpoint group.
     *
     * The default value is TCP.
     *
     * Default: - "TCP"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-healthcheckprotocol)
     *
     * @param healthCheckProtocol The protocol that Global Accelerator uses to perform health checks
     *   on endpoints that are part of this endpoint group.
     */
    public fun healthCheckProtocol(healthCheckProtocol: String) {
        cdkBuilder.healthCheckProtocol(healthCheckProtocol)
    }

    /**
     * The Amazon Resource Name (ARN) of the listener.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-listenerarn)
     *
     * @param listenerArn The Amazon Resource Name (ARN) of the listener.
     */
    public fun listenerArn(listenerArn: String) {
        cdkBuilder.listenerArn(listenerArn)
    }

    /**
     * Allows you to override the destination ports used to route traffic to an endpoint.
     *
     * Using a port override lets you map a list of external destination ports (that your users send
     * traffic to) to a list of internal destination ports that you want an application endpoint to
     * receive traffic on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-portoverrides)
     *
     * @param portOverrides Allows you to override the destination ports used to route traffic to an
     *   endpoint.
     */
    public fun portOverrides(vararg portOverrides: Any) {
        _portOverrides.addAll(listOf(*portOverrides))
    }

    /**
     * Allows you to override the destination ports used to route traffic to an endpoint.
     *
     * Using a port override lets you map a list of external destination ports (that your users send
     * traffic to) to a list of internal destination ports that you want an application endpoint to
     * receive traffic on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-portoverrides)
     *
     * @param portOverrides Allows you to override the destination ports used to route traffic to an
     *   endpoint.
     */
    public fun portOverrides(portOverrides: Collection<Any>) {
        _portOverrides.addAll(portOverrides)
    }

    /**
     * Allows you to override the destination ports used to route traffic to an endpoint.
     *
     * Using a port override lets you map a list of external destination ports (that your users send
     * traffic to) to a list of internal destination ports that you want an application endpoint to
     * receive traffic on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-portoverrides)
     *
     * @param portOverrides Allows you to override the destination ports used to route traffic to an
     *   endpoint.
     */
    public fun portOverrides(portOverrides: IResolvable) {
        cdkBuilder.portOverrides(portOverrides)
    }

    /**
     * The number of consecutive health checks required to set the state of a healthy endpoint to
     * unhealthy, or to set an unhealthy endpoint to healthy.
     *
     * The default value is 3.
     *
     * Default: - 3
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-thresholdcount)
     *
     * @param thresholdCount The number of consecutive health checks required to set the state of a
     *   healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy.
     */
    public fun thresholdCount(thresholdCount: Number) {
        cdkBuilder.thresholdCount(thresholdCount)
    }

    /**
     * The percentage of traffic to send to an AWS Regions .
     *
     * Additional traffic is distributed to other endpoint groups for this listener.
     *
     * Use this action to increase (dial up) or decrease (dial down) traffic to a specific Region.
     * The percentage is applied to the traffic that would otherwise have been routed to the Region
     * based on optimal routing.
     *
     * The default value is 100.
     *
     * Default: - 100
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-endpointgroup.html#cfn-globalaccelerator-endpointgroup-trafficdialpercentage)
     *
     * @param trafficDialPercentage The percentage of traffic to send to an AWS Regions .
     */
    public fun trafficDialPercentage(trafficDialPercentage: Number) {
        cdkBuilder.trafficDialPercentage(trafficDialPercentage)
    }

    public fun build(): CfnEndpointGroup {
        if (_endpointConfigurations.isNotEmpty())
            cdkBuilder.endpointConfigurations(_endpointConfigurations)
        if (_portOverrides.isNotEmpty()) cdkBuilder.portOverrides(_portOverrides)
        return cdkBuilder.build()
    }
}
