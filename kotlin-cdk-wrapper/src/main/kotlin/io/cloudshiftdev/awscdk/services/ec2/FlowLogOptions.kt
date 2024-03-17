@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.collections.List

/**
 * Options to add a flow log to a VPC.
 *
 * Example:
 *
 * ```
 * Vpc vpc = new Vpc(this, "Vpc");
 * vpc.addFlowLog("FlowLogS3", FlowLogOptions.builder()
 * .destination(FlowLogDestination.toS3())
 * .build());
 * // Only reject traffic and interval every minute.
 * vpc.addFlowLog("FlowLogCloudWatch", FlowLogOptions.builder()
 * .trafficType(FlowLogTrafficType.REJECT)
 * .maxAggregationInterval(FlowLogMaxAggregationInterval.ONE_MINUTE)
 * .build());
 * ```
 */
public interface FlowLogOptions {
  /**
   * Specifies the type of destination to which the flow log data is to be published.
   *
   * Flow log data can be published to CloudWatch Logs or Amazon S3
   *
   * Default: FlowLogDestinationType.toCloudWatchLogs()
   */
  public fun destination(): FlowLogDestination? =
      unwrap(this).getDestination()?.let(FlowLogDestination::wrap)

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
  public fun logFormat(): List<LogFormat> = unwrap(this).getLogFormat()?.map(LogFormat::wrap) ?:
      emptyList()

  /**
   * The maximum interval of time during which a flow of packets is captured and aggregated into a
   * flow log record.
   *
   * When creating flow logs for a Transit Gateway or Transit Gateway Attachment,
   * this property must be ONE_MINUTES.
   *
   * Default: - FlowLogMaxAggregationInterval.ONE_MINUTES if creating flow logs for Transit Gateway,
   * otherwise FlowLogMaxAggregationInterval.TEN_MINUTES.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-flowlog.html#cfn-ec2-flowlog-maxaggregationinterval)
   */
  public fun maxAggregationInterval(): FlowLogMaxAggregationInterval? =
      unwrap(this).getMaxAggregationInterval()?.let(FlowLogMaxAggregationInterval::wrap)

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
  public fun trafficType(): FlowLogTrafficType? =
      unwrap(this).getTrafficType()?.let(FlowLogTrafficType::wrap)

  /**
   * A builder for [FlowLogOptions]
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
     * @param trafficType The type of traffic to log.
     * You can log traffic that the resource accepts or rejects, or all traffic.
     * When the target is either `TransitGateway` or `TransitGatewayAttachment`, setting the traffic
     * type is not possible.
     */
    public fun trafficType(trafficType: FlowLogTrafficType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.FlowLogOptions.Builder =
        software.amazon.awscdk.services.ec2.FlowLogOptions.builder()

    /**
     * @param destination Specifies the type of destination to which the flow log data is to be
     * published.
     * Flow log data can be published to CloudWatch Logs or Amazon S3
     */
    override fun destination(destination: FlowLogDestination) {
      cdkBuilder.destination(destination.let(FlowLogDestination::unwrap))
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
     * @param trafficType The type of traffic to log.
     * You can log traffic that the resource accepts or rejects, or all traffic.
     * When the target is either `TransitGateway` or `TransitGatewayAttachment`, setting the traffic
     * type is not possible.
     */
    override fun trafficType(trafficType: FlowLogTrafficType) {
      cdkBuilder.trafficType(trafficType.let(FlowLogTrafficType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.FlowLogOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.FlowLogOptions,
  ) : CdkObject(cdkObject), FlowLogOptions {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): FlowLogOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.FlowLogOptions): FlowLogOptions
        = CdkObjectWrappers.wrap(cdkObject) as? FlowLogOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: FlowLogOptions): software.amazon.awscdk.services.ec2.FlowLogOptions
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.FlowLogOptions
  }
}
