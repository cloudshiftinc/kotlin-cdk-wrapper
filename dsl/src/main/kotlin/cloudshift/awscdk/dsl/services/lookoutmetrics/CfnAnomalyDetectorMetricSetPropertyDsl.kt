@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

@CdkDslMarker
public class CfnAnomalyDetectorMetricSetPropertyDsl {
  private val cdkBuilder: CfnAnomalyDetector.MetricSetProperty.Builder =
      CfnAnomalyDetector.MetricSetProperty.builder()

  private val _dimensionList: MutableList<String> = mutableListOf()

  private val _metricList: MutableList<Any> = mutableListOf()

  /**
   * @param dimensionList A list of the fields you want to treat as dimensions.
   */
  public fun dimensionList(vararg dimensionList: String) {
    _dimensionList.addAll(listOf(*dimensionList))
  }

  /**
   * @param dimensionList A list of the fields you want to treat as dimensions.
   */
  public fun dimensionList(dimensionList: Collection<String>) {
    _dimensionList.addAll(dimensionList)
  }

  /**
   * @param metricList A list of metrics that the dataset will contain. 
   */
  public fun metricList(vararg metricList: Any) {
    _metricList.addAll(listOf(*metricList))
  }

  /**
   * @param metricList A list of metrics that the dataset will contain. 
   */
  public fun metricList(metricList: Collection<Any>) {
    _metricList.addAll(metricList)
  }

  /**
   * @param metricList A list of metrics that the dataset will contain. 
   */
  public fun metricList(metricList: IResolvable) {
    cdkBuilder.metricList(metricList)
  }

  /**
   * @param metricSetDescription A description of the dataset you are creating.
   */
  public fun metricSetDescription(metricSetDescription: String) {
    cdkBuilder.metricSetDescription(metricSetDescription)
  }

  /**
   * @param metricSetFrequency The frequency with which the source data will be analyzed for
   * anomalies.
   */
  public fun metricSetFrequency(metricSetFrequency: String) {
    cdkBuilder.metricSetFrequency(metricSetFrequency)
  }

  /**
   * @param metricSetName The name of the dataset. 
   */
  public fun metricSetName(metricSetName: String) {
    cdkBuilder.metricSetName(metricSetName)
  }

  /**
   * @param metricSource Contains information about how the source data should be interpreted. 
   */
  public fun metricSource(metricSource: IResolvable) {
    cdkBuilder.metricSource(metricSource)
  }

  /**
   * @param metricSource Contains information about how the source data should be interpreted. 
   */
  public fun metricSource(metricSource: CfnAnomalyDetector.MetricSourceProperty) {
    cdkBuilder.metricSource(metricSource)
  }

  /**
   * @param offset After an interval ends, the amount of seconds that the detector waits before
   * importing data.
   * Offset is only supported for S3, Redshift, Athena and datasources.
   */
  public fun offset(offset: Number) {
    cdkBuilder.offset(offset)
  }

  /**
   * @param timestampColumn Contains information about the column used for tracking time in your
   * source data.
   */
  public fun timestampColumn(timestampColumn: IResolvable) {
    cdkBuilder.timestampColumn(timestampColumn)
  }

  /**
   * @param timestampColumn Contains information about the column used for tracking time in your
   * source data.
   */
  public fun timestampColumn(timestampColumn: CfnAnomalyDetector.TimestampColumnProperty) {
    cdkBuilder.timestampColumn(timestampColumn)
  }

  /**
   * @param timezone The time zone in which your source data was recorded.
   */
  public fun timezone(timezone: String) {
    cdkBuilder.timezone(timezone)
  }

  public fun build(): CfnAnomalyDetector.MetricSetProperty {
    if(_dimensionList.isNotEmpty()) cdkBuilder.dimensionList(_dimensionList)
    if(_metricList.isNotEmpty()) cdkBuilder.metricList(_metricList)
    return cdkBuilder.build()
  }
}
