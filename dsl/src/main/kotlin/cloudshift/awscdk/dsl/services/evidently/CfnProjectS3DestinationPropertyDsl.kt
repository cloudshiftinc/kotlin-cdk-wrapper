@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.evidently.CfnProject

/**
 * If the project stores evaluation events in an Amazon S3 bucket, this structure stores the bucket
 * name and bucket prefix.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.evidently.*;
 * S3DestinationProperty s3DestinationProperty = S3DestinationProperty.builder()
 * .bucketName("bucketName")
 * // the properties below are optional
 * .prefix("prefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-evidently-project-s3destination.html)
 */
@CdkDslMarker
public class CfnProjectS3DestinationPropertyDsl {
  private val cdkBuilder: CfnProject.S3DestinationProperty.Builder =
      CfnProject.S3DestinationProperty.builder()

  /**
   * @param bucketName The name of the bucket in which Evidently stores evaluation events. 
   */
  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  /**
   * @param prefix The bucket prefix in which Evidently stores evaluation events.
   */
  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  public fun build(): CfnProject.S3DestinationProperty = cdkBuilder.build()
}
