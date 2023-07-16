@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.FlowLogDestination
import software.amazon.awscdk.services.ec2.FlowLogMaxAggregationInterval
import software.amazon.awscdk.services.ec2.FlowLogProps
import software.amazon.awscdk.services.ec2.FlowLogResourceType
import software.amazon.awscdk.services.ec2.FlowLogTrafficType
import software.amazon.awscdk.services.ec2.LogFormat

@CdkDslMarker
public class FlowLogPropsDsl {
  private val cdkBuilder: FlowLogProps.Builder = FlowLogProps.builder()

  private val _logFormat: MutableList<LogFormat> = mutableListOf()

  public fun destination(destination: FlowLogDestination) {
    cdkBuilder.destination(destination)
  }

  public fun flowLogName(flowLogName: String) {
    cdkBuilder.flowLogName(flowLogName)
  }

  public fun logFormat(vararg logFormat: LogFormat) {
    _logFormat.addAll(listOf(*logFormat))
  }

  public fun logFormat(logFormat: Collection<LogFormat>) {
    _logFormat.addAll(logFormat)
  }

  public fun maxAggregationInterval(maxAggregationInterval: FlowLogMaxAggregationInterval) {
    cdkBuilder.maxAggregationInterval(maxAggregationInterval)
  }

  public fun resourceType(resourceType: FlowLogResourceType) {
    cdkBuilder.resourceType(resourceType)
  }

  public fun trafficType(trafficType: FlowLogTrafficType) {
    cdkBuilder.trafficType(trafficType)
  }

  public fun build(): FlowLogProps {
    if(_logFormat.isNotEmpty()) cdkBuilder.logFormat(_logFormat)
    return cdkBuilder.build()
  }
}
