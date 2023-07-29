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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotification
import software.constructs.Construct

/**
 * Specifies a connection notification for a VPC endpoint or VPC endpoint service.
 *
 * A connection notification notifies you of specific endpoint events. You must create an SNS topic
 * to receive notifications. For more information, see
 * [Create a Topic](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) in the *Amazon
 * Simple Notification Service Developer Guide* .
 *
 * You can create a connection notification for interface endpoints only.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnVPCEndpointConnectionNotification cfnVPCEndpointConnectionNotification =
 * CfnVPCEndpointConnectionNotification.Builder.create(this, "MyCfnVPCEndpointConnectionNotification")
 * .connectionEvents(List.of("connectionEvents"))
 * .connectionNotificationArn("connectionNotificationArn")
 * // the properties below are optional
 * .serviceId("serviceId")
 * .vpcEndpointId("vpcEndpointId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html)
 */
@CdkDslMarker
public class CfnVPCEndpointConnectionNotificationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnVPCEndpointConnectionNotification.Builder =
        CfnVPCEndpointConnectionNotification.Builder.create(scope, id)

    private val _connectionEvents: MutableList<String> = mutableListOf()

    /**
     * The endpoint events for which to receive notifications.
     *
     * Valid values are `Accept` , `Connect` , `Delete` , and `Reject` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-connectionevents)
     *
     * @param connectionEvents The endpoint events for which to receive notifications.
     */
    public fun connectionEvents(vararg connectionEvents: String) {
        _connectionEvents.addAll(listOf(*connectionEvents))
    }

    /**
     * The endpoint events for which to receive notifications.
     *
     * Valid values are `Accept` , `Connect` , `Delete` , and `Reject` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-connectionevents)
     *
     * @param connectionEvents The endpoint events for which to receive notifications.
     */
    public fun connectionEvents(connectionEvents: Collection<String>) {
        _connectionEvents.addAll(connectionEvents)
    }

    /**
     * The ARN of the SNS topic for the notifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-connectionnotificationarn)
     *
     * @param connectionNotificationArn The ARN of the SNS topic for the notifications.
     */
    public fun connectionNotificationArn(connectionNotificationArn: String) {
        cdkBuilder.connectionNotificationArn(connectionNotificationArn)
    }

    /**
     * The ID of the endpoint service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-serviceid)
     *
     * @param serviceId The ID of the endpoint service.
     */
    public fun serviceId(serviceId: String) {
        cdkBuilder.serviceId(serviceId)
    }

    /**
     * The ID of the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointconnectionnotification.html#cfn-ec2-vpcendpointconnectionnotification-vpcendpointid)
     *
     * @param vpcEndpointId The ID of the endpoint.
     */
    public fun vpcEndpointId(vpcEndpointId: String) {
        cdkBuilder.vpcEndpointId(vpcEndpointId)
    }

    public fun build(): CfnVPCEndpointConnectionNotification {
        if (_connectionEvents.isNotEmpty()) cdkBuilder.connectionEvents(_connectionEvents)
        return cdkBuilder.build()
    }
}
