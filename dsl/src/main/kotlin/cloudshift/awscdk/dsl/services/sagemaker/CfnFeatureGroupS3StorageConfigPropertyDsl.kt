@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnFeatureGroup

@CdkDslMarker
public class CfnFeatureGroupS3StorageConfigPropertyDsl {
  private val cdkBuilder: CfnFeatureGroup.S3StorageConfigProperty.Builder =
      CfnFeatureGroup.S3StorageConfigProperty.builder()

  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun s3Uri(s3Uri: String) {
    cdkBuilder.s3Uri(s3Uri)
  }

  public fun build(): CfnFeatureGroup.S3StorageConfigProperty = cdkBuilder.build()
}
