@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition

@CdkDslMarker
public class CfnModelQualityJobDefinitionS3OutputPropertyDsl {
  private val cdkBuilder: CfnModelQualityJobDefinition.S3OutputProperty.Builder =
      CfnModelQualityJobDefinition.S3OutputProperty.builder()

  public fun localPath(localPath: String) {
    cdkBuilder.localPath(localPath)
  }

  public fun s3UploadMode(s3UploadMode: String) {
    cdkBuilder.s3UploadMode(s3UploadMode)
  }

  public fun s3Uri(s3Uri: String) {
    cdkBuilder.s3Uri(s3Uri)
  }

  public fun build(): CfnModelQualityJobDefinition.S3OutputProperty = cdkBuilder.build()
}
