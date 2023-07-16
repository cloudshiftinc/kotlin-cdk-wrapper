@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@CdkDslMarker
public class CfnApplicationS3ContentLocationPropertyDsl {
  private val cdkBuilder: CfnApplication.S3ContentLocationProperty.Builder =
      CfnApplication.S3ContentLocationProperty.builder()

  public fun bucketArn(bucketArn: String) {
    cdkBuilder.bucketArn(bucketArn)
  }

  public fun fileKey(fileKey: String) {
    cdkBuilder.fileKey(fileKey)
  }

  public fun objectVersion(objectVersion: String) {
    cdkBuilder.objectVersion(objectVersion)
  }

  public fun build(): CfnApplication.S3ContentLocationProperty = cdkBuilder.build()
}
