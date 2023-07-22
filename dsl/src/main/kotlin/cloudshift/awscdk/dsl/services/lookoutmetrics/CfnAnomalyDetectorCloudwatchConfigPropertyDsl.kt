@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

@CdkDslMarker
public class CfnAnomalyDetectorCloudwatchConfigPropertyDsl {
  private val cdkBuilder: CfnAnomalyDetector.CloudwatchConfigProperty.Builder =
      CfnAnomalyDetector.CloudwatchConfigProperty.builder()

  /**
   * @param roleArn An IAM role that gives Amazon Lookout for Metrics permission to access data in
   * Amazon CloudWatch. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnAnomalyDetector.CloudwatchConfigProperty = cdkBuilder.build()
}
