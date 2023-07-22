@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rum

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rum.CfnAppMonitor

@CdkDslMarker
public class CfnAppMonitorMetricDefinitionPropertyDsl {
  private val cdkBuilder: CfnAppMonitor.MetricDefinitionProperty.Builder =
      CfnAppMonitor.MetricDefinitionProperty.builder()

  /**
   * @param dimensionKeys This field is a map of field paths to dimension names.
   * It defines the dimensions to associate with this metric in CloudWatch . The value of this field
   * is used only if the metric destination is `CloudWatch` . If the metric destination is `Evidently`
   * , the value of `DimensionKeys` is ignored.
   */
  public fun dimensionKeys(dimensionKeys: Map<String, String>) {
    cdkBuilder.dimensionKeys(dimensionKeys)
  }

  /**
   * @param dimensionKeys This field is a map of field paths to dimension names.
   * It defines the dimensions to associate with this metric in CloudWatch . The value of this field
   * is used only if the metric destination is `CloudWatch` . If the metric destination is `Evidently`
   * , the value of `DimensionKeys` is ignored.
   */
  public fun dimensionKeys(dimensionKeys: IResolvable) {
    cdkBuilder.dimensionKeys(dimensionKeys)
  }

  /**
   * @param eventPattern The pattern that defines the metric.
   * RUM checks events that happen in a user's session against the pattern, and events that match
   * the pattern are sent to the metric destination.
   *
   * If the metrics destination is `CloudWatch` and the event also matches a value in
   * `DimensionKeys` , then the metric is published with the specified dimensions.
   */
  public fun eventPattern(eventPattern: String) {
    cdkBuilder.eventPattern(eventPattern)
  }

  /**
   * @param name The name of the metric that is defined in this structure. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param namespace If you are creating a custom metric instead of an extended metrics, use this
   * parameter to define the metric namespace for that custom metric.
   * Do not specify this parameter if you are creating an extended metric.
   *
   * You can't use any string that starts with `AWS/` for your namespace.
   */
  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
  }

  /**
   * @param unitLabel Use this field only if you are sending this metric to CloudWatch .
   * It defines the CloudWatch metric unit that this metric is measured in.
   */
  public fun unitLabel(unitLabel: String) {
    cdkBuilder.unitLabel(unitLabel)
  }

  /**
   * @param valueKey The field within the event object that the metric value is sourced from.
   */
  public fun valueKey(valueKey: String) {
    cdkBuilder.valueKey(valueKey)
  }

  public fun build(): CfnAppMonitor.MetricDefinitionProperty = cdkBuilder.build()
}
