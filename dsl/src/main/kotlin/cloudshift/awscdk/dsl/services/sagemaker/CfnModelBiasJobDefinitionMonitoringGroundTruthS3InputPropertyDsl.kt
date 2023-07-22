@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition

/**
 * The ground truth labels for the dataset used for the monitoring job.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * MonitoringGroundTruthS3InputProperty monitoringGroundTruthS3InputProperty =
 * MonitoringGroundTruthS3InputProperty.builder()
 * .s3Uri("s3Uri")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-monitoringgroundtruths3input.html)
 */
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
