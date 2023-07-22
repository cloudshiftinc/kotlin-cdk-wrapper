@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ivs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ivs.CfnRecordingConfiguration

/**
 * The S3DestinationConfiguration property type describes an S3 location where recorded videos will
 * be stored.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ivs.*;
 * S3DestinationConfigurationProperty s3DestinationConfigurationProperty =
 * S3DestinationConfigurationProperty.builder()
 * .bucketName("bucketName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-s3destinationconfiguration.html)
 */
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
