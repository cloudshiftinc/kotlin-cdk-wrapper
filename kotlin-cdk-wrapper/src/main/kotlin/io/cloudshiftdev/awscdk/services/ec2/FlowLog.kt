@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A VPC flow log.
 *
 * Example:
 *
 * ```
 * CfnTransitGateway tgw;
 * FlowLog.Builder.create(this, "TransitGatewayFlowLog")
 * .resourceType(FlowLogResourceType.fromTransitGatewayId(tgw.getRef()))
 * .build();
 * ```
 */
public open class FlowLog(
  cdkObject: software.amazon.awscdk.services.ec2.FlowLog,
) : Resource(cdkObject),
    IFlowLog {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: FlowLogProps,
  ) :
      this(software.amazon.awscdk.services.ec2.FlowLog(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(FlowLogProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: FlowLogProps.Builder.() -> Unit,
  ) : this(scope, id, FlowLogProps(props)
  )

  /**
   * The S3 bucket to publish flow logs to.
   */
  public open fun bucket(): IBucket? = unwrap(this).getBucket()?.let(IBucket::wrap)

  /**
   * The ARN of the Kinesis Data Firehose delivery stream to publish flow logs to.
   */
  public open fun deliveryStreamArn(): String? = unwrap(this).getDeliveryStreamArn()

  /**
   * The Id of the VPC Flow Log.
   */
  public override fun flowLogId(): String = unwrap(this).getFlowLogId()

  /**
   * The iam role used to publish logs to CloudWatch.
   */
  public open fun iamRole(): IRole? = unwrap(this).getIamRole()?.let(IRole::wrap)

  /**
   * S3 bucket key prefix to publish the flow logs under.
   */
  public open fun keyPrefix(): String? = unwrap(this).getKeyPrefix()

  /**
   * The CloudWatch Logs LogGroup to publish flow logs to.
   */
  public open fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.FlowLog].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies the type of destination to which the flow log data is to be published.
     *
     * Flow log data can be published to CloudWatch Logs or Amazon S3
     *
     * Default: FlowLogDestinationType.toCloudWatchLogs()
     *
     * @param destination Specifies the type of destination to which the flow log data is to be
     * published. 
     */
    public fun destination(destination: FlowLogDestination)

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
    public fun flowLogName(flowLogName: String)

    /**
     * The fields to include in the flow log record, in the order in which they should appear.
     *
     * If multiple fields are specified, they will be separated by spaces. For full control over the
     * literal log format
     * string, pass a single field constructed with `LogFormat.custom()`.
     *
     * See https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records
     *
     * Default: - default log format is used.
     *
     * @param logFormat The fields to include in the flow log record, in the order in which they
     * should appear. 
     */
    public fun logFormat(logFormat: List<LogFormat>)

    /**
     * The fields to include in the flow log record, in the order in which they should appear.
     *
     * If multiple fields are specified, they will be separated by spaces. For full control over the
     * literal log format
     * string, pass a single field constructed with `LogFormat.custom()`.
     *
     * See https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records
     *
     * Default: - default log format is used.
     *
     * @param logFormat The fields to include in the flow log record, in the order in which they
     * should appear. 
     */
    public fun logFormat(vararg logFormat: LogFormat)

    /**
     * The maximum interval of time during which a flow of packets is captured and aggregated into a
     * flow log record.
     *
     * When creating flow logs for a Transit Gateway or Transit Gateway Attachment,
     * this property must be ONE_MINUTES.
     *
     * Default: - FlowLogMaxAggregationInterval.ONE_MINUTES if creating flow logs for Transit
     * Gateway, otherwise FlowLogMaxAggregationInterval.TEN_MINUTES.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-maxaggregationinterval)
     * @param maxAggregationInterval The maximum interval of time during which a flow of packets is
     * captured and aggregated into a flow log record. 
     */
    public fun maxAggregationInterval(maxAggregationInterval: FlowLogMaxAggregationInterval)

    /**
     * The type of resource for which to create the flow log.
     *
     * @param resourceType The type of resource for which to create the flow log. 
     */
    public fun resourceType(resourceType: FlowLogResourceType)

    /**
     * The type of traffic to log.
     *
     * You can log traffic that the resource accepts or rejects, or all traffic.
     * When the target is either `TransitGateway` or `TransitGatewayAttachment`, setting the traffic
     * type is not possible.
     *
     * Default: ALL
     *
     * [Documentation](https://docs.aws.amazon.com/vpc/latest/tgw/working-with-flow-logs.html)
     * @param trafficType The type of traffic to log. 
     */
    public fun trafficType(trafficType: FlowLogTrafficType)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.FlowLog.Builder =
        software.amazon.awscdk.services.ec2.FlowLog.Builder.create(scope, id)

    /**
     * Specifies the type of destination to which the flow log data is to be published.
     *
     * Flow log data can be published to CloudWatch Logs or Amazon S3
     *
     * Default: FlowLogDestinationType.toCloudWatchLogs()
     *
     * @param destination Specifies the type of destination to which the flow log data is to be
     * published. 
     */
    override fun destination(destination: FlowLogDestination) {
      cdkBuilder.destination(destination.let(FlowLogDestination.Companion::unwrap))
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
    override fun flowLogName(flowLogName: String) {
      cdkBuilder.flowLogName(flowLogName)
    }

    /**
     * The fields to include in the flow log record, in the order in which they should appear.
     *
     * If multiple fields are specified, they will be separated by spaces. For full control over the
     * literal log format
     * string, pass a single field constructed with `LogFormat.custom()`.
     *
     * See https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records
     *
     * Default: - default log format is used.
     *
     * @param logFormat The fields to include in the flow log record, in the order in which they
     * should appear. 
     */
    override fun logFormat(logFormat: List<LogFormat>) {
      cdkBuilder.logFormat(logFormat.map(LogFormat.Companion::unwrap))
    }

    /**
     * The fields to include in the flow log record, in the order in which they should appear.
     *
     * If multiple fields are specified, they will be separated by spaces. For full control over the
     * literal log format
     * string, pass a single field constructed with `LogFormat.custom()`.
     *
     * See https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records
     *
     * Default: - default log format is used.
     *
     * @param logFormat The fields to include in the flow log record, in the order in which they
     * should appear. 
     */
    override fun logFormat(vararg logFormat: LogFormat): Unit = logFormat(logFormat.toList())

    /**
     * The maximum interval of time during which a flow of packets is captured and aggregated into a
     * flow log record.
     *
     * When creating flow logs for a Transit Gateway or Transit Gateway Attachment,
     * this property must be ONE_MINUTES.
     *
     * Default: - FlowLogMaxAggregationInterval.ONE_MINUTES if creating flow logs for Transit
     * Gateway, otherwise FlowLogMaxAggregationInterval.TEN_MINUTES.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-maxaggregationinterval)
     * @param maxAggregationInterval The maximum interval of time during which a flow of packets is
     * captured and aggregated into a flow log record. 
     */
    override fun maxAggregationInterval(maxAggregationInterval: FlowLogMaxAggregationInterval) {
      cdkBuilder.maxAggregationInterval(maxAggregationInterval.let(FlowLogMaxAggregationInterval.Companion::unwrap))
    }

    /**
     * The type of resource for which to create the flow log.
     *
     * @param resourceType The type of resource for which to create the flow log. 
     */
    override fun resourceType(resourceType: FlowLogResourceType) {
      cdkBuilder.resourceType(resourceType.let(FlowLogResourceType.Companion::unwrap))
    }

    /**
     * The type of traffic to log.
     *
     * You can log traffic that the resource accepts or rejects, or all traffic.
     * When the target is either `TransitGateway` or `TransitGatewayAttachment`, setting the traffic
     * type is not possible.
     *
     * Default: ALL
     *
     * [Documentation](https://docs.aws.amazon.com/vpc/latest/tgw/working-with-flow-logs.html)
     * @param trafficType The type of traffic to log. 
     */
    override fun trafficType(trafficType: FlowLogTrafficType) {
      cdkBuilder.trafficType(trafficType.let(FlowLogTrafficType.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.FlowLog = cdkBuilder.build()
  }

  public companion object {
    public fun fromFlowLogId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      flowLogId: String,
    ): IFlowLog =
        software.amazon.awscdk.services.ec2.FlowLog.fromFlowLogId(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, flowLogId).let(IFlowLog::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): FlowLog {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return FlowLog(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.FlowLog): FlowLog =
        FlowLog(cdkObject)

    internal fun unwrap(wrapped: FlowLog): software.amazon.awscdk.services.ec2.FlowLog =
        wrapped.cdkObject as software.amazon.awscdk.services.ec2.FlowLog
  }
}
