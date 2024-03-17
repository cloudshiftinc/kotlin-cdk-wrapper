@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties of a VPC Flow Log.
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
public interface FlowLogProps : FlowLogOptions {
  /**
   * The name of the FlowLog.
   *
   * Since the FlowLog resource doesn't support providing a physical name, the value provided here
   * will be recorded in the `Name` tag.
   *
   * Default: CDK generated name
   */
  public fun flowLogName(): String? = unwrap(this).getFlowLogName()

  /**
   * The type of resource for which to create the flow log.
   */
  public fun resourceType(): FlowLogResourceType

  /**
   * A builder for [FlowLogProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param destination Specifies the type of destination to which the flow log data is to be
     * published.
     * Flow log data can be published to CloudWatch Logs or Amazon S3
     */
    public fun destination(destination: FlowLogDestination)

    /**
     * @param flowLogName The name of the FlowLog.
     * Since the FlowLog resource doesn't support providing a physical name, the value provided here
     * will be recorded in the `Name` tag.
     */
    public fun flowLogName(flowLogName: String)

    /**
     * @param logFormat The fields to include in the flow log record, in the order in which they
     * should appear.
     * If multiple fields are specified, they will be separated by spaces. For full control over the
     * literal log format
     * string, pass a single field constructed with `LogFormat.custom()`.
     *
     * See https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records
     */
    public fun logFormat(logFormat: List<LogFormat>)

    /**
     * @param logFormat The fields to include in the flow log record, in the order in which they
     * should appear.
     * If multiple fields are specified, they will be separated by spaces. For full control over the
     * literal log format
     * string, pass a single field constructed with `LogFormat.custom()`.
     *
     * See https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records
     */
    public fun logFormat(vararg logFormat: LogFormat)

    /**
     * @param maxAggregationInterval The maximum interval of time during which a flow of packets is
     * captured and aggregated into a flow log record.
     * When creating flow logs for a Transit Gateway or Transit Gateway Attachment,
     * this property must be ONE_MINUTES.
     */
    public fun maxAggregationInterval(maxAggregationInterval: FlowLogMaxAggregationInterval)

    /**
     * @param resourceType The type of resource for which to create the flow log. 
     */
    public fun resourceType(resourceType: FlowLogResourceType)

    /**
     * @param trafficType The type of traffic to log.
     * You can log traffic that the resource accepts or rejects, or all traffic.
     * When the target is either `TransitGateway` or `TransitGatewayAttachment`, setting the traffic
     * type is not possible.
     */
    public fun trafficType(trafficType: FlowLogTrafficType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.FlowLogProps.Builder =
        software.amazon.awscdk.services.ec2.FlowLogProps.builder()

    /**
     * @param destination Specifies the type of destination to which the flow log data is to be
     * published.
     * Flow log data can be published to CloudWatch Logs or Amazon S3
     */
    override fun destination(destination: FlowLogDestination) {
      cdkBuilder.destination(destination.let(FlowLogDestination::unwrap))
    }

    /**
     * @param flowLogName The name of the FlowLog.
     * Since the FlowLog resource doesn't support providing a physical name, the value provided here
     * will be recorded in the `Name` tag.
     */
    override fun flowLogName(flowLogName: String) {
      cdkBuilder.flowLogName(flowLogName)
    }

    /**
     * @param logFormat The fields to include in the flow log record, in the order in which they
     * should appear.
     * If multiple fields are specified, they will be separated by spaces. For full control over the
     * literal log format
     * string, pass a single field constructed with `LogFormat.custom()`.
     *
     * See https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records
     */
    override fun logFormat(logFormat: List<LogFormat>) {
      cdkBuilder.logFormat(logFormat.map(LogFormat::unwrap))
    }

    /**
     * @param logFormat The fields to include in the flow log record, in the order in which they
     * should appear.
     * If multiple fields are specified, they will be separated by spaces. For full control over the
     * literal log format
     * string, pass a single field constructed with `LogFormat.custom()`.
     *
     * See https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html#flow-log-records
     */
    override fun logFormat(vararg logFormat: LogFormat): Unit = logFormat(logFormat.toList())

    /**
     * @param maxAggregationInterval The maximum interval of time during which a flow of packets is
     * captured and aggregated into a flow log record.
     * When creating flow logs for a Transit Gateway or Transit Gateway Attachment,
     * this property must be ONE_MINUTES.
     */
    override fun maxAggregationInterval(maxAggregationInterval: FlowLogMaxAggregationInterval) {
      cdkBuilder.maxAggregationInterval(maxAggregationInterval.let(FlowLogMaxAggregationInterval::unwrap))
    }

    /**
     * @param resourceType The type of resource for which to create the flow log. 
     */
    override fun resourceType(resourceType: FlowLogResourceType) {
      cdkBuilder.resourceType(resourceType.let(FlowLogResourceType::unwrap))
    }

    /**
     * @param trafficType The type of traffic to log.
     * You can log traffic that the resource accepts or rejects, or all traffic.
     * When the target is either `TransitGateway` or `TransitGatewayAttachment`, setting the traffic
     * type is not possible.
     */
    override fun trafficType(trafficType: FlowLogTrafficType) {
      cdkBuilder.trafficType(trafficType.let(FlowLogTrafficType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.FlowLogProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.FlowLogProps,
  ) : CdkObject(cdkObject), FlowLogProps {
    /**
     * Specifies the type of destination to which the flow log data is to be published.
     *
     * Flow log data can be published to CloudWatch Logs or Amazon S3
     *
     * Default: FlowLogDestinationType.toCloudWatchLogs()
     */
    override fun destination(): FlowLogDestination? =
        unwrap(this).getDestination()?.let(FlowLogDestination::wrap)

    /**
     * The name of the FlowLog.
     *
     * Since the FlowLog resource doesn't support providing a physical name, the value provided here
     * will be recorded in the `Name` tag.
     *
     * Default: CDK generated name
     */
    override fun flowLogName(): String? = unwrap(this).getFlowLogName()

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
     */
    override fun logFormat(): List<LogFormat> = unwrap(this).getLogFormat()?.map(LogFormat::wrap) ?:
        emptyList()

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
     */
    override fun maxAggregationInterval(): FlowLogMaxAggregationInterval? =
        unwrap(this).getMaxAggregationInterval()?.let(FlowLogMaxAggregationInterval::wrap)

    /**
     * The type of resource for which to create the flow log.
     */
    override fun resourceType(): FlowLogResourceType =
        unwrap(this).getResourceType().let(FlowLogResourceType::wrap)

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
     */
    override fun trafficType(): FlowLogTrafficType? =
        unwrap(this).getTrafficType()?.let(FlowLogTrafficType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FlowLogProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.FlowLogProps): FlowLogProps =
        CdkObjectWrappers.wrap(cdkObject) as? FlowLogProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: FlowLogProps): software.amazon.awscdk.services.ec2.FlowLogProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.FlowLogProps
  }
}
