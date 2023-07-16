@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector

@CdkDslMarker
public class CfnAnomalyDetectorSingleMetricAnomalyDetectorPropertyDsl {
  private val cdkBuilder: CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty.Builder =
      CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty.builder()

  private val _dimensions: MutableList<Any> = mutableListOf()

  public fun dimensions(vararg dimensions: Any) {
    _dimensions.addAll(listOf(*dimensions))
  }

  public fun dimensions(dimensions: Collection<Any>) {
    _dimensions.addAll(dimensions)
  }

  public fun dimensions(dimensions: IResolvable) {
    cdkBuilder.dimensions(dimensions)
  }

  public fun metricName(metricName: String) {
    cdkBuilder.metricName(metricName)
  }

  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
  }

  public fun stat(stat: String) {
    cdkBuilder.stat(stat)
  }

  public fun build(): CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty {
    if(_dimensions.isNotEmpty()) cdkBuilder.dimensions(_dimensions)
    return cdkBuilder.build()
  }
}
