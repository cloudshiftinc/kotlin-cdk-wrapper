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
import software.amazon.awscdk.services.ec2.FlowLogDestination
import software.amazon.awscdk.services.ec2.FlowLogMaxAggregationInterval
import software.amazon.awscdk.services.ec2.FlowLogProps
import software.amazon.awscdk.services.ec2.FlowLogResourceType
import software.amazon.awscdk.services.ec2.FlowLogTrafficType
import software.amazon.awscdk.services.ec2.LogFormat

/**
 * Properties of a VPC Flow Log.
 *
 * Example:
 * ```
 * Vpc vpc;
 * LogGroup logGroup = new LogGroup(this, "MyCustomLogGroup");
 * Role role = Role.Builder.create(this, "MyCustomRole")
 * .assumedBy(new ServicePrincipal("vpc-flow-logs.amazonaws.com"))
 * .build();
 * FlowLog.Builder.create(this, "FlowLog")
 * .resourceType(FlowLogResourceType.fromVpc(vpc))
 * .destination(FlowLogDestination.toCloudWatchLogs(logGroup, role))
 * .build();
 * ```
 */
@CdkDslMarker
public class FlowLogPropsDsl {
    private val cdkBuilder: FlowLogProps.Builder = FlowLogProps.builder()

    private val _logFormat: MutableList<LogFormat> = mutableListOf()

    /**
     * @param destination Specifies the type of destination to which the flow log data is to be
     *   published. Flow log data can be published to CloudWatch Logs or Amazon S3
     */
    public fun destination(destination: FlowLogDestination) {
        cdkBuilder.destination(destination)
    }

    /**
     * @param flowLogName The name of the FlowLog. Since the FlowLog resource doesn't support
     *   providing a physical name, the value provided here will be recorded in the `Name` tag.
     */
    public fun flowLogName(flowLogName: String) {
        cdkBuilder.flowLogName(flowLogName)
    }

    /**
     * @param logFormat The fields to include in the flow log record, in the order in which they
     *   should appear. If multiple fields are specified, they will be separated by spaces. For full
     *   control over the literal log format string, pass a single field constructed with
     *   `LogFormat.custom()`.
     *
     * See https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records
     */
    public fun logFormat(vararg logFormat: LogFormat) {
        _logFormat.addAll(listOf(*logFormat))
    }

    /**
     * @param logFormat The fields to include in the flow log record, in the order in which they
     *   should appear. If multiple fields are specified, they will be separated by spaces. For full
     *   control over the literal log format string, pass a single field constructed with
     *   `LogFormat.custom()`.
     *
     * See https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records
     */
    public fun logFormat(logFormat: Collection<LogFormat>) {
        _logFormat.addAll(logFormat)
    }

    /**
     * @param maxAggregationInterval The maximum interval of time during which a flow of packets is
     *   captured and aggregated into a flow log record.
     */
    public fun maxAggregationInterval(maxAggregationInterval: FlowLogMaxAggregationInterval) {
        cdkBuilder.maxAggregationInterval(maxAggregationInterval)
    }

    /** @param resourceType The type of resource for which to create the flow log. */
    public fun resourceType(resourceType: FlowLogResourceType) {
        cdkBuilder.resourceType(resourceType)
    }

    /**
     * @param trafficType The type of traffic to log. You can log traffic that the resource accepts
     *   or rejects, or all traffic.
     */
    public fun trafficType(trafficType: FlowLogTrafficType) {
        cdkBuilder.trafficType(trafficType)
    }

    public fun build(): FlowLogProps {
        if (_logFormat.isNotEmpty()) cdkBuilder.logFormat(_logFormat)
        return cdkBuilder.build()
    }
}
