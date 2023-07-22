@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codepipeline.CfnPipeline

/**
 * The S3 bucket where artifacts for the pipeline are stored.
 *
 *
 * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot use
 * both. If you create a cross-region action in your pipeline, you must use `artifactStores` .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.*;
 * ArtifactStoreProperty artifactStoreProperty = ArtifactStoreProperty.builder()
 * .location("location")
 * .type("type")
 * // the properties below are optional
 * .encryptionKey(EncryptionKeyProperty.builder()
 * .id("id")
 * .type("type")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html)
 */
@CdkDslMarker
public class CfnPipelineArtifactStorePropertyDsl {
  private val cdkBuilder: CfnPipeline.ArtifactStoreProperty.Builder =
      CfnPipeline.ArtifactStoreProperty.builder()

  /**
   * @param encryptionKey The encryption key used to encrypt the data in the artifact store, such as
   * an AWS Key Management Service ( AWS KMS) key.
   * If this is undefined, the default key for Amazon S3 is used. To see an example artifact store
   * encryption key field, see the example structure here:
   * [AWS::CodePipeline::Pipeline](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html)
   * .
   */
  public fun encryptionKey(encryptionKey: IResolvable) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  /**
   * @param encryptionKey The encryption key used to encrypt the data in the artifact store, such as
   * an AWS Key Management Service ( AWS KMS) key.
   * If this is undefined, the default key for Amazon S3 is used. To see an example artifact store
   * encryption key field, see the example structure here:
   * [AWS::CodePipeline::Pipeline](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html)
   * .
   */
  public fun encryptionKey(encryptionKey: CfnPipeline.EncryptionKeyProperty) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  /**
   * @param location The S3 bucket used for storing the artifacts for a pipeline. 
   * You can specify the name of an S3 bucket but not a folder in the bucket. A folder to contain
   * the pipeline artifacts is created for you based on the name of the pipeline. You can use any S3
   * bucket in the same AWS Region as the pipeline to store your pipeline artifacts.
   */
  public fun location(location: String) {
    cdkBuilder.location(location)
  }

  /**
   * @param type The type of the artifact store, such as S3. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnPipeline.ArtifactStoreProperty = cdkBuilder.build()
}
