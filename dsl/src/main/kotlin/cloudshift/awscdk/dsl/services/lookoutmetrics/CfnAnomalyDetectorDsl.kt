@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector
import software.constructs.Construct

@CdkDslMarker
public class CfnAnomalyDetectorDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAnomalyDetector.Builder = CfnAnomalyDetector.Builder.create(scope, id)

  private val _metricSetList: MutableList<Any> = mutableListOf()

  /**
   * Contains information about the configuration of the anomaly detector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-anomalydetectorconfig)
   * @param anomalyDetectorConfig Contains information about the configuration of the anomaly
   * detector. 
   */
  public fun anomalyDetectorConfig(anomalyDetectorConfig: IResolvable) {
    cdkBuilder.anomalyDetectorConfig(anomalyDetectorConfig)
  }

  /**
   * Contains information about the configuration of the anomaly detector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-anomalydetectorconfig)
   * @param anomalyDetectorConfig Contains information about the configuration of the anomaly
   * detector. 
   */
  public
      fun anomalyDetectorConfig(anomalyDetectorConfig: CfnAnomalyDetector.AnomalyDetectorConfigProperty) {
    cdkBuilder.anomalyDetectorConfig(anomalyDetectorConfig)
  }

  /**
   * A description of the detector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-anomalydetectordescription)
   * @param anomalyDetectorDescription A description of the detector. 
   */
  public fun anomalyDetectorDescription(anomalyDetectorDescription: String) {
    cdkBuilder.anomalyDetectorDescription(anomalyDetectorDescription)
  }

  /**
   * The name of the detector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-anomalydetectorname)
   * @param anomalyDetectorName The name of the detector. 
   */
  public fun anomalyDetectorName(anomalyDetectorName: String) {
    cdkBuilder.anomalyDetectorName(anomalyDetectorName)
  }

  /**
   * The ARN of the KMS key to use to encrypt your data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-kmskeyarn)
   * @param kmsKeyArn The ARN of the KMS key to use to encrypt your data. 
   */
  public fun kmsKeyArn(kmsKeyArn: String) {
    cdkBuilder.kmsKeyArn(kmsKeyArn)
  }

  /**
   * The detector's dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-metricsetlist)
   * @param metricSetList The detector's dataset. 
   */
  public fun metricSetList(vararg metricSetList: Any) {
    _metricSetList.addAll(listOf(*metricSetList))
  }

  /**
   * The detector's dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-metricsetlist)
   * @param metricSetList The detector's dataset. 
   */
  public fun metricSetList(metricSetList: Collection<Any>) {
    _metricSetList.addAll(metricSetList)
  }

  /**
   * The detector's dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-anomalydetector.html#cfn-lookoutmetrics-anomalydetector-metricsetlist)
   * @param metricSetList The detector's dataset. 
   */
  public fun metricSetList(metricSetList: IResolvable) {
    cdkBuilder.metricSetList(metricSetList)
  }

  public fun build(): CfnAnomalyDetector {
    if(_metricSetList.isNotEmpty()) cdkBuilder.metricSetList(_metricSetList)
    return cdkBuilder.build()
  }
}
