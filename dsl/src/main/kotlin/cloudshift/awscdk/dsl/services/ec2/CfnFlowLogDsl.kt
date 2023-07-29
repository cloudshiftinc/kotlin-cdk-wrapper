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
import software.amazon.awscdk.services.ec2.CfnFlowLog
import software.constructs.Construct

/**
 * Specifies a VPC flow log that captures IP traffic for a specified network interface, subnet, or
 * VPC.
 *
 * To view the log data, use Amazon CloudWatch Logs (CloudWatch Logs) to help troubleshoot
 * connection issues. For example, you can use a flow log to investigate why certain traffic isn't
 * reaching an instance, which can help you diagnose overly restrictive security group rules. For
 * more information, see
 * [VPC Flow Logs](https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html) in the *Amazon
 * VPC User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * Object destinationOptions;
 * CfnFlowLog cfnFlowLog = CfnFlowLog.Builder.create(this, "MyCfnFlowLog")
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
public class CfnFlowLogDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFlowLog.Builder = CfnFlowLog.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The ARN of the IAM role that allows Amazon EC2 to publish flow logs to a CloudWatch Logs log
     * group in your account.
     *
     * This parameter is required if the destination type is `cloud-watch-logs` and unsupported
     * otherwise.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-deliverlogspermissionarn)
     *
     * @param deliverLogsPermissionArn The ARN of the IAM role that allows Amazon EC2 to publish
     *   flow logs to a CloudWatch Logs log group in your account.
     */
    public fun deliverLogsPermissionArn(deliverLogsPermissionArn: String) {
        cdkBuilder.deliverLogsPermissionArn(deliverLogsPermissionArn)
    }

    /**
     * The destination options. The following options are supported:.
     * * `FileFormat` - The format for the flow log ( `plain-text` | `parquet` ). The default is
     *   `plain-text` .
     * * `HiveCompatiblePartitions` - Indicates whether to use Hive-compatible prefixes for flow
     *   logs stored in Amazon S3 ( `true` | `false` ). The default is `false` .
     * * `PerHourPartition` - Indicates whether to partition the flow log per hour ( `true` |
     *   `false` ). The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-destinationoptions)
     *
     * @param destinationOptions The destination options. The following options are supported:.
     */
    public fun destinationOptions(destinationOptions: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(destinationOptions)
        cdkBuilder.destinationOptions(builder.map)
    }

    /**
     * The destination options. The following options are supported:.
     * * `FileFormat` - The format for the flow log ( `plain-text` | `parquet` ). The default is
     *   `plain-text` .
     * * `HiveCompatiblePartitions` - Indicates whether to use Hive-compatible prefixes for flow
     *   logs stored in Amazon S3 ( `true` | `false` ). The default is `false` .
     * * `PerHourPartition` - Indicates whether to partition the flow log per hour ( `true` |
     *   `false` ). The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-destinationoptions)
     *
     * @param destinationOptions The destination options. The following options are supported:.
     */
    public fun destinationOptions(destinationOptions: Any) {
        cdkBuilder.destinationOptions(destinationOptions)
    }

    /**
     * The destination for the flow log data. The meaning of this parameter depends on the
     * destination type.
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
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-logdestination)
     *
     * @param logDestination The destination for the flow log data. The meaning of this parameter
     *   depends on the destination type.
     */
    public fun logDestination(logDestination: String) {
        cdkBuilder.logDestination(logDestination)
    }

    /**
     * The type of destination for the flow log data.
     *
     * Default: `cloud-watch-logs`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-logdestinationtype)
     *
     * @param logDestinationType The type of destination for the flow log data.
     */
    public fun logDestinationType(logDestinationType: String) {
        cdkBuilder.logDestinationType(logDestinationType)
    }

    /**
     * The fields to include in the flow log record, in the order in which they should appear.
     *
     * If you omit this parameter, the flow log is created using the default format. If you specify
     * this parameter, you must include at least one field. For more information about the available
     * fields, see
     * [Flow log records](https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records)
     * in the *Amazon VPC User Guide* or
     * [Transit Gateway Flow Log records](https://docs.aws.amazon.com/vpc/latest/tgw/tgw-flow-logs.html#flow-log-records)
     * in the *AWS Transit Gateway Guide* .
     *
     * Specify the fields using the `${field-id}` format, separated by spaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-logformat)
     *
     * @param logFormat The fields to include in the flow log record, in the order in which they
     *   should appear.
     */
    public fun logFormat(logFormat: String) {
        cdkBuilder.logFormat(logFormat)
    }

    /**
     * The name of a new or existing CloudWatch Logs log group where Amazon EC2 publishes your flow
     * logs.
     *
     * This parameter is valid only if the destination type is `cloud-watch-logs` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-loggroupname)
     *
     * @param logGroupName The name of a new or existing CloudWatch Logs log group where Amazon EC2
     *   publishes your flow logs.
     */
    public fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
    }

    /**
     * The maximum interval of time during which a flow of packets is captured and aggregated into a
     * flow log record.
     *
     * The possible values are 60 seconds (1 minute) or 600 seconds (10 minutes). This parameter
     * must be 60 seconds for transit gateway resource types.
     *
     * When a network interface is attached to a
     * [Nitro-based instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances)
     * , the aggregation interval is always 60 seconds or less, regardless of the value that you
     * specify.
     *
     * Default: 600
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-maxaggregationinterval)
     *
     * @param maxAggregationInterval The maximum interval of time during which a flow of packets is
     *   captured and aggregated into a flow log record.
     */
    public fun maxAggregationInterval(maxAggregationInterval: Number) {
        cdkBuilder.maxAggregationInterval(maxAggregationInterval)
    }

    /**
     * The ID of the resource to monitor.
     *
     * For example, if the resource type is `VPC` , specify the ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-resourceid)
     *
     * @param resourceId The ID of the resource to monitor.
     */
    public fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
    }

    /**
     * The type of resource to monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-resourcetype)
     *
     * @param resourceType The type of resource to monitor.
     */
    public fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
    }

    /**
     * The tags to apply to the flow logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-tags)
     *
     * @param tags The tags to apply to the flow logs.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags to apply to the flow logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-tags)
     *
     * @param tags The tags to apply to the flow logs.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The type of traffic to monitor (accepted traffic, rejected traffic, or all traffic).
     *
     * This parameter is not supported for transit gateway resource types. It is required for the
     * other resource types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-traffictype)
     *
     * @param trafficType The type of traffic to monitor (accepted traffic, rejected traffic, or all
     *   traffic).
     */
    public fun trafficType(trafficType: String) {
        cdkBuilder.trafficType(trafficType)
    }

    public fun build(): CfnFlowLog {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
