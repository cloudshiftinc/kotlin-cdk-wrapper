@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnPipeline

@CdkDslMarker
public class CfnPipelineS3LocationPropertyDsl {
  private val cdkBuilder: CfnPipeline.S3LocationProperty.Builder =
      CfnPipeline.S3LocationProperty.builder()

  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  public fun eTag(eTag: String) {
    cdkBuilder.eTag(eTag)
  }

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnPipeline.S3LocationProperty = cdkBuilder.build()
}
