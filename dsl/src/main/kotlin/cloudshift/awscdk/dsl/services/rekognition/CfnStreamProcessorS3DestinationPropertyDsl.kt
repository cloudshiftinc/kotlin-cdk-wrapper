@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rekognition

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor

@CdkDslMarker
public class CfnStreamProcessorS3DestinationPropertyDsl {
  private val cdkBuilder: CfnStreamProcessor.S3DestinationProperty.Builder =
      CfnStreamProcessor.S3DestinationProperty.builder()

  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  public fun objectKeyPrefix(objectKeyPrefix: String) {
    cdkBuilder.objectKeyPrefix(objectKeyPrefix)
  }

  public fun build(): CfnStreamProcessor.S3DestinationProperty = cdkBuilder.build()
}
