@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ivs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ivs.CfnRecordingConfiguration

@CdkDslMarker
public class CfnRecordingConfigurationS3DestinationConfigurationPropertyDsl {
  private val cdkBuilder: CfnRecordingConfiguration.S3DestinationConfigurationProperty.Builder =
      CfnRecordingConfiguration.S3DestinationConfigurationProperty.builder()

  /**
   * @param bucketName Location (S3 bucket name) where recorded videos will be stored. 
   */
  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  public fun build(): CfnRecordingConfiguration.S3DestinationConfigurationProperty =
      cdkBuilder.build()
}
