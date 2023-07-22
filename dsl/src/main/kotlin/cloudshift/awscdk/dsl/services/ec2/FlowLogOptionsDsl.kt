@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.FlowLogDestination
import software.amazon.awscdk.services.ec2.FlowLogMaxAggregationInterval
import software.amazon.awscdk.services.ec2.FlowLogOptions
import software.amazon.awscdk.services.ec2.FlowLogTrafficType
import software.amazon.awscdk.services.ec2.LogFormat

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
@CdkDslMarker
public class FlowLogOptionsDsl {
  private val cdkBuilder: FlowLogOptions.Builder = FlowLogOptions.builder()

  private val _logFormat: MutableList<LogFormat> = mutableListOf()

  /**
   * @param destination Specifies the type of destination to which the flow log data is to be
   * published.
   * Flow log data can be published to CloudWatch Logs or Amazon S3
   */
  public fun destination(destination: FlowLogDestination) {
    cdkBuilder.destination(destination)
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
  public fun logFormat(vararg logFormat: LogFormat) {
    _logFormat.addAll(listOf(*logFormat))
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
  public fun logFormat(logFormat: Collection<LogFormat>) {
    _logFormat.addAll(logFormat)
  }

  /**
   * @param maxAggregationInterval The maximum interval of time during which a flow of packets is
   * captured and aggregated into a flow log record.
   */
  public fun maxAggregationInterval(maxAggregationInterval: FlowLogMaxAggregationInterval) {
    cdkBuilder.maxAggregationInterval(maxAggregationInterval)
  }

  /**
   * @param trafficType The type of traffic to log.
   * You can log traffic that the resource accepts or rejects, or all traffic.
   */
  public fun trafficType(trafficType: FlowLogTrafficType) {
    cdkBuilder.trafficType(trafficType)
  }

  public fun build(): FlowLogOptions {
    if(_logFormat.isNotEmpty()) cdkBuilder.logFormat(_logFormat)
    return cdkBuilder.build()
  }
}
