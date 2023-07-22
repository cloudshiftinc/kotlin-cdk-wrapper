@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnPipeline

@CdkDslMarker
public class CfnPipelineS3LocationPropertyDsl {
  private val cdkBuilder: CfnPipeline.S3LocationProperty.Builder =
      CfnPipeline.S3LocationProperty.builder()

  /**
   * @param bucket The name of the S3 bucket where the PipelineDefinition file is stored. 
   */
  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param eTag The Amazon S3 ETag (a file checksum) of the PipelineDefinition file.
   * If you don't specify a value, SageMaker skips ETag validation of your PipelineDefinition file.
   */
  public fun eTag(eTag: String) {
    cdkBuilder.eTag(eTag)
  }

  /**
   * @param key The file name of the PipelineDefinition file (Amazon S3 object name). 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param version For versioning-enabled buckets, a specific version of the PipelineDefinition
   * file.
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnPipeline.S3LocationProperty = cdkBuilder.build()
}
