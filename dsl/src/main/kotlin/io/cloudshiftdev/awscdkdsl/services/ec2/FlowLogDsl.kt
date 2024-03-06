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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.FlowLog
import software.amazon.awscdk.services.ec2.FlowLogDestination
import software.amazon.awscdk.services.ec2.FlowLogMaxAggregationInterval
import software.amazon.awscdk.services.ec2.FlowLogResourceType
import software.amazon.awscdk.services.ec2.FlowLogTrafficType
import software.amazon.awscdk.services.ec2.LogFormat
import software.constructs.Construct

/**
 * A VPC flow log.
 *
 * Example:
 * ```
 * CfnTransitGateway tgw;
 * FlowLog.Builder.create(this, "TransitGatewayFlowLog")
 * .resourceType(FlowLogResourceType.fromTransitGatewayId(tgw.getRef()))
 * .build();
 * ```
 */
@CdkDslMarker
public class FlowLogDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: FlowLog.Builder = FlowLog.Builder.create(scope, id)

    private val _logFormat: MutableList<LogFormat> = mutableListOf()

    /**
     * Specifies the type of destination to which the flow log data is to be published.
     *
     * Flow log data can be published to CloudWatch Logs or Amazon S3
     *
     * Default: FlowLogDestinationType.toCloudWatchLogs()
     *
     * @param destination Specifies the type of destination to which the flow log data is to be
     *   published.
     */
    public fun destination(destination: FlowLogDestination) {
        cdkBuilder.destination(destination)
    }

    /**
     * The name of the FlowLog.
     *
     * Since the FlowLog resource doesn't support providing a physical name, the value provided here
     * will be recorded in the `Name` tag.
     *
     * Default: CDK generated name
     *
     * @param flowLogName The name of the FlowLog.
     */
    public fun flowLogName(flowLogName: String) {
        cdkBuilder.flowLogName(flowLogName)
    }

    /**
     * The fields to include in the flow log record, in the order in which they should appear.
     *
     * If multiple fields are specified, they will be separated by spaces. For full control over the
     * literal log format string, pass a single field constructed with `LogFormat.custom()`.
     *
     * See https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records
     *
     * Default: - default log format is used.
     *
     * @param logFormat The fields to include in the flow log record, in the order in which they
     *   should appear.
     */
    public fun logFormat(vararg logFormat: LogFormat) {
        _logFormat.addAll(listOf(*logFormat))
    }

    /**
     * The fields to include in the flow log record, in the order in which they should appear.
     *
     * If multiple fields are specified, they will be separated by spaces. For full control over the
     * literal log format string, pass a single field constructed with `LogFormat.custom()`.
     *
     * See https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records
     *
     * Default: - default log format is used.
     *
     * @param logFormat The fields to include in the flow log record, in the order in which they
     *   should appear.
     */
    public fun logFormat(logFormat: Collection<LogFormat>) {
        _logFormat.addAll(logFormat)
    }

    /**
     * The maximum interval of time during which a flow of packets is captured and aggregated into a
     * flow log record.
     *
     * When creating flow logs for a Transit Gateway or Transit Gateway Attachment, this property
     * must be ONE_MINUTES.
     *
     * Default: - FlowLogMaxAggregationInterval.ONE_MINUTES if creating flow logs for Transit
     * Gateway, otherwise FlowLogMaxAggregationInterval.TEN_MINUTES.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-maxaggregationinterval)
     *
     * @param maxAggregationInterval The maximum interval of time during which a flow of packets is
     *   captured and aggregated into a flow log record.
     */
    public fun maxAggregationInterval(maxAggregationInterval: FlowLogMaxAggregationInterval) {
        cdkBuilder.maxAggregationInterval(maxAggregationInterval)
    }

    /**
     * The type of resource for which to create the flow log.
     *
     * @param resourceType The type of resource for which to create the flow log.
     */
    public fun resourceType(resourceType: FlowLogResourceType) {
        cdkBuilder.resourceType(resourceType)
    }

    /**
     * The type of traffic to log.
     *
     * You can log traffic that the resource accepts or rejects, or all traffic. When the target is
     * either `TransitGateway` or `TransitGatewayAttachment`, setting the traffic type is not
     * possible.
     *
     * Default: ALL
     *
     * [Documentation](https://docs.aws.amazon.com/vpc/latest/tgw/working-with-flow-logs.html)
     *
     * @param trafficType The type of traffic to log.
     */
    public fun trafficType(trafficType: FlowLogTrafficType) {
        cdkBuilder.trafficType(trafficType)
    }

    public fun build(): FlowLog {
        if (_logFormat.isNotEmpty()) cdkBuilder.logFormat(_logFormat)
        return cdkBuilder.build()
    }
}
