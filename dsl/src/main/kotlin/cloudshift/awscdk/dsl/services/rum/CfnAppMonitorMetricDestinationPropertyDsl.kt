@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rum

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rum.CfnAppMonitor

@CdkDslMarker
public class CfnAppMonitorMetricDestinationPropertyDsl {
  private val cdkBuilder: CfnAppMonitor.MetricDestinationProperty.Builder =
      CfnAppMonitor.MetricDestinationProperty.builder()

  private val _metricDefinitions: MutableList<Any> = mutableListOf()

  /**
   * @param destination Defines the destination to send the metrics to. 
   * Valid values are `CloudWatch` and `Evidently` . If you specify `Evidently` , you must also
   * specify the ARN of the CloudWatch Evidently experiment that is to be the destination and an IAM
   * role that has permission to write to the experiment.
   */
  public fun destination(destination: String) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param destinationArn Use this parameter only if `Destination` is `Evidently` .
   * This parameter specifies the ARN of the Evidently experiment that will receive the extended
   * metrics.
   */
  public fun destinationArn(destinationArn: String) {
    cdkBuilder.destinationArn(destinationArn)
  }

  /**
   * @param iamRoleArn This parameter is required if `Destination` is `Evidently` . If `Destination`
   * is `CloudWatch` , do not use this parameter.
   * This parameter specifies the ARN of an IAM role that RUM will assume to write to the Evidently
   * experiment that you are sending metrics to. This role must have permission to write to that
   * experiment.
   */
  public fun iamRoleArn(iamRoleArn: String) {
    cdkBuilder.iamRoleArn(iamRoleArn)
  }

  /**
   * @param metricDefinitions An array of structures which define the metrics that you want to send.
   */
  public fun metricDefinitions(vararg metricDefinitions: Any) {
    _metricDefinitions.addAll(listOf(*metricDefinitions))
  }

  /**
   * @param metricDefinitions An array of structures which define the metrics that you want to send.
   */
  public fun metricDefinitions(metricDefinitions: Collection<Any>) {
    _metricDefinitions.addAll(metricDefinitions)
  }

  /**
   * @param metricDefinitions An array of structures which define the metrics that you want to send.
   */
  public fun metricDefinitions(metricDefinitions: IResolvable) {
    cdkBuilder.metricDefinitions(metricDefinitions)
  }

  public fun build(): CfnAppMonitor.MetricDestinationProperty {
    if(_metricDefinitions.isNotEmpty()) cdkBuilder.metricDefinitions(_metricDefinitions)
    return cdkBuilder.build()
  }
}
