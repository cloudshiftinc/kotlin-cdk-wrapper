@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a VPC flow log that captures IP traffic for a specified network interface, subnet, or
 * VPC.
 *
 * To view the log data, use Amazon CloudWatch Logs (CloudWatch Logs) to help troubleshoot
 * connection issues. For example, you can use a flow log to investigate why certain traffic isn't
 * reaching an instance, which can help you diagnose overly restrictive security group rules. For more
 * information, see [VPC Flow Logs](https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html) in
 * the *Amazon VPC User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * Object destinationOptions;
 * CfnFlowLog cfnFlowLog = CfnFlowLog.Builder.create(this, "MyCfnFlowLog")
 * .resourceId("resourceId")
 * .resourceType("resourceType")
 * // the properties below are optional
 * .deliverCrossAccountRole("deliverCrossAccountRole")
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
public open class CfnFlowLog(
  cdkObject: software.amazon.awscdk.services.ec2.CfnFlowLog,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFlowLogProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnFlowLog(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnFlowLogProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFlowLogProps.Builder.() -> Unit,
  ) : this(scope, id, CfnFlowLogProps(props)
  )

  /**
   * The ID of the flow log.
   *
   * For example, `fl-123456abc123abc1` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The ARN of the IAM role that allows the service to publish flow logs across accounts.
   */
  public open fun deliverCrossAccountRole(): String? = unwrap(this).getDeliverCrossAccountRole()

  /**
   * The ARN of the IAM role that allows the service to publish flow logs across accounts.
   */
  public open fun deliverCrossAccountRole(`value`: String) {
    unwrap(this).setDeliverCrossAccountRole(`value`)
  }

  /**
   * The ARN of the IAM role that allows Amazon EC2 to publish flow logs to a CloudWatch Logs log
   * group in your account.
   */
  public open fun deliverLogsPermissionArn(): String? = unwrap(this).getDeliverLogsPermissionArn()

  /**
   * The ARN of the IAM role that allows Amazon EC2 to publish flow logs to a CloudWatch Logs log
   * group in your account.
   */
  public open fun deliverLogsPermissionArn(`value`: String) {
    unwrap(this).setDeliverLogsPermissionArn(`value`)
  }

  /**
   * The destination options.
   *
   * The following options are supported:.
   */
  public open fun destinationOptions(): Any? = unwrap(this).getDestinationOptions()

  /**
   * The destination options.
   *
   * The following options are supported:.
   */
  public open fun destinationOptions(`value`: Any) {
    unwrap(this).setDestinationOptions(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The destination for the flow log data.
   *
   * The meaning of this parameter depends on the destination type.
   */
  public open fun logDestination(): String? = unwrap(this).getLogDestination()

  /**
   * The destination for the flow log data.
   *
   * The meaning of this parameter depends on the destination type.
   */
  public open fun logDestination(`value`: String) {
    unwrap(this).setLogDestination(`value`)
  }

  /**
   * The type of destination for the flow log data.
   */
  public open fun logDestinationType(): String? = unwrap(this).getLogDestinationType()

  /**
   * The type of destination for the flow log data.
   */
  public open fun logDestinationType(`value`: String) {
    unwrap(this).setLogDestinationType(`value`)
  }

  /**
   * The fields to include in the flow log record, in the order in which they should appear.
   */
  public open fun logFormat(): String? = unwrap(this).getLogFormat()

  /**
   * The fields to include in the flow log record, in the order in which they should appear.
   */
  public open fun logFormat(`value`: String) {
    unwrap(this).setLogFormat(`value`)
  }

  /**
   * The name of a new or existing CloudWatch Logs log group where Amazon EC2 publishes your flow
   * logs.
   */
  public open fun logGroupName(): String? = unwrap(this).getLogGroupName()

  /**
   * The name of a new or existing CloudWatch Logs log group where Amazon EC2 publishes your flow
   * logs.
   */
  public open fun logGroupName(`value`: String) {
    unwrap(this).setLogGroupName(`value`)
  }

  /**
   * The maximum interval of time during which a flow of packets is captured and aggregated into a
   * flow log record.
   */
  public open fun maxAggregationInterval(): Number? = unwrap(this).getMaxAggregationInterval()

  /**
   * The maximum interval of time during which a flow of packets is captured and aggregated into a
   * flow log record.
   */
  public open fun maxAggregationInterval(`value`: Number) {
    unwrap(this).setMaxAggregationInterval(`value`)
  }

  /**
   * The ID of the resource to monitor.
   */
  public open fun resourceId(): String = unwrap(this).getResourceId()

  /**
   * The ID of the resource to monitor.
   */
  public open fun resourceId(`value`: String) {
    unwrap(this).setResourceId(`value`)
  }

  /**
   * The type of resource to monitor.
   */
  public open fun resourceType(): String = unwrap(this).getResourceType()

  /**
   * The type of resource to monitor.
   */
  public open fun resourceType(`value`: String) {
    unwrap(this).setResourceType(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags to apply to the flow logs.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags to apply to the flow logs.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags to apply to the flow logs.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The type of traffic to monitor (accepted traffic, rejected traffic, or all traffic).
   */
  public open fun trafficType(): String? = unwrap(this).getTrafficType()

  /**
   * The type of traffic to monitor (accepted traffic, rejected traffic, or all traffic).
   */
  public open fun trafficType(`value`: String) {
    unwrap(this).setTrafficType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnFlowLog].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ARN of the IAM role that allows the service to publish flow logs across accounts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-delivercrossaccountrole)
     * @param deliverCrossAccountRole The ARN of the IAM role that allows the service to publish
     * flow logs across accounts. 
     */
    public fun deliverCrossAccountRole(deliverCrossAccountRole: String)

    /**
     * The ARN of the IAM role that allows Amazon EC2 to publish flow logs to a CloudWatch Logs log
     * group in your account.
     *
     * This parameter is required if the destination type is `cloud-watch-logs` and unsupported
     * otherwise.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-deliverlogspermissionarn)
     * @param deliverLogsPermissionArn The ARN of the IAM role that allows Amazon EC2 to publish
     * flow logs to a CloudWatch Logs log group in your account. 
     */
    public fun deliverLogsPermissionArn(deliverLogsPermissionArn: String)

    /**
     * The destination options. The following options are supported:.
     *
     * * `FileFormat` - The format for the flow log ( `plain-text` | `parquet` ). The default is
     * `plain-text` .
     * * `HiveCompatiblePartitions` - Indicates whether to use Hive-compatible prefixes for flow
     * logs stored in Amazon S3 ( `true` | `false` ). The default is `false` .
     * * `PerHourPartition` - Indicates whether to partition the flow log per hour ( `true` |
     * `false` ). The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-destinationoptions)
     * @param destinationOptions The destination options. The following options are supported:. 
     */
    public fun destinationOptions(destinationOptions: Any)

    /**
     * The destination for the flow log data. The meaning of this parameter depends on the
     * destination type.
     *
     * * If the destination type is `cloud-watch-logs` , specify the ARN of a CloudWatch Logs log
     * group. For example:
     *
     * arn:aws:logs: *region* : *account_id* :log-group: *my_group*
     *
     * Alternatively, use the `LogGroupName` parameter.
     *
     * * If the destination type is `s3` , specify the ARN of an S3 bucket. For example:
     *
     * arn:aws:s3::: *my_bucket* / *my_subfolder* /
     *
     * The subfolder is optional. Note that you can't use `AWSLogs` as a subfolder name.
     *
     * * If the destination type is `kinesis-data-firehose` , specify the ARN of a Kinesis Data
     * Firehose delivery stream. For example:
     *
     * arn:aws:firehose: *region* : *account_id* :deliverystream: *my_stream*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-logdestination)
     * @param logDestination The destination for the flow log data. The meaning of this parameter
     * depends on the destination type. 
     */
    public fun logDestination(logDestination: String)

    /**
     * The type of destination for the flow log data.
     *
     * Default: `cloud-watch-logs`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-logdestinationtype)
     * @param logDestinationType The type of destination for the flow log data. 
     */
    public fun logDestinationType(logDestinationType: String)

    /**
     * The fields to include in the flow log record, in the order in which they should appear.
     *
     * If you omit this parameter, the flow log is created using the default format. If you specify
     * this parameter, you must include at least one field. For more information about the available
     * fields, see [Flow log
     * records](https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records) in
     * the *Amazon VPC User Guide* or [Transit Gateway Flow Log
     * records](https://docs.aws.amazon.com/vpc/latest/tgw/tgw-flow-logs.html#flow-log-records) in the
     * *AWS Transit Gateway Guide* .
     *
     * Specify the fields using the `${field-id}` format, separated by spaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-logformat)
     * @param logFormat The fields to include in the flow log record, in the order in which they
     * should appear. 
     */
    public fun logFormat(logFormat: String)

    /**
     * The name of a new or existing CloudWatch Logs log group where Amazon EC2 publishes your flow
     * logs.
     *
     * This parameter is valid only if the destination type is `cloud-watch-logs` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-loggroupname)
     * @param logGroupName The name of a new or existing CloudWatch Logs log group where Amazon EC2
     * publishes your flow logs. 
     */
    public fun logGroupName(logGroupName: String)

    /**
     * The maximum interval of time during which a flow of packets is captured and aggregated into a
     * flow log record.
     *
     * The possible values are 60 seconds (1 minute) or 600 seconds (10 minutes). This parameter
     * must be 60 seconds for transit gateway resource types.
     *
     * When a network interface is attached to a [Nitro-based
     * instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances)
     * , the aggregation interval is always 60 seconds or less, regardless of the value that you
     * specify.
     *
     * Default: 600
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-maxaggregationinterval)
     * @param maxAggregationInterval The maximum interval of time during which a flow of packets is
     * captured and aggregated into a flow log record. 
     */
    public fun maxAggregationInterval(maxAggregationInterval: Number)

    /**
     * The ID of the resource to monitor.
     *
     * For example, if the resource type is `VPC` , specify the ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-resourceid)
     * @param resourceId The ID of the resource to monitor. 
     */
    public fun resourceId(resourceId: String)

    /**
     * The type of resource to monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-resourcetype)
     * @param resourceType The type of resource to monitor. 
     */
    public fun resourceType(resourceType: String)

    /**
     * The tags to apply to the flow logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-tags)
     * @param tags The tags to apply to the flow logs. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to apply to the flow logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-tags)
     * @param tags The tags to apply to the flow logs. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The type of traffic to monitor (accepted traffic, rejected traffic, or all traffic).
     *
     * This parameter is not supported for transit gateway resource types. It is required for the
     * other resource types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-traffictype)
     * @param trafficType The type of traffic to monitor (accepted traffic, rejected traffic, or all
     * traffic). 
     */
    public fun trafficType(trafficType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnFlowLog.Builder =
        software.amazon.awscdk.services.ec2.CfnFlowLog.Builder.create(scope, id)

    /**
     * The ARN of the IAM role that allows the service to publish flow logs across accounts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-delivercrossaccountrole)
     * @param deliverCrossAccountRole The ARN of the IAM role that allows the service to publish
     * flow logs across accounts. 
     */
    override fun deliverCrossAccountRole(deliverCrossAccountRole: String) {
      cdkBuilder.deliverCrossAccountRole(deliverCrossAccountRole)
    }

    /**
     * The ARN of the IAM role that allows Amazon EC2 to publish flow logs to a CloudWatch Logs log
     * group in your account.
     *
     * This parameter is required if the destination type is `cloud-watch-logs` and unsupported
     * otherwise.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-deliverlogspermissionarn)
     * @param deliverLogsPermissionArn The ARN of the IAM role that allows Amazon EC2 to publish
     * flow logs to a CloudWatch Logs log group in your account. 
     */
    override fun deliverLogsPermissionArn(deliverLogsPermissionArn: String) {
      cdkBuilder.deliverLogsPermissionArn(deliverLogsPermissionArn)
    }

    /**
     * The destination options. The following options are supported:.
     *
     * * `FileFormat` - The format for the flow log ( `plain-text` | `parquet` ). The default is
     * `plain-text` .
     * * `HiveCompatiblePartitions` - Indicates whether to use Hive-compatible prefixes for flow
     * logs stored in Amazon S3 ( `true` | `false` ). The default is `false` .
     * * `PerHourPartition` - Indicates whether to partition the flow log per hour ( `true` |
     * `false` ). The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-destinationoptions)
     * @param destinationOptions The destination options. The following options are supported:. 
     */
    override fun destinationOptions(destinationOptions: Any) {
      cdkBuilder.destinationOptions(destinationOptions)
    }

    /**
     * The destination for the flow log data. The meaning of this parameter depends on the
     * destination type.
     *
     * * If the destination type is `cloud-watch-logs` , specify the ARN of a CloudWatch Logs log
     * group. For example:
     *
     * arn:aws:logs: *region* : *account_id* :log-group: *my_group*
     *
     * Alternatively, use the `LogGroupName` parameter.
     *
     * * If the destination type is `s3` , specify the ARN of an S3 bucket. For example:
     *
     * arn:aws:s3::: *my_bucket* / *my_subfolder* /
     *
     * The subfolder is optional. Note that you can't use `AWSLogs` as a subfolder name.
     *
     * * If the destination type is `kinesis-data-firehose` , specify the ARN of a Kinesis Data
     * Firehose delivery stream. For example:
     *
     * arn:aws:firehose: *region* : *account_id* :deliverystream: *my_stream*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-logdestination)
     * @param logDestination The destination for the flow log data. The meaning of this parameter
     * depends on the destination type. 
     */
    override fun logDestination(logDestination: String) {
      cdkBuilder.logDestination(logDestination)
    }

    /**
     * The type of destination for the flow log data.
     *
     * Default: `cloud-watch-logs`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-logdestinationtype)
     * @param logDestinationType The type of destination for the flow log data. 
     */
    override fun logDestinationType(logDestinationType: String) {
      cdkBuilder.logDestinationType(logDestinationType)
    }

    /**
     * The fields to include in the flow log record, in the order in which they should appear.
     *
     * If you omit this parameter, the flow log is created using the default format. If you specify
     * this parameter, you must include at least one field. For more information about the available
     * fields, see [Flow log
     * records](https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records) in
     * the *Amazon VPC User Guide* or [Transit Gateway Flow Log
     * records](https://docs.aws.amazon.com/vpc/latest/tgw/tgw-flow-logs.html#flow-log-records) in the
     * *AWS Transit Gateway Guide* .
     *
     * Specify the fields using the `${field-id}` format, separated by spaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-logformat)
     * @param logFormat The fields to include in the flow log record, in the order in which they
     * should appear. 
     */
    override fun logFormat(logFormat: String) {
      cdkBuilder.logFormat(logFormat)
    }

    /**
     * The name of a new or existing CloudWatch Logs log group where Amazon EC2 publishes your flow
     * logs.
     *
     * This parameter is valid only if the destination type is `cloud-watch-logs` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-loggroupname)
     * @param logGroupName The name of a new or existing CloudWatch Logs log group where Amazon EC2
     * publishes your flow logs. 
     */
    override fun logGroupName(logGroupName: String) {
      cdkBuilder.logGroupName(logGroupName)
    }

    /**
     * The maximum interval of time during which a flow of packets is captured and aggregated into a
     * flow log record.
     *
     * The possible values are 60 seconds (1 minute) or 600 seconds (10 minutes). This parameter
     * must be 60 seconds for transit gateway resource types.
     *
     * When a network interface is attached to a [Nitro-based
     * instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances)
     * , the aggregation interval is always 60 seconds or less, regardless of the value that you
     * specify.
     *
     * Default: 600
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-maxaggregationinterval)
     * @param maxAggregationInterval The maximum interval of time during which a flow of packets is
     * captured and aggregated into a flow log record. 
     */
    override fun maxAggregationInterval(maxAggregationInterval: Number) {
      cdkBuilder.maxAggregationInterval(maxAggregationInterval)
    }

    /**
     * The ID of the resource to monitor.
     *
     * For example, if the resource type is `VPC` , specify the ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-resourceid)
     * @param resourceId The ID of the resource to monitor. 
     */
    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    /**
     * The type of resource to monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-resourcetype)
     * @param resourceType The type of resource to monitor. 
     */
    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    /**
     * The tags to apply to the flow logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-tags)
     * @param tags The tags to apply to the flow logs. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags to apply to the flow logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-tags)
     * @param tags The tags to apply to the flow logs. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The type of traffic to monitor (accepted traffic, rejected traffic, or all traffic).
     *
     * This parameter is not supported for transit gateway resource types. It is required for the
     * other resource types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-traffictype)
     * @param trafficType The type of traffic to monitor (accepted traffic, rejected traffic, or all
     * traffic). 
     */
    override fun trafficType(trafficType: String) {
      cdkBuilder.trafficType(trafficType)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnFlowLog = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnFlowLog.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFlowLog {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFlowLog(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnFlowLog): CfnFlowLog =
        CfnFlowLog(cdkObject)

    internal fun unwrap(wrapped: CfnFlowLog): software.amazon.awscdk.services.ec2.CfnFlowLog =
        wrapped.cdkObject as software.amazon.awscdk.services.ec2.CfnFlowLog
  }

  /**
   * Describes the destination options for a flow log.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * DestinationOptionsProperty destinationOptionsProperty = DestinationOptionsProperty.builder()
   * .fileFormat("fileFormat")
   * .hiveCompatiblePartitions(false)
   * .perHourPartition(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-flowlog-destinationoptions.html)
   */
  public interface DestinationOptionsProperty {
    /**
     * The format for the flow log.
     *
     * The default is `plain-text` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-flowlog-destinationoptions.html#cfn-ec2-flowlog-destinationoptions-fileformat)
     */
    public fun fileFormat(): String

    /**
     * Indicates whether to use Hive-compatible prefixes for flow logs stored in Amazon S3.
     *
     * The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-flowlog-destinationoptions.html#cfn-ec2-flowlog-destinationoptions-hivecompatiblepartitions)
     */
    public fun hiveCompatiblePartitions(): Any

    /**
     * Indicates whether to partition the flow log per hour.
     *
     * This reduces the cost and response time for queries. The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-flowlog-destinationoptions.html#cfn-ec2-flowlog-destinationoptions-perhourpartition)
     */
    public fun perHourPartition(): Any

    /**
     * A builder for [DestinationOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fileFormat The format for the flow log. 
       * The default is `plain-text` .
       */
      public fun fileFormat(fileFormat: String)

      /**
       * @param hiveCompatiblePartitions Indicates whether to use Hive-compatible prefixes for flow
       * logs stored in Amazon S3. 
       * The default is `false` .
       */
      public fun hiveCompatiblePartitions(hiveCompatiblePartitions: Boolean)

      /**
       * @param hiveCompatiblePartitions Indicates whether to use Hive-compatible prefixes for flow
       * logs stored in Amazon S3. 
       * The default is `false` .
       */
      public fun hiveCompatiblePartitions(hiveCompatiblePartitions: IResolvable)

      /**
       * @param perHourPartition Indicates whether to partition the flow log per hour. 
       * This reduces the cost and response time for queries. The default is `false` .
       */
      public fun perHourPartition(perHourPartition: Boolean)

      /**
       * @param perHourPartition Indicates whether to partition the flow log per hour. 
       * This reduces the cost and response time for queries. The default is `false` .
       */
      public fun perHourPartition(perHourPartition: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnFlowLog.DestinationOptionsProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnFlowLog.DestinationOptionsProperty.builder()

      /**
       * @param fileFormat The format for the flow log. 
       * The default is `plain-text` .
       */
      override fun fileFormat(fileFormat: String) {
        cdkBuilder.fileFormat(fileFormat)
      }

      /**
       * @param hiveCompatiblePartitions Indicates whether to use Hive-compatible prefixes for flow
       * logs stored in Amazon S3. 
       * The default is `false` .
       */
      override fun hiveCompatiblePartitions(hiveCompatiblePartitions: Boolean) {
        cdkBuilder.hiveCompatiblePartitions(hiveCompatiblePartitions)
      }

      /**
       * @param hiveCompatiblePartitions Indicates whether to use Hive-compatible prefixes for flow
       * logs stored in Amazon S3. 
       * The default is `false` .
       */
      override fun hiveCompatiblePartitions(hiveCompatiblePartitions: IResolvable) {
        cdkBuilder.hiveCompatiblePartitions(hiveCompatiblePartitions.let(IResolvable::unwrap))
      }

      /**
       * @param perHourPartition Indicates whether to partition the flow log per hour. 
       * This reduces the cost and response time for queries. The default is `false` .
       */
      override fun perHourPartition(perHourPartition: Boolean) {
        cdkBuilder.perHourPartition(perHourPartition)
      }

      /**
       * @param perHourPartition Indicates whether to partition the flow log per hour. 
       * This reduces the cost and response time for queries. The default is `false` .
       */
      override fun perHourPartition(perHourPartition: IResolvable) {
        cdkBuilder.perHourPartition(perHourPartition.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnFlowLog.DestinationOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnFlowLog.DestinationOptionsProperty,
    ) : CdkObject(cdkObject), DestinationOptionsProperty {
      /**
       * The format for the flow log.
       *
       * The default is `plain-text` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-flowlog-destinationoptions.html#cfn-ec2-flowlog-destinationoptions-fileformat)
       */
      override fun fileFormat(): String = unwrap(this).getFileFormat()

      /**
       * Indicates whether to use Hive-compatible prefixes for flow logs stored in Amazon S3.
       *
       * The default is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-flowlog-destinationoptions.html#cfn-ec2-flowlog-destinationoptions-hivecompatiblepartitions)
       */
      override fun hiveCompatiblePartitions(): Any = unwrap(this).getHiveCompatiblePartitions()

      /**
       * Indicates whether to partition the flow log per hour.
       *
       * This reduces the cost and response time for queries. The default is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-flowlog-destinationoptions.html#cfn-ec2-flowlog-destinationoptions-perhourpartition)
       */
      override fun perHourPartition(): Any = unwrap(this).getPerHourPartition()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnFlowLog.DestinationOptionsProperty):
          DestinationOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DestinationOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnFlowLog.DestinationOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnFlowLog.DestinationOptionsProperty
    }
  }
}
