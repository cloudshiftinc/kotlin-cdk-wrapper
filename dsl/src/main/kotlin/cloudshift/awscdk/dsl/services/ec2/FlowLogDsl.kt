@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
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
   * published. 
   */
  public fun destination(destination: FlowLogDestination) {
    cdkBuilder.destination(destination)
  }

  /**
   * The name of the FlowLog.
   *
   * It is not recommended to use an explicit name.
   *
   * Default: If you don't specify a flowLogName, AWS CloudFormation generates a
   * unique physical ID and uses that ID for the group name.
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
  public fun logFormat(vararg logFormat: LogFormat) {
    _logFormat.addAll(listOf(*logFormat))
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
  public fun logFormat(logFormat: Collection<LogFormat>) {
    _logFormat.addAll(logFormat)
  }

  /**
   * The maximum interval of time during which a flow of packets is captured and aggregated into a
   * flow log record.
   *
   * Default: FlowLogMaxAggregationInterval.TEN_MINUTES
   *
   * @param maxAggregationInterval The maximum interval of time during which a flow of packets is
   * captured and aggregated into a flow log record. 
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
   * You can log traffic that the resource accepts or rejects, or all traffic.
   *
   * Default: ALL
   *
   * @param trafficType The type of traffic to log. 
   */
  public fun trafficType(trafficType: FlowLogTrafficType) {
    cdkBuilder.trafficType(trafficType)
  }

  public fun build(): FlowLog {
    if(_logFormat.isNotEmpty()) cdkBuilder.logFormat(_logFormat)
    return cdkBuilder.build()
  }
}
