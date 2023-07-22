@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition

@CdkDslMarker
public class CfnModelBiasJobDefinitionMonitoringGroundTruthS3InputPropertyDsl {
  private val cdkBuilder: CfnModelBiasJobDefinition.MonitoringGroundTruthS3InputProperty.Builder =
      CfnModelBiasJobDefinition.MonitoringGroundTruthS3InputProperty.builder()

  /**
   * @param s3Uri The address of the Amazon S3 location of the ground truth labels. 
   */
  public fun s3Uri(s3Uri: String) {
    cdkBuilder.s3Uri(s3Uri)
  }

  public fun build(): CfnModelBiasJobDefinition.MonitoringGroundTruthS3InputProperty =
      cdkBuilder.build()
}
