@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetectorProps

@CdkDslMarker
public class CfnAnomalyDetectorPropsDsl {
  private val cdkBuilder: CfnAnomalyDetectorProps.Builder = CfnAnomalyDetectorProps.builder()

  private val _metricSetList: MutableList<Any> = mutableListOf()

  /**
   * @param anomalyDetectorConfig Contains information about the configuration of the anomaly
   * detector. 
   */
  public fun anomalyDetectorConfig(anomalyDetectorConfig: IResolvable) {
    cdkBuilder.anomalyDetectorConfig(anomalyDetectorConfig)
  }

  /**
   * @param anomalyDetectorConfig Contains information about the configuration of the anomaly
   * detector. 
   */
  public
      fun anomalyDetectorConfig(anomalyDetectorConfig: CfnAnomalyDetector.AnomalyDetectorConfigProperty) {
    cdkBuilder.anomalyDetectorConfig(anomalyDetectorConfig)
  }

  /**
   * @param anomalyDetectorDescription A description of the detector.
   */
  public fun anomalyDetectorDescription(anomalyDetectorDescription: String) {
    cdkBuilder.anomalyDetectorDescription(anomalyDetectorDescription)
  }

  /**
   * @param anomalyDetectorName The name of the detector.
   */
  public fun anomalyDetectorName(anomalyDetectorName: String) {
    cdkBuilder.anomalyDetectorName(anomalyDetectorName)
  }

  /**
   * @param kmsKeyArn The ARN of the KMS key to use to encrypt your data.
   */
  public fun kmsKeyArn(kmsKeyArn: String) {
    cdkBuilder.kmsKeyArn(kmsKeyArn)
  }

  /**
   * @param metricSetList The detector's dataset. 
   */
  public fun metricSetList(vararg metricSetList: Any) {
    _metricSetList.addAll(listOf(*metricSetList))
  }

  /**
   * @param metricSetList The detector's dataset. 
   */
  public fun metricSetList(metricSetList: Collection<Any>) {
    _metricSetList.addAll(metricSetList)
  }

  /**
   * @param metricSetList The detector's dataset. 
   */
  public fun metricSetList(metricSetList: IResolvable) {
    cdkBuilder.metricSetList(metricSetList)
  }

  public fun build(): CfnAnomalyDetectorProps {
    if(_metricSetList.isNotEmpty()) cdkBuilder.metricSetList(_metricSetList)
    return cdkBuilder.build()
  }
}
