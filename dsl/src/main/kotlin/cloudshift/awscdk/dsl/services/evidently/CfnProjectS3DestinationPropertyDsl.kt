@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.evidently.CfnProject

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
