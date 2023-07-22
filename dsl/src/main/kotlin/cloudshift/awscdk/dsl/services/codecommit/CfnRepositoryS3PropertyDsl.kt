@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codecommit

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codecommit.CfnRepository

@CdkDslMarker
public class CfnRepositoryS3PropertyDsl {
  private val cdkBuilder: CfnRepository.S3Property.Builder = CfnRepository.S3Property.builder()

  /**
   * @param bucket The name of the Amazon S3 bucket that contains the ZIP file with the content that
   * will be committed to the new repository. 
   * This can be specified using the name of the bucket in the AWS account . Changes to this
   * property are ignored after initial resource creation.
   */
  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param key The key to use for accessing the Amazon S3 bucket. 
   * Changes to this property are ignored after initial resource creation. For more information, see
   * [Creating object key
   * names](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html) and [Uploading
   * objects](https://docs.aws.amazon.com/AmazonS3/latest/userguide/upload-objects.html) in the Amazon
   * S3 User Guide.
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param objectVersion The object version of the ZIP file, if versioning is enabled for the
   * Amazon S3 bucket.
   * Changes to this property are ignored after initial resource creation.
   */
  public fun objectVersion(objectVersion: String) {
    cdkBuilder.objectVersion(objectVersion)
  }

  public fun build(): CfnRepository.S3Property = cdkBuilder.build()
}
