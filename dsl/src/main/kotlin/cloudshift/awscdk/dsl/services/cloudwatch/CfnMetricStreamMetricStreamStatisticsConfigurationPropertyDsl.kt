@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudwatch.CfnMetricStream

@CdkDslMarker
public class CfnMetricStreamMetricStreamStatisticsConfigurationPropertyDsl {
  private val cdkBuilder: CfnMetricStream.MetricStreamStatisticsConfigurationProperty.Builder =
      CfnMetricStream.MetricStreamStatisticsConfigurationProperty.builder()

  private val _additionalStatistics: MutableList<String> = mutableListOf()

  private val _includeMetrics: MutableList<Any> = mutableListOf()

  /**
   * @param additionalStatistics The additional statistics to stream for the metrics listed in
   * `IncludeMetrics` . 
   */
  public fun additionalStatistics(vararg additionalStatistics: String) {
    _additionalStatistics.addAll(listOf(*additionalStatistics))
  }

  /**
   * @param additionalStatistics The additional statistics to stream for the metrics listed in
   * `IncludeMetrics` . 
   */
  public fun additionalStatistics(additionalStatistics: Collection<String>) {
    _additionalStatistics.addAll(additionalStatistics)
  }

  /**
   * @param includeMetrics An array that defines the metrics that are to have additional statistics
   * streamed. 
   */
  public fun includeMetrics(vararg includeMetrics: Any) {
    _includeMetrics.addAll(listOf(*includeMetrics))
  }

  /**
   * @param includeMetrics An array that defines the metrics that are to have additional statistics
   * streamed. 
   */
  public fun includeMetrics(includeMetrics: Collection<Any>) {
    _includeMetrics.addAll(includeMetrics)
  }

  /**
   * @param includeMetrics An array that defines the metrics that are to have additional statistics
   * streamed. 
   */
  public fun includeMetrics(includeMetrics: IResolvable) {
    cdkBuilder.includeMetrics(includeMetrics)
  }

  public fun build(): CfnMetricStream.MetricStreamStatisticsConfigurationProperty {
    if(_additionalStatistics.isNotEmpty()) cdkBuilder.additionalStatistics(_additionalStatistics)
    if(_includeMetrics.isNotEmpty()) cdkBuilder.includeMetrics(_includeMetrics)
    return cdkBuilder.build()
  }
}
