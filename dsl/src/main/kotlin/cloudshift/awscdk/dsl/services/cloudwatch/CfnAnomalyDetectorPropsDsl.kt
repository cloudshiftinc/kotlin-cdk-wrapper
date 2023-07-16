@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetectorProps

@CdkDslMarker
public class CfnAnomalyDetectorPropsDsl {
  private val cdkBuilder: CfnAnomalyDetectorProps.Builder = CfnAnomalyDetectorProps.builder()

  private val _dimensions: MutableList<Any> = mutableListOf()

  public fun configuration(configuration: IResolvable) {
    cdkBuilder.configuration(configuration)
  }

  public fun configuration(configuration: CfnAnomalyDetector.ConfigurationProperty) {
    cdkBuilder.configuration(configuration)
  }

  public fun dimensions(vararg dimensions: Any) {
    _dimensions.addAll(listOf(*dimensions))
  }

  public fun dimensions(dimensions: Collection<Any>) {
    _dimensions.addAll(dimensions)
  }

  public fun dimensions(dimensions: IResolvable) {
    cdkBuilder.dimensions(dimensions)
  }

  public fun metricMathAnomalyDetector(metricMathAnomalyDetector: IResolvable) {
    cdkBuilder.metricMathAnomalyDetector(metricMathAnomalyDetector)
  }

  public
      fun metricMathAnomalyDetector(metricMathAnomalyDetector: CfnAnomalyDetector.MetricMathAnomalyDetectorProperty) {
    cdkBuilder.metricMathAnomalyDetector(metricMathAnomalyDetector)
  }

  public fun metricName(metricName: String) {
    cdkBuilder.metricName(metricName)
  }

  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
  }

  public fun singleMetricAnomalyDetector(singleMetricAnomalyDetector: IResolvable) {
    cdkBuilder.singleMetricAnomalyDetector(singleMetricAnomalyDetector)
  }

  public
      fun singleMetricAnomalyDetector(singleMetricAnomalyDetector: CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty) {
    cdkBuilder.singleMetricAnomalyDetector(singleMetricAnomalyDetector)
  }

  public fun stat(stat: String) {
    cdkBuilder.stat(stat)
  }

  public fun build(): CfnAnomalyDetectorProps {
    if(_dimensions.isNotEmpty()) cdkBuilder.dimensions(_dimensions)
    return cdkBuilder.build()
  }
}
