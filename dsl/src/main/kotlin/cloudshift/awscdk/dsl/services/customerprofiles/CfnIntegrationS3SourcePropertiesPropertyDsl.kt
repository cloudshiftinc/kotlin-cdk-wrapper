@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

@CdkDslMarker
public class CfnIntegrationS3SourcePropertiesPropertyDsl {
  private val cdkBuilder: CfnIntegration.S3SourcePropertiesProperty.Builder =
      CfnIntegration.S3SourcePropertiesProperty.builder()

  /**
   * @param bucketName The Amazon S3 bucket name where the source files are stored. 
   */
  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  /**
   * @param bucketPrefix The object key for the Amazon S3 bucket in which the source files are
   * stored.
   */
  public fun bucketPrefix(bucketPrefix: String) {
    cdkBuilder.bucketPrefix(bucketPrefix)
  }

  public fun build(): CfnIntegration.S3SourcePropertiesProperty = cdkBuilder.build()
}
