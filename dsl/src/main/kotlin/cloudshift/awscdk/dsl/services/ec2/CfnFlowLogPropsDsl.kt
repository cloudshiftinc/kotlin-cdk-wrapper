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
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnFlowLogProps

/**
 * Properties for defining a `CfnFlowLog`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * Object destinationOptions;
 * CfnFlowLogProps cfnFlowLogProps = CfnFlowLogProps.builder()
 * .resourceId("resourceId")
 * .resourceType("resourceType")
 * // the properties below are optional
 * .deliverLogsPermissionArn("deliverLogsPermissionArn")
 * .destinationOptions(destinationOptions)
 * .logDestination("logDestination")
 * .logDestinationType("logDestinationType")
 * .logFormat("logFormat")
 * .logGroupName("logGroupName")
 * .maxAggregationInterval(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .trafficType("trafficType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html)
 */
@CdkDslMarker
public class CfnFlowLogPropsDsl {
    private val cdkBuilder: CfnFlowLogProps.Builder = CfnFlowLogProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param deliverLogsPermissionArn The ARN of the IAM role that allows Amazon EC2 to publish
     *   flow logs to a CloudWatch Logs log group in your account. This parameter is required if the
     *   destination type is `cloud-watch-logs` and unsupported otherwise.
     */
    public fun deliverLogsPermissionArn(deliverLogsPermissionArn: String) {
        cdkBuilder.deliverLogsPermissionArn(deliverLogsPermissionArn)
    }

    /**
     * @param destinationOptions The destination options. The following options are supported:.
     * * `FileFormat` - The format for the flow log ( `plain-text` | `parquet` ). The default is
     *   `plain-text` .
     * * `HiveCompatiblePartitions` - Indicates whether to use Hive-compatible prefixes for flow
     *   logs stored in Amazon S3 ( `true` | `false` ). The default is `false` .
     * * `PerHourPartition` - Indicates whether to partition the flow log per hour ( `true` |
     *   `false` ). The default is `false` .
     */
    public fun destinationOptions(destinationOptions: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(destinationOptions)
        cdkBuilder.destinationOptions(builder.map)
    }

    /**
     * @param destinationOptions The destination options. The following options are supported:.
     * * `FileFormat` - The format for the flow log ( `plain-text` | `parquet` ). The default is
     *   `plain-text` .
     * * `HiveCompatiblePartitions` - Indicates whether to use Hive-compatible prefixes for flow
     *   logs stored in Amazon S3 ( `true` | `false` ). The default is `false` .
     * * `PerHourPartition` - Indicates whether to partition the flow log per hour ( `true` |
     *   `false` ). The default is `false` .
     */
    public fun destinationOptions(destinationOptions: Any) {
        cdkBuilder.destinationOptions(destinationOptions)
    }

    /**
     * @param logDestination The destination for the flow log data. The meaning of this parameter
     *   depends on the destination type.
     * * If the destination type is `cloud-watch-logs` , specify the ARN of a CloudWatch Logs log
     *   group. For example:
     *
     * arn:aws:logs: *region* : *account_id* :log-group: *my_group*
     *
     * Alternatively, use the `LogGroupName` parameter.
     * * If the destination type is `s3` , specify the ARN of an S3 bucket. For example:
     *
     * arn:aws:s3::: *my_bucket* / *my_subfolder* /
     *
     * The subfolder is optional. Note that you can't use `AWSLogs` as a subfolder name.
     * * If the destination type is `kinesis-data-firehose` , specify the ARN of a Kinesis Data
     *   Firehose delivery stream. For example:
     *
     * arn:aws:firehose: *region* : *account_id* :deliverystream: *my_stream*
     */
    public fun logDestination(logDestination: String) {
        cdkBuilder.logDestination(logDestination)
    }

    /**
     * @param logDestinationType The type of destination for the flow log data. Default:
     *   `cloud-watch-logs`
     */
    public fun logDestinationType(logDestinationType: String) {
        cdkBuilder.logDestinationType(logDestinationType)
    }

    /**
     * @param logFormat The fields to include in the flow log record, in the order in which they
     *   should appear. If you omit this parameter, the flow log is created using the default
     *   format. If you specify this parameter, you must include at least one field. For more
     *   information about the available fields, see
     *   [Flow log records](https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records)
     *   in the *Amazon VPC User Guide* or
     *   [Transit Gateway Flow Log records](https://docs.aws.amazon.com/vpc/latest/tgw/tgw-flow-logs.html#flow-log-records)
     *   in the *AWS Transit Gateway Guide* .
     *
     * Specify the fields using the `${field-id}` format, separated by spaces.
     */
    public fun logFormat(logFormat: String) {
        cdkBuilder.logFormat(logFormat)
    }

    /**
     * @param logGroupName The name of a new or existing CloudWatch Logs log group where Amazon EC2
     *   publishes your flow logs. This parameter is valid only if the destination type is
     *   `cloud-watch-logs` .
     */
    public fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
    }

    /**
     * @param maxAggregationInterval The maximum interval of time during which a flow of packets is
     *   captured and aggregated into a flow log record. The possible values are 60 seconds (1
     *   minute) or 600 seconds (10 minutes). This parameter must be 60 seconds for transit gateway
     *   resource types.
     *
     * When a network interface is attached to a
     * [Nitro-based instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances)
     * , the aggregation interval is always 60 seconds or less, regardless of the value that you
     * specify.
     *
     * Default: 600
     */
    public fun maxAggregationInterval(maxAggregationInterval: Number) {
        cdkBuilder.maxAggregationInterval(maxAggregationInterval)
    }

    /**
     * @param resourceId The ID of the resource to monitor. For example, if the resource type is
     *   `VPC` , specify the ID of the VPC.
     */
    public fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
    }

    /** @param resourceType The type of resource to monitor. */
    public fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
    }

    /** @param tags The tags to apply to the flow logs. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags to apply to the flow logs. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param trafficType The type of traffic to monitor (accepted traffic, rejected traffic, or all
     *   traffic). This parameter is not supported for transit gateway resource types. It is
     *   required for the other resource types.
     */
    public fun trafficType(trafficType: String) {
        cdkBuilder.trafficType(trafficType)
    }

    public fun build(): CfnFlowLogProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
